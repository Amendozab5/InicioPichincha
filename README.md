# Diseño Responsivo del Inicio de Sesión - Banco Pichincha (Android App)

Este repositorio contiene la implementación del diseño responsivo y adaptativo para la pantalla de inicio de sesión de la aplicación móvil de **Banco Pichincha**, desarrollada para la plataforma Android utilizando **Kotlin** y layouts **XML**.

---

## Características del Diseño

1. **Responsividad Completa**: 
   - Se utiliza un contenedor raíz `ScrollView` para permitir el desplazamiento vertical dinámico en caso de que la pantalla sea compacta o que el teclado en pantalla (software keyboard) se despliegue, previniendo recortes o errores de desbordamiento de interfaz (*overflow*).
   - Estructuración interna con `ConstraintLayout` para lograr una distribución de vistas moderna, equilibrada y alineada proporcionalmente.
   
2. **Distribución Adaptativa de Vistas**:
   - Las tres tarjetas principales de métodos de autenticación (*Usuario y contraseña*, *Huella / Face ID* y *Pin de 6 dígitos*) se ajustan proporcionalmente según el ancho del dispositivo mediante cadenas de restricciones horizontales (`Horizontal Chain`) y anchos dinámicos (`0dp`).
   
3. **Identidad Visual de Banco Pichincha**:
   - Integración de la paleta de colores institucional oficial de la entidad financiera:
     - **Amarillo Pichincha** (`#FFDD00` / `@color/pichincha_yellow`)
     - **Azul Oscuro** (`#0F2B4C` / `@color/pichincha_blue`)
     - **Azul de Enlaces** (`#0073C2` / `@color/pichincha_light_blue`)
   - Tarjetas con bordes sutiles, esquinas con radios de 16dp y efecto de respuesta táctil (*ripple* u onda) incorporado de forma nativa.
   
4. **Interactividad**:
   - Implementación en **Kotlin** de `setOnClickListener` para todas las tarjetas del menú y opciones de pie de página, arrojando mensajes interactivos en pantalla (`Toast`) para guiar el flujo.

---

## Captura del Diseño de la App

A continuación se muestra la captura del diseño responsivo implementado, incluyendo la vista de diseño visual (Design) y la estructura de componentes (Blueprint) en Android Studio:

<p align="center">
  <img src="app/src/main/res/drawable/diseñoApp.png" alt="Diseño de la App - Banco Pichincha" width="90%">
</p>

---

## Estructura del Código Relevante

El diseño y la lógica están divididos en los siguientes módulos del proyecto:

* **Layout XML Principal**: [activity_main.xml](app/src/main/res/layout/activity_main.xml) - Define la estructura visual y responsiva.
* **Controlador Kotlin**: [MainActivity.kt](app/src/main/java/com/example/iniciopichincha/MainActivity.kt) - Enlaza la interactividad y los eventos de clic.
* **Definición de Colores**: [colors.xml](app/src/main/res/values/colors.xml) - Aloja los códigos de color de la marca.
* **Recursos Gráficos**: 
  - [card_background.xml](app/src/main/res/drawable/card_background.xml) - Fondo de las tarjetas con ripple.
  - Iconos vectoriales y mapas de bits oficiales en la carpeta `res/drawable/`.

---

## Instrucciones para Compilar y Ejecutar

1. Clona este repositorio o copia los archivos fuente en tu espacio de trabajo local de Android Studio.
2. Abre el proyecto en **Android Studio**.
3. Sincroniza Gradle (*Sync Project with Gradle Files*).
4. Elige tu dispositivo virtual (Emulador) o físico conectado.
5. Ejecuta la aplicación utilizando la combinación `Shift + F10` o presionando el botón **Run**.
