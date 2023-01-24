import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author Tancred
 * @version 1.0.0
 */
public class BetterScanner {
    private static final String DEFAULT_MESSAGE = "Invalid input. Please try again:";

    private final Scanner scanner = new Scanner(System.in);
    private final boolean shouldLoop;

    public BetterScanner() {
        this.shouldLoop = false;
    }

    /**
     * @param shouldLoop Weather or not the scanning functions should loop until
     *                   valid data has been provided.
     */
    public BetterScanner(boolean shouldLoop) {
        this.shouldLoop = shouldLoop;
    }

    /**
     * @return User input as BigDecimal.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public BigDecimal nextBigDecimal() {
        try {
            return new BigDecimal(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(BetterScanner.DEFAULT_MESSAGE);
                return this.nextBigDecimal();
            } else {
                throw exception;
            }
        }
    }

    /**
     * @param messageOnInvalidInput The printed message upon invalid data.
     * @return User input as BigDecimal.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public BigDecimal nextBigDecimal(String messageOnInvalidInput) {
        try {
            return new BigDecimal(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(messageOnInvalidInput);
                return this.nextBigDecimal(messageOnInvalidInput);
            } else {
                throw exception;
            }
        }
    }

    /**
     * @return User input as BigInteger.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public BigInteger nextBigInteger() {
        try {
            return new BigInteger(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(BetterScanner.DEFAULT_MESSAGE);
                return this.nextBigInteger();
            } else {
                throw exception;
            }
        }
    }

    /**
     * @param messageOnInvalidInput The printed message upon invalid data.
     * @return User input as BigInteger.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public BigInteger nextBigInteger(String messageOnInvalidInput) {
        try {
            return new BigInteger(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(messageOnInvalidInput);
                return this.nextBigInteger(messageOnInvalidInput);
            } else {
                throw exception;
            }
        }
    }

    /**
     * @return User input as boolean.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     */
    public boolean nextBoolean() {
        return Boolean.parseBoolean(this.scanner.nextLine());
    }

    /**
     * @return User input as byte.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public byte nextByte() {
        try {
            return Byte.parseByte(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(BetterScanner.DEFAULT_MESSAGE);
                return this.nextByte();
            } else {
                throw exception;
            }
        }
    }

    /**
     * @param messageOnInvalidInput The printed message upon invalid data.
     * @return User input as byte.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public byte nextByte(String messageOnInvalidInput) {
        try {
            return Byte.parseByte(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(messageOnInvalidInput);
                return this.nextByte(messageOnInvalidInput);
            } else {
                throw exception;
            }
        }
    }

    /**
     * @return User input as char.
     * @throws NoSuchElementException    If the scanner can't find a next line.
     * @throws IllegalStateException     If the scanner is closed.
     * @throws IndexOutOfBoundsException If shouldLoop has been set to false upon
     *                                   instantiation and invalid data has been
     *                                   provided.
     */
    public char nextChar() {
        try {
            String userInput = this.scanner.nextLine();

            if (userInput.length() != 1) {
                throw new IndexOutOfBoundsException("String too long/short for type char.");
            }

            return userInput.charAt(0);
        } catch (IndexOutOfBoundsException exception) {
            if (this.shouldLoop) {
                System.out.println(BetterScanner.DEFAULT_MESSAGE);
                return this.nextChar();
            } else {
                throw new IndexOutOfBoundsException(exception.getMessage());
            }
        }
    }

    /**
     * @param messageOnInvalidInput The printed message upon invalid data.
     * @return User input as char.
     * @throws NoSuchElementException    If the scanner can't find a next line.
     * @throws IllegalStateException     If the scanner is closed.
     * @throws IndexOutOfBoundsException If shouldLoop has been set to false upon
     *                                   instantiation and invalid data has been
     *                                   provided.
     */
    public char nextChar(String messageOnInvalidInput) {
        try {
            String userInput = this.scanner.nextLine();

            if (userInput.length() != 1) {
                throw new IndexOutOfBoundsException("String too long/short for type char.");
            }

            return userInput.charAt(0);
        } catch (IndexOutOfBoundsException exception) {
            if (this.shouldLoop) {
                System.out.println(messageOnInvalidInput);
                return this.nextChar(messageOnInvalidInput);
            } else {
                throw new IndexOutOfBoundsException(exception.getMessage());
            }
        }
    }

    /**
     * @return User input as double.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public double nextDouble() {
        try {
            return Double.parseDouble(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(BetterScanner.DEFAULT_MESSAGE);
                return this.nextDouble();
            } else {
                throw exception;
            }
        }
    }

    /**
     * @param messageOnInvalidInput The printed message upon invalid data.
     * @return User input as double.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public double nextDouble(String messageOnInvalidInput) {
        try {
            return Double.parseDouble(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(messageOnInvalidInput);
                return this.nextDouble(messageOnInvalidInput);
            } else {
                throw exception;
            }
        }
    }

    /**
     * @return User input as float.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public float nextFloat() {
        try {
            return Float.parseFloat(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(BetterScanner.DEFAULT_MESSAGE);
                return this.nextFloat();
            } else {
                throw exception;
            }
        }
    }

    /**
     * @param messageOnInvalidInput The printed message upon invalid data.
     * @return User input as float.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public float nextFloat(String messageOnInvalidInput) {
        try {
            return Float.parseFloat(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(messageOnInvalidInput);
                return this.nextFloat(messageOnInvalidInput);
            } else {
                throw exception;
            }
        }
    }

    /**
     * @return User input as integer.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public int nextInt() {
        try {
            return Integer.parseInt(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(BetterScanner.DEFAULT_MESSAGE);
                return this.nextInt();
            } else {
                throw exception;
            }
        }
    }

    /**
     * @param messageOnInvalidInput The printed message upon invalid data.
     * @return User input as integer.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public int nextInt(String messageOnInvalidInput) {
        try {
            return Integer.parseInt(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(messageOnInvalidInput);
                return this.nextInt(messageOnInvalidInput);
            } else {
                throw exception;
            }
        }
    }

    /**
     * @return User input as long.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public long nextLong() {
        try {
            return Long.parseLong(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(BetterScanner.DEFAULT_MESSAGE);
                return this.nextLong();
            } else {
                throw exception;
            }
        }
    }

    /**
     * @param messageOnInvalidInput The printed message upon invalid data.
     * @return User input as long.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public long nextLong(String messageOnInvalidInput) {
        try {
            return Long.parseLong(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(messageOnInvalidInput);
                return this.nextLong(messageOnInvalidInput);
            } else {
                throw exception;
            }
        }
    }

    /**
     * @return User input as short.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public short nextShort() {
        try {
            return Short.parseShort(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(BetterScanner.DEFAULT_MESSAGE);
                return this.nextShort();
            } else {
                throw exception;
            }
        }
    }

    /**
     * @param messageOnInvalidInput The printed message upon invalid data.
     * @return User input as short.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     * @throws NumberFormatException  If shouldLoop has been set to false upon
     *                                instantiation and invalid data has been
     *                                provided.
     */
    public short nextShort(String messageOnInvalidInput) {
        try {
            return Short.parseShort(this.scanner.nextLine());
        } catch (NumberFormatException exception) {
            if (this.shouldLoop) {
                System.out.println(messageOnInvalidInput);
                return this.nextShort(messageOnInvalidInput);
            } else {
                throw exception;
            }
        }
    }

    /**
     * @return User input as string.
     * @throws NoSuchElementException If the scanner can't find a next line.
     * @throws IllegalStateException  If the scanner is closed.
     */
    public String nextString() {
        return this.scanner.nextLine();
    }
}