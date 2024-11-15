package projetpoo;

public class produit {
private String nomp  ;
private String refp;
private int    qualitep ;
private int    stkp ;
private float  prixunit ;


public produit(String nomp,String refp,int qualitep,int stkp,float prixunit){
	this.nomp=nomp;
	this.refp=refp;
	this.qualitep=qualitep;
	this.stkp=stkp;
	this.prixunit=prixunit;
}
//les gettters

public String getNom()
{return this.nomp;}

public String getref()
{return this.refp;}

public int getQualite()
{return this.qualitep;}

public int getStk()
{return this.stkp;}

public float getPrixunit()
{return this.prixunit;}
// les setters 
public void  setNom(String  nom)
{this.nomp=nom;}

public void  setref(String ref)
{ this.refp=ref;}

public void setQualite(int qual)
{ this.qualitep=qual;}

public void  setStk(int stock)
{ this.stkp=stock;}

public void setPrixunit(float prix )
{ this.prixunit=prix;}
}




