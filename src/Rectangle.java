public class Rectangle {
    float length;
    float width;

    public Rectangle (float w, float l) {
        length = l;
        width = w;
    }
        public float calculateArea() {
            return  length * width;

        }
    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle(4f, 6f );
         System.out.println("The area is: " + rectangle1.calculateArea()+ " square feet");

    }

}
