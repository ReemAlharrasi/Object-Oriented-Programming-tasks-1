package task416_417;

public class Main {
    void main(){
        //example
        Book b = new Book();
        b.title="Java Basics";
        b.author="Maryam";
        b.printInfo();

        //task417
        //In main, build three books: one by Ishaq, one by Fatma, one by Salim.
        Book c = new Book();
        c.title="Java Basics";
        c.author="Ishaq";
        c.printInfo();

        Book d = new Book();
        d.title="Business Basics";
        d.author="Fatma";
        d.printInfo();

        Book e = new Book();
        e.title="Web Computing Basics";
        e.author="Salim";
        e.printInfo();
    }
}
