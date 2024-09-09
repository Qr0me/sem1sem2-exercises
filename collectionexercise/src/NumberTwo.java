import java.util.*;

public class NumberTwo {

    public static void main(String[] args){
        String[] productID = {"Mints-1A", "Choco-1B", "Jelly-1Q", "Candy-2C", "Gummies-3D", "Lollipops-4E",
        "Caramels-5F", "Marshmallows-6G", "Taffy-7H", "Toffee-8I", "Fudge-9J", "Licorice-11K", "RockCandy-12L",
        "Gumballs-13M", "Jawbreakers-14N", "Truffles-15O", "Sours-16P", "Gelatin-17Q", "Bonbons-18R", "Choco-2A"};

        double[] productPrice = {15.20, 18.10, 16.30, 14.50, 20.00, 12.75, 17.90, 22.40, 19.60, 13.25,
        21.80, 15.90, 18.70, 23.50, 11.30, 16.80, 25.20, 14.60, 11.90};
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Product Name: ");
        String inputID = scan.nextLine();

        double price = priceFinder(productID, productPrice, inputID);

        if(price != -1){
            System.out.println("Price of product is: "+price);
        } else{
            System.out.println("Product not found.");
        }
    }

    public static double priceFinder(String[] ID, double[] price, String inputID){

        for(int i = 0; i<price.length; i++){
            if(ID[i].equals(inputID)){
                return price[i];
            }
        } 

        return -1;
    }
}
