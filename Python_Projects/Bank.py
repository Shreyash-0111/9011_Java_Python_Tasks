balance = 10000
flag = True

def MainMenue() :
    global balance
    global flag
    print("Welcome To The Bank!")
    print("Opening Balance: 10000")
    print("1. Check Balance.")
    print("2. Deposite Money.")
    print("3. Withdraw Money.")
    print("4. Exit")
    
    while (flag) :
        choice = int(input("Enter Your Choice: "))
        match choice :
            case 1: print("Current Balance: ", balance)
            case 2: 
                deposit = int(input("Enter deposit amount: "))
                if deposit > 0 :
                    print("Deposit successful.")
                    balance += deposit
                    print("Updated Balance: " , balance)
                else : 
                    print("!!!Transaction Failed!!!")
                    print("---Deposite Amount must be greater than 0---")
            case 3:
                withdrawAmount = int(input("Enter Amount to Withdraw: "))
                if withdrawAmount > 0 :
                    if withdrawAmount < balance :
                        print("Withdraw Successful.")
                        balance -= withdrawAmount
                        print("Updated Balance: " , balance)
                    else : print("Transaction Failed : Insufficient Balance")
                else : print("Transaction Failed: Amount should be greater than 0")
            case 4: 
                print("Exiting.......")
                flag = False
            case _: print("Invalid Choice!!! | Enter a Vaild Choice.")
            
        if not flag : 
            break
        

MainMenue()
                  
                
    
    