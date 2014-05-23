	

    import java.io.BufferedWriter;
    import java.io.FileReader;
    import java.io.FileWriter;
    import java.util.ArrayList;
    import java.util.Locale;
    import java.util.Scanner;
     
    public class OrderOfProducts {
     
            public static void main(String[] args) throws Exception {
                    Locale.setDefault(Locale.ROOT);
                    ArrayList<Product> products = new ArrayList<Product>();
                    try (Scanner input = new Scanner(new FileReader("/home/pesho87/workspace/LoopsMethodsClasses/res/Products.txt"))) {                    
                            while (input.hasNextLine()) {
                                    products.add(new Product(input.next(), input.nextDouble()));
                            }                              
                    }
                    double result = 0;
                    try (Scanner input = new Scanner(new FileReader("/home/pesho87/workspace/LoopsMethodsClasses/res/Order.txt"))) {                       
                            while (input.hasNextLine()) {
                                    double quantity = input.nextDouble();
                                    String currentProduct = input.next();
                                    for (Product product : products) {
                                            if (product.getName().equals(currentProduct)) {
                                                    result += quantity * product.getPrice();
                                            }
                                    }
                            }                              
                    }
                    try (BufferedWriter output = new BufferedWriter(new FileWriter("/home/pesho87/workspace/LoopsMethodsClasses/res/Output.txt"))) {
                            output.write(String.format("%.2f", result));
                    }
            }
    }

