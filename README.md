<h2><b>PARTE 1 INTERFAZ: </b></h2><u><a href"https://github.com/makulky/SocialCooking-Parte1">https://github.com/makulky/SocialCooking-Parte1</a></u>

<h2><b>PREGUNTAS:</b></h2>

1. Ruta absoluta hacia el directorio principal donde está almacenada la aplicación. (0,5)

<b>C:\Users\TU_USUARIO\AndroidStudioProjects\NOMBRE_PROYECTO</b>

2. Ruta relativa hacia el directorio con las actividades de la aplicación. (0,5)<br>

<b>app/src/main/java/com/NOMBRE_EMPRESA/TU_APP/</b>

3. Ruta relativa hacia el directorio donde se encuentran los recursos de la aplicación. (0,5)<br>

<b>app/src/main/res/</b>

4. vRuta relativa hacia el directorio donde se encuentran los elementos de compilación de la aplicación. (0,5)<br>

<b>app/</b>

5. ¿Cuántas clases se han creado para esta aplicación? ¿heredan de alguna clase? (1)<br>

<b>Se han creado 3 clases. CreditActivity, MainActivity y SplashActivity. Sí, cada una de las tres clases hereda de la clase AppCompatActivity</b>

6. ¿Qué es una actividad? ¿dónde se define la apariencia gráfica y el funcionamiento lógico de cada actividad?  (1)<br>

<b>Una actividad es una sola pantalla con una interfaz de usuario en una aplicación de Android. Actúa como el punto de entrada principal para la interacción del usuario con la aplicación. <p><ul><li>Apariencia Gráfica: Se define en archivos XML en el directorio res/layout.<br></li><li>
Funcionamiento Lógico: Se define en archivos .java o .kt en el directorio java o kotlin.</li></ul></b>

7. ¿Cuál es el cometido de la función "onCreate" de las actividades? (1)<br>

<b>La función onCreate es donde se inicializa la actividad. Es el primer método que se llama cuando se crea la actividad. Aquí es donde se establece la interfaz de usuario con setContentView y se inicializan los componentes necesarios.</b>
 
8. ¿Para qué se utiliza el objeto "intent" de la clase "Intent" en esta aplicación? (1)<br>

<b>El objeto Intent se utiliza para realizar operaciones de comunicación entre componentes de la aplicación, como iniciar nuevas actividades, servicios o enviar datos entre actividades.</b>

9. ¿Qué está definido en el fichero "strings.xml"? (1)<br>

<b>El archivo strings.xml en el directorio res/values contiene definiciones de cadenas de texto utilizadas en la aplicación. Esto permite la localización y la reutilización de textos.</b>

10. ¿Para qué se utiliza el directorio "mipmap" en el proyecto? ¿qué significa la siguiente línea de código del fichero "ic_launcher.xml": 
&lt;background android:drawable="@drawable/ic_launcher_background"/&gt; (1)<br>

<b>El directorio mipmap se utiliza para almacenar los iconos de la aplicación en diferentes resoluciones. La línea anterior define un fondo para el icono de la aplicación, utilizando un recurso drawable llamado "ic_launcher_background".</b>

11. ¿Cuál es la función principal del fichero "AndoidManifest.xml"?¿dónde se encuentra ubicado? (1)<br>

<b>define la estructura y los componentes de la aplicación, incluyendo actividades, permisos y otros componentes. Se encuentra en: app/src/main/AndroidManifest.xml</b>

12. Indica las siguientes cláusulas del fichero de manifiesto: 
<ul>
  <li>Nombre de las actividades. (0,5): <b>Puedes encontrar los nombres de las actividades en el archivo AndroidManifest.xml bajo las etiquetas <activity>.</b></li>
  <li>Explica las siguientes cláusulas (0,5):<br>
  - android:allowBackup="true": <b>Esto permite que los datos de la aplicación sean respaldados y restaurados.</b><br>
  - android:icon="@mipmap/ic_launcher": <b>Esto especifica el icono de la aplicación que se muestra en la pantalla de inicio y en la lista de aplicaciones del dispositivo.</b></li>
</ul>
