//1)import Package.*

//package Car;
//import Vehicle.*;
//public class TestPack {
//    public static void main(String[] args) {
//        TestPack1 obj=new TestPack1();
//        obj.pack1();
//    }}

//2)import Package.classname

//package Car;
//import Vehicle.TestPack1;
//public class TestPack{
//    public static void main(String[] args) {
//        TestPack1 ob=new TestPack1();
//        ob.pack1();
//    }
//}

//3)fully qualified name

package Car;
import Vehicle.TestPack1;
public class TestPack{
    public static void main(String[] args) {
        TestPack1 obj=new TestPack1();
        obj.pack1();
    }
}