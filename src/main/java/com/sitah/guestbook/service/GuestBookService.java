package com.sitah.guestbook.service;

import com.sitah.guestbook.domain.GuestBookEntry;
import com.sitah.guestbook.domain.GuestBookEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestBookService {

    @Autowired

    private GuestBookEntryRepository guestBookEntryRepository;
    public List<GuestBookEntry> findAllEntries () {
        return this.guestBookEntryRepository.findAll ();
    }

    public GuestBookEntry findGuestBookEntryById (Integer id) {
        return this.guestBookEntryRepository.findGuestBookEntryById(id);
    }

    public List <GuestBookEntry> findGuestBookEntryByUser (String user) {
        return this.guestBookEntryRepository.findGuestBookEntryByUser (user);
    }

    public void deleteGuestBookEntryById (Integer id) {
        this.guestBookEntryRepository.delete (id);
    }

    public void save (GuestBookEntry newEntry) {
        this.guestBookEntryRepository.save (newEntry);
    }

    public GuestBookEntry findOne (Integer id) {
        return this.guestBookEntryRepository.findOne (id);
    }
}
