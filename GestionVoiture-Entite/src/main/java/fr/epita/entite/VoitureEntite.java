package fr.epita.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VoitureEntite {
    @Column
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String marque;
    @Column
    private String modele;
    @Column
    private int prix;

    public VoitureEntite() {
    }

    public VoitureEntite(String marque, String modele, int prix) {
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "VoitureEntite{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", prix=" + prix +
                '}';
    }
}
