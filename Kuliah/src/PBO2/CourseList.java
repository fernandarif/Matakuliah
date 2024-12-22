package PBO2;

import java.util.ArrayList;

// Kelas untuk mengelola daftar mata kuliah
public class CourseList {
    private ArrayList<Course> courses; // List untuk menyimpan objek mata kuliah

    // Constructor untuk menginisialisasi list
    public CourseList() {
        courses = new ArrayList<>();
    }

    // Metode untuk menambah mata kuliah ke dalam daftar
    public void addCourse(String name) {
        courses.add(new Course(name)); // Membuat objek Course baru dan menambahkannya ke list
    }

    // Metode untuk mencari mata kuliah berdasarkan nama
    public Course findCourse(String name) {
        for (Course course : courses) {
            // Membandingkan nama (case-insensitive) untuk menemukan mata kuliah
            if (course.getName().equalsIgnoreCase(name)) {
                return course;
            }
        }
        return null; // Mengembalikan null jika mata kuliah tidak ditemukan
    }

    // Metode untuk menghitung jumlah mata kuliah dalam daftar
    public int getTotalCourses() {
        return courses.size(); // Mengembalikan ukuran list
    }

    // Metode untuk menampilkan semua mata kuliah dalam daftar
    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("Daftar mata kuliah kosong."); // Pesan jika list kosong
        } else {
            System.out.println("Daftar Mata Kuliah:");
            for (Course course : courses) {
                System.out.println("- " + course.getName()); // Menampilkan nama setiap mata kuliah
            }
        }
    }
}
