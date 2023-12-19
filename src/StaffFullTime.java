public class StaffFullTime extends Staff{
    private int prizeMoney;
    private int forfeitMoney;
    private int salary;

    public StaffFullTime() {
    }

    public StaffFullTime(String staffCode, String fullName, int age, int numberPhone, String email, int prizeMoney, int forfeitMoney, int salary) {
        super (staffCode, fullName, age, numberPhone, email);
        this.prizeMoney = prizeMoney;
        this.forfeitMoney = forfeitMoney;
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return (salary + prizeMoney - forfeitMoney);
    }

    public int getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(int prizeMoney) {
        this.prizeMoney = prizeMoney;
    }

    public int getForfeitMoney() {
        return forfeitMoney;
    }

    public void setForfeitMoney(int forfeitMoney) {
        this.forfeitMoney = forfeitMoney;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
