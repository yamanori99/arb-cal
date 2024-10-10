import java.util.ArrayList;
import java.util.List;

public class ArbitrarinessCalculator {

    // Function to calculate entropy
    public static double entropy(double[] probabilities) {
        List<Double> informationContent = new ArrayList<>();

        // Calculate the information content I(x_i)
        for (double p : probabilities) {
            informationContent.add(-Math.log(p) / Math.log(2));  // Use log base 2
        }

        // Calculate the entropy H(x)
        double entropyValue = 0;
        for (int i = 0; i < probabilities.length; i++) {
            entropyValue += probabilities[i] * informationContent.get(i);
        }

        return entropyValue;
    }

    public static void main(String[] args) {
        // Probabilities of each convention, basin of attraction
        // Below is an input example, with the basin of attraction from the author's simulation.
        double[] probabilities = {0.113709, 0.33434, 0.185575, 0.166355, 0.200022};

        double entropyValue = entropy(probabilities);
        System.out.println(entropyValue);
    }
}