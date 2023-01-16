public interface Element {

    public void print();

    public void add(Element element);
    public void remove(Element element);
    public Element get(int i);

    public void accept(Visitor visitor);
}
