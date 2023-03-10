package rikkei.academy;

public class Main {
    public static void main(String[] args) {
//Kiểm thử Class Shape
//        System.out.println("----------SHAPE----------");
//        Shape shape = new Shape();
//        System.out.println(shape);
//        shape = new Shape("red", false);
//        System.out.println(shape);
////kiểm thử Class Circle
//        System.out.println("----------CIRCLE----------");
//        Circle circle = new Circle();
//        System.out.println(circle);
//        circle = new Circle(3.5);
//        System.out.println(circle);
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
////Kiểm thử RECTANGLE
//        System.out.println("---------RECTANGLE----------");
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//        rectangle = new Rectangle(2.3,5.8);
//        System.out.println(rectangle);
//        rectangle = new Rectangle("orange", true,2.5,3.8);
//        System.out.println(rectangle);
////Kiểm thử SQUARE
//        System.out.println("----------SQUARE----------");
//        Square square = new Square();
//        System.out.println(square);
//        square= new Square(2.3);
//        System.out.println(square);
//        square= new Square("yellow", true , 5.8);
//        System.out.println(square);
        System.out.println("" +
                "\n" +
                "---hình tròn---");
        //kiểm thử hình tròn
        Circle circle = new Circle(5);
        System.out.println("Diện tích trước khi thay đổi kích thước--->"+circle.getArea());
        circle.resize(50);
        System.out.println("Diện tích sau khi thay đổi kích thước--->"+circle.getArea());
        System.out.println("" +
                "\n" +
                "---hình chữ nhật---" +
                "" +
                "");
        //kiểm thử hcn
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("Diện tích trước khi thay đổi kích thước--->"+rectangle.getArea());
        rectangle.resize(50);
        System.out.println("Diện tích sau khi thay đổi kích thước--->"+rectangle.getArea());
        System.out.println("" +
                "\n" +
                "---hình vuông---");
        // k thử hình vuông
        Square square = new Square(5);
        System.out.println("Diện tích trước khi thay đổi kích thước--->"+square.getArea());
        square.resize(100);
        System.out.println("Diện tích sau khi thay đổi kích thước--->"+square.getArea());
    }
}


