"""Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas."""
def main ():
    while True:
        numero_limite=int(input("introduce un número positivo:"))
        if numero_limite < 0:
            print("El número que has introducido no es positivo")
        else:
            cuenta_atras=", ".join(str(i) for i in range(numero_limite, -1, -1))
            print(cuenta_atras)
        break
main()