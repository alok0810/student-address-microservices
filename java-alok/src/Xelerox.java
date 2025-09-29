import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Xelerox {

    public static void main(String[] args)
    {
        List<CustomerOrder> list =new ArrayList<>();
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse("02-06-2025",formatter) ;

        list.add(new CustomerOrder(100.25,LocalDate.parse("02-06-2025",formatter),112));
        list.add(new CustomerOrder(110.25,LocalDate.parse("07-06-2025",formatter),118));
        list.add(new CustomerOrder(1070.25,LocalDate.parse("02-01-2025",formatter),113));
        list.add(new CustomerOrder(10000.15,LocalDate.parse("24-06-2025",formatter),102));
        list.add(new CustomerOrder(910.25,LocalDate.parse("02-03-2025",formatter),1016));
        double[] sum =new double[1];
        list.stream().filter(i->i.getCustomerId()>115).forEach(i->
        {
           // System.out.println("amount----> "+" "+i.getAmount()+"  Date---> "+" "+i.getOrderDate());
            sum[0]+=i.getAmount();
        });

        System.out.println(OffsetDateTime.now().getMonthValue());
        System.out.println(list.stream().filter(i->OffsetDateTime.now().getMonthValue()-i.getOrderDate().getMonthValue()>3).findFirst());
        list.stream().filter(i->i.getOrderDate().getMonthValue()- OffsetDateTime.now().getMonthValue()>4).findFirst();
      double sumr= list.stream().filter(i->i.getOrderDate().getMonthValue()==6).mapToDouble(i->i.getAmount()).sum();
        double average= list.stream().filter(i->i.getOrderDate().getMonthValue()==6).mapToDouble(i->i.getAmount()).average().getAsDouble();
        System.out.println(average+"****avg***");

        Map<Integer,List<CustomerOrder>> map= list.stream().collect(Collectors.groupingBy(i->i.getOrderDate().getMonthValue()));
        System.out.println(sumr);
        //System.out.println(sum[0]);
    }
}


class CustomerOrder
{
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public CustomerOrder(double amount, LocalDate orderDate, int customerId) {
        this.amount = amount;
        this.orderDate = orderDate;
        this.customerId = customerId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "amount=" + amount +
                ", orderDate=" + orderDate +
                ", customerId=" + customerId +
                '}';
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    double amount;
    LocalDate orderDate;
    int customerId;
}
