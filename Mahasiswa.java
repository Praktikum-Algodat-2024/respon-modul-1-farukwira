import java.util.Collections;
import java.util.LinkedList;

public class Mahasiswa {
    LinkedList<String> praktikan;

    public Mahasiswa() {
        praktikan = new LinkedList<>();
    }

    public void addFirst(String name) {
        praktikan.addFirst(name);
    }

    public void addLast(String name) {
        praktikan.addLast(name);
    }

    public void delete(String name) {
        praktikan.remove(name);
    }

    public void reverseMiddle() {
        int start = 1;  
        int end = praktikan.size(); 
        if (start < end) {
            LinkedList<String> middlePart = new LinkedList<>(praktikan.subList(start, end));
            Collections.reverse(middlePart);
    
            for (int i = 1; i < middlePart.size(); i++) {
                praktikan.set(start + i, middlePart.get(i));
            }
        }
    }

    public void reverseAll() {
        Collections.reverse(praktikan);
    }

    public void displayList() {
        System.out.println("============================");
        System.out.println("Daftar Praktikan Kelompok 11");
        System.out.println("============================");
        for (String name : praktikan) {
            System.out.println(name);
        }
    }
    
    public void displayList1() {
        System.out.println("========================================");
        System.out.println("List Presentasi Setelah Wira Tidak Hadir");
        System.out.println("========================================");
        for (String name : praktikan) {
            System.out.println(name);
        }
    }

    public void displayList2() {
        System.out.println("========================================");
        System.out.println("  List Presensi Setelah Dibalik Tengah  ");
        System.out.println("========================================");
        for (String name : praktikan) {
            System.out.println(name);
        }
    }
    public void displayList3() {
        System.out.println("========================================");
        System.out.println("      List Presensi Setelah Dibalik     ");
        System.out.println("========================================");
        for (String name : praktikan) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Mahasiswa kelompok11 = new Mahasiswa();

        kelompok11.addFirst("Nayla");
        kelompok11.addLast("Nini");
        kelompok11.addLast("Wira");
        kelompok11.addLast("Ananta");
        kelompok11.addLast("Salsa");
        kelompok11.addLast("Raja");
        kelompok11.addLast("Alfath");
        kelompok11.addLast("Nopal");

        System.out.println("Setelah penambahan awal:");
        kelompok11.displayList();

        kelompok11.delete("Wira");
        kelompok11.displayList1();

        kelompok11.reverseMiddle();
        kelompok11.displayList2();

        kelompok11.reverseAll();
        kelompok11.displayList3();
    }
}
