package com.easybytes.backend.Controller;

import com.easybytes.backend.dto.UserDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Map;

@RestController
@RequestMapping("/api/dummy/users/")
public class UserContoller {
    @GetMapping("{userId}/posts/{postId}")
    public String searchUserPostWithMutliPathvariable(@PathVariable(name = "userId") Long custId,@PathVariable Long postId){
        return "Fetched user with "+custId+" and postId "+postId;
    }

    @GetMapping("{userId}/address/{addressId}")
    public String searchUserAddressWithMutliPathvariable(@PathVariable Map<String,String>pathMap){
        return "Fetched user with "+pathMap.get("userId")+" and address "+pathMap.get("addressId");
    }

    @GetMapping("/search")
    public String searchUserWithQueryParams(@RequestParam String name, @RequestParam String gender){
        return "Fetched user from query params with name "+name+" and gender "+gender;
    }

    @GetMapping("/search/map")
    public String searchUserWithMapQueryParams(@RequestParam Map<String,String>reqParam){
        return "Fetched user from query params with name "+reqParam.get("name")+" and gender "+reqParam.get("gender");
    }

    @GetMapping("/headers")
    public String readRequestHeaders(@RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader(name = "User-Location", required = false, defaultValue = "Hyderabad") String userLocation) {
        return "Received: " + userAgent + " " + userLocation;
    }

    @GetMapping("/headers/map")
    public String readRequestHeadersWithMap(@RequestHeader Map<String, String> requestHeaders) {
        return "Received: " + requestHeaders.get("User-Agent") + " " + requestHeaders.get("User-Location");
    }

    @PostMapping
    public String createUser(@RequestBody UserDto userDto) {
        return "Created User with the data: " + userDto.toString();
    }

    @PostMapping("request-entity")
    public ResponseEntity<String> createUserWithRequestEntity(RequestEntity<UserDto> requestEntity) {
        HttpHeaders httpHeaders = requestEntity.getHeaders();
        UserDto userDto = requestEntity.getBody();
        String queryParam = requestEntity.getUrl().getQuery();
        String pathVariables = requestEntity.getUrl().getPath();
        // return "Created User with the data: " + userDto.toString();
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Custom-Header", "ExampleValue")
                .body("Created User with the data: " + userDto.toString());
    }
}
