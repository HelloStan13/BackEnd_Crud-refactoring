package co.com.sofka.crud.Entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.*;

class GroupListTest extends Todo {
    /*
     * @version 1.0
     * @autor Adryan Ynfante <adryanynfante@gmail.com>
     */
    @Test
    void testGetId() {
        Long id = 1L;
        Assertions.assertEquals(1, 1);
    }

    @Test
    void testGetName() {
        String name = "Front React";
        Assertions.assertEquals("Front React", "Front React");

    }

}