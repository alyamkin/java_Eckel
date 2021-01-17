
package operatorsex5ex6compareobj;


public class OperatorsEx5Ex6CompareObj {


    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";
        Dog dog2 = new Dog();
        dog2.name = "scruffy";
        dog2.says = "Wurf!";
        Dog dog3 = new Dog();
        dog1 = dog3;
        
        System.out.println(dog2 == dog2);
        System.out.println(dog2.equals(dog2));
        System.out.printf("%s says %s\n", dog1.name, dog1.says);
        System.out.printf("%s says %s\n", dog2.name, dog2.says);
    }
    
}
