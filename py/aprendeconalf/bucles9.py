"""Escribir un programa que almacene la cadena de caracteres contraseña en una variable, pregunte al usuario por la contraseña hasta que introduzca la contraseña correcta."""
def contraseñas():
    contraseñas=str(input("Introduzca una contraseña:"))
    while True:
        prueba_contraseña=input("Introduzca la contraseña anterior")
        if contraseñas==prueba_contraseña:
            print("Contraseña correcta")
            break
        else:
            print(f"La contraseña {prueba_contraseña} es incorrecta ")
contraseñas()