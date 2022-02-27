![Ima1](https://github.com/felixmontero/Agenda/blob/master/images/1.jpg) 
# Tarea 5. Shared repository on [GitHub](https://github.com)

## Proyecto de agenda de teléfono, usando como lenguaje Java

* Creación de respositorio con la rama master/main
* Clonación del repo
* Creación de branches para la subida de clases que conforman nuestro programa y realizar los respectivos aportes y/o cambios que realicen los colaboradores
* Pull requests

## 1. Creación del repositorio

* En el lado superior derecho, en el menú desplegable hacemos clic en ***New repository***.

![Ima2](https://github.com/felixmontero/Agenda/blob/master/images/2.png)

* En la opción ***Repository name***, introducimos el nombre, en este caso  `Agenda`.

* En ***Description***, escribimos una breve descripción.
* En nuestro caso selecionamos la opción para que sea privado (***Private***).
* Elegimos la opción `Add a README file` o no, según sea el caso.
* Y por último `Create repository`.

![Ima3](https://github.com/felixmontero/Agenda/blob/master/images/3.png)

* Veremos nuestro repositorio, con la rama main/master creada por default

![Ima4](https://github.com/felixmontero/Agenda/blob/master/images/4.png)

## 2. Invitación a otros desarrolladores para colaborar en nuestro trabajo

* Una vez que tenemos creado nuestro repositosio, en ***Setting*** debajo de ***Access*** veremos la opción ***Collaborators***. Ahí mismo veremos los pasos para poder añadir a desarrolladores

![Ima5](https://github.com/felixmontero/Agenda/blob/master/images/5.png)

![Ima6](https://github.com/felixmontero/Agenda/blob/master/images/6.png)

![Ima7](https://github.com/felixmontero/Agenda/blob/master/images/7.png)

* Las personas que añadamos recibiran una invitación, y a partir de ahí cada uno aportará al proyecto (en nuestro caso) las diferentes clases que conforman nuestro programa, así como cambios en el archivo main.java

## 3. Creación de ramas como colaboradores una vez reciba la invitación

![Ima30](https://github.com/felixmontero/Agenda/blob/master/images/30.png)


* El primer paso es descargar el repositorio, para esto hay que clonarlo:

        $ git clone https://github.com/felixmontero/Agenda.git

![Ima8](https://github.com/felixmontero/Agenda/blob/master/images/8.png)

 * Entramos en el repositorio:
      
        $ cd repo_name

 * Creamos una nueva rama para guardar cualquier cambio:
     
              $ git branch my-branch

* Cambiamos a esta rama:

         $ git checkout my-branch
![Ima9](https://github.com/felixmontero/Agenda/blob/master/images/9.png)

* Comprobamos en [GitHub](https://github.com) que nuestras ramas se han creado con éxito

![Ima10](https://github.com/felixmontero/Agenda/blob/master/images/10.png)

## 4. Realizar cambios a nuestro programa en el Main.java, así como subida de las clases que lo componen

* Una vez ubicados en nuestra rama, realizamos algunos cambios en el archivo Main2.java con VIM (en nuestro caso), confirmamos que se han aplicado los cambios y lo añadimos a la stage area:
                
       $ vim Main2.java

       $ git status

       $git add Main2.java 

![Ima11](https://github.com/felixmontero/Agenda/blob/master/images/11.png)
![Ima12](https://github.com/felixmontero/Agenda/blob/master/images/12.png)


* Un commit con nuestro comentario:

       $ git commit -m "Mejoras al..."


* Lanzamos los cambios a [GitHub](https://github.com):

       $ git push --set-upstream origin my-branch

![Ima13](https://github.com/felixmontero/Agenda/blob/master/images/13.png)

* Realizamos los pasos anteriores al mismo tiempo o después, para la subida de las clases que componen nuestra Agenda.java. En el siguiente ejemplo un colaborador sube la clase Contacto.java usando ***git pull*** para actualizar la versión local de su repositorio desde el remoto. A continuación hace el ***commit*** y el ***git push***

![Ima14](https://github.com/felixmontero/Agenda/blob/master/images/14.png)
![Ima15](https://github.com/felixmontero/Agenda/blob/master/images/15.png)
![Ima16](https://github.com/felixmontero/Agenda/blob/master/images/16.png)

## 5. Pull request

* Y para comparar los cambios nos vamos a Pull requests, ***New pull request***

![Ima17](https://github.com/felixmontero/Agenda/blob/master/images/17.png)

* Seleccionamos entre las diferentes ramas para revisar y comparar los cambios 
![Ima18](https://github.com/felixmontero/Agenda/blob/master/images/18.png)
![Ima19](https://github.com/felixmontero/Agenda/blob/master/images/19.png)
![Ima20](https://github.com/felixmontero/Agenda/blob/master/images/20.png)
![Ima21](https://github.com/felixmontero/Agenda/blob/master/images/21.png)

* Una vez hecho esto, podemos crear una ***pull request***
![Ima22](https://github.com/felixmontero/Agenda/blob/master/images/22.png)

* Le damos un título y escribimos un comentario y damos clic en la opción ***Create pull request***
![Ima23](https://github.com/felixmontero/Agenda/blob/master/images/23.png)
![Ima24](https://github.com/felixmontero/Agenda/blob/master/images/24.png)

* Podremos ver la opción ***Merge pull request***, en caso de que haya conflictos, los solucionamos y continuamos
![Ima25](https://github.com/felixmontero/Agenda/blob/master/images/25.png)

* Una vez clicamos en la opción ***Merge pull request*** nos va a pedir más ***commits***, en caso que no queramos hacerlos simplemente confirmamos la fusión con ***Confirm merge*** 
![Ima26](https://github.com/felixmontero/Agenda/blob/master/images/26.png)

* Brevemente veremos ***merging*** y depsués cambiará el estado a ***Merged*** junto con los ***commits*** y de qué rama a qué rama se han hecho. Addemás de la opción de eliminar la rama de la cual se establecieron o añadieron los cambios a la rama main/master.

![Ima27](https://github.com/felixmontero/Agenda/blob/master/images/27.png)
![Ima28](https://github.com/felixmontero/Agenda/blob/master/images/28.png)


## Vídeo donde se puede ver parte de todo el proceso; llevado a cabo por un ***contributor*** (click en la imagen para verlo)

[![Ima31](https://github.com/felixmontero/Agenda/blob/master/images/31.jpg)](https://youtu.be/Qftj9mTuUqw)






