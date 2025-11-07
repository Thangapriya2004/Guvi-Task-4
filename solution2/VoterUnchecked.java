package solution2;

public class VoterUnchecked {
    private int voterId;
    private String name;
    private int age;

    public VoterUnchecked(int voterId, String name, int age) {
        if (age < 18) {
            throw new InvalidVoterAgeRuntimeException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;

    }
}

