package leverX.homework.homework1;


import java.util.ArrayList;

public class FarmDog {

    public static void main(String[] args) {

        final int AMOUNT_OF_DOGS = 4;
        ArrayList<Dog> dogs= new ArrayList<>();
        Staff staff = new Staff();
        Vet vet = new Vet();
        Dog currentDog;
        TrainingGround trainingGround = new TrainingGround();

        for (int dog = 0; dog < AMOUNT_OF_DOGS; ++dog) {
            dogs.add(new Dog());
            currentDog = dogs.get(dog);
            currentDog.dogInfo();
            staff.feedDog(currentDog);
            staff.cleanAviary(currentDog.getAviary());
            vet.checkDog(currentDog);
            trainingGround.doActivity(currentDog);
            staff.feedDog(currentDog);

        }

    }

}
