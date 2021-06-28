package Java;

class Tarjeta extends Payment {
    Integer numbers;
    Integer date;
    Integer cvv;

    public Tarjeta(Integer id, Integer numbers, Integer date, Integer cvv){
        super(id);
        this.numbers = numbers;
        this.date = date;
        this.cvv = cvv;

    }
}
