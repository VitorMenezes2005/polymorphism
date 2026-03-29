import entities.Cars;
import entities.ForeignCars;
import entities.NationalCars;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Cars> list = new ArrayList<>();

    IO.println("Welcome, please fill in the information:");
    IO.print("Car name: ");
    String name = sc.nextLine();
    IO.print("Car year: ");
    Integer carYear = sc.nextInt();
    IO.print("Car price: ");
    Double carPrice = sc.nextDouble();

    IO.println("The car is domestic?");
    sc.nextLine();
    char ch = sc.next().charAt(0);

    if(ch == 'Y'){
        IO.print("Fill in the discount: ");
        Double discount = sc.nextDouble();
        Cars cars = new NationalCars(name, carYear, carPrice, discount);
        list.add(cars);
    }else{
        IO.print("Fill in the import fee: ");
        Double tax = sc.nextDouble();
        Cars cars = new ForeignCars(name, carYear, carPrice, tax);
        list.add(cars);
    }

    IO.println();
    IO.println("Final report:");
    for(Cars c : list){
        IO.println(c);
    }
}
