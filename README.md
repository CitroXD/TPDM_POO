GitHub : 


Hibernate -> Remplace requête à base de donnée par appel à des méthodes objet de haut niveau
H2 -> Systeme de gestion de BDD relationnelles en Java
JPA->Permet d'utiliser SQL et BDD
DevTools -> Ajoute des outils de dev
Thymelead -> Permet de faire de l'html
Web -> Permet d'héberger un site web avec spring

Etape 13:
	1.Avec le GetMapping("/greeting")
	2.
	3. On récupère le name="ENSIM" avec nameGET et on crée un attribut "nomTemplate" dans lequel on stocke ce nom. On l'utilise ensuite dans l'HTML.
	
Etape 17:
	Ajout d'une tab Adress avec les champs correspondants aux attributs private de la classe Adress
	
Etape 18:
	Les annotations permettent à Hibernate d'accèder à la base. La table n'existait pas, il l'a donc construite
	
Etape 20:
	On récupère toutes les adresses présentes dans Data.sql

Etape 23:
	C’est une annotation qui nous permet de faire l’injection de dépendances entre les beans de l’application
	
Etape 30:
	ajout de dépendance :
 	<dependency>
	    <groupId>org.webjars</groupId>
	   	<artifactId>bootstrap</artifactId>
		<version>3.3.6</version>
	</dependency>

	<dependency>
	    <groupId>org.webjars</groupId>
	    <artifactId>bootstrap-datepicker</artifactId>
	    <version>1.0.1</version>
	</dependency>

	<dependency>
	    <groupId>org.webjars</groupId>
	    <artifactId>jquery</artifactId>
	    <version>1.9.1</version>
	</dependency>
	
Etape 6 Partie 2:
	Besoin d'une clef pour l'API dark sky
	https://api.darksky.net/forecast/clef/latitude,longitude
	Methode GET
	Pour ajouter des paramètres : https://api.darksky.net/forecast/clef/latitude,longitude?nomoption=val
	La temperature est récupérable dans l'attribut temperature du currently
	Les prévisions sont données par Daily et son attribut summary
	
	
	
	
	