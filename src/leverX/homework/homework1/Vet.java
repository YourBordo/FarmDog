package leverX.homework.homework1;


public class Vet {
    public Vet() {
    }

    public void checkDog(Dog dog) {
        if (dog.isHealthy()) {
            System.out.println(dog.getName() + " is already healthy");
        } else {
            dog.setHealthy(true);
            System.out.println(dog.getName() + " is cured");
        }
    };

}
