import java.util.Scanner;

public class UNVote {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of participating countries");
        final int numOfCountries = scanner.nextInt();
        int i = 0;
        String[] countryName = new String[numOfCountries];
        int[] countryVote = new int[numOfCountries];
        int vFor = 0, vAgainst = 0, vAbstain = 0, vVeto = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("We're about to start the vote... each country should write down it's name followed by a vote code." +
                "\n The vote code are as followed:\n1 - For\n2 - Against\n3 - Abstain\n4 - Veto\n\nNone valid vote will be counted as abstained vote");

        for (i = 0; i <= numOfCountries; i++) {
            System.out.println(".\n.\nVote #" + (i + 1) + " is ready, please enter country name followed by vote code");
            countryName[i] = scanner.next();
            countryVote[i] = scanner.nextInt();
            if (countryVote[i] == 4) {
                vVeto++;
                break;
            } else if (countryVote[i] == 1) {
                vFor++;
                continue;
            } else if (countryVote[i] == 2) {
                vAgainst++;

                continue;
            } else {
                vAbstain++;
            }
        }
        if (vVeto > 0) {
            System.out.println("Vote have stopped due to veto use by " + countryName[i]);
        } else if (vFor > vAgainst) {
            System.out.println("Vote successfully passed with the following votes:\nFor - " + vFor + "\nAgainst - " + vAgainst + "\nAbstain - " + vAbstain + "\nVeto - " + vVeto);
        } else {
            System.out.println("Vote did not passed with the following votes:\nFor - " + vFor + "\nAgainst - " + vAgainst + "\nAbstain - " + vAbstain + "\nVeto - " + vVeto);
        }
    }
}

