package _03_lsp.shapes;

public class Square extends Rectangle {

    @Override
    public void setWight(int width){
        super.setWight(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWight(height);
        super.setHeight(height);
    }

}
