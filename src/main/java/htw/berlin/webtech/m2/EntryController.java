package htw.berlin.webtech.m2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EntryController {

    @Autowired
    EntryService service;

    @PostMapping("/entry")
    public Entry createEntry(@RequestBody Entry entry){
        return service.save(entry);
    }

    @GetMapping("/entry/{id}")
    public Entry getEntry(@PathVariable String id){
        Long entryId = Long.parseLong(id);
        return service.get(entryId);
    }
}
