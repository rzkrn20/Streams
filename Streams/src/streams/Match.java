/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.util.Arrays;
import java.util.List;


/**
 * 
 *
 * @author rzkrn20
 */
public class Match{

    public static void main(String[] args) {
        contoh1();
        contoh1Biasa();
        contoh2();
        contoh2Biasa();


    }
    public static void contoh1(){
        /*AllMatch
        return (boolean) true ketika SEMUA datanya memenuhi predicate yang diberikan
        */
        
        List<Integer> harga = Arrays.asList(1000,1500,2500,10000,null);
        boolean hasil = harga.stream()
                              .allMatch(h-> h != null);
        System.out.println(hasil);
        System.out.println("====================");
    }
        public static void contoh1Biasa(){
        List<Integer> harga = Arrays.asList(1000,1500,2500,10000,null);
        try {
            for (int h : harga) {
                System.out.println(h);
            }
            System.out.println("True");
        }
        catch (Exception e) {
            System.out.println("False");
        }
        System.out.println("====================");
    }
    public static void contoh2(){
        /*AnyMatch
        return (boolean) true ketika SALAH SATU datanya memenuhi predicate yang diberikan
        */
        List<Integer> harga = Arrays.asList(1000,1500,2500,10000,null);
        boolean hasil = harga.stream()
                             .anyMatch(h-> h != null);
        System.out.println(hasil);
        System.out.println("====================");
    }
    public static void contoh2Biasa(){
        List<Integer> harga = Arrays.asList(1000,1500,2500,10000,null);
        try {
            for (int h : harga) {
                System.out.println(h);
            }
            System.out.println("False");
        }
        catch (Exception e) {
            System.out.println("True");
        }
        System.out.println("====================");
    }
}
