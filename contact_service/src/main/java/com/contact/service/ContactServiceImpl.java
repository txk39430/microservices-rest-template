package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    // hard coded list of conctacts
     List<Contact> list= List.of(
      new Contact(1L,"teja@gmail.com","Teja",23L),
            new Contact(2L,"hem@gmail.com","Hem",23L),
            new Contact(3L,"tom@gmail.com","Tom",24L),
            new Contact(4L,"stark@gmail.com","Starl",25L)

    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
