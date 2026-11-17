package soa.controller;

import soa.model.Data;
import soa.service.DataService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    private final DataService service;

    public DataController(DataService service) {
        this.service = service;
    }

    @GetMapping
    public List<Data> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Data save(@RequestBody Data data) {
        return service.save(data);
    }
}

