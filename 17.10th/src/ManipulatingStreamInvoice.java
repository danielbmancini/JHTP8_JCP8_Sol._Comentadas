import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/*
    exercise 17.11
 */
public class ManipulatingStreamInvoice {
    public static void main(String[] args) {
        ArrayList<Invoice> invoices = new ArrayList<>();

        invoices.add(new Invoice("83","Electric sander",7,57.98));
        invoices.add(new Invoice("24","Power saw",18,99.99));
        invoices.add(new Invoice("7","Sledge hammer",11,21.50));
        invoices.add(new Invoice("77","Hammer",76,11.99));
        invoices.add(new Invoice("39","Lawn mower",3,79.50));
        invoices.add(new Invoice("68","Screwdriver",106,6.99));
        invoices.add(new Invoice("56","Jig saw",21,11.00));
        invoices.add(new Invoice("3","Wrench",34,7.5));

        invoices.stream().sorted(Comparator.comparing(Invoice::getPartDescription))
                .forEach(invoice -> System.out.printf("(a) %n%s%n",invoice)); //a)

        invoices.stream().sorted(Comparator.comparing(Invoice::getPricePerItem))
                .forEach(invoice -> System.out.printf("(b) %n%s%n",invoice)); //b)

        System.out.println();
        invoices.stream().map(invoice -> Arrays.asList(invoice.getPartDescription(), invoice.getQuantity()))
                .sorted(Comparator.comparing(list -> (Integer) list.get(1)))
                    .forEach(System.out::println); //c), map invoices to a (PartDescription,Quantity) list and sort by Quantity

        System.out.println();
        invoices.stream().map(invoice -> Arrays.asList(invoice.getPartDescription(),invoice.getQuantity()*invoice.getPricePerItem()))
                .sorted(Comparator.comparing(list -> (Double) list.get(1)))
                .forEach(System.out::println); //d), map invoices to a (PartDescription,Calculated price) list and sort by Calculated price

        System.out.println();
        invoices.stream().map(invoice -> Arrays.asList(invoice.getPartDescription(),invoice.getQuantity()*invoice.getPricePerItem()))
                .filter(list -> {
                    double b = (Double) list.get(1);
                    return b >= 200 && b <= 500;
                })
                .sorted(Comparator.comparing(list -> (Double) list.get(1)))
                .forEach(System.out::println); //e), map invoices to a (PartDescription,Calculated price) list, filter everything not in between 200 and 500, and then sort by Calculated price
    }

}
