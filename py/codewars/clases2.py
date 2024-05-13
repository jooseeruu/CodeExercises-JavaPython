"""Realizar un programa en el cual se declaren dos valores enteros por teclado utilizando el método __init__.
Calcular después la suma, resta, multiplicación y división. Utilizar un método para cada una e imprimir los resultados obtenidos.
Llamar a la clase Calculadora."""

class Calculadora:
    def __init__(self, num1, num2):
        self.num1 = num1
        self.num2 = num2
        
    def suma(self):
        resultado = self.num1 + self.num2
        print(f"El resultado de la suma es {resultado}")
        
    def resta(self):
        resultado = self.num1 - self.num2
        print(f"El resultado de la resta es {resultado}")
    
    def multiplicación(self):
        resultado = self.num1 * self.num2
        print(f"El resultado de la multiplicación es {resultado}")
        
    def división(self):
        resultado = self.num1 // self.num2
        print(f"El resultado de la división es {resultado}")

    
calc = Calculadora(10, 5)
calc.suma()
calc.resta()
calc.multiplicación()
calc.división()
