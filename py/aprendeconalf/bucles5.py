"""Escribir un programa que pregunte al usuario una cantidad a invertir, el interés anual y el número de años, y muestre por pantalla el capital obtenido en la inversión cada año que dura la inversión."""
def main():
    inversion = float(input("Introduce una cantidad de dinero a invertir: "))
    tasa_interes_anual = float(input("Introduce la tasa de interés anual (como un porcentaje): ")) / 100
    años = int(input("Introduce una cantidad de años para dejar trabajando el dinero: "))

    for i in range(1, años + 1):
        inversion = inversion * (1 + tasa_interes_anual)
        print(f"El capital obtenido en el año {i} es: {inversion}")

main()
