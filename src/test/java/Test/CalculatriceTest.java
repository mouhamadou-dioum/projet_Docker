/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import com.mycompany.projet1maven.Calculatrice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tmmou
 */
public class CalculatriceTest {
    
     Calculatrice calculatrice = new Calculatrice();

    @Test
    void testAddition() {
        assertEquals(5, calculatrice.addition(2, 3));
    }

    @Test
    void testSoustraction() {
        assertEquals(3, calculatrice.soustraction(5, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(12, calculatrice.multiplication(4, 3));
    }

    @Test
    void testDivision() {
        assertEquals(5.0, calculatrice.division(10, 2));
    }

    @Test
    void testDivisionParZero() {
    }
}
