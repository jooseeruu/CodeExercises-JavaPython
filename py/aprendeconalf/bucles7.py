"""Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10."""
def tabla(numero):
    for i in range(1,11):
        print(f"{numero} * {i} = {numero * i}")
tabla(4)