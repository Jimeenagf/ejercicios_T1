## ALED

### Práctica 1
### Práctica 2

# Apuntes de Java y Git

## JAVA

### Arrays
Un array permite almacenar varios elementos del mismo tipo en una misma variable.  
Los elementos se identifican mediante un índice que empieza en 0.

```java
int[] numeros = {10, 20, 30, 40};

System.out.println(numeros[0]); // 10
````

Para crear un array indicando su tamaño:

```java
int[] numeros = new int[5];
```

---

### Bucles

Los bucles permiten repetir un bloque de código varias veces.

**For:** se utiliza normalmente cuando conocemos el número de repeticiones.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

**While:** repite el código mientras se cumpla una condición.

```java
int i = 0;

while (i < 5) {
    System.out.println(i);
    i++;
}
```

**For-each:** permite recorrer los elementos de un array.

```java
int[] numeros = {10, 20, 30};

for (int numero : numeros) {
    System.out.println(numero);
}
```

---

### Clases

Una clase es una plantilla que define las características y comportamientos que tendrán los objetos.

```java
public class Persona {
    String nombre;
    int edad;
}
```

Podemos crear un objeto a partir de la clase:

```java
Persona persona = new Persona();
persona.nombre = "Ana";
persona.edad = 20;
```

---

### Métodos

Un método es un bloque de código que realiza una tarea determinada. Permite reutilizar código.

```java
public static void saludar() {
    System.out.println("Hola");
}
```

Los métodos pueden recibir parámetros y devolver un resultado:

```java
public static int sumar(int a, int b) {
    return a + b;
}
```

Ejemplo:

```java
int resultado = sumar(3, 5);
```

---

# GIT

Git es un sistema de control de versiones que permite registrar y gestionar los cambios realizados en un proyecto.

### Commit

Un `commit` guarda los cambios realizados en el repositorio local.

```bash
git add .
git commit -m "Añadidos apuntes de Java"
```

El mensaje del commit debe indicar qué cambios se han realizado.

---

### Push

`push` envía los commits del repositorio local al repositorio remoto, como GitHub.

```bash
git push
```

---

### Pull

`pull` descarga los cambios del repositorio remoto y actualiza el repositorio local.

```bash
git pull
```

---

### Fork

Un `fork` crea una copia de un repositorio de otra persona en nuestra propia cuenta de GitHub.

Se utiliza para poder trabajar sobre un proyecto sin modificar directamente el repositorio original.

Flujo habitual:

1. Hacer un `fork` del repositorio.
2. Clonar el fork.
3. Realizar cambios.
4. Crear un `commit`.
5. Hacer `push` al fork.

