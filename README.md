# Introduccion-Java

## Analizar e implementar Ciclos en Java

Vamos a crear el algoritmo con la lógica necesaria para encender una lampara, emitir un mensaje y detener las luces en algún momento.

El Bucle While nos ayuda a ejecutar una parte del código mientras una condición se cumpla. Recuerda tener mucho cuidado y asegurarte de que la condición del ciclo while cambie en algún momento, de otra forma, el ciclo no se detendrá nunca y sobrecargarás tu programa:

```java
while (isTurnOnLight) {
  printSOS();
}
```

Los operadores ternarios son otra forma de evaluar condiciones, así como los condicionales IF y ELSE`:

```java
// Operador Ternario:
isTurnOnLight = (isTurnOnLight) ? false : true;

// IF y ELSE:
if (isTurnOnLight) {
  isTurnOnLight = false;
} else {
  isTurnOnLight = true;  
}
```