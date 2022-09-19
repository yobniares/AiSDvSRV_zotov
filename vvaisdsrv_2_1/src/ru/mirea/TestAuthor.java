package ru.mirea;

public class TestAuthor {

    public static void main(String[] args) {
        Author author = new Author("Imya", "123@123.123",'m');
        System.out.println(author);
        System.out.println(author.getEmail());
        System.out.println(author.getName());
        System.out.println(author.getGender());
        author.setEmail("234@gmail.ru");
        System.out.println(author);
        System.out.println("Test passed successfully!");
    }
}
