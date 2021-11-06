package htw.berlin.webtech.m2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {

    @Autowired
    EntryService service;

    @PostMapping("/entry")
    public Entry createEntry(@RequestBody Entry entry){
        return service.save(entry);
    }

}
