//Program to calculate Smart Utility Bill with GST and Discount and Final Payable Amount

public class SmartUtilityBill {

    public float calculateElectricityCharges(float a,float b) {
        float charges = (a+b) * 18 / 100;
        return charges + (a+b);
    }
    public float calculateWaterCharges(float c,float d) {
        float charges = (c+d) * 13 / 100;
        return charges + (c+d);
    }
    public float calculateGasCharges(float e) {
        float charges = (e) * 7 / 100;
        return charges + e;
    }
    public float totalBill(float a, float b, float c, float d, float e) {
        float total = calculateElectricityCharges(a,b) + calculateWaterCharges(c,d) + calculateGasCharges(e);
        return total;
    }
    public float calculateDiscountedBill(float a, float b, float c, float d, float e) {
        float total = totalBill(a, b, c, d, e);
        float discount = total * 20 / 100;
        return (total - discount);
    }

    public static void main (String[] args) {

        SmartUtilityBill obj = new SmartUtilityBill();
        System.out.println("Welcome to Smart Utility Bill Calculator");
        float a=100, b=100, c=100, d=100, e=100;
        float totalBill = obj.totalBill(a, b, c, d, e);
        float FinalPayableAmount = obj.calculateDiscountedBill(a, b, c, d, e);

        System.out.println("Total after GST: " + totalBill + " | " + "Discount: " + totalBill * 20 / 100 + " | " + "Final Payable Amount: " + FinalPayableAmount);

    }
    
}
