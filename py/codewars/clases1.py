"""Ejercicio 1
Crea la clase Coche que contenga las siguientes propiedades:

matrícula (string)
marca (string)
kilometros_recorridos (float)
gasolina (float)
La clase tendrá un método llamado avanzar() que recibirá como argumento el número de kilómetros a conducir y sumará los kilómetros recorridos al valor de la propiedad kilometros_recorridos.
El método también restará al valor de gasolina el resultado de los kilómetros multiplicado por 0'1.
La clase también contendrá otro método llamado repostar() que recibirá como argumento los litros introducidos que deberán sumarse a la variable gasolina.
Por último, será necesario controlar que el método avanzar nunca obtendrá un número negativo en la gasolina.
En dicho caso, deberá mostrar el siguiente mensaje: "Es necesario repostar para recorrer la cantidad indicada de kilómetros".

Ejemplo:

avanzar(50) # gasolina = 50
avanzar(100) # kilometros_recorridos = 100, gasolina = 40
avanzar(40) # kilometros_recorridos = 140, gasolina = 36
avanzar(180) # kilometros_recorridos = 320, gasolina = 18"""

class Coche:
    def __init__(self, matricula, marca, kilometros_recorridos, gasolina):
        self.matricula = matricula
        self.marca = marca
        self.kilometros_recorridos = kilometros_recorridos
        self.gasolina = gasolina

    def avanzar(self, kilometros):
        if self.gasolina - kilometros * 0.1 < 0:
            print("Es necesario repostar para recorrer la cantidad indicada de kilómetros")
        else:
            self.kilometros_recorridos += kilometros
            self.gasolina -= kilometros * 0.1
            print(f"Hemos recorrido {self.kilometros_recorridos} y nos queda {self.gasolina}")

    def repostar(self, litros):
        self.gasolina += litros
        print(f"hemos repostado {litros} litros ahora tenemos {self.gasolina} litros en total")

# Crear una instancia de la clase Coche
mi_coche = Coche("2533 JBC", "Toyota", 0, 50)

# Llamar al método avanzar
mi_coche.avanzar(50)  # kilometros_recorridos = 50, gasolina = 45

# Llamar al método avanzar de nuevo
mi_coche.avanzar(100)  # kilometros_recorridos = 150, gasolina = 35

# Llamar al método repostar
mi_coche.repostar(20)  # gasolina = 55

# Intentar avanzar más de lo que la gasolina permite
mi_coche.avanzar(600)  # Debería mostrar: "Es necesario repostar para recorrer la cantidad indicada de kilómetros"
