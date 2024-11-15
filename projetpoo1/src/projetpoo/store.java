package projetpoo;

public class store {
	private vente[] ventes;
	private produit[] produits;
	private int nbprod;
	private int nbvente;
    public store(int tailleMax, int tailleMaxv) {
        produits = new produit[tailleMax];
        ventes= new vente[tailleMaxv]; //on a définit un taille max de vente !!
        nbprod = 0;
        nbvente=0;
    }
    public void ajouterpdt(produit p) {
        if (nbprod < produits.length) { //tester s il y a encore espace dans produits{
            produits[nbprod] = p;
            nbprod++;// incrementer pour la position du prochain ajout 
        } else 
        {
            System.out.println("Le store  est pleine, impossible d'ajouter un nouveau produit.");
        }
    }
    // modification produit existants 
    public void updatepdt(produit p)//donne un produit p existant avec les nouveaux valeurs en gardants le meme nom de produit
    {int test ;
    test=0;
    for(int i=0;i<nbprod;i++) {
    	if(produits[i].getNom().equals(p.getNom()) )
    	{produits[i].setref( p.getref());
    	produits[i].setQualite( p.getQualite());
    	produits[i].setStk( p.getStk());
    	produits[i].setPrixunit( p.getPrixunit());
    	test=1;
    	break;
    	}
    	}
 if (test==0) {   		
    		System.out.println("Le produit n'existe pas");
    	}
    }

	
public void AjouterVente(vente v) {
	int test=0;
	for(int i=0;i<nbprod;i++) {
		if(v.getNomv().equals(produits[i].getNom()) && v.getQuantv()<=produits[i].getStk()) {
		    float m =produits[i].getPrixunit() * v.getQuantv();
			v.setMontants(m);
			ventes[nbvente]=v;    nbvente++;	
			int diff=produits[i].getStk()-(v.getQuantv()); 
			produits[i].setStk(diff); //mise à jour de stock dans le table produits
	        test=1;
		}	
		else if(v.getNomv().equals(produits[i].getNom()) && produits[i].getStk()==0) {
			System.out.println("Le produit "+produits[i].getNom()+" est HORS STOCK");
			test=1;
		}
		else if (v.getNomv().equals(produits[i].getNom()) && v.getQuantv()>produits[i].getStk()) {
			System.out.println("Le produit "+produits[i].getNom()+" contient actuellement "+produits[i].getStk());
			System.out.println("Veuillez contacter le client pour le choix de vente");
			test=1;
		}
		}
	if(test==0)
	System.out.println("Ce produit n'existe pas dans le Store");
}

public void ConsulterStk (String nom) {
	int test; 
	test=0;
	for(int i=0;i<nbprod;i++) {
		if(produits[i].getNom().equals(nom)) {
	    System.out.println("Le produit "+nom+" admet un stock de "+produits[i].getStk());
	    test=1;
	    break;
		}
	}
	if(test==0) {
	System.out.println("Le produit n'existe pas");
	}
	
}

public void Recette (int jour ,int mois ,int annee){ //Recette d'un jour donné
	int s;
	s=0;
	for(int i=0;i<nbvente;i++) {
		if(ventes[i].getAnneev()==annee && ventes[i].getMoisv()==mois && ventes[i].getJourv()==jour) {
			System.out.println("Le produit "+ventes[i].getNomv()+" admet comme:");
			System.out.println("Quantité = "+ventes[i].getQuantv()+" ; Montants = "+ventes[i].getMontants()+" à "+ventes[i].getHeurev());
			s+=ventes[i].getMontants();
		}
	}
	System.out.println("La recette de "+jour+"/"+mois+"/"+annee+" est "+s);
}
public void RechercheVente(String nom) { //historique de vente d un produit donne
System.out.println("Le produit "+nom+":");
for(int i=0;i<nbvente;i++) {
	if(ventes[i].getNomv().equals(nom)) {
		System.out.println(+i+".\n"+"A la date "+ventes[i].getJourv()+"/"+ventes[i].getMoisv()+"/"+ventes[i].getAnneev()+" à "+ventes[i].getHeurev());
		System.out.println("La quantité vendue : "+ventes[i].getQuantv()+" et le montant est : "+ventes[i].getMontants());
}
}
}
}
