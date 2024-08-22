class Book {
    void read() {
        System.out.println("Reading a book");
    }
}

class EBook extends Book {
    void download() {
        System.out.println("Downloading an eBook");
    }
}

public class SingleInheritanceExample5 {
    public static void main(String[] args) {
        EBook ebook = new EBook();
        ebook.read();     
        ebook.download(); 
    }
}
