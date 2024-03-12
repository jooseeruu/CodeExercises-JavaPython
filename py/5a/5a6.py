"""Escribe un programa que pida primero dos números (máximo y mínimo) y que después te pida números intermedios. Para terminar de escribir números, escribe un número que no esté comprendido entre los dos valores iniciales. El programa termina escribiendo la lista de números.
Escribe un número: 6
Escribe un número mayor que 6: 4
4 no es mayor que 6. Vuelve a probar: 50
Escribe un número entre 6 y 50: 45
Escribe otro número entre 6 y 50: 13
Escribe otro número entre 6 y 50: 4
Los números situados entre 6 y 50 que has escrito son: 45, 13 
"""
def main():
    lista_numeros=[]
    min=int(input("Introduce un número minimo: "))
    max=int(input("Introduce un número máximo: "))
    while True:
        num_inter=int(input("Introduce un número intermedio: "))
        if min>num_inter or max<num_inter:
            print(lista_numeros)
            break
        elif min<num_inter<max:
            lista_numeros.append(num_inter)
        else:
            print("Introduce un valor válido")
main()