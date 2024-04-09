"""ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.

Examples (Input --> Output)
"1234"   -->  true
"12345"  -->  false
"a234"   -->  false"""

def validate_pin(pin):
    count=0
    for numbers in str(pin):
        if numbers==int:
            count=count+1
            if count==6 or 4:
                return True
            else:
                return False
        else:
            break
        

print(validate_pin(1234))