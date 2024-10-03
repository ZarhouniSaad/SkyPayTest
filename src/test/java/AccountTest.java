import org.example.service.Account;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void shouldPrintStatementWithDepositsAndWithdrawals() {
        // Create a stream to hold the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Given an account with deposits and a withdrawal
        Account account = new Account();
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        // Printing the statement
        account.printStatement();

        // Verify that the output matches the expected format
        // Using LocalDate to keep it simple
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String expectedStatement =
                "DATE       || AMOUNT  || BALANCE\n" +
                        currentDate+" || -500  || 2500\n" +
                        currentDate+" || 2000  || 3000\n" +
                        currentDate+" || 1000  || 1000\n";

        // Reformat output line separator difference
        String actualStatement=outContent.toString();
        actualStatement=actualStatement.replace("\r\n", "\n");


        // Check if the printed output matches the expected statement
        assertEquals(expectedStatement, actualStatement);

        // Restore the original System.out
        System.setOut(originalOut);
    }
}
