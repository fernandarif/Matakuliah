package PBO2;

import java.util.Scanner;

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner untuk membaca input dari pengguna
        CourseList courseList = new CourseList(); // Membuat objek CourseList untuk mengelola daftar mata kuliah
        int choice; // Variabel untuk menyimpan pilihan menu pengguna

        do {
            // Menampilkan menu utama
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mata Kuliah");
            System.out.println("2. Cari Mata Kuliah");
            System.out.println("3. Tampilkan Jumlah Mata Kuliah");
            System.out.println("4. Tampilkan Daftar Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt(); // Membaca pilihan menu
            scanner.nextLine(); // Mengkonsumsi karakter newline

            switch (choice) {
                case 1:
                    // Menambah mata kuliah baru
                    System.out.print("Masukkan nama mata kuliah: ");
                    String name = scanner.nextLine(); // Membaca nama mata kuliah dari input pengguna
                    courseList.addCourse(name); // Menambahkan mata kuliah ke daftar
                    System.out.println("Mata kuliah berhasil ditambahkan.");
                    break;

                case 2:
                    // Mencari mata kuliah berdasarkan nama
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String searchName = scanner.nextLine(); // Membaca nama mata kuliah yang dicari
                    Course foundCourse = courseList.findCourse(searchName); // Mencari mata kuliah
                    if (foundCourse != null) {
                        System.out.println("Mata kuliah ditemukan: " + foundCourse.getName());
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan.");
                    }
                    break;

                case 3:
                    // Menampilkan jumlah total mata kuliah
                    System.out.println("Jumlah mata kuliah: " + courseList.getTotalCourses());
                    break;

                case 4:
                    // Menampilkan daftar semua mata kuliah
                    courseList.displayCourses();
                    break;

                case 5:
                    // Keluar dari program
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    // Pesan jika pilihan tidak valid
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 5); // Program akan terus berjalan hingga pengguna memilih opsi 5

        scanner.close(); // Menutup scanner untuk mencegah kebocoran resource
    }
}
