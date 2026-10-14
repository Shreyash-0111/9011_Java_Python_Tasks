//Program to implement Logistics Billing System

public class Logistics_Billing {

    public float calculateStandardShipping(float a, float b) {
        float cost = a + b;
        float tax = cost * 0.15f;
        if ((cost + tax) > 150) {
            return (cost + tax) + 20;
        }
        return cost + tax;
    }
    
 
    public float calculateExpressShipping(float c, float d) {
        float cost = c + d;
        float supercharge = cost * 0.20f;
        return cost + supercharge;
    }
   
    public float calculateInsurancefee(float e) {
        float insurance = e * 0.08f;
        return e + insurance;
    }
   
    public float calculateGrossFreightTotal(float a, float b, float c, float d, float e) {
        float total = calculateStandardShipping(a, b) + calculateExpressShipping(c, d) + calculateInsurancefee(e);
        return total;
    }
    public float calculateNetPayableAmount(float a, float b, float c, float d, float e) {
        float grossTotal = calculateGrossFreightTotal(a, b, c, d, e);
        float discount = 0;
        if (grossTotal > 500) {
            discount = grossTotal * 0.15f;
            return (grossTotal - discount) - 30;
        }
        else {
            discount = grossTotal * 0.5f;
            return (grossTotal - discount) - 30;
        }
    }


    public static void main(String[] args) {

        Logistics_Billing billing = new Logistics_Billing();
        float netpayable = billing.calculateNetPayableAmount(100, 100, 100, 100, 100);
        System.out.println( "Gross Total: " + billing.calculateGrossFreightTotal(100, 100, 100, 100, 100) + " | NetPayable Amount:" + netpayable);
        // System.out.println("SD :" + billing.calculateStandardShipping(100, 100));
        // System.out.println("ED :" + billing.calculateExpressShipping(100, 100));
        // System.out.println("IF :" + billing.calculateInsurancefee(100));
    }
    
}






//calculateStandardShipping(a, b)
//calculateExpressShipping(c, d)
//calculateInsuranceFee(e)
//calculateGrossFreightTotal(a, b, c, d, e)
//calculateNetPayableAmount(a, b, c, d, e)
