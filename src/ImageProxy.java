public class ImageProxy implements Element, Visitee{
    Image realImage;
    String url;

    Image loadImage(String url) {
        if(realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    ImageProxy(String url) {
        this.url = url;
    }

    @Override
    public void print() {
        loadImage(url).print();
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
        visitor.visitImageProxy(this);
    }
}
