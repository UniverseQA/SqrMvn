import ru.netology.SqrMvn.services.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        System.out.println(service.calcSumSqr(1000, 999999));
    }
}