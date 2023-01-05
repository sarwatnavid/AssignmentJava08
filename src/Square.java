public class Square {

    float length;
    float width;

    public Square (float w, float l){
        length= l;
        width =w;
    }
//    Perimeter=2x(length+width)
    public float calculatePerimeter(){
        return 2 * (length + width);

    }
    public static void main(String[] args) {
        Square square1 = new Square(5f, 5f);
        System.out.println("The Perimeter is: " + square1.calculatePerimeter());
    }

}
