import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("Ramesh", 1000);
    }

    @AfterEach
    void tearDown() {
        account = null;
    }

    @Test
    void deposit_shouldIncreaseBalance() {
        double amount = 500;
        account.deposit(amount);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void withdraw_shouldDecreaseBalance() {
        double amount = 200;
        account.withdraw(amount);
        assertEquals(800, account.getBalance());
    }

    @Test
    void withdraw_moreThanBalance_shouldNotChangeBalance() {
        account.withdraw(1500);
        assertEquals(1000, account.getBalance());
    }
}
