package projetpoo;

import java.util.Scanner;

public class Test {
public static void main(String args []) {	
	store Store=new store(100,120);
//Preparation de menu
	
	int c=-1; //pour entrer dans la boucle 
while(c!=7) {
	System.out.println(" ///                     Le Menu              ///");
    System.out.println("Taper 1 : Ajouter un produit");
    System.out.println("Taper 2 : Modifier les données d'un produit existant");
    System.out.println("Taper 3 : Ajouter une vente ");
    System.out.println("Taper 4 : Consulter le Stock");
    System.out.println("Taper 5 : Consulter la Recette d'un jour donné");
    System.out.println("Taper 6 : Consulter l’heure et le montant d’une vente particulière");
    System.out.println("Taper 7 : Quitter");
    System.out.print(" \n///                 Taper le numéro :               ///\n");
    Scanner s = new Scanner(System.in);
    c=s.nextInt();
 if(c==1) {
	 System.out.println("Nom de produit");
	 Scanner s1=new Scanner(System.in) ;
	 String nomp;
	 nomp=s1.nextLine();
	 System.out.println("Ref produit");
	 String ref;
	 ref=s1.nextLine();
	 System.out.println("Qualite de produit");
	 int qualitep;
	 qualitep=s1.nextInt();
	 System.out.println("Stock disponible de produit");
	 int st;
	 st=s1.nextInt();
	 System.out.println("Prix unitaire de produit");
	 float pr;
	 pr=s1.nextFloat();
	 produit p=new produit(nomp,ref,qualitep,st,pr);
	 Store.ajouterpdt(p);
	 }
 if(c==2) {
	 System.out.println("Nom de produit");
	 Scanner s1=new Scanner(System.in) ;
	 String nomp;
	 nomp=s1.nextLine();
	 System.out.println("Ref produit");
	 String ref;
	 ref=s1.nextLine();
	 System.out.println("Qualite de produit");
	 int qualitep;
	 qualitep=s1.nextInt();
	 System.out.println("Stock disponible de produit");
	 int st;
	 st=s1.nextInt();
	 System.out.println("Prix unitaire de produit");
	 float pr;
	 pr=s1.nextFloat();
	 produit p=new produit(nomp,ref,qualitep,st,pr);
	 Store.updatepdt(p);
 }
 if(c==3) {
	 Scanner s1=new Scanner(System.in) ;
	 System.out.println("Nom de vente");
	 String nomv;
	 nomv=s1.nextLine();
	 System.out.println("Quantité de vente");
	 int q;
	 q=s1.nextInt();
	 System.out.println("Heure de vente");
	 String h;
	 Scanner s2=new Scanner(System.in);
	 h=s2.nextLine();
	 System.out.println("Jour de vente");
	 int j;
	 j=s1.nextInt();
	 System.out.println("Mois de vente");
	 int m;
	 m=s1.nextInt();
	 System.out.println("Annee de vente");
	 int a;
	 a=s1.nextInt();
	  vente v=new vente(nomv,q,h,j,m,a);
	 
  Store.AjouterVente(v);
 }
if(c==4) { 
 System.out.println("Donner le nom de produit à consulter");
 Scanner s1=new Scanner(System.in) ;
 String n;
 n=s1.nextLine();
 Store.ConsulterStk(n);
}
if(c==5) {
	System.out.println("Donner la date de la recette à consulter");
	Scanner s1=new Scanner(System.in) ;
	System.out.println("Jour");
	 int j;
	 j=s1.nextInt();
	 System.out.println("Mois");
	 int m;
	 m=s1.nextInt();
	 System.out.println("Annee");
	 int a;
	 a=s1.nextInt();
	 Store.Recette(j,m,a);
}
if(c==6) {
	System.out.println("Donner le nom de vente à rechercher");
	 Scanner s1=new Scanner(System.in) ;
	 String n;
	 n=s1.nextLine();
	 Store.RechercheVente(n);

}
}
}
}

