# Gestión de Socios en Java☕

Este proyecto es una aplicación para la gestión de una lista de socios en Java utilizando el GUI Builder para la construcción de la interfaz gráfica. Permite agregar, eliminar, listar y guardar socios en un fichero de texto.


## Funcionalidades

- Agregar nuevos socios con sus datos: nombre, apellido, DNI, teléfono y categoría.
- Eliminar socios existentes mediante el DNI.
- Listar todos los socios registrados.
- Guardar los datos de los socios en un fichero de texto.
- Cargar los datos de los socios desde un fichero de texto al iniciar la aplicación.


## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal.
- **Swing - GUI Builder**: Para la creación de la interfaz gráfica de usuario.
- **I/O de Java**: Para leer y escribir en el fichero de texto.
- **JOptionPane**: Para mostrar mensajes y alertas a los usuarios.


## Interfaz de usuario

<div align="center">  
<img align="center" src="https://i.ibb.co/z74Y8dD/interfazdeusuario.jpg" alt="Screenshot">
</div>


## Instalación

1. **Clonar el repositorio.**
    ```bash
    git clone https://github.com/danugil/GestionSocios-Java
    ```
    
2. **Abrir el proyecto en un IDE compatible con Java.**

3. **Compilar y ejecutar el proyecto.**


## Modo de uso

1. **Agregar un Socio**:
    - Ingresa los datos del socio en los campos correspondientes.
    - Haz clic en el botón "Agregar".
    - Aparecerá un mensaje de confirmación si el socio se agregó correctamente.

2. **Eliminar un Socio**:
    - Ingresa el DNI del socio a eliminar en el campo correspondiente.
    - Haz clic en el botón "Eliminar".
    - Aparecerá un mensaje de confirmación si el socio se eliminó correctamente.

3. **Guardar Socios**:
    - Los datos de los socios se deben guardar en el fichero `fichero.txt` cada vez que se agrega o elimina un socio.

4. **Cargar Socios**:
    - Al iniciar la aplicación, los datos de los socios se cargarán automáticamente desde el fichero `fichero.txt` o haciendo clic en el botón "Abrir".

5. **Listar Socios**:
    - Haz clic en el botón "Listar" para mostrar todos los socios registrados.
