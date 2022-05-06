
package co.com.sofka.crud.Controllers;

import co.com.sofka.crud.Entidades.GroupList;
import co.com.sofka.crud.DAO.GroupListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class GroupListController {
    @Autowired
    private GroupListService service;

    @GetMapping(value = "api/grouplists")
    public Iterable<GroupList> list() {
        return service.list();
    }
}
