"""Escribe un programa que te pida dos números, de manera que el segundo sea mayor que el primero. El programa termina escribiendo los dos números tal y como se pide:
Escribe un número: 6
Escribe un número mayor que 6: 6
6 no es mayor que 6. Vuelve a introducir un número: 1
1 no es mayor que 6. Vuelve a introducir un número: 8
Los números que has escrito son 6 y 8
"""

def main():

    lista_numeros=[]
    while True:
        num_menor= int(input("Introduce un número:"))
        num_mayor= int(input(f"Introduce un número mayor que {num_menor}: ")) 
        if num_menor<num_mayor:
            lista_numeros.append(num_menor)
            lista_numeros.append(num_mayor)
            print(f"Los números que has escrito son {lista_numeros} ")
            break
        else:
            print(f"{num_menor} no es mas grande que {num_mayor} ")

main()
