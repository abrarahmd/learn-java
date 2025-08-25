public class Variables {
    public static void main(String[] args) {
        int myAge = 24; // int stores values size of billions
        String message = "Hello, User!";
        int userAge = myAge;
        myAge = 25;
        byte herAge = 23; // byte stores values size of 8 bits
        int monsterAge = 945_123_231; // _ for better readability
        long monsterMotherAge = 1_050_056_049_088L; // long stores values size of trillions
        float myIncome = 1000F;
        double incomeYour = 200_000D;
        char start = 'A';
        boolean isEligible = false;

        
        System.out.println("Message: " + message); 
        System.out.println("My age: " + myAge);
        System.out.println("Your age: " + userAge);
        System.out.println("Her age: " + herAge);
        System.out.println("Monster age: " + monsterAge);
        System.out.println("Monster Mother age: " + monsterMotherAge);
        System.out.println("My income: " + myIncome);
        System.out.println("Your income: " + incomeYour);

    }

}