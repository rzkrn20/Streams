/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streams;

import java.util.Arrays;
import java.util.List;

/**
 * reduce operation applies a binary operator to each element in the stream
 * bisa mempermudah pencarian maximum, minimum, sum, dsb.
 * @author rzkrn20
 */
public class Reduce {
    public static void main(String[] args) {
        contoh1();
        contoh1Biasa();
        contoh2();
        contoh2Biasa();
            
    }
    public static void contoh1(){
        List<Integer> harga = Arrays.asList(1000,1500,2500,10000);

        int total = harga.stream()
                .reduce(0,(a,b)->a+b); //reduce(identity, BinaryOperator)
                                        //identity = initialValue disesuaikan dengan tipe datanya

        System.out.println(total);

    }
    public static void contoh1Biasa(){
        List<Integer> harga = Arrays.asList(1000,1500,2500,10000);
        
        int total =0;
        for (int h : harga) {
            total += h;
        }

        System.out.println(total);

    }
    public static void contoh2(){
        List<String> nama = Arrays.asList("Rizki","Ishak","Kurnia");

        String namaPlngPnjng = nama.stream()
                .reduce("",(a, b)-> a.length() > b.length()? a : b);

        System.out.println(namaPlngPnjng);
    }
    public static void contoh2Biasa(){
        List<String> nama = Arrays.asList("Rizki","Ishak","Kurnia");
        String namaPlngPnjng = "";
        for (int i=0;i<3;i++) {
            if(nama.get(i).length()>namaPlngPnjng.length()){
                namaPlngPnjng = nama.get(i);
            }
        }

        System.out.println(namaPlngPnjng);
    }
}