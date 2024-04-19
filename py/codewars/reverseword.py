"""Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"""

def reverse_words(text):
    reversed_text=""
    for letter in text:
        reversed_text= letter + reversed_text
    
    return reversed_text

print(reverse_words("hola"))
    