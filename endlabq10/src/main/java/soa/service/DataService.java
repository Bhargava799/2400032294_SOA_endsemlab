package soa.service;

import soa.model.Data;
import soa.repository.DataRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DataService {

    private final DataRepository repo;

    public DataService(DataRepository repo) {
        this.repo = repo;
    }

    public List<Data> getAll() {
        return repo.findAll();
    }

    public Data save(Data data) {
        return repo.save(data);
    }
}
