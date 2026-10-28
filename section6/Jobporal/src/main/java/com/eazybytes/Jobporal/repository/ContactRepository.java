package com.eazybytes.Jobporal.repository;

import com.eazybytes.Jobporal.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}