/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class Rectangle extends Shape { /* Concrete Element */
	private int width, height;
	public Rectangle(int width, int height, 
    int x, int y) {
        this.width = width;
        this.height = height;
        super.setxPos(x);
        super.setyPos(y);
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
