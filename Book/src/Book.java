public class Book {

    private final String fahrenheit451; //Название
    private final String rayDouglasBradbury; //Автор
    private final int amount; //Количество страниц
    private final long number; //номер ISBN

    public Book (String fahrenheit451, String rayDouglasBradbury, int amount, int number) {
        this.fahrenheit451 = fahrenheit451;
        this.rayDouglasBradbury = rayDouglasBradbury;
        this.amount = 256;
        this.number = 9780345342966L;
    }
    public String getFahrenheit451 () {
        return fahrenheit451;
    }
    public String getRayDouglasBradbury () {
        return rayDouglasBradbury;
    }
    public int getAmount () {
        return amount;
    }
    public long getNumber () {
        return number;
    }
}
