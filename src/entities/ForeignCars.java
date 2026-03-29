package entities;

public class ForeignCars extends Cars{
    private Double importTax;

    public ForeignCars() {
        super();
    }

    public ForeignCars(String name,
                       Integer year,
                       Double price,
                       Double importTax) {
        super(name, year, price);
        this.importTax = importTax;
    }

    public Double getImportTax() {
        return importTax;
    }

    public void setImportTax(Double importTax) {
        this.importTax = importTax;
    }

    public Double calculation(){
        Double valueFinal = getPrice() + importTax;
        return valueFinal;
    }

    @Override
    public String priceTag(){
        return getName() + ", R$" + calculation();
    }
}
