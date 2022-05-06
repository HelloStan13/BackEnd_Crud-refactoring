package co.com.sofka.crud.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * @version 1.0
 * @autor Adryan Ynfante <adryanynfante@gmail.com>
 * se decalaran losa tributos de grupo de tareas junto a sus get and setter y constructor
 */
@Entity
@Table(name="grouplist")
public class GroupList {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public GroupList() {
    }

    public GroupList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
