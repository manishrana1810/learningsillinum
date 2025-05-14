import org.w3c.dom.css.Rect;

public class Rectangle {
    int length,width;
    public Rectangle(){
        length=1;
        width=1;


    }
    public Rectangle(int a, int b){
        length=a;
        width=b;

    }
    public void perimeter(int a,int b){
        int perimeter;
        perimeter=2*(a+b);
        System.out.println("Perimeter of the rectangle is ="+perimeter);
    }
    public void area(int a,int b){
        int area;
        area=a*b;
        System.out.println("Area of the rectangle ="+area);
    }

    public static void main(String[] args) {
        Rectangle obj1=new Rectangle();
        Rectangle obj2=new Rectangle(20,30);
        obj1.perimeter(10,20);
        obj2.area(10,20);



    }

}
