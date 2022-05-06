package co.com.sofka.crud.DAO;

import co.com.sofka.crud.Entidades.GroupList;
import co.com.sofka.crud.Repositories.GroupListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
 * @version 1.0
 * @autor Adryan Ynfante <adryanynfante@gmail.com>
 * servicio de grupo declaramos los métodos que se implementaran en el controller
 */

@Service
public class GroupListService {
    @Autowired
    private GroupListRepository repository;

    public Iterable<GroupList> list(){
        return repository.findAll();
    }

    public GroupList save(GroupList groupList){
        return repository.save(groupList);
    }

    public void delete(Long id){
        repository.delete(get(id));
    }

    public GroupList get(Long id){
        return repository.findById(id).orElseThrow();
    }
}
