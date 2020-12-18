package leverX.homework.homework1;

public class Dog {

    private String name;
    private boolean isHungry;
    private boolean isTrained;
    private String age;
    private Aviary aviary;
    private boolean isHealthy;


    public Dog() {
        //dog's name generated with 3-digit number
        name = "Dog" + (int) (Math.random() * 899 + 100);
        //possibility ~50%
        isHungry = Math.random() < 0.5;
        isHealthy = Math.random() < 0.5;
        //each dog has it's own aviary
        aviary = new Aviary();

        //possibility of certain age ~30%
        if (Math.random() < 0.3) {
            age = "puppy";
        } else if (Math.random() < 0.6) {
            age = "adult";
        } else {
            age = "old";
        }

        //possibility of generation trained dog ~50%
        //puppies can't be trained
        if (age.equals("adult") || age.equals("old")) {
            isTrained = Math.random() < 0.5;
        }
    }

    public void dogInfo() {
        System.out.println("---------------------------------------"
                + "\nname: " + name + "\nage: " + age
                + "\naviary number: " + aviary.getNumber()
        );

        if (isTrained) {
            System.out.print(name + " is trained, ");
        } else {
            System.out.print(name + " isn't trained, ");
        }
        if (isHealthy) {
            System.out.print("healthy, ");
        } else {
            System.out.print("not healthy, ");
        }
        if (isHungry) {
            System.out.print("hungry\n");
        } else {
            System.out.print("full\n");
        }

    }

    public boolean isHealthy() {
        return isHealthy;
    }
    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }
    public Aviary getAviary() {
        return aviary;
    }
    public String getName() {
        return name;
    }
    public boolean isHungry() {
        return isHungry;
    }
    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
    public String getAge() {
        return age;
    }
}
