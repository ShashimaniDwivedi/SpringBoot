package com.easybytes.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContoller {
    @GetMapping("/api/dummy/users/{userId}/posts/{postId}")
    public String searchUserPostWithMutliPathvariable(@PathVariable(name = "userId") Long custId,@PathVariable Long postId){
        return "Fetched user with "+custId+" and postId "+postId;
    }
}
