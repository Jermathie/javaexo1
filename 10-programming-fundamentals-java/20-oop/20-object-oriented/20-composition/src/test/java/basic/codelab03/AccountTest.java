package basic.codelab03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOutContent = System.out;
    private final PrintStream originalErrContent = System.err;

    @BeforeEach
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.setOut(originalOutContent);
        System.setErr(originalErrContent);
    }

    @Test
    void creationWillCreateAccountNumber() {
        Account account = new Account(12.0, new AccountOwner("firstName", "lastName"));

        assertThat(account.getAccountNumber()).isNotNull();
    }

    @Test
    void withdraw() {
        Account account = new Account(100, new AccountOwner("firstName", "lastName"));

        account.withdraw(10);

        assertThat(account.getBalance()).isEqualTo(90);
    }

    @Test
    void withdrawNotMoreThanTotal() {
        Account account = new Account(100, new AccountOwner("firstName", "lastName"));

        account.withdraw(110);

        assertThat(outContent.toString().trim()).isEqualTo("Can not withdraw more than the total balance");
    }

    @Test
    void withdrawNotMoreThan5000() {
        Account account = new Account(10000, new AccountOwner("firstName", "lastName"));

        account.withdraw(5001);

        assertThat(outContent.toString().trim()).isEqualTo("Maximum amount allowed to withdraw is 5000");
    }

    @Test
    void deposit() {
        Account account = new Account(100, new AccountOwner("firstName", "lastName"));

        account.deposit(10);

        assertThat(account.getBalance()).isEqualTo(110);
    }

    @Test
    void depositTooMuch() {
        Account account = new Account(10000, new AccountOwner("firstName", "lastName"));

        account.deposit(80001);

        assertThat(outContent.toString().trim()).isEqualTo("Maximum amount allowed to deposit is 80000");
    }
}
