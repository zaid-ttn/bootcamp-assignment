package Ques6;


public class EnumSwitch {
    enum Status{
        PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED, REFUNDED
    }
    public static void printStatus(Status s) {
        switch (s) {
            case PENDING:
                System.out.println("Order is awaiting confirmation");
                break;
            case PROCESSING:
                System.out.println("Order is being prepared");
                break;
            case SHIPPED:
                System.out.println("Order has been dispatched.");
                break;
            case DELIVERED:
                System.out.println("Order has been successfully delivered");
            case CANCELLED:
                System.out.println("Order has been canceled");
                break;
            case REFUNDED:
                System.out.println("Refund has been issued for the order.");
                break;
            default:
                System.out.println("Error");
        }

    }

        public static void main(String[] args){

            Status cancelled=Status.CANCELLED;
            printStatus(cancelled);
            Status refunded=Status.REFUNDED;
            printStatus(refunded);

    }

}
