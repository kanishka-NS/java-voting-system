package votingsystem;

public class Voter extends person {
    private int voterId;
    private boolean hasVoted;

    public Voter(int voterId, String name) {
        super(name);
        this.voterId = voterId;
        this.hasVoted = false;
    }

    public int getVoterId() {
        return voterId;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void vote(Candidate candidate) {
        if (!hasVoted) {
            candidate.addVote();
            hasVoted = true;
            System.out.println(name + " successfully voted for " + candidate.getName());
        } else {
            System.out.println("Error: Voter " + getName() + " has already voted!");
        }
    }
}
