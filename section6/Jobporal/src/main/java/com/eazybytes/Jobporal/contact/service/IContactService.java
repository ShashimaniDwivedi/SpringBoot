package com.eazybytes.Jobporal.contact.service;

import com.eazybytes.Jobporal.dto.ContactRequestDto;

public interface IContactService {
    boolean saveContact(ContactRequestDto contactRequestDto);
}
