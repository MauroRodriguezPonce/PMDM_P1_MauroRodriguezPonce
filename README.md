
# PelisPendientes

**Práctica 1 · PMDM (Temas 1-3) · Mi primera app Android**
Autor: Mauro Rodríguez Ponce

## Descripción

PelisPendientes es una app Android para apuntar las películas y series que quiero ver y no perderlas entre tantas plataformas de streaming. Cada título se guarda como "pendiente" y, cuando se ve, se marca como "visto" con una nota de 1 a 5. Está pensada para funcionar sin conexión y con una interfaz oscura, cómoda para usarla de noche.

En esta práctica **no se programa la funcionalidad**: el objetivo es analizar el desarrollo móvil, especificar la app, preparar el entorno de desarrollo y organizar correctamente los recursos (textos, imágenes, colores, estilos e icono).

## Qué he hecho

**Parte A · Análisis del desarrollo móvil.** Ventajas e inconvenientes frente a escritorio y web, limitaciones concretas (batería, memoria, conectividad, pantalla, fragmentación) aplicadas a la app, tabla comparativa nativo / híbrido / multiplataforma con justificación de la elección de Android nativo, y diagrama del ciclo de vida de una Activity con tres escenarios (llamada, giro de pantalla y botón Atrás).

**Parte B · Especificación.** Idea y público objetivo, 3 objetivos medibles, requisitos funcionales (RF-01…RF-10) con prioridad, requisitos no funcionales verificables (RNF-01…RNF-06), diagrama de casos de uso y dos fichas detalladas (CU-01 Añadir título y CU-03 Marcar como vista y puntuar).

**Parte C · Entorno de desarrollo.** Proyecto creado en Android Studio (Empty Views Activity, Java, API mínima 24), dos dispositivos virtuales distintos (móvil y tablet) documentados en una tabla, ejecución de la app en ambos y explicación de la estructura del proyecto (Manifest, `java/`, `res/` y ficheros Gradle) y de la relación Activity–layout.

**Parte D · Recursos de la aplicación.** Dos pantallas (lista y formulario) que solo usan recursos externalizados:

- **Textos:** todos en `strings.xml`, con un `string-array` (plataformas) y un texto con parámetros (`%1$d`, `%2$d`).
- **Internacionalización:** traducción completa al inglés en `values-en`.
- **Imágenes:** tres vectoriales (claqueta, estrella, añadir) y un bitmap (banner), con la justificación del formato elegido.
- **Colores:** paleta propia con nombres por función (`color_primario`, `color_acento`, `color_fondo`…), inspirada en una sala de cine.
- **Estilos y tema:** tema oscuro personalizado y estilos propios reutilizados en ambas pantallas, con medidas en `dp` y texto en `sp`.
- **Icono:** icono adaptativo propio creado con Image Asset y aplicado en el Manifest.

## Cómo ejecutarla

1. Clona el repositorio:
   ```
   git clone https://github.com/TU_USUARIO/PMDM_P1_MauroRodriguezPonce.git
   ```
2. Abre la carpeta del proyecto con **Android Studio**.
3. Espera a que termine la sincronización de Gradle (**File → Sync Project with Gradle Files**).
4. Elige un dispositivo virtual (AVD) o un móvil físico y pulsa **Run**.

**Requisitos:** Android Studio reciente, JDK incluido con Android Studio y un dispositivo o emulador con **Android 7.0 (API 24)** o superior.

Más información en el PDF adjuntado (`docs/memoria.pdf`).