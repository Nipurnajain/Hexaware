import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PasswordGenerator {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        // Example usage:
        int passwordLength = 12; // You can adjust the length as needed
        String securePassword = generateSecurePassword(passwordLength);
        System.out.println("Generated Password: " + securePassword);
    }

    public static String generateSecurePassword(int length) throws NoSuchAlgorithmException {
        // Define character sets for each category
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()-_+=";

        // Combine character sets
        String allCharacters = uppercaseLetters + lowercaseLetters + numbers + specialCharacters;

        // Use SecureRandom for secure random number generation
        SecureRandom secureRandom = new SecureRandom();

        // Create a StringBuilder to build the password
        StringBuilder passwordBuilder = new StringBuilder();

        // Ensure at least one character from each category
        passwordBuilder.append(getRandomCharacter(uppercaseLetters, secureRandom));
        passwordBuilder.append(getRandomCharacter(lowercaseLetters, secureRandom));
        passwordBuilder.append(getRandomCharacter(numbers, secureRandom));
        passwordBuilder.append(getRandomCharacter(specialCharacters, secureRandom));

        // Generate the remaining characters
        for (int i = 4; i < length; i++) {
            passwordBuilder.append(getRandomCharacter(allCharacters, secureRandom));
        }

        // Shuffle the characters in the password
        String shuffledPassword = shufflePassword(passwordBuilder.toString());

        return shuffledPassword;
    }

    private static char getRandomCharacter(String characterSet, SecureRandom secureRandom) {
        int randomIndex = secureRandom.nextInt(characterSet.length());
        return characterSet.charAt(randomIndex);
    }

    private static String shufflePassword(String password) throws NoSuchAlgorithmException {
        // Convert the password to a char array for shuffling
        char[] passwordArray = password.toCharArray();

        // Shuffle the characters using Fisher-Yates algorithm
        for (int i = passwordArray.length - 1; i > 0; i--) {
            int randomIndex = SecureRandom.getInstanceStrong().nextInt(i + 1);
            char temp = passwordArray[i];
            passwordArray[i] = passwordArray[randomIndex];
            passwordArray[randomIndex] = temp;
        }

        return new String(passwordArray);
    }
}
