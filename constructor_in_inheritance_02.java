class base1{
    base1(){
        System.out.println("hello , base1's constructor");
    }
    base1(int a){
        System.out.println("still, constructor of base1 class having value as " + a);
    }
}
class derived1 extends base1{
    derived1(){
        System.out.println("hello , derived1's constructor");
    }
    derived1(int a , int b){
        super(a);
        System.out.println("still, constructor of derived1 class having value as " + a + " " + b);
    }
        }
        class childderived extends derived1{
            childderived(){
                System.out.println("hello , childdervied's constructor");
            }
            childderived(int a, int b , int c){
                super( a, b);
                System.out.println("still, constructor of derived1 class having value as " + a + " " + b + c);
            }
        }
public class constructor_in_inheritance_02 {
    public static void main(String[] args) {
        childderived c = new childderived(8 , 9 ,7);
    }
}
