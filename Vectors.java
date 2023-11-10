import java.util.Vector;
public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector();
        //1st Add
        for(int i=0;i<5;i++){
            v.add(i);
        }
        //2nd display
        System.out.println("the original Vector is :"+ v );
        
        //3rd addAtindex
        v.add(3,100);

        //4th deleteAtindex
        v.remove(4);

        //5th Search using index
        int Element=v.get(3);

        //6th Search Index
        int indx=v.indexOf(100);

        //7th check Size 
        int Size=v.size();

        //8th if element Exists
        boolean b=v.contains(100);

        //9th if empty or not
        boolean c=v.isEmpty();

        //10th Last index
        int LastIndex=v.lastIndexOf(100);

        //extra clone vector
        Vector<Integer> vec = (Vector<Integer>) v.clone();
    }
}
