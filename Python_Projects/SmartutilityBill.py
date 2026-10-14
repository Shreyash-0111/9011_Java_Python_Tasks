#Program to calculate Smart Home Utility Bill with GST and Discount and display the final bill

def calculateElectricityCharges(a,b) :
    gst = (a+b) * 0.18
    return gst + (a+b)

def calculateWaterCharges(c,d) :
    gst = (c+d) * 0.13
    return gst + (c+d)

def calculateGasCharges(e) :
    gst = e * 0.07
    return gst + e

def totalUtilityBill(a,b,c,d,e) :
    total = calculateElectricityCharges(a,b) + calculateWaterCharges(c,d) + calculateGasCharges(e)
    return total

def calculateDiscountedUtilityBill(a,b,c,d,e) :
    total = totalUtilityBill(a,b,c,d,e)
    discounted = total - (total * 0.15)
    return discounted

finalUtilityBill = calculateDiscountedUtilityBill(200, 150, 100, 50, 75)
print("Final Utility Bill (after discount):", finalUtilityBill)