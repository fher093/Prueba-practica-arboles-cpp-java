# Sistema de Gestión Académica - Árbol Binario de Búsqueda en JAVA

*Estudiante:* Fernando Llerena

*Semestre:* Tercer Semestre  

*Universidad:* Universidad Técnica de Ambato (UTA)  

*Carrera:* Ingeniería de Software  

*Asignatura:* Estructura de Datos  

---


Este proyecto es una implementación de un sistema académico desarrollado para la **Universidad Técnica de Ambato**. El objetivo es gestionar la información de estudiantes utilizando estructuras de datos avanzadas, específicamente **Árboles Binarios de Búsqueda (BST)** en Java.

## 📁 Estructura del Proyecto
A continuación se detalla la organización de los archivos del repositorio, incluyendo la carpeta de evidencias y el código fuente en Java:

```text
PRUEBA-PRACTICA-ARBOLES-CPP-JAVA/
├── evidencias/          # Capturas de pantalla del funcionamiento
│   ├── Insercion1.png
│   ├── insercion2.png
│   ├── insercion3.png
│   ├── insercion4.png
│   ├── insercion5.png
│   ├── opcion2.png
│   ├── ... (hasta opcion14.png)
├── java/                # Código fuente del sistema
│   ├── ArbolBST.java    # Lógica del Árbol Binario de Búsqueda
│   ├── Estudiante.java  # Clase modelo del Estudiante
│   ├── Main.java        # Clase principal con el menú
│   └── Nodo.java        # Estructura del nodo del árbol
└── README.md            # Documentación del proyecto
```

---

## 📋 Descripción del Proyecto
El sistema permite administrar registros de estudiantes (cédula, nombres, apellidos, nota final, carrera y nivel) optimizando las búsquedas y el almacenamiento mediante la lógica de árboles binarios.

### Características Técnicas
- **Lenguaje:** Java 17+
- **Paradigma:** Programación Orientada a Objetos (POO)
- **Estructura de Datos:** Árbol Binario de Búsqueda (ABB / BST)
- **Algoritmos:** Recursividad para inserción y recorridos, y Colas para el recorrido por niveles (BFS).

---

## 🚀 Funcionalidades y Evidencias

### 1. Gestión de Estudiantes (Inserción)
Se permite el registro de nuevos estudiantes manteniendo el orden del árbol por el número de cédula.
<table>
  <tr>
    <td><img src="evidencias/Insercion1.png" width="200"></td>
    <td><img src="evidencias/insercion2.png" width="200"></td>
    <td><img src="evidencias/insercion3.png" width="200"></td>
  </tr>
  <tr>
    <td><img src="evidencias/insercion4.png" width="200"></td>
    <td><img src="evidencias/insercion5.png" width="200"></td>
    <td><i>Proceso de registro inicial</i></td>
  </tr>
</table>

### 2. Búsqueda y Eliminación
- **Buscar por Cédula:** Localización eficiente con complejidad O(log n).
- **Eliminar Estudiante:** Reestructuración del árbol manteniendo sus propiedades.

| Operación | Evidencia Visual |
| :--- | :--- |
| **Buscar Estudiante** | <img src="evidencias/opcion2.png" width="400"> |
| **Eliminar Estudiante** | <img src="evidencias/opcion3.png" width="400"> |

### 3. Recorridos del Árbol
Implementación de los algoritmos clásicos de exploración de nodos:
- **Inorden:** <img src="evidencias/opcion4.png" width="350">
- **Preorden:** <img src="evidencias/opcion5.png" width="350">
- **Postorden:** <img src="evidencias/opcion6.png" width="350">
- **Por Niveles (BFS):** <img src="evidencias/opcion7.png" width="350">

### 4. Estadísticas y Reportes
El sistema genera reportes automáticos basados en la información recolectada:

| Función | Descripción | Evidencia |
| :--- | :--- | :--- |
| **Contar Estudiantes** | Total de nodos en el árbol | <img src="evidencias/opcion8.png" width="250"> |
| **Altura del Árbol** | Nivel máximo de profundidad | <img src="evidencias/opcion9.png" width="250"> |
| **Nota Mayor** | Estudiante con rendimiento máximo | <img src="evidencias/opcion10.png" width="250"> |
| **Nota Menor** | Estudiante con rendimiento mínimo | <img src="evidencias/opcion11.png" width="250"> |
| **Aprobados** | Filtro de notas (>= 7.0) | <img src="evidencias/opcion12.png" width="250"> |
| **Reprobados** | Estudiantes con notas inferiores a 7.0 | <img src="evidencias/opcion13.png" width="250"> |

### 5. Salida del Sistema
- <img src="evidencias/opcion14.png" width="300">

---
