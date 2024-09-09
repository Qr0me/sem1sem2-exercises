public class Driver {
    public static void main(String[] args){
        Author auth = new Author();
        auth.setName("AAAA");
        auth.setEmail("aaa@gmail.com");
        auth.setGender('M');

        Author auth2 = new Author();
        auth2.setName("BBB");
        auth2.setEmail("bbb@gmail.com");
        auth2.setGender('F');

        Author auth3 = new Author();
        auth3.setName("CCCCC");
        auth3.setEmail("ccc@gmail.com");
        auth3.setGender('F');

        Author[] arr = {auth, auth2, auth3};

        Book book = new Book();
        book.setName("AAABBBCCC");
        book.setAuthor(arr);
        book.setPrice(42069);

        System.out.println(book.getQty());
        System.out.println(book.getAuthor());
        
    }
}
