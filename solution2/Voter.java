package solution2;

public class Voter {
    int voterId;
    String name;
    int age;

    Voter(int voterId,String name,int age ) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("invalid age for voter");

        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;

    }
    void display() {
        System.out.println("VoterId: "+ voterId + ", Name: " + name + ",Age:" + age);
        System.out.println("solution2.Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
