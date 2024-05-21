tablero = [' ']*9
jugadores = ['X', 'O']
turno = 0

def imprimir_tablero():
    for i in range(0, 9, 3):
        print(tablero[i], '|', tablero[i+1], '|', tablero[i+2])

def check_ganador(jugador):
    lineas_ganadoras = [(0,1,2), (3,4,5), (6,7,8), (0,3,6), (1,4,7), (2,5,8), (0,4,8), (2,4,6)]
    for linea in lineas_ganadoras:
        if tablero[linea[0]] == tablero[linea[1]] == tablero[linea[2]] == jugador:
            return True
    return False

while True:
    imprimir_tablero()
    pos = int(input(f'Jugador {jugadores[turno]}, elige una posición (0-8): '))
    if tablero[pos] != ' ':
        print('Esa posición ya está ocupada, elige otra.')
        continue
    tablero[pos] = jugadores[turno]
    if check_ganador(jugadores[turno]):
        imprimir_tablero()
        print(f'¡El jugador {jugadores[turno]} ha ganado!')
        break
    turno = (turno + 1) % 2
