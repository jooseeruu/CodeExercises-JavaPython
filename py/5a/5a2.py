"""Escribe un programa que te pida números y los guarde en una lista. Para terminar de introducir números, simplemente escribe “Salir”. El programa termina escribiendo la lista de números.
Escribe un número: 14
Escribe una otro número: 123
Escribe una otro número: -25
Escribe una otro número: 123
Escribe una otro número: Salir
Los números que has escrito son [14, 123, -25, 123]
"""
def main():
    lista_numeros=[]
    while True:
        numero = input("Dame un número: ")
        if numero =="s":
            print(f"Los números que has escrito son {lista_numeros}")
        lista_numeros.append(numero)

main()    