"""Escribe un programa que te pida los nombres y notas de alumnos. Si escribes una nota fuera del intervalo de 0 a 10, el programa entenderá que no quieres introducir más notas de este alumno. Si no escribes el nombre, el programa entenderá que no quieres introducir más alumnos. 
Nota: La lista en la que se guardan los nombres y notas tiene esta estructura [[nombre1, nota1, nota2, etc], [nombre2, nota1, nota2, etc], [nom3, nota1, nota2, etc], etc]
Dame un nombre: Héctor Quiroga
Escribe una nota: 4
Escribe otra nota: 8.5
Escribe otra nota: 12
Dame otro nombre: Inés Valls
Escribe una nota: 7.5
Escribe otra nota: 1
Escribe otra nota: 2
Escribe otra nota: -5
Dame otro nombre:
Las notas de los alumnos son:
Héctor Quiroga: 4.0 - 8.5
Inés Valls: 7.5 - 1.0 - 2.0
"""
def main():
    alumnos = []

    while True:
        nombre = input("Dame un nombre (o deja en blanco para terminar): ")
        if not nombre:
            break

        notas_alumno = []
        while True:
            try:
                nota = float(input("Escribe una nota (fuera del intervalo 0-10 para terminar): "))
                if 0 <= nota <= 10:
                    notas_alumno.append(nota)
                else:
                    break  
            except ValueError:
                print("Por favor, ingresa un número válido.")

        if notas_alumno:
            alumnos.append((nombre, notas_alumno))  

    print("\nLas notas de los alumnos son:")
    for nombre, notas_alumno in alumnos:
        notas_alumno_str = " - ".join(map(str, notas_alumno))  
        print(f"{nombre}: {notas_alumno_str}")
main()
