"""Crea un programa en Java o en Python que generi una matriu de
3x3 amb valors aleatoris i que primer la mostri per pantalla i
després mostri la seva matriu transposada.
Per convertir una matriu (A) a la seva matriu transportada (AT) les
files es canvien per columnes tal i com podeu veure:"""

import random
# Generar una matriz de 3x3 con valores aleatorios
A = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
for i in range(3):
    for j in range(3):
        A[i][j] = int(random.random() * 10)

# Mostrar la matriz original
print("Matriz original:")
for i in range(3):
    for j in range(3):
        print(A[i][j], end=' ')
    print()

# Calcular y mostrar la matriz transpuesta
print("\nMatriz transpuesta:")
for i in range(3):
    for j in range(3):
        print(A[j][i], end=' ')
    print()
