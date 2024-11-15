package projetpoo; 

public class vente {        //commander un produit !!
	private String nompv;
	private int quantv;
	 private float montants;
	private String heurev;
	private int jourv;
	 private int moisv;
	private int anneev;
	//constructeur vente
	public vente(String nompv,int quantv,String heurev,int jourv,int moisv,int annev) {
		this.nompv=nompv;
		this.quantv=quantv;
		this.montants=0;
		this.heurev=heurev;
		this.jourv=jourv;
		this.moisv=moisv;
		this.anneev=annev;

	}
	public String getNomv()
	{return this.nompv;}

	public int getQuantv()
	{return this.quantv;}
	
	public float getMontants()
	{return this.montants;}

	public String getHeurev()
	{return this.heurev;}
	
	public int getJourv()
	{return this.jourv;}

	public int getMoisv()
	{return this.moisv;}
	
	public int getAnneev()
	{return this.anneev;}

	public void setMontants(float m) {
	this.montants=m;
	}
	
	
	


}
