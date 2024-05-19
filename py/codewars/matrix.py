"""Crea un programa en Java o en Python que generi una matriu de
3x3 amb valors aleatoris i que primer la mostri per pantalla i
després mostri la seva matriu transposada.
Per convertir una matriu (A) a la seva matriu transportada (AT) les
files es canvien per columnes tal i com podeu veure:"""

import random

# Crear la matriz original A
A = [[0,0,0],
     [0,0,0],
     [0,0,0]]
for i in range(3):
    for j in range(3):
        A[i][j] = int(random.random()*10)

print("Matriz original A:")
for i in range(3):
    for j in range(3):
        print(A[i][j], end=" ")
    print()

# Crear la matriz transpuesta AT
AT = [[0,0,0],
      [0,0,0],
      [0,0,0]]
for i in range(3):
    for j in range(3):
        AT[j][i] = A[i][j]

print("Matriz Transpuesta AT:")
for i in range(3):
    for j in range(3):
        print(AT[i][j], end=" ")
    print()
