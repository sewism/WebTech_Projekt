package htw.berlin.webtech.m2;

import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntryService {

    @Autowired
    EntryRepository repo;

    public Entry save(Entry entry){
        Entry result = repo.save(entry);
        return result;
    }

    public Entry get(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }
}
