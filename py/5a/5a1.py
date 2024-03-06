"""Escribe un programa que te pida palabras y las guarde en una lista. Para terminar de introducir palabras, simplemente pulsa Enter. El programa termina escribiendo la lista de palabras.
Escribe una palabra: viaje
Escribe más palabras: aventura
Escribe más palabras: cómic
Escribe más palabras:
Las palabras que has Escrito son [ 'viaje', 'aventura', 'cómic']
"""
def main():
    lista_palabras = []
    while True:
        palabra = input("Escribe una palabra: ")
        if palabra == "":
            print("Las palabras que has escrito son", lista_palabras)
            break
        else:
            lista_palabras.append(palabra)

main()

        

