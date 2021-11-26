package org.campus02.sallmann;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account test = new Account("Martina");
    Account test2 = new Account("Stefan");
    Account Test3 = new Account("Susi");

    @Test
    void getOwner() {
        assertEquals("Martina", test.getOwner());
        assertEquals("Stefan", test2.getOwner());
        assertEquals("Susi", Test3.getOwner());
    }

    @Test
    void getAmount(){
    assertEquals(100, test.getAmount());
    assertEquals(100, test2.getAmount());
    assertEquals(100,Test3.getAmount());

}
}