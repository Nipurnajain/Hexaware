public class AddressSimilarityFinder {
//similarity finder
    public static void main(String[] args) {
        // Example usage:
        String address1 = "123 Main St, Cityville, State, 12345";
        String address2 = "123 Main Street, Cityville, State, 12345";
        String address3 = "456 Market St, Townsville, State, 54321";

        boolean areSimilar = areAddressesSimilar(address1, address2);
        System.out.println("Are address1 and address2 similar? " + areSimilar);

        areSimilar = areAddressesSimilar(address1, address3);
        System.out.println("Are address1 and address3 similar? " + areSimilar);
    }

    public static boolean areAddressesSimilar(String address1, String address2) {
        // Use Levenshtein distance to measure similarity
        int distance = calculateLevenshteinDistance(address1, address2);

        // Assume a threshold for similarity (you can adjust this threshold based on your needs)
        int similarityThreshold = 5;

        return distance <= similarityThreshold;
    }

    private static int calculateLevenshteinDistance(String str1, String str2) {
        int[][] distanceMatrix = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                if (i == 0) {
                    distanceMatrix[i][j] = j;
                } else if (j == 0) {
                    distanceMatrix[i][j] = i;
                } else {
                    int substitutionCost = str1.charAt(i - 1) == str2.charAt(j - 1) ? 0 : 1;
                    distanceMatrix[i][j] = Math.min(
                            Math.min(distanceMatrix[i - 1][j] + 1, distanceMatrix[i][j - 1] + 1),
                            distanceMatrix[i - 1][j - 1] + substitutionCost
                    );
                }
            }
        }

        return distanceMatrix[str1.length()][str2.length()];
    }
}

