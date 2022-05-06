package co.com.sofka.crud.Controllers;

import co.com.sofka.crud.Entidades.GroupList;
import co.com.sofka.crud.DAO.GroupListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/*
 * @version 1.0
 * @autor Adryan Ynfante <adryanynfante@gmail.com>
 * Controller grupo de tareas endpoint api/grouplists, declaramos origen para admitir la conexion del front,
 * metodos guardar, editar , eliminar
 */

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class GroupListController {
    @Autowired
    private GroupListService service;

    @GetMapping(value = "api/grouplists")
    public Iterable<GroupList> list(){
        return service.list();
    }

    @PostMapping(value = "api/grouplist")
    public GroupList save(@RequestBody GroupList groupList){
        return service.save(groupList);
    }

    @PutMapping(value = "api/grouplist")
    public GroupList update(@RequestBody GroupList groupList){
        if(groupList.getId() != null){
            return service.save(groupList);
        }
        throw new RuntimeException("No existe el id");
    }

    @DeleteMapping(value = "api/{id}/grouplist")
    public void delete(@PathVariable("id")Long id){
        service.delete(id);
    }

    @GetMapping(value = "api/{id}/grouplist")
    public GroupList get(@PathVariable("id") Long id){
        return service.get(id);
    }
}
