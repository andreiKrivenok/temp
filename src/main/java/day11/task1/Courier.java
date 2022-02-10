package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    public final int SALARY_MONTH_COURIER = 100;
    public Warehouse ware;

    public Courier(Warehouse ware) {
        this.ware = ware;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary = salary + SALARY_MONTH_COURIER;
        ware.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (ware.getCountDeliveredOrders() < 10000 && isPayed == false) {
            System.out.println("Бонус пока не доступен");
        } else if (ware.getCountDeliveredOrders() == 10000) {
            isPayed = true;
            salary = salary + 50000;
        } else if (ware.getCountDeliveredOrders() > 10000) {
            System.out.println("Бонус уже был выплачен");
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
