"""Escribe un programa que pida notas y los guarde en una lista. Para terminar de introducir notas, escribe una nota que no esté entre 0 y 10. El programa termina escribiendo la lista de notas.
Escribe una nota: 7.5
Escribe una nota: 0
Escribe una nota: 10
Escribe una nota: -1
Las notas que has Escrito son [7.5, 0.0, 10.0]
"""

def main():
    lista_numeros = []
    while True:
        numero = input("Dame una nota o escribe 'salir' para terminar: ")
        if numero.lower() == "salir":
            break
        else:
            numero = int(numero)
            if 0 <= numero <= 10:
                lista_numeros.append(numero)
            else:
                print("La nota debe estar entre 0 y 10.")

    print(f"Las notas que has escrito son {lista_numeros}")

main()
