List<String> list = new ArrayList<>();
         list.add("X");
         list.add("Y");
         list.add("X");
         list.add("Y");
         list.add("Z");
         list.remove(new String("Y"));
         System.out.println(list);

//------------------

String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
        for (int i = 0; i < arr.length; i++) { //Line n1
            for (int j = 0; j < arr[i].length; j++) { //Line n2
                switch (arr[i][j]) { //Line n3
                    case "2":
                    case "4":
                    case "6":
                        break; //Line n4
                    default: 
                        continue; //Line n5
                }
                System.out.print(arr[i][j]); //Line n6
            }
        }

//---------

List<String> list = new ArrayList<>();
         list.add(0, "Array");
         list.add(0, "List");

//----------

class Parent {
     int i = 10;
     Parent(int i) {
         super();
         this.i = i;
     }
}
 
class Child extends Parent {
     int j = 20;
 
     Child(int j) {
         super(0);
         this.j = j;
     }
 
     Child(int i, int j) {
         super(i);
         this(j);
     }
 
}

//-----
public class Test {
 
     private static void add(double d1, double d2) {
         System.out.println("double version: " + (d1 + d2));
     }
 
     private static void add(Double d1, Double d2) {
         System.out.println("Double version: " + (d1 + d2));
     }
 
     public static void main(String[] args) {
         add(10.0, new Integer(10));
     }
 
}
