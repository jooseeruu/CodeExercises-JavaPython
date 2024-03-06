"""Escribir un programa para jugar a adivinar un número (el usuario piensa un número y el programa lo ha de adivinar). El programa empieza pidiendo entre qué números está el número a adivinar y luego intenta adivinar de qué número se trata. El usuario va diciendo si el número que ha dicho el programa es menor, mayor o igual al que se ha buscado.
Valor mínimo: 0
Valor máximo: 100
Piensa un número entre 0 y 100 a ver si lo puedo adivinar.
Es 50 ?: mayor
Es 75 ?: menor
Es 62 ?: menor
Es 56 ?: mayor
Es 59 ?: igual
Gracias por jugar!!
Mejoras (opcionales):
    • que al principio el programa se asegure de que el valor máximo es superior al valor mínimo.
    • Que el programa detecte "trampas", por ejemplo, si cuando dices "25" le decimos "mayor" y al decir "26" le decimos "menor", el programa debe decir que estamos haciendo trampas y debe dejar de jugar con nosotros.
"""
import random
def main():

    minimo = int(input("Valor mínimo: "))
    maximo = int(input("Valor máximo: "))

    while maximo <= minimo:
        print("El valor máximo debe ser mayor que el valor mínimo.")
        maximo = int(input("Valor máximo: "))

    numpropuesto = random.randint(minimo, maximo)
    print(f"Piensa un número entre {minimo} y {maximo} a ver si lo puedo adivinar.")

    while True:
        propuesto = input(f"Es {numpropuesto}?: ")

        if propuesto == "mayor":
            minimo = numpropuesto + 1
        elif propuesto == "menor":
            maximo = numpropuesto - 1
        elif propuesto == "igual":
            print("¡Adiviné! Gracias por jugar.")
            break
        else:
            print("Por favor, responde 'mayor', 'menor' o 'igual'.")
            
        numpropuesto = random.randint(minimo, maximo)

main()