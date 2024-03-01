#Escribe un programa que te pida primero un número y luego te pida números hasta que la suma de los números introducidos coincida con el número inicial. El programa termina escribiendo la lista de números.
#Escribe límite: 50
#Escribe un valor: 10
#Escribe otro valor: 45
#45 es demasiado grande. Escribe otro valor: 1
#Escribe otro valor: 39
#El límite a alcanzar es 50. La lista creada es: 10, 1, 39

def main():
    limite = int(input("Introduce un limite:"))
    numero= []
    suma_actual=0
    while suma_actual<limite:
        valor= int(input("Escribe un valor:"))
        if suma_actual+valor>limite:
            print(f"El valor introducido ({valor}) es demasiado alto introduce otro:")
            
        else:
            numero.append(valor)
            suma_actual+=valor

    print(f"El límite a alcanzar es {limite}. La lista creada es: {', '.join(map(str, numero))}")
main()
