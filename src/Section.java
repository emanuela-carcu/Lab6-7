import java.util.ArrayList;
import java.util.List;

public class Section implements Element, Visitee{

    private String title;
    private List<Element> elements;

    public Section (String title){
        this.title = title;
        elements = new ArrayList<>();
    }

    @Override
    public void print() {
            System.out.println(title);
            for(Element e: elements) {
                e.print();
            }
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public Element get(int i) {
        return elements.get(i);
    }

    @Override
    public void accept(Visitor visitor) {
        for(Element e: elements) {
            e.accept(visitor);
        }
        visitor.visitSection(this);
    }


}

