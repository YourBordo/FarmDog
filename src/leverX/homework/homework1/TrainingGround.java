package leverX.homework.homework1;

import java.util.List;

public class TrainingGround {

    public TrainingGround() { };

    //dog has certain activity, depends it's age
    public void doActivity(Dog dog) {
        switch (dog.getAge()) {
            case "puppy": {
                System.out.println(dog.getName() + " is training");
                break;
            }
            case "adult": {
                System.out.println(dog.getName() + " is working");
                break;
            }
            case "old": {
                System.out.println(dog.getName() + " is chilling");
                break;
            }
            default: {
                break;
            }
        }

        //after activity dog become hungry
        dog.setHungry(true);
    };

}
