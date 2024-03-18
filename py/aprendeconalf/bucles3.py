"""Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas."""
def main ():
    while True:
        numero_limite=int(input("introduce un número positivo:"))
        if numero_limite < 0:
            print("El número que has introducido no es positivo")
        else:
            for i in range (1, numero_limite):
                if i%2!=0:
                    print(i)
        break
main()