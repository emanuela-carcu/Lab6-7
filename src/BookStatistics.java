public class BookStatistics implements Visitor{
    private int noTable = 0;
    private int noTableOfContents = 0;
    private int noParagraph = 0;
    private int noImage = 0;
    private int noImageProxy = 0;
    private int noSection = 0;
    @Override
    public void visitBook(Book book) {


    }

    @Override
    public void visitSection(Section section) {
        noSection++;
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        noTableOfContents++;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        noParagraph++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        noImageProxy++;
    }

    @Override
    public void visitImage(Image image) {
        noImage++;
    }

    @Override
    public void visitTable(Table table) {
        noTable++;
    }

    public void printStatistics(){
        System.out.println("Book Statistics");
        System.out.println();
        System.out.println("Number of Images: "+ " " + noImage);
        System.out.println();
        System.out.println("Number of Tables: "+ " " + noTable);
        System.out.println();
        System.out.println("Number of Paragraphs: "+ " " + noParagraph);
        System.out.println();

    }
}
