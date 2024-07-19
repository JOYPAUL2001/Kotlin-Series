package Day5.CompanionObject;

public class Companions {
    public static void main(String[] args) {

        MyClass.j10();
        MyClass.B.j9();
        //here we can see that we can access the JvmStatic annotated method just by calling the class name,
        // just like static mwthod in java.
    }
}
