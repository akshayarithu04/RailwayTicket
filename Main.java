package TrainTicket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean Torun=true;
        while(Torun){
            System.out.println("Welcome!!");
            System.out.print("1.Ticket Booking\n2.Cancel Ticket\n3.Display Confirm Ticket Details\n4.Display RAC Ticket Details\n" +
                    "5.Display Waiting List Ticket Details\n6.Exit\n");
            System.out.print("Please Select One of the Option : ");
            int option= scan.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter Your Name : ");
                    String name= scan.next();
                    System.out.print("Enter Your Age : ");
                    int age= scan.nextInt();
                    System.out.print("Enter Your Berth Preference(L/M/U/SU) : ");
                    char berth=scan.next().charAt(0);;
                    if(berth == 'L'|| berth =='M'|| berth=='U'|| berth=='S'){
                        TicketBooking.bookTicket(new Passanger(name,age,berth));
                    }else{
                        System.out.println("Invalid Berth");
                    }
                    break;
                case 2:
                    System.out.println("Enter Your Ticket id: ");
                    int id=scan.nextInt();
                    System.out.println(TicketCancelling.canceling(id));
                    break;
                case 3:
                    System.out.println("Ticket Details");
                    TicketBooking.displayConfirmed();
                case 4:
                    System.out.println("Ticket Details");
                    TicketBooking.displayrac();
                case 5:
                    System.out.println("Ticket Details");
                    TicketBooking.displaywaiting();
                case 6:
                    System.out.print("Thanks For Visiting!!");
                    return;
                default:
                    Torun=false;
            }

        }

    }

}
