package com.example.wawandco.zxyshoes;

/**
 * Created by android on 03/10/2017.
 */

public class Metodos {
    public static int total(int cantidad, boolean isMan, boolean isWoman, boolean isSneaker, boolean isClasic, String shoe) {
        int total;
        String strAdidas = "Adidas";
        String strNike = "Nike";
        String strPuma = "Puma";
        total = 0;


        if (isMan) {
            if (isSneaker) {
                if (shoe.equals(strAdidas)) {
                    total = 140000;
                }

                if (shoe.equals(strPuma)) {
                    total = 130000;
                }

                if (shoe.equals(strNike)) {
                    total = 120000;
                }
            }

            if (isClasic) {
                if (shoe.equals(strAdidas)) {
                    total = 80000;
                }

                if (shoe.equals(strPuma)) {
                    total = 100000;
                }

                if (shoe.equals(strNike)) {
                    total = 50000;
                }
            }
        }

        if (isWoman) {
            if (isSneaker) {
                if (shoe.equals(strAdidas)) {
                    total = 130000;
                }

                if (shoe.equals(strPuma)) {
                    total = 110000;
                }

                if (shoe.equals(strNike)) {
                    total = 100000;
                }
            }

            if (isClasic) {
                if (shoe.equals(strAdidas)) {
                    total = 70000;
                }

                if (shoe.equals(strPuma)) {
                    total = 120000;
                }

                if (shoe.equals(strNike)) {
                    total = 60000;
                }
            }
        }

        total = total * cantidad;

        return total;
    }
}
