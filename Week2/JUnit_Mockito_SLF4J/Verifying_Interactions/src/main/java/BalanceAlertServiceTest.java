import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class BalanceAlertServiceTest {

    @Test
    void shouldSendSmsWhenBalanceIsLow() {
        SmsService sms = mock(SmsService.class);
        BalanceAlertService service = new BalanceAlertService(sms);

        service.checkBalanceAndNotify("9876543210", 40);

        verify(sms).send("9876543210", "Your balance is low: ₹40");
    }
}


