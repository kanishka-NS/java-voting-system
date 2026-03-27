package votingsystem;

import java.io.*;
import java.util.*;

public class VotingSystem {
    private ArrayList<Candidate> candidates = new ArrayList<>();
    private ArrayList<Voter> voters = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Load candidates and voters from files
    public void loadData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("candidates.txt"));
            String line;
            while ((line = br.readLine()) != null) candidates.add(new Candidate(line.trim()));
            br.close();

            br = new BufferedReader(new FileReader("voters.txt"));
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                voters.add(new Voter(Integer.parseInt(parts[0].trim()), parts[1].trim()));
            }
            br.close();

            System.out.println("Data loaded!\n");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Save results to a file
    public void saveResults() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("results.txt"))) {
            pw.println("Election Results:");
            for (Candidate c : candidates)
                pw.println(c.getName() + " - " + c.getVotes() + " votes");
        } catch (Exception e) {
            System.out.println("Error saving results!");
        }
    }

    // Cast a vote
    public void castVote() {
        System.out.print("Enter Voter ID: ");
        int voterId = sc.nextInt();
        sc.nextLine();

        Voter voter = voters.stream().filter(v -> v.getVoterId() == voterId).findFirst().orElse(null);

        if (voter == null) { System.out.println("Invalid ID!"); return; }
        if (voter.hasVoted()) { System.out.println("Already voted!"); return; }

        for (int i = 0; i < candidates.size(); i++)
            System.out.println((i + 1) + ". " + candidates.get(i).getName());

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        if (choice < 1 || choice > candidates.size()) { System.out.println("Invalid choice!"); return; }

        voter.vote(candidates.get(choice - 1));
    }

    // Show results and save them
    public void showResults() {
        System.out.println("\nElection Results:");
        for (Candidate c : candidates)
            System.out.println(c.getName() + " - " + c.getVotes() + " votes");
        saveResults();
    }

    // Menu loop
    public void startElection() {
        while (true) {
            System.out.println("\n--- Menu ---\n1. Cast Vote\n2. Show Results\n3. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> castVote();
                case 2 -> showResults();
                case 3 -> { return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.loadData();
        vs.startElection();
    }
}
