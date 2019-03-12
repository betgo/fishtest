package com.wxx.match.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description //TODO
 * @Date 2019/3/10 22:07
 * @Author wxx
 **/
@Entity
@Table(name = "fish_p")
public class Disease {
        @Id
    private int id;

    private String Fishname;
    private String         Fishdisease              ;
    private Double Decay                            ;
    private Double         Whitespot                ;
    private Double White                            ;
    private Double         Black                    ;
    private Double Swelling                         ;
    private Double         Fade                     ;
    private Double Bodycolordeepened                ;
    private Double         Havemucus                ;
    private Double Blackandwhite                    ;
    private Double         Congestionorbleeding     ;
    private Double Abdominaldistention              ;
    private Double         Thin                     ;
    private Double Erythema                         ;
    private Double         Whitecloudsformcircular  ;
    private Double Blotchy                          ;
    private Double         Bellyuptheblock          ;
    private Double Fromthegroupof                   ;
    private Double         Swirling                 ;
    private Double Jumpoutofthewater                ;
    private Double         Imbalances               ;
    private Double Crazytoswim                      ;
    private Double         Slow                     ;
    private Double Floatingonthesurfaceofthewater   ;
    private Double         Bite                     ;
    private Double Irritable                        ;
    private Double         Avengingboredomdisorderlyjump;
    private Double Anincreasein                     ;
    private Double         Alotof                   ;
    private Double Yellow                           ;
    private Double         Gillsdecay               ;
    private Double Gillsgrey                        ;
    private Double         Gillswhitedots           ;
    private Double Gillcongestionorbleeding         ;
    private Double         Skinproliferation        ;
    private Double Gillcoveropen                    ;
    private Double         Gillholehangingeggs      ;
    private Double Gillslitsisred                   ;
    private Double         Gillslitsfade            ;
    private Double Finmembranerupturehemorrhage     ;
    private Double         Articlefinsincomplete    ;
    private Double Loosescales                      ;
    private Double         Scalesfalloff            ;
    private Double Scalesup                         ;
    private Double         Abnormalmucusincolor     ;
    private Double Bleedingfromtheplaque            ;
    private Double         Livercongestion          ;
    private Double Thespleencongestion              ;
    private Double         Renalcongestion          ;
    private Double Intestinalhyperemia              ;
    private Double         Theliverbleeding         ;
    private Double Gonadsbloodclot                  ;
    private Double         Gastrichelicobacterenlargement;
    private Double Hepatomegaly                     ;
    private Double         Splenomegaly             ;
    private Double Renalenlargement                 ;
    private Double         Liverkhaki               ;
    private Double Thespleenkhaki                   ;
    private Double         Renalkhaki               ;
    private Double Imakhaki                         ;
    private Double         Theintestinalred         ;
    private Double Imtailblack                      ;
    private Double         Liverreddish             ;
    private Double Thegallbladderfade               ;
    private Double         Thespleenmorewhite       ;
    private Double Kidneymorewhite                  ;
    private Double         Withascites              ;
    private Double Heartcysts                       ;
    private Double         Intestinalmembranecanker ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFishname() {
        return Fishname;
    }

    public void setFishname(String fishname) {
        Fishname = fishname;
    }

    public String getFishdisease() {
        return Fishdisease;
    }

    public void setFishdisease(String fishdisease) {
        Fishdisease = fishdisease;
    }

    public Double getDecay() {
        return Decay;
    }

    public void setDecay(Double decay) {
        Decay = decay;
    }

    public Double getWhitespot() {
        return Whitespot;
    }

    public void setWhitespot(Double whitespot) {
        Whitespot = whitespot;
    }

    public Double getWhite() {
        return White;
    }

    public void setWhite(Double white) {
        White = white;
    }

    public Double getBlack() {
        return Black;
    }

    public void setBlack(Double black) {
        Black = black;
    }

    public Double getSwelling() {
        return Swelling;
    }

    public void setSwelling(Double swelling) {
        Swelling = swelling;
    }

    public Double getFade() {
        return Fade;
    }

    public void setFade(Double fade) {
        Fade = fade;
    }

    public Double getBodycolordeepened() {
        return Bodycolordeepened;
    }

    public void setBodycolordeepened(Double bodycolordeepened) {
        Bodycolordeepened = bodycolordeepened;
    }

    public Double getHavemucus() {
        return Havemucus;
    }

    public void setHavemucus(Double havemucus) {
        Havemucus = havemucus;
    }

    public Double getBlackandwhite() {
        return Blackandwhite;
    }

    public void setBlackandwhite(Double blackandwhite) {
        Blackandwhite = blackandwhite;
    }

    public Double getCongestionorbleeding() {
        return Congestionorbleeding;
    }

    public void setCongestionorbleeding(Double congestionorbleeding) {
        Congestionorbleeding = congestionorbleeding;
    }

    public Double getAbdominaldistention() {
        return Abdominaldistention;
    }

    public void setAbdominaldistention(Double abdominaldistention) {
        Abdominaldistention = abdominaldistention;
    }

    public Double getThin() {
        return Thin;
    }

    public void setThin(Double thin) {
        Thin = thin;
    }

    public Double getErythema() {
        return Erythema;
    }

    public void setErythema(Double erythema) {
        Erythema = erythema;
    }

    public Double getWhitecloudsformcircular() {
        return Whitecloudsformcircular;
    }

    public void setWhitecloudsformcircular(Double whitecloudsformcircular) {
        Whitecloudsformcircular = whitecloudsformcircular;
    }

    public Double getBlotchy() {
        return Blotchy;
    }

    public void setBlotchy(Double blotchy) {
        Blotchy = blotchy;
    }

    public Double getBellyuptheblock() {
        return Bellyuptheblock;
    }

    public void setBellyuptheblock(Double bellyuptheblock) {
        Bellyuptheblock = bellyuptheblock;
    }

    public Double getFromthegroupof() {
        return Fromthegroupof;
    }

    public void setFromthegroupof(Double fromthegroupof) {
        Fromthegroupof = fromthegroupof;
    }

    public Double getSwirling() {
        return Swirling;
    }

    public void setSwirling(Double swirling) {
        Swirling = swirling;
    }

    public Double getJumpoutofthewater() {
        return Jumpoutofthewater;
    }

    public void setJumpoutofthewater(Double jumpoutofthewater) {
        Jumpoutofthewater = jumpoutofthewater;
    }

    public Double getImbalances() {
        return Imbalances;
    }

    public void setImbalances(Double imbalances) {
        Imbalances = imbalances;
    }

    public Double getCrazytoswim() {
        return Crazytoswim;
    }

    public void setCrazytoswim(Double crazytoswim) {
        Crazytoswim = crazytoswim;
    }

    public Double getSlow() {
        return Slow;
    }

    public void setSlow(Double slow) {
        Slow = slow;
    }

    public Double getFloatingonthesurfaceofthewater() {
        return Floatingonthesurfaceofthewater;
    }

    public void setFloatingonthesurfaceofthewater(Double floatingonthesurfaceofthewater) {
        Floatingonthesurfaceofthewater = floatingonthesurfaceofthewater;
    }

    public Double getBite() {
        return Bite;
    }

    public void setBite(Double bite) {
        Bite = bite;
    }

    public Double getIrritable() {
        return Irritable;
    }

    public void setIrritable(Double irritable) {
        Irritable = irritable;
    }

    public Double getAvengingboredomdisorderlyjump() {
        return Avengingboredomdisorderlyjump;
    }

    public void setAvengingboredomdisorderlyjump(Double avengingboredomdisorderlyjump) {
        Avengingboredomdisorderlyjump = avengingboredomdisorderlyjump;
    }

    public Double getAnincreasein() {
        return Anincreasein;
    }

    public void setAnincreasein(Double anincreasein) {
        Anincreasein = anincreasein;
    }

    public Double getAlotof() {
        return Alotof;
    }

    public void setAlotof(Double alotof) {
        Alotof = alotof;
    }

    public Double getYellow() {
        return Yellow;
    }

    public void setYellow(Double yellow) {
        Yellow = yellow;
    }

    public Double getGillsdecay() {
        return Gillsdecay;
    }

    public void setGillsdecay(Double gillsdecay) {
        Gillsdecay = gillsdecay;
    }

    public Double getGillsgrey() {
        return Gillsgrey;
    }

    public void setGillsgrey(Double gillsgrey) {
        Gillsgrey = gillsgrey;
    }

    public Double getGillswhitedots() {
        return Gillswhitedots;
    }

    public void setGillswhitedots(Double gillswhitedots) {
        Gillswhitedots = gillswhitedots;
    }

    public Double getGillcongestionorbleeding() {
        return Gillcongestionorbleeding;
    }

    public void setGillcongestionorbleeding(Double gillcongestionorbleeding) {
        Gillcongestionorbleeding = gillcongestionorbleeding;
    }

    public Double getSkinproliferation() {
        return Skinproliferation;
    }

    public void setSkinproliferation(Double skinproliferation) {
        Skinproliferation = skinproliferation;
    }

    public Double getGillcoveropen() {
        return Gillcoveropen;
    }

    public void setGillcoveropen(Double gillcoveropen) {
        Gillcoveropen = gillcoveropen;
    }

    public Double getGillholehangingeggs() {
        return Gillholehangingeggs;
    }

    public void setGillholehangingeggs(Double gillholehangingeggs) {
        Gillholehangingeggs = gillholehangingeggs;
    }

    public Double getGillslitsisred() {
        return Gillslitsisred;
    }

    public void setGillslitsisred(Double gillslitsisred) {
        Gillslitsisred = gillslitsisred;
    }

    public Double getGillslitsfade() {
        return Gillslitsfade;
    }

    public void setGillslitsfade(Double gillslitsfade) {
        Gillslitsfade = gillslitsfade;
    }

    public Double getFinmembranerupturehemorrhage() {
        return Finmembranerupturehemorrhage;
    }

    public void setFinmembranerupturehemorrhage(Double finmembranerupturehemorrhage) {
        Finmembranerupturehemorrhage = finmembranerupturehemorrhage;
    }

    public Double getArticlefinsincomplete() {
        return Articlefinsincomplete;
    }

    public void setArticlefinsincomplete(Double articlefinsincomplete) {
        Articlefinsincomplete = articlefinsincomplete;
    }

    public Double getLoosescales() {
        return Loosescales;
    }

    public void setLoosescales(Double loosescales) {
        Loosescales = loosescales;
    }

    public Double getScalesfalloff() {
        return Scalesfalloff;
    }

    public void setScalesfalloff(Double scalesfalloff) {
        Scalesfalloff = scalesfalloff;
    }

    public Double getScalesup() {
        return Scalesup;
    }

    public void setScalesup(Double scalesup) {
        Scalesup = scalesup;
    }

    public Double getAbnormalmucusincolor() {
        return Abnormalmucusincolor;
    }

    public void setAbnormalmucusincolor(Double abnormalmucusincolor) {
        Abnormalmucusincolor = abnormalmucusincolor;
    }

    public Double getBleedingfromtheplaque() {
        return Bleedingfromtheplaque;
    }

    public void setBleedingfromtheplaque(Double bleedingfromtheplaque) {
        Bleedingfromtheplaque = bleedingfromtheplaque;
    }

    public Double getLivercongestion() {
        return Livercongestion;
    }

    public void setLivercongestion(Double livercongestion) {
        Livercongestion = livercongestion;
    }

    public Double getThespleencongestion() {
        return Thespleencongestion;
    }

    public void setThespleencongestion(Double thespleencongestion) {
        Thespleencongestion = thespleencongestion;
    }

    public Double getRenalcongestion() {
        return Renalcongestion;
    }

