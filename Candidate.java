package votingsystem;

public class Candidate extends person {
    private int votes;

    public Candidate(String name) {
        super(name);
        this.votes = 0;
    }

    public void addVote() {
        votes++;
    }

    public int getVotes() {
        return votes;
    }
}
