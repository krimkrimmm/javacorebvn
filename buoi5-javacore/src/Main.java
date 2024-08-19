//OOP: ltrinh hg đối tượng
//có 4 tchat: đóng gói, đa hinh,kế thưa,trưu tượng
//bai5:
import java.util.Scanner;
public class Main {
    public static <Peopleman> void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
//        // khởi tạo đối tượng
//        People cat = new People();
//        System.out.println(cat);
//        People worker = new People("miw");
//        System.out.println(worker);
//        People man = new People( "man",true);
//        System.out.println(man);
//        calculateArea(10, 5, "HV");
// tạo class Vehicle: vận tốc, name
//hãy tạo ra các đối tượng tu vehicle va in ra nó, các giá trị của nó phải la do nguoi sdung nhập vao
//in ra ngoai man hinh
        System.out.println("nhập tên ptien:");
        String name = scanner.nextLine();
        System.out.println("nhập vận tốc xe:");
        double speed = Double.parseDouble(scanner.nextLine());
        Vehicles bike = new Vehicles(speed,name);
        System.out.println(bike);
        //

        System.out.println("nhập vao mua ma bạn yeu thích:");
        String s = scanner.nextLine();
        System.out.println("mua m thích la:"+s);

        //peopleman
        Peopleman peopleman = new People(18,"a");
        peopleman.setAge(19);
        System.out.println(peopleman.getAge());
        peopleman.setName("haha");
        System.out.println(peopleman.getName());
    }


    public static int calculateArea(int s, int a, String name) {
        return s;

    }
}







