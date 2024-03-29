"""Escribir una función que reciba un número entero positivo y devuelva su factorial."""
def factorial(n):
    temporal = 1
    for i in range(n):
        temporal *= i+1
    return temporal

print(factorial(4))
print(factorial(20))