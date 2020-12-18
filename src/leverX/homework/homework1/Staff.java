package leverX.homework.homework1;


public class Staff {
    public Staff(){};

    public void cleanAviary(Aviary aviary){
        if (aviary.isClean()) {
            System.out.println("aviary " + aviary.getNumber() + " is already cleaned");
        } else {
            aviary.setClean(true);
            System.out.println("aviary " + aviary.getNumber() + " is cleaned");
        }
    };

    //dog has certain food, depends it's age
    public void feedDog(Dog dog){
        if(dog.isHungry()){
            dog.setHungry(false);
            System.out.println(dog.getName()  + " is fed with food for " + dog.getAge() + " dogs");
        } else {
            System.out.println("dog is already full");
        }
    };
}
