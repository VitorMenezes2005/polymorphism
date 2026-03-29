package entities;

public class NationalCars extends Cars {
    private Double discount;

    public NationalCars() {
        super();
    }

    public NationalCars(String name,
                        Integer year,
                        Double price,
                        Double discount) {
        super(name, year, price);
        this.discount = discount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double calculation(){
        Double valueFinal = getPrice() - discount;
        return valueFinal;
    }

    @Override
    public String priceTag(){
        return getName() + ", R$" + calculation();
    }
}
