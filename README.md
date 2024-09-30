# Convertidor de Monedas - Challenge Programa One

## Descripción

Este proyecto es una aplicación Java que permite convertir entre diferentes monedas. Fue desarrollada utilizando Maven para la gestión de dependencias y organización del ciclo de vida del proyecto. La aplicación soporta múltiples tipos de cambio y permite realizar conversiones precisas entre divisas.

## 💥 Características

- Conversión entre las principales monedas del mundo.
- Soporte para tasas de cambio en tiempo real.
- Interfaz de línea de comandos (CLI) simple para ingresar montos y seleccionar monedas.
- Manejo de errores en caso de tasas de cambio no disponibles.

##  🛠 Tecnologías

- **Java**: versión 21.
- **Maven**: para la gestión de dependencias.
- **API de tipo de cambio**:  https://www.exchangerate-api.com/.

## 🎯 Requisitos previos

- JDK 21.
- Maven 4.0 instalado.
- (Opcional) Claves API si necesitas conectarte a una API de tasas de cambio externas.

## 🚀 Instalación

1. Clonar el repositorio:
   ```
   git clone https://github.com/LuHer18/conversor-monedas-challenge.git
   
   ```
2. Instalar dependencias y compilar el proyecto:
   ```
   mvn clean install
   
   ```
3. Configuración de Variables de Entorno
   
   Cambia el nombre del archivo .env.template a .env e ingresa API Key URL Base

   ```
   API_KEY=tu_api_key
   BASE_URL=https://v6.exchangerate-api.com/v6/

   ```
4. Inicia el archivo Main y tendrás disponible el convertiro por línea de comandos

## 🔑 Licencia
<p><a href='https://github.com/LuHer18/conversor-monedas-challenge/blob/main/LICENSE'>MIT</a> - Creado por <a href='https://github.com/LuHer18'>Luis Herrera</a></p>
