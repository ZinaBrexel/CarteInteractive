package fr.simplon.festivals.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.sql.Date;

/**
 * Classe représentant un festival.
 */
@Entity
@Table(name="festival")
public class Festival {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String url;
    private String ville;
    private int cp;
    @Column(length=1024)
    private String lieu;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date debut;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date fin;
    private double lat;
    private double lon;

    /**
     * Constructeur par défaut.
     */
    public Festival() {

    }

    /**
     * Constructeur avec paramètres.
     * @param nom le nom du festival
     * @param url l'URL du site web du festival
     * @param ville la ville où se déroule le festival
     * @param cp le code postal de la ville
     * @param lieu le lieu précis où se déroule le festival
     * @param debut la date de début du festival
     * @param fin la date de fin du festival
     * @param lat la latitude du lieu où se déroule le festival
     * @param lon la longitude du lieu où se déroule le festival
     */

    public Festival(String nom, String url, String ville, int cp, String lieu, Date debut, Date fin, double lat, double lon) {
        this.nom = nom;
        this.url=url;
        this.ville = ville;
        this.cp = cp;
        this.lieu = lieu;
        this.debut = debut;
        this.fin = fin;
        this.lat = lat;
        this.lon = lon;
    }

    /**
     * Retourne l'identifiant du festival.
     * @return l'identifiant du festival
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'identifiant du festival.
     * @param id l'identifiant du festival
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retourne le nom du festival.
     * @return le nom du festival
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom du festival.
     * @param nom le nom du festival
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne l'URL du site web du festival.
     * @return l'URL du site web du festival
     */
    public String getUrl() {
        return url;
    }

    /**
     * Définit l'URL du site web du festival.
     * @param url l'URL du site web du festival
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Retourne la ville où se déroule le festival.
     * @return la ville où se déroule le festival
     */
    public String getVille() {
        return ville;
    }

    /**
     * Définit la ville où se déroule le festival.
     * @param ville la ville où se déroule le festival
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * Renvoie le code postal de la ville où se déroule le festival.
     * @return le code postal de la ville où se déroule le festival
     */
    public int getCp() {
        return cp;
    }

    /**
     * Définit le code postal de la ville où se déroule le festival.
     * @param cp le code postal de la ville où se déroule le festival
     */
    public void setCp(int cp) {
        this.cp = cp;
    }

    /**
     * Renvoie le lieu où se déroule le festival.
     * @return le lieu où se déroule le festival
     */
    public String getLieu() {
        return lieu;
    }

    /**
     * Définit le lieu où se déroule le festival.
     * @param lieu le lieu où se déroule le festival
     */
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    /**
     * Renvoie la date de début du festival.
     * @return la date de début du festival
     */
    public Date getDebut() {
        return debut;
    }

    /**
     * Définit la date de début du festival.
     * @param debut la date de début du festival
     */
    public void setDebut(Date debut) {
        this.debut = debut;
    }

    /**
     * Renvoie la date de fin du festival.
     * @return la date de fin du festival
     */
    public Date getFin() {
        return fin;
    }

    /**
     * Définit la date de fin du festival.
     * @param fin la date de fin du festival
     */
    public void setFin(Date fin) {
        this.fin = fin;
    }

    /**
     * Renvoie la latitude du lieu où se déroule le festival.
     * @return la latitude du lieu où se déroule le festival
     */
    public double getLat() {
        return lat;
    }

    /**
     * Définit la latitude du lieu où se déroule le festival.
     * @param lat la latitude du lieu où se déroule le festival
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    /**
     * Renvoie la longitude du lieu où se déroule le festival.
     * @return la longitude du lieu où se déroule le festival
     */
    public double getLon() {
        return lon;
    }

    /**
     * Définit la longitude du lieu où se déroule le festival.
     * @param lon la longitude du lieu où se déroule le festival
     */
    public void setLon(double lon) {
        this.lon = lon;
    }
}
