import java.util.LinkedList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("=========== Tugas 2 ===========");
       System.out.println("Nama\t : Deyola Fadwa Shifana");
       System.out.println("Nim\t : 2011522032");
       System.out.println("===============================\n");

       LinkedList <String> saya = new LinkedList<>();
       saya.add("d");
       saya.add("e");
       saya.add("y");
       saya.add("o");
       saya.add("l");
       saya.add("a");
       saya.add(" ");
       saya.add("f");
       saya.add("a");
       saya.add("d");
       saya.add("w");
       saya.add("a");
       saya.add(" ");
       saya.add("s");
       saya.add("h");
       saya.add("i");
       saya.add("f");
       saya.add("a");
       saya.add("n");
       saya.add("a");
       System.out.println("Nama\t:"+saya+" -> Ukuran :" +saya.size());

       //add karakter lain yang anda inginkan
       System.out.println("\n=== 1. ADD KARAKTER ===");

       saya.addFirst("2011522032");   
       saya.addLast("(Cipa)");
       System.out.println("\tNama\t: "+saya+" -> Ukuran :" +saya.size());

       //sisipkan karakter lain yang anda inginkan
       System.out.println("\n=== 2. SISIPKAN KARAKTER ===");
       saya.set(1,"D");
       saya.set(8 ,"F");
       saya.set(14 ,"S");
       System.out.println("\tNama\t: "+saya+" -> Ukuran :" +saya.size());

       //hapus beberapa karaker yang ingin anda hapus
       System.out.println("\n=== 3. HAPUS KARAKTER ===");
       saya.removeFirst();
       saya.removeLast();
       System.out.println("\tNama\t: "+saya+", Ukuran :" +saya.size());

       //buat fungsi POP dan PUSH pada project anda
       System.out.println("\n=== 4. FUNGSI POP DAN PUSH ===");
       
       //POP
       System.out.println("=== pop");
       saya.pop();
       System.out.println("\tNama\t: "+saya+" -> Ukuran :" +saya.size());

       //PUSH
       System.out.println("=== push");
       saya.push("A");
       saya.push("B");
       saya.push("C");
    
       System.out.println("\tNama\t: "+saya+" -> Ukuran :" +saya.size());
    
    }
}