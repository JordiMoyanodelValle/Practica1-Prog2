package prog2.model;

import prog2.vista.ExcepcioReserva;

public class Allotjament implements InAllotjament {

    private String nom;
    private String idAllotjament;
    long estadaMinimaALTA;
    long estadaMinimaBAIXA;

    public Allotjament (String nom, String idAllotjament) {
        this.nom = nom;
        this.idAllotjament = idAllotjament;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(String id) {
        this.idAllotjament = id;
    }

    public String getId() {
        return idAllotjament;
    }

    public boolean correcteFuncionament() {

        Allotjament allotjament = this;
        if (allotjament instanceof Parcela) {
            Parcela parcela = (Parcela) allotjament;
            return parcela.getConexioElectrica();
        } else if (allotjament instanceof Casa) {
            Casa casa = (Casa) allotjament;
            if (casa instanceof MobilHome) {
                MobilHome mobilHome = (MobilHome) casa;
                return mobilHome.isTerrassaAmbBarbacoa();
            } else if (casa instanceof Glamping) {
                Glamping glamping = (Glamping) casa;
                return glamping.isCasaMascotes();
            } else if (casa instanceof Bungalow) {
                Bungalow bungalow = (Bungalow) casa;
                if (bungalow instanceof BungalowPremium) {
                    BungalowPremium bungalowPre = (BungalowPremium) bungalow;
                    return bungalowPre.getCodiWifi().length() >= 8 && bungalowPre.getCodiWifi().length() <= 16 && bungalowPre.isAireFred();
                } else { /* Si bungalow no és de tipus premium */
                    return bungalow.isAireFred();
                }
            } else { /* Si casa no és de cap dels tipus definits de Casa */
                return false;
            }
        } else { /* Si allotjament no és de cap dels tipus definits d'Allotjament */
            return false;
        }
    }

    /* He fet "if-else" ja que aquest codi només el cridem des del nostre codi (Camping.java)*/
    public long getEstadaMinima(Temp temp) {
        if (temp == Temp.ALTA) return this.estadaMinimaALTA;
        else return this.estadaMinimaBAIXA;
    }

    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {
        this.estadaMinimaALTA = estadaMinimaALTA_;
        this.estadaMinimaBAIXA = estadaMinimaBAIXA_;
    }
}