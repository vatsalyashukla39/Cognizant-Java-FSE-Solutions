public class BalanceAlertService {
        private final SmsService smsService;

        public BalanceAlertService(SmsService smsService) {
            this.smsService = smsService;
        }

        public void checkBalanceAndNotify(String phone, int balance) {
            if (balance < 50) {
                smsService.send(phone, "Your balance is low: ₹" + balance);
            }
        }
    }
