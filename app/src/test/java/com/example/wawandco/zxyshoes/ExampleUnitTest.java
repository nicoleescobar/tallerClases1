package com.example.wawandco.zxyshoes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public  void combinacion1() {
        int cantidad = 1;
        boolean isMan = true;
        boolean isWoman = false;
        boolean isSneaker = true;
        boolean isClasic = false;
        String shoe = "Nike";

        int actual = Metodos.total(cantidad, isMan, isWoman, isSneaker, isClasic, shoe);
        int expected = 120000;

        assertEquals(expected, actual);
    }

    @Test
    public  void combinacion2() {
        int cantidad = 1;
        boolean isMan = true;
        boolean isWoman = false;
        boolean isSneaker = true;
        boolean isClasic = false;
        String shoe = "Adidas";

        int actual = Metodos.total(cantidad, isMan, isWoman, isSneaker, isClasic, shoe);
        int expected = 140000;

        assertEquals(expected, actual);
    }

    @Test
    public void combinacion3() {
        int cantidad = 1;
        boolean isMan = true;
        boolean isWoman = false;
        boolean isSneaker = true;
        boolean isClasic = false;
        String shoe = "Puma";

        int actual = Metodos.total(cantidad, isMan, isWoman, isSneaker, isClasic, shoe);
        int expected = 130000;

        assertEquals(expected, actual);
    }

    @Test
    public void combinacion4()  {
        int cantidad = 1;
        boolean isMan = true;
        boolean isWoman = false;
        boolean isSneaker = false;
        boolean isClasic = true;
        String shoe = "Nike";

        int actual = Metodos.total(cantidad, isMan, isWoman, isSneaker, isClasic, shoe);
        int expected = 50000;

        assertEquals(expected, actual);
    }

    @Test
    public void combinacion5()  {
        int cantidad = 1;
        boolean isMan = true;
        boolean isWoman = false;
        boolean isSneaker = false;
        boolean isClasic = true;
        String shoe = "Adidas";

        int actual = Metodos.total(cantidad, isMan, isWoman, isSneaker, isClasic, shoe);
        int expected = 80000;

        assertEquals(expected, actual);
    }

    @Test
    public void combinacion6() {
        int cantidad = 1;
        boolean isMan = true;
        boolean isWoman = false;
        boolean isSneaker = false;
        boolean isClasic = true;
        String shoe = "Puma";

        int actual = Metodos.total(cantidad, isMan, isWoman, isSneaker, isClasic, shoe);
        int expected = 100000;

        assertEquals(expected, actual);
    }


    @Test
    public  void combinacion7() {
        int cantidad = 1;
        boolean isMan = false;
        boolean isWoman = true;
        boolean isSneaker = true;
        boolean isClasic = false;
        String shoe = "Nike";

        int actual = Metodos.total(cantidad, isMan, isWoman, isSneaker, isClasic, shoe);
        int expected = 100000;

        assertEquals(expected, actual);
    }

    @Test
    public  void combinacion8() {
        int cantidad = 1;
        boolean isMan = false;
        boolean isWoman = true;
        boolean isSneaker = true;
        boolean isClasic = false;
        String shoe = "Adidas";

        int actual = Metodos.total(cantidad, isMan, isWoman, isSneaker, isClasic, shoe);
        int expected = 130000;

        assertEquals(expected, actual);
    }

    @Test
    public void combinacion9() {
        int cantidad = 1;
        boolean isMan = false;
        boolean isWoman = true;
        boolean isSneaker = true;
        boolean isClasic = false;
        String shoe = "Puma";

        int actual = Metodos.total(cantidad, isMan, isWoman, isSneaker, isClasic, shoe);
        int expected = 110000;

        assertEquals(expected, actual);
    }

    @Test
    public void combinacion10()  {
        int cantidad = 1;
        boolean isMan = false;
        boolean isWoman = true;
        boolean isSneaker = false;
        boolean isClasic = true;
        String shoe = "Nike";

        int actual = Metodos.total(cantidad, isMan, isWoman, isSneaker, isClasic, shoe);
        int expected = 60000;

        assertEquals(expected, actual);
    }

    @Test
    public void combinacion11()  {
        int cantidad = 1;
        boolean isMan = false;
        boolean isWoman = true;
        boolean isSneaker = false;
        boolean isClasic = true;
        String shoe = "Adidas";

        int actual = Metodos.total(cantidad, isMan, isWoman, isSneaker, isClasic, shoe);
        int expected = 70000;

        assertEquals(expected, actual);
    }

    @Test
    public void combinacion12() {
        int cantidad = 1;
        boolean isMan = false;
        boolean isWoman = true;
        boolean isSneaker = false;
        boolean isClasic = true;
        String shoe = "Puma";

        int actual = Metodos.total(cantidad, isMan, isWoman, isSneaker, isClasic, shoe);
        int expected = 120000;

        assertEquals(expected, actual);
    }
}