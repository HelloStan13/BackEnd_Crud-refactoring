package co.com.sofka.crud.DAO;

import co.com.sofka.crud.Entidades.Todo;
import co.com.sofka.crud.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.StreamSupport;
/*
 * @version 1.0
 * @autor Adryan Ynfante <adryanynfante@gmail.com>
 * servicio de grupo declaramos los métodos que se implementaran en el controller
 */
@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Iterable<Todo> listTodoByGroup(Long groupId) {

        return () -> StreamSupport.stream(repository.findAll().spliterator(), false)
                    .filter(x -> x.getGroupListId().equals(groupId))
                    .iterator();
    }

    public Iterable<Todo> list(){
        return repository.findAll();
    }

    public Todo save(Todo todo){
        return repository.save(todo);
    }

    public void delete(Long id){
        repository.delete(get(id));
    }

    public Todo get(Long id){
         return repository.findById(id).orElseThrow();
    }

}
