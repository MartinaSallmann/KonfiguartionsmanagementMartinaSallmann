package org.campus02.sallmann;

import org.junit.jupiter.api.*;

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



    @Test
    void credit() {

        assertEquals(220,test.credit(120));
        assertEquals(220, test2.credit(120));
        assertEquals(220, Test3.credit(120));

    }
}