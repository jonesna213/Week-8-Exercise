package com.persistence;

import com.swagger.Pet;
import edu.matc.persistence.SwaggerDao;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SwaggerDaoTest {
    /**
     * To test if getPet from the swagger dao works
     */
    @Test
    void getPetSuccess() {
        SwaggerDao dao = new SwaggerDao();
        Pet pet = dao.getPet(6); //Only one I found that didn't give a 404

        assertEquals("doggie", pet.getName());
        assertEquals("available", pet.getStatus());
        assertEquals("fuzzstring", pet.getCategory().getName());
        assertEquals("fuzzstring", pet.getTags().get(0).getName());
    }
}
