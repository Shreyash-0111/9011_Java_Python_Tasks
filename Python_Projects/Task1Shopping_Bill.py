#program to calculate shopping bill with GST and Discount and diaplay the final bill

def calculateElectronicsGST(a,b) :
    gst = (a+b) * 0.18
    return gst + (a+b)

def calculateFashionGST(c,d) :
    gst = (c+d) * 0.13
    return gst + (c+d)

def calculateFoodGST(e) :
    gst = e * 0.07
    return gst + e

def totalBill(a,b,c,d,e) :
    total = calculateElectronicsGST(a,b) + calculateFashionGST(c,d) + calculateFoodGST(e)
    return total

def calculateDiscountedBill(a,b,c,d,e) :
    total = totalBill(a,b,c,d,e)
    discounted = total - (total * 0.20)
    return discounted

finalBill = calculateDiscountedBill(100, 100, 100, 100, 100)

print("Total Bill after GST: ", totalBill(100, 100, 100, 100, 100))
print("Discount: ", round(totalBill(100, 100, 100, 100, 100) * 0.20, 2))
print("Final Payable Amount: ", finalBill)

#Output:
#Total Bill after GST:  569.0
#Discount:  113.8
#Final Payable Amount:  455.2