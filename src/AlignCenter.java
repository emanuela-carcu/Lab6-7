public class AlignCenter implements AlignStrategy{
    @Override
    public void render(Paragraph p) {
        System.out.println("Center align: "+p.getText());
    }
}
