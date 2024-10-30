//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NarrowAngle narrowAngle = new NarrowAngle(12,24);
        RightAngle rightAngle = new RightAngle(21);
        MineAngle mineAngle = new MineAngle(10,10,10);
        Circle circle = new Circle(10.4);
        Rectangle rectangle = new Rectangle(14.1);
        Shape[]shapes = {narrowAngle,rightAngle,mineAngle,circle,rectangle};
        for(Shape num : shapes){
            System.out.println(num);
        }
    }
}



//
//public abstract double getPerimeter()
//
//деген абстракт методун  Shape деген класска кошунуз.
//
//Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.