/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author USER
 */
public class Runmain {
    public static void main(String[] args) {
        Person s1 = new Person("Thúy", 19, "Nữ", "Xem phim");
        System.out.println(s1);
        Person s = new Person();
        s.setName("Thúy");
        s.setAge(19);
        s.setGender("Nữ");
        s.setHobby("Xem phim"); 
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Gender: " + s.getGender());
        System.out.println("Hobby: " + s.getHobby());
    }
}