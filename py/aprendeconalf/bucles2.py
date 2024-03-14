"""Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido (desde 1 hasta su edad)."""
def main():
    edad=int(input("¿Que edad tienes?"))
    for i in range (1,edad):
        print (i+1)
    
main()