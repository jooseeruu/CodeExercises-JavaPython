## String a Integer
```
Integer entero = Integer.valueOf(cadena);
// o
int entero = Integer.parseInt(cadena);
```
Ejemplo:
```
Integer a = Integer.valueOf("900");
// o
int b = Integer.parseInt("900");
```
## Integer a String
```
String cadena = Integer.toString(entero);
// o
String cadena = String.valueOf(entero);
```
Ejemplo:
```
String importe = Integer.toString(900);
// o
int entero = 900;
String mensaje = String.valueOf(entero);
```
## char a String
```
String cadena = Character.toString(char);
```
Ejemplo:
```
char codigo = 'A';
String cadena = Character.toString(codigo);
```
## String a char
```
char caracter = cadena.charAt(0); //Solo primer caracter
```
Ejemplo:
```
String codigo= "E";
char caracter = cadena.charAt(0);
```
## String a Double
```
double doble = Double.parseDouble(cadena);
```
Ejemplo:
```
double doble = Double.parseDouble("900.1");
```
## Double a String
```
String cadena = String.valueOf(doble);
```
Ejemplo:
```
double totalDoble = 900.5;
String totalString = String.valueOf(doble);
```
## String a Float
```
float flotante = Float.parseFloat(cadena);
```
Ejemplo:
```
float importe = Float.parseFloat("900.5");
```
## Float a String
```
String cadena = Float.toString(flotante);
```
Ejemplo:
```
String total = Float.toString(900.1f);
```
## String a Boolean
```
Boolean boolean = Boolean.valueOf(cadena);
// o
boolean boolean = Boolean.parseBoolean(cadena);
```
Ejemplo:
```
Boolean boolean = Boolean.valueOf("true");
// o
boolean boolean = Boolean.parseBoolean("false");
```
## Boolean a String
```
String cadena = String.valueOf(b);
// o
String cadena = Boolean.toString(b);
```
Ejemplo:
```
boolean b = true;
String cadena = String.valueOf(b);
// o
boolean b = false;
String cadena = Boolean.toString(b);
```