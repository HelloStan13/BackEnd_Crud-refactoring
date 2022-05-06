package co.com.sofka.crud.DAO;

import co.com.sofka.crud.Entidades.GroupList;
import co.com.sofka.crud.Repositories.GroupListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupListService {
    @Autowired
    private GroupListRepository repository;

    public Iterable<GroupList> list(){
        return repository.findAll();
    }
}