    public void setRenalcongestion(Double renalcongestion) {
        Renalcongestion = renalcongestion;
    }

    public Double getIntestinalhyperemia() {
        return Intestinalhyperemia;
    }

    public void setIntestinalhyperemia(Double intestinalhyperemia) {
        Intestinalhyperemia = intestinalhyperemia;
    }

    public Double getTheliverbleeding() {
        return Theliverbleeding;
    }

    public void setTheliverbleeding(Double theliverbleeding) {
        Theliverbleeding = theliverbleeding;
    }

    public Double getGonadsbloodclot() {
        return Gonadsbloodclot;
    }

    public void setGonadsbloodclot(Double gonadsbloodclot) {
        Gonadsbloodclot = gonadsbloodclot;
    }

    public Double getGastrichelicobacterenlargement() {
        return Gastrichelicobacterenlargement;
    }

    public void setGastrichelicobacterenlargement(Double gastrichelicobacterenlargement) {
        Gastrichelicobacterenlargement = gastrichelicobacterenlargement;
    }

    public Double getHepatomegaly() {
        return Hepatomegaly;
    }

    public void setHepatomegaly(Double hepatomegaly) {
        Hepatomegaly = hepatomegaly;
    }

    public Double getSplenomegaly() {
        return Splenomegaly;
    }

    public void setSplenomegaly(Double splenomegaly) {
        Splenomegaly = splenomegaly;
    }

    public Double getRenalenlargement() {
        return Renalenlargement;
    }

    public void setRenalenlargement(Double renalenlargement) {
        Renalenlargement = renalenlargement;
    }

    public Double getLiverkhaki() {
        return Liverkhaki;
    }

    public void setLiverkhaki(Double liverkhaki) {
        Liverkhaki = liverkhaki;
    }

    public Double getThespleenkhaki() {
        return Thespleenkhaki;
    }

    public void setThespleenkhaki(Double thespleenkhaki) {
        Thespleenkhaki = thespleenkhaki;
    }

    public Double getRenalkhaki() {
        return Renalkhaki;
    }

    public void setRenalkhaki(Double renalkhaki) {
        Renalkhaki = renalkhaki;
    }

    public Double getImakhaki() {
        return Imakhaki;
    }

    public void setImakhaki(Double imakhaki) {
        Imakhaki = imakhaki;
    }

    public Double getTheintestinalred() {
        return Theintestinalred;
    }

    public void setTheintestinalred(Double theintestinalred) {
        Theintestinalred = theintestinalred;
    }

    public Double getImtailblack() {
        return Imtailblack;
    }

    public void setImtailblack(Double imtailblack) {
        Imtailblack = imtailblack;
    }

    public Double getLiverreddish() {
        return Liverreddish;
    }

    public void setLiverreddish(Double liverreddish) {
        Liverreddish = liverreddish;
    }

    public Double getThegallbladderfade() {
        return Thegallbladderfade;
    }

    public void setThegallbladderfade(Double thegallbladderfade) {
        Thegallbladderfade = thegallbladderfade;
    }

    public Double getThespleenmorewhite() {
        return Thespleenmorewhite;
    }

    public void setThespleenmorewhite(Double thespleenmorewhite) {
        Thespleenmorewhite = thespleenmorewhite;
    }

    public Double getKidneymorewhite() {
        return Kidneymorewhite;
    }

    public void setKidneymorewhite(Double kidneymorewhite) {
        Kidneymorewhite = kidneymorewhite;
    }

    public Double getWithascites() {
        return Withascites;
    }

    public void setWithascites(Double withascites) {
        Withascites = withascites;
    }

    public Double getHeartcysts() {
        return Heartcysts;
    }

    public void setHeartcysts(Double heartcysts) {
        Heartcysts = heartcysts;
    }

    public Double getIntestinalmembranecanker() {
        return Intestinalmembranecanker;
    }

    public void setIntestinalmembranecanker(Double intestinalmembranecanker) {
        Intestinalmembranecanker = intestinalmembranecanker;
    }
}
