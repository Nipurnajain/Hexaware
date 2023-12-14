public class AddressFormatter {

    public static void main(String[] args) {
        // Example usage:
        String formattedAddress = formatAddress("123 main street", "example city", "ny", "12345");
        System.out.println("Formatted Address: " + formattedAddress);
    }

    public static String formatAddress(String street, String city, String state, String zipCode) {
        // Format street
        String formattedStreet = capitalizeWords(street);

        // Format city
        String formattedCity = capitalizeWords(city);

        // Format state (assuming two-letter state code)
        String formattedState = state.toUpperCase();

        // Format zip code
        String formattedZipCode = formatZipCode(zipCode);

        // Construct the formatted address
        return formattedStreet + ", " + formattedCity + ", " + formattedState + " " + formattedZipCode;
    }

    private static String capitalizeWords(String input) {
        // Capitalize the first letter of each word
        String[] words = input.split("\\s");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }

        return result.toString().trim();
    }

    private static String formatZipCode(String zipCode) {
        // Format the zip code to ensure it has 5 digits
        String formattedZipCode = zipCode.replaceAll("[^\\d]", ""); // Remove non-digit characters
        return String.format("%05d", Integer.parseInt(formattedZipCode));
    }
}
