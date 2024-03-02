"""Escribe un programa que te pida nombres de personas y sus números de teléfono. Para terminar debe pulsar “S” cuando te pida el nombre. El programa termina escribiendo nombres y números de teléfono. Nota: La lista en la que se guardan los nombres y números de teléfono tiene esta estructura[[nombre1, telef1], [nombre2, telef2], [nom3, telef3], etc], es decir, lista de listas.
Dame un nombre: Pepe González
Dame el teléfono: 971971971
Dame un nombre: Macarena Gómez
Dame el teléfono: 971999999
Dame un nombre: Pascual Ribot
Dame el teléfono: 666555444
Dame un nombre: S
Los nombres y teléfonos de la agenda son:
Pepe González: 971971971
Macarena Gómez: 971999999
Pasqual Ribot: 666555444"""

def main():
   
    nombres = []
    telefonos = []

    while True:
        nombre = input("Dame un nombre: ")
        if nombre == 'S':
            break
        telefono = input("Dame el teléfono: ")


        nombres.append(nombre)
        telefonos.append(telefono)

    print("Los nombres y teléfonos de la agenda son:")
    for i in range(len(nombres)):
        print(f"{nombres[i]}: {telefonos[i]}")
    
    main()

