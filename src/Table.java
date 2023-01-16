public class Table implements Element, Visitee{
    private String name;

    public Table(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Table "+ name);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int i) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}
