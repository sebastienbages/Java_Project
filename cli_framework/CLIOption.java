package cli_framework;

public abstract class CLIOption<T> {
	protected String acces;
	protected String nom;
	protected String description;
	protected T valeur;
	protected boolean possedeUneValeur;
	
	public CLIOption(String nom, String description, boolean possedeUneValeur) {
		this.nom = nom;
		this.description = description;
		this.possedeUneValeur = possedeUneValeur;
	}
	
	public String getAcces() {
		return this.acces;
	}
	
	public void setAcces(String acces) {
		this.acces = acces;
	}
	
	public void setValeur(T valeur) {
		this.valeur = valeur;
	}
	
	public boolean possedeUneValeur( ) {
		return this.possedeUneValeur;
	}
	
	@Override
	public String toString() {
		return this.nom + " = " + this.valeur + " (" + this.description + ")";
	}
}
