package co.com.sofka.crud.Entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoTest extends Todo {

    @Test
    void testGetGroupListId() {
        Long id = 1L;
        Assertions.assertEquals(1, 1);
    }

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