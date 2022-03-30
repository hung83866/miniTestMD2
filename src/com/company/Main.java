package com.company;

import Books.Book;
import Books.FictionBook;
import Books.ProgrammingBook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Book[] book = new Book[10];
        book[0] = new ProgrammingBook(15, "md1", 200000, "NĐC", "java", "ABCD");
        book[1] = new ProgrammingBook(10, "md12", 120000, "NĐC", "PHP", "ABCD3");
        book[2] = new ProgrammingBook(06, "md11", 180000, "NĐC", "java", "ABCD1");
        book[3] = new ProgrammingBook(13, "md5", 220000, "NĐC", "C++", "ABCD2");
        book[4] = new ProgrammingBook(01, "md19", 210000, "NĐC", "java", "ABCD6");
        book[5] = new FictionBook(02, "ảo ma", 300000, "HMH", "Hành ĐỘng");
        book[6] = new FictionBook(03, "ảo ma canada", 350000, "HMH", "18+");
        book[7] = new FictionBook(04, "ảo ma silabia", 303000, "HMH", "20+");
        book[8] = new FictionBook(07, "ảo ma vãi chưởng", 222000, "HMH", "40+");
        book[9] = new FictionBook(23, "ảo ma séc bi a", 333000, "HMH", "tuổi tí mới được xem");
// tính giá 10 book:
        double TotalPrice = 0;
        for (Book b1: book) {
            TotalPrice += b1.getPrice();
        }
        System.out.println("tổng 10 cuốn total = "+TotalPrice);
//  đếm số sách có language truyen vao:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập language muốn tìm");
        String language = scanner.next();
        int count = 0;
        for (Book listBook: book ) {
           if (listBook instanceof ProgrammingBook){
               ProgrammingBook programmingBook = (ProgrammingBook) listBook;
               if (programmingBook.getLanguage().equals(language)){
                   count++;
               }
           }
        }
        System.out.println("số sách cần tìm = "+count);

    }
}
