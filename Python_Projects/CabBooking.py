import random  

flag = True

def MainMenu():
    global flag
    print("Welcome To Cab Booking Bot!!")
    
    while flag:
        print("\nEnter 1 to Book a Ride")
        print("Enter 2 to Exit")
        choice = int(input("Enter your choice: "))
        match choice:
            case 1: 
                bookRide()
                flag = True
            case 2: 
                print("Exiting...")
                flag = False
            case _: 
                print("Invalid Choice!! Please Try Again!!")
                
        if not flag:
            break
        
def bookRide():
    global flag

    flag = True 
    print("\nChoose Cab Type:")
    
    while flag:
        print("1. Auto")
        print("2. Sedan")
        print("3. SUV")
        cabChoice = int(input("Enter your choice: "))
        
        match cabChoice:
            case 1: 
                autoRide()
                flag = False
            case 2: 
                sedanRide()
                flag = False
            case 3: 
                suvRide()
                flag = False
            case _: 
                print("Invalid Choice!! Please Try Again!!")
                
        if not flag:
            break
            
def routeDetails(fare, name):
    global flag
    flag = True
    totalFare = 0
    distance = 0
    print("\nSelect Route (Source & Destination): ")
    
    while flag:
        print("1. Pune Station to Shivajinagar")
        print("2. Pune Station to Kothrud")
        print("3. Pune Station to Wakad")
        print("4. Swargate to Shivajinagar")
        print("5. Swargate to Kothrud")
        print("6. Swargate to Wakad")
        print("7. Hinjawadi to Shivajinagar")
        print("8. Hinjawadi to Kothrud")
        print("9. Hinjawadi to Wakad")
        choice = int(input("Enter your choice: "))
        
        routes = {
            1: ("Pune Station to Shivajinagar", 5),
            2: ("Pune Station to Kothrud", 8),
            3: ("Pune Station to Wakad", 10),
            4: ("Swargate to Shivajinagar", 5),
            5: ("Swargate to Kothrud", 8),
            6: ("Swargate to Wakad", 10),
            7: ("Hinjawadi to Shivajinagar", 5),
            8: ("Hinjawadi to Kothrud", 8),
            9: ("Hinjawadi to Wakad", 10)
        }
        
        if choice in routes:
            routeName, distance = routes[choice]
            totalFare = fare * distance
            print(f"\nCab Type: {name} | Route: {routeName} | Distance: {distance} km | Fare/km: Rs.{fare} | Total Fare: Rs.{totalFare}")
            confirmOTP()
            flag = False
        else:
            print("Invalid Choice!! Please Try Again!!")
            
        if not flag:
            break
        
def autoRide():
    routeDetails(12, "Auto")

def sedanRide():
    routeDetails(18, "Sedan")

def suvRide():
    routeDetails(25, "SUV")

def confirmOTP():
    global flag
    flag = True
    while flag:
        print("\n1. Confirm OTP")
        print("2. Cancel Ride")
        print("-------Once the OTP has been shared, the ride cannot be cancelled----------")
        choice = int(input("Enter your choice: "))
        match choice:
            case 1: 
                otp = random.randint(1000, 9999)
                print("Your OTP is: ", otp)
                userOTP = int(input("Enter the OTP: "))
                if userOTP == otp:
                    print("OTP Verified!! Your Ride has been Booked Successfully!!")
                    print("Thank You for using Cab Booking Bot!!")
                    flag = False
                else:
                    print("Invalid OTP!! Please Try Again!!")
            case 2: 
                print("Ride Cancelled!!")
                flag = False
            case _: 
                print("Invalid Choice!! Please Try Again!!")
            
        if not flag:
            break

MainMenu()
