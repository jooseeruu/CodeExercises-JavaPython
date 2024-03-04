"""Escribir un programa para jugar a adivinar un número (el ordenador "piensa" el número y el usuario lo ha de adivinar). El programa empieza pidiendo entre qué números está el número a adivinar, se "inventa" un número al azar y luego el usuario va probando valores. El programa va decidiendo si son demasiado grandes o pequeños. pista:
import random
import time

minimo = int (input ( "Valor mínimo:"))
max = int (input ( "Valor máximo:"))
secreto = random.randint (mínimo, máximo)
Valor mínimo: 0
Valor máximo: 100
A ver si adivinas un número entero entre 0 y 100.
Escribe un número: 20
Demasiado pequeño! Volver a probar: 30
Demasiado grande! Volver a probar: 27
Correcto! Lo has intentado 3 veces.
"""
import random

def main():
    minimo = int(input("Valor mínimo: "))
    maximo = int(input("Valor máximo: "))
    secreto = random.randint(minimo, maximo)
    intentos = 0

    print(f"A ver si adivinas un número entero entre {minimo} y {maximo}.")

    while True:
        adivina = int(input("Escribe un número: "))
        intentos += 1

        if adivina < secreto:
            print("Demasiado pequeño. Vuelve a probar.")
        elif adivina > secreto:
            print("Demasiado grande. Vuelve a probar.")
        else:
            print(f"¡Correcto! Lo has intentado {intentos} veces.")
            break
main()
