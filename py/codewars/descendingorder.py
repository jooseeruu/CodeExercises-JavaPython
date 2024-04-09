"""Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

Examples:
Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321"""
def descending_order(num):
    num_str="".join(sorted(str(num), reverse=True))
    sorted_int=int(num_str)
    return sorted_int
        
    
print(descending_order(42145))
print(descending_order(145263))
print(descending_order(123456789))

