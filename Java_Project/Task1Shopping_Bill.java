//Program to calculate the shopping bills with GST and Discount and Final Payable Amount

public class Task1Shopping_Bill {

    public float calculateElectronicsGST(float a, float b) {
        float GST = (a+b) * 18 / 100;
        return GST + (a+b);
    }
    public float calculateFashionGST(float c, float d) {
        float GST = (c+d) * 13 / 100;
        return GST + (c+d);
    }
    public float calculateFoodGST(float e) {
        float GST = (e) * 7 / 100;
        return GST + e;
    }
    public float totalBill(float a, float b, float c, float d, float e) {
        float total = calculateElectronicsGST(a,b) + calculateFashionGST(c,d) + calculateFoodGST(e);
        return total;
    }
    public float calculateDiscountedBill(float a, float b, float c, float d, float e) {
        float total = totalBill(a, b, c, d, e);
        float discount = total * 20 / 100;
        return (total - discount);
    }

    
    public static void main (String[] args) {

        Task1Shopping_Bill obj = new Task1Shopping_Bill();
        System.out.println("Welcome to Shopping Bill Calculator");
        float a=100, b=100, c=100, d=100, e=100;
        float totalBill = obj.totalBill(a, b, c, d, e);
        float FinalPayableAmount = obj.calculateDiscountedBill(a, b, c, d, e);

        System.out.println("Total after GST: " + totalBill + " | " + "Discount: " + totalBill * 20 / 100 + " | " + "Final Payable Amount: " + FinalPayableAmount);

    }
}

//Output
//Welcome to Shopping Bill Calculator
//Total after GST: 569.0 | Discount: 113.8 | Final Payable Amount: 455.2
