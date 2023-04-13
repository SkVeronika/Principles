package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "9200№567560";
        post.patronymic = "Иванович";
        post.phone = "+7(999)123-45-67";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 4;
        post.birthday.month = 8;
        post.birthday.year = 1993;
    }
}