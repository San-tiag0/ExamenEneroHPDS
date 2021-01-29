# Ordenación
Cree diferentes formas que puedan formar parte de una lista ordenable. El orden de clasificación se basa en el tamaño de sus respectivas áreas:
- El área de un cuadrado es el cuadrado de su lado
- El área de un rectángulo es el ancho multiplicado por la altura
- El área de un triángulo es la base multiplicada por la altura dividida por 2
- El área de un círculo es el cuadrado de su radio multiplicado por π

El orden de clasificación predeterminado de una lista de formas es ascendente según el tamaño del área:
```java
List<Shape> shapes = new ArrayList<>();
shapes.add(new square(lado));
shapes.add(new circle(radio));
shapes.add(new rectangle(base, altura));
shapes.add(new triangle(base, altura));
Collections.sort(shapes);
```
Utilice la constante π correcta para los cálculos del área del círculo:
Math.PI