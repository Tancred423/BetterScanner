public class Main {
    private static final String YOU_PROVIDED = "You provided: ";

    public static void main(String[] args) {
        System.out.println("\nNow testing without loop, without message");
        testWithoutMessage(false);
        System.out.println("\nNow testing with loop, without message");
        testWithoutMessage(true);
        System.out.println("\nNow testing without loop, with message");
        testWithMessage(false);
        System.out.println("\nNow testing with loop, with message");
        testWithMessage(true);

    }

    private static void testWithoutMessage(boolean shouldLoop) {
        BetterScanner scanner = new BetterScanner(shouldLoop);

        System.out.println("Provide a big decimal:");
        System.out.println(YOU_PROVIDED + scanner.nextBigDecimal());

        System.out.println("Provide a big integer:");
        System.out.println(YOU_PROVIDED + scanner.nextBigInteger());

        System.out.println("Provide a boolean:");
        System.out.println(YOU_PROVIDED + scanner.nextBoolean());

        System.out.println("Provide a byte:");
        System.out.println(YOU_PROVIDED + scanner.nextByte());

        System.out.println("Provide an character:");
        System.out.println(YOU_PROVIDED + scanner.nextChar());

        System.out.println("Provide a double:");
        System.out.println(YOU_PROVIDED + scanner.nextDouble());

        System.out.println("Provide a float:");
        System.out.println(YOU_PROVIDED + scanner.nextFloat());

        System.out.println("Provide an integer:");
        System.out.println(YOU_PROVIDED + scanner.nextInt());

        System.out.println("Provide a long:");
        System.out.println(YOU_PROVIDED + scanner.nextLong());

        System.out.println("Provide a short:");
        System.out.println(YOU_PROVIDED + scanner.nextShort());

        System.out.println("Provide a string:");
        System.out.println(YOU_PROVIDED + scanner.nextString());

    }

    private static void testWithMessage(boolean shouldLoop) {
        BetterScanner scanner = new BetterScanner(shouldLoop);

        System.out.println("Provide a big decimal:");
        System.out.println(YOU_PROVIDED + scanner.nextBigDecimal("Invalid big decimal. Please try again:"));

        System.out.println("Provide a big integer:");
        System.out.println(YOU_PROVIDED + scanner.nextBigInteger("Invalid big integer. Please try again:"));

        System.out.println("Provide a boolean:");
        System.out.println(YOU_PROVIDED + scanner.nextBoolean());

        System.out.println("Provide a byte:");
        System.out.println(YOU_PROVIDED + scanner.nextByte("Invalid byte. Please try again:"));

        System.out.println("Provide an character:");
        System.out.println(YOU_PROVIDED + scanner.nextChar("Invalid char. Please try again:"));

        System.out.println("Provide a double:");
        System.out.println(YOU_PROVIDED + scanner.nextDouble("Invalid double. Please try again:"));

        System.out.println("Provide a float:");
        System.out.println(YOU_PROVIDED + scanner.nextFloat("Invalid float. Please try again:"));

        System.out.println("Provide an integer:");
        System.out.println(YOU_PROVIDED + scanner.nextInt("Invalid int. Please try again:"));

        System.out.println("Provide a long:");
        System.out.println(YOU_PROVIDED + scanner.nextLong("Invalid long. Please try again:"));

        System.out.println("Provide a short:");
        System.out.println(YOU_PROVIDED + scanner.nextShort("Invalid short. Please try again:"));

        System.out.println("Provide a string:");
        System.out.println(YOU_PROVIDED + scanner.nextString());

    }
}