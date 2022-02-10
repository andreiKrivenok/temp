package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    public final int SALARY_MONTH_PICKER = 80;
    public Warehouse ware;

    public Picker(Warehouse ware) {
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
        salary = salary + SALARY_MONTH_PICKER;
        ware.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (ware.getCountPickedOrders() < 10000 && isPayed == false) {
            System.out.println("Бонус пока не доступен");
        } else if (ware.getCountPickedOrders() == 10000) {
            isPayed = true;
            salary = salary + 70000;
        } else if (ware.getCountPickedOrders() > 10000) {
            System.out.println("Бонус уже был выплачен");
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}

