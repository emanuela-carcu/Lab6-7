import java.util.ArrayList;
import java.util.List;

public class Book implements Visitee{
    private String name;
    private List<Element> elements;
    private List<Author> authors;

    public Book(String name){
        this.name = name;
        authors = new ArrayList<>();
        elements = new ArrayList<>();
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public void addContent(Element stuff){
        elements.add(stuff);
    }

    public void print() {
        System.out.println("Book "+ name);
        System.out.println();
        System.out.println("Authors: ");
        for (Author a: authors) {
            a.print();
        }
        System.out.println();
        for (Element e:elements) {
            e.print();
        }

    }

    @Override
    public void accept(Visitor visitor) {
        for(Element e: elements) {
            e.accept(visitor);
        }
        visitor.visitBook(this);
    }

}
