/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Optional class in Java is used to get the sequential stream of the only value
 * present in this Optional instance. Jika tidak ada value, maka akan return
 * stream kosong
 *
 * @author rzkrn20
 */
public class Optional_ {

    public static void main(String[] args) {
        
        //versi biasa seperti yang ada di Reduce.java
        
        contoh2biasa();
    }

    public static void contoh1() {
        List<Integer> harga = Arrays.asList();

        Optional<Integer> total = harga.stream()
                .reduce((a, b) -> a + b);// tidak perlu menambahkan identity

        System.out.println(total);

    }

    public static void contoh2() {    
        Optional<Integer> nilai1 = Optional.ofNullable(null);//allow null
        Optional<Integer> nilai2 = Optional.of(3);// create an optional
        
        //Untuk cek ada valuenya atau tidak
        System.out.println(nilai1.isPresent());
        System.out.println(nilai2.isPresent());
        
        //return value, kalau tidak ada return default value (di sini berarti return 0)
        Integer n1 = nilai1.orElse(0);
        Integer n2 = nilai2.get();
        System.out.println(n1+n2);

    }
    public static void contoh2biasa(){
        Integer n1 = null;
        Integer n2 = 3;
        Integer n3;
        //Versi biasa isPresent
        if (n1 == null){
            System.out.println("true");
        }
        else System.out.println("false");
        //versi biasa orElse
        if (n1 == null){
            n3=0;
        }
        else n3=n1;
        System.out.println(n3+n2);
    }
}
