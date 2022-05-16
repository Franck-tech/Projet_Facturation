/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : Menu
 * Date : 16/05/2022 13:58:52
 * Version de wdjava.dll  : 24.0.68.2
 */


package com.TechBox.facturation.wdgen;


import com.TechBox.facturation.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.zml.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFMenu extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de Menu
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION1
 */
class GWDZM_ACTION1 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Menu.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION1_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Menu.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_ACTION1
 */
class GWDBTN_ACTION1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Menu.ZM_ACTION1.BTN_ACTION1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2485957659829672081l);

super.setChecksum("726598915");

super.setNom("BTN_ACTION1");

super.setType(4);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("+", "+"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(24, 8);

super.setTailleInitiale(46, 29);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(-1);

super.setLettreAppel(65535);

super.setTypeBouton(2);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\Accueil.png?E5", "C:\\Mes Projets Mobile\\Facturation\\Accueil.png?E5"), 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleSurvol(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleEnfonce(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0x2ED1FE, 0x517E, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0x2ED1FE, 0x517E, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0x2ED1FE, 0x517E, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond(WDChaineMultilangue.getString("", ""), 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_ACTION1
 */
public void clicSurBoutonGauche()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.clicSurBoutonGauche();

// Menu..Plan = +2
GWDPFacturation.ms_Project.mWD_Menu.setProp(EWDPropriete.PROP_PLAN,2);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_ACTION1 mWD_BTN_ACTION1 = new GWDBTN_ACTION1();

/**
 * LIB_TitreAction1
 */
class GWDLIB_TitreAction1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Menu.ZM_ACTION1.LIB_TitreAction1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2485957659829737617l);

super.setChecksum("726663995");

super.setNom("LIB_TitreAction1");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("Accueil", "Accueil"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 45);

super.setTailleInitiale(94, 14);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -5.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_TitreAction1 mWD_LIB_TitreAction1 = new GWDLIB_TitreAction1();
class GWDZM_ACTION1_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de Menu.ZM_ACTION1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Menu.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_ACTION1.initialiserObjet();
super.ajouterChamp(mWD_BTN_ACTION1);
mWD_LIB_TitreAction1.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(62);

super.setVisibleInitial(true);

super.setModeSelection(1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION1_Ligne1 mWD_ZM_ACTION1_Ligne1 = new GWDZM_ACTION1_Ligne1();
/**
 * Initialise tous les champs de Menu.ZM_ACTION1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Menu.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION1_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION1_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2485957659829541009l);

super.setChecksum("726510251");

super.setNom("ZM_ACTION1");

super.setType(97);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Zone multiligne", "Zone multiligne"));

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(11, 533);

super.setTailleInitiale(94, 62);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(1);

super.setAltitude(1);

super.setAncrageInitial(9, 330, 1000, 1000, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), -1, 0, 0x10000);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF4F4F4, 0x747474, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xF4F4F4, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION1
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// Menu..Plan = +2
GWDPFacturation.ms_Project.mWD_Menu.setProp(EWDPropriete.PROP_PLAN,2);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION1 mWD_ZM_ACTION1;

/**
 * ZM_ACTION2
 */
class GWDZM_ACTION2 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Menu.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION2_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Menu.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_ACTION1
 */
class GWDBTN_ACTION1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Menu.ZM_ACTION2.BTN_ACTION1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2485962010660539176l);

super.setChecksum("755596175");

super.setNom("BTN_ACTION1");

super.setType(4);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("+", "+"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(27, 8);

super.setTailleInitiale(46, 29);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(-1);

super.setLettreAppel(65535);

super.setTypeBouton(2);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\Paramètre.png?E5", "C:\\Mes Projets Mobile\\Facturation\\Paramètre.png?E5"), 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleSurvol(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleEnfonce(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0x2ED1FE, 0x517E, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0x2ED1FE, 0x517E, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0x2ED1FE, 0x517E, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond(WDChaineMultilangue.getString("", ""), 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_ACTION1 mWD_BTN_ACTION1 = new GWDBTN_ACTION1();

/**
 * LIB_TitreAction1
 */
class GWDLIB_TitreAction1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Menu.ZM_ACTION2.LIB_TitreAction1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2485962010660604712l);

super.setChecksum("755661255");

super.setNom("LIB_TitreAction1");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("Paramètre", "Setting"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 45);

super.setTailleInitiale(94, 14);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -5.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_TitreAction1 mWD_LIB_TitreAction1 = new GWDLIB_TitreAction1();
class GWDZM_ACTION2_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de Menu.ZM_ACTION2
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Menu.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_ACTION1.initialiserObjet();
super.ajouterChamp(mWD_BTN_ACTION1);
mWD_LIB_TitreAction1.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(62);

super.setVisibleInitial(true);

super.setModeSelection(1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION2_Ligne1 mWD_ZM_ACTION2_Ligne1 = new GWDZM_ACTION2_Ligne1();
/**
 * Initialise tous les champs de Menu.ZM_ACTION2
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Menu.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION2_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION2_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2485962010660408104l);

super.setChecksum("755507511");

super.setNom("ZM_ACTION2");

super.setType(97);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Zone multiligne", "Zone multiligne"));

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(113, 533);

super.setTailleInitiale(94, 62);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(2);

super.setAltitude(2);

super.setAncrageInitial(5, 330, 1000, 500, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), -1, 0, 0x10000);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF4F4F4, 0x747474, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xF4F4F4, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION2
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// ExécuteTraitement(BTN_ACTION1, trtclic)
WDAPIVM.executeTraitement(mWD_BTN_ACTION1,18);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION2 mWD_ZM_ACTION2;

/**
 * ZM_ACTION3
 */
class GWDZM_ACTION3 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de Menu.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION3_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Menu.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_ACTION1
 */
class GWDBTN_ACTION1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Menu.ZM_ACTION3.BTN_ACTION1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2485962027841067813l);

super.setChecksum("756255632");

super.setNom("BTN_ACTION1");

super.setType(4);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("+", "+"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(24, 8);

super.setTailleInitiale(46, 29);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(-1);

super.setLettreAppel(65535);

super.setTypeBouton(2);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\A propos.png?E5", "C:\\Mes Projets Mobile\\Facturation\\A propos.png?E5"), 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleSurvol(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleEnfonce(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0x2ED1FE, 0x517E, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0x2ED1FE, 0x517E, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0x2ED1FE, 0x517E, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond(WDChaineMultilangue.getString("", ""), 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_ACTION1 mWD_BTN_ACTION1 = new GWDBTN_ACTION1();

/**
 * LIB_TitreAction1
 */
class GWDLIB_TitreAction1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Menu.ZM_ACTION3.LIB_TitreAction1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2485962027841133349l);

super.setChecksum("756320712");

super.setNom("LIB_TitreAction1");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("A Propos", "In regards to"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 45);

super.setTailleInitiale(94, 14);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -5.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_TitreAction1 mWD_LIB_TitreAction1 = new GWDLIB_TitreAction1();
class GWDZM_ACTION3_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de Menu.ZM_ACTION3
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Menu.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_ACTION1.initialiserObjet();
super.ajouterChamp(mWD_BTN_ACTION1);
mWD_LIB_TitreAction1.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(62);

super.setVisibleInitial(true);

super.setModeSelection(1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION3_Ligne1 mWD_ZM_ACTION3_Ligne1 = new GWDZM_ACTION3_Ligne1();
/**
 * Initialise tous les champs de Menu.ZM_ACTION3
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Menu.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION3_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION3_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2485962027840936741l);

super.setChecksum("756166968");

super.setNom("ZM_ACTION3");

super.setType(97);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Zone multiligne", "Zone multiligne"));

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(218, 533);

super.setTailleInitiale(94, 62);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(3);

super.setAltitude(3);

super.setAncrageInitial(5, 330, 1000, 1000, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), -1, 0, 0x10000);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF4F4F4, 0x747474, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xF4F4F4, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION3
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// ExécuteTraitement(BTN_ACTION1, trtclic)
WDAPIVM.executeTraitement(mWD_BTN_ACTION1,18);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION3 mWD_ZM_ACTION3;

/**
 * Facturation
 */
class GWDFacturation extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de Menu.Facturation
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2485965214735789789l);

super.setChecksum("785244262");

super.setNom("Facturation");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("          Facturation", "    Billing"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(-2, -2);

super.setTailleInitiale(325, 36);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0x2ED1FE, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x32B1F3, 0x3173, 0x2ED1FE, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDFacturation mWD_Facturation;

/**
 * N_CompteurMère1
 */
class GWDN_CompteurMere1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de Menu.N_CompteurMère1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486044272259745610l);

super.setChecksum("846201018");

super.setNom("N_CompteurMère1");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("N°Compteur mère", "No. Mother counter"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 167);

super.setTailleInitiale(136, 19);

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -8.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDN_CompteurMere1 mWD_N_CompteurMere1;

/**
 * TexteSansLibelle1
 */
class GWDTexteSansLibelle1 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de Menu.TexteSansLibelle1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,2,169,28);
super.setQuid(2486044276554843978l);

super.setChecksum("846331635");

super.setNom("TexteSansLibelle1");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("", ""));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(142, 160);

super.setTailleInitiale(170, 32);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("Ref. CEET", "Ref. CEET"));

super.setNumTab(8);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), -1, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteSansLibelle1 mWD_TexteSansLibelle1;

/**
 * N_CompteurMère2
 */
class GWDN_CompteurMere2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de Menu.N_CompteurMère2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486044581498052543l);

super.setChecksum("846862711");

super.setNom("N_CompteurMère2");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("Consomation", "No. Mother counter"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 206);

super.setTailleInitiale(136, 19);

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -8.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDN_CompteurMere2 mWD_N_CompteurMere2;

/**
 * TexteSansLibelle2
 */
class GWDTexteSansLibelle2 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de Menu.TexteSansLibelle2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,2,133,26);
super.setQuid(2486044581498183615l);

super.setChecksum("846993327");

super.setNom("TexteSansLibelle2");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("", ""));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(142, 200);

super.setTailleInitiale(134, 30);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(9);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), -1, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteSansLibelle2 mWD_TexteSansLibelle2;

/**
 * N_CompteurMère3
 */
class GWDN_CompteurMere3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de Menu.N_CompteurMère3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486044834901837429l);

super.setChecksum("847577192");

super.setNom("N_CompteurMère3");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("Montant", "No. Mother counter"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 249);

super.setTailleInitiale(136, 19);

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -8.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDN_CompteurMere3 mWD_N_CompteurMere3;

/**
 * TexteSansLibelle3
 */
class GWDTexteSansLibelle3 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de Menu.TexteSansLibelle3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,2,133,28);
super.setQuid(2486044834901968501l);

super.setChecksum("847707808");

super.setNom("TexteSansLibelle3");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("", ""));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(142, 284);

super.setTailleInitiale(134, 32);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(11);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), -1, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteSansLibelle3 mWD_TexteSansLibelle3;

/**
 * N_CompteurMère4
 */
class GWDN_CompteurMere4 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de Menu.N_CompteurMère4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486044903623689461l);

super.setChecksum("849952504");

super.setNom("N_CompteurMère4");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("Impayé", "No. Mother counter"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 291);

super.setTailleInitiale(136, 19);

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(11);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -8.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDN_CompteurMere4 mWD_N_CompteurMere4;

/**
 * N_CompteurMère5
 */
class GWDN_CompteurMere5 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de Menu.N_CompteurMère5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486045182797414961l);

super.setChecksum("850803829");

super.setNom("N_CompteurMère5");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("Date Reçu", "No. Mother counter"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 370);

super.setTailleInitiale(136, 19);

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(12);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -8.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDN_CompteurMere5 mWD_N_CompteurMere5;

/**
 * TexteSansLibelle5
 */
class GWDTexteSansLibelle5 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°13 de Menu.TexteSansLibelle5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,2,169,25);
super.setQuid(2486045182797546049l);

super.setChecksum("850934461");

super.setNom("TexteSansLibelle5");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("", ""));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(142, 365);

super.setTailleInitiale(170, 29);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(13);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("JJ/MM/AAAA", "JJ/MM/AAAA"));

super.setNumTab(13);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), -1, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteSansLibelle5 mWD_TexteSansLibelle5;

/**
 * N_CompteurMère6
 */
class GWDN_CompteurMere6 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°14 de Menu.N_CompteurMère6
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486046634500237422l);

super.setChecksum("854680580");

super.setNom("N_CompteurMère6");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("/KWh", "/KWh"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(273, 200);

super.setTailleInitiale(39, 30);

super.setPlan(2);

super.setCadrageHorizontal(2);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(14);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -5.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDN_CompteurMere6 mWD_N_CompteurMere6;

/**
 * N_CompteurMère7
 */
class GWDN_CompteurMere7 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°15 de Menu.N_CompteurMère7
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486047742606252703l);

super.setChecksum("859133751");

super.setNom("N_CompteurMère7");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("FrCFA", "FrCFA"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(273, 284);

super.setTailleInitiale(39, 32);

super.setPlan(2);

super.setCadrageHorizontal(2);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(15);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -5.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDN_CompteurMere7 mWD_N_CompteurMere7;

/**
 * N_CompteurMère8
 */
class GWDN_CompteurMere8 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°16 de Menu.N_CompteurMère8
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486049881513243866l);

super.setChecksum("872412004");

super.setNom("N_CompteurMère8");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("FrCFA", "FrCFA"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(273, 244);

super.setTailleInitiale(39, 32);

super.setPlan(2);

super.setCadrageHorizontal(2);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(16);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -5.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDN_CompteurMere8 mWD_N_CompteurMere8;

/**
 * TexteSansLibelle4
 */
class GWDTexteSansLibelle4 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°17 de Menu.TexteSansLibelle4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,2,133,28);
super.setQuid(2486049885808342234l);

super.setChecksum("872542621");

super.setNom("TexteSansLibelle4");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("", ""));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(142, 242);

super.setTailleInitiale(134, 32);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(17);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(10);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), -1, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteSansLibelle4 mWD_TexteSansLibelle4;

/**
 * TexteSansLibelle6
 */
class GWDTexteSansLibelle6 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°18 de Menu.TexteSansLibelle6
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,2,169,25);
super.setQuid(2486050079084930382l);

super.setChecksum("875602494");

super.setNom("TexteSansLibelle6");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("", ""));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(142, 409);

super.setTailleInitiale(170, 29);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(18);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("JJ/MM/AAAA", "JJ/MM/AAAA"));

super.setNumTab(14);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), -1, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteSansLibelle6 mWD_TexteSansLibelle6;

/**
 * N_CompteurMère9
 */
class GWDN_CompteurMere9 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°19 de Menu.N_CompteurMère9
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486050079085061469l);

super.setChecksum("875734037");

super.setNom("N_CompteurMère9");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("A payé avant", "No. Mother counter"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 414);

super.setTailleInitiale(136, 19);

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(19);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -8.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDN_CompteurMere9 mWD_N_CompteurMere9;

/**
 * ZM_ACTION4
 */
class GWDZM_ACTION4 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°20 de Menu.ZM_ACTION4
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION4_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Menu.ZM_ACTION4
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_ACTION1
 */
class GWDBTN_ACTION1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Menu.ZM_ACTION4.BTN_ACTION1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486055671198991134l);

super.setChecksum("942246068");

super.setNom("BTN_ACTION1");

super.setType(4);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("+", "+"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(50, 8);

super.setTailleInitiale(80, 41);

super.setPlan(2);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(-1);

super.setLettreAppel(65535);

super.setTypeBouton(2);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\Scanner.png?E5", "C:\\Mes Projets Mobile\\Facturation\\Scanner.png?E5"), 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleSurvol(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleEnfonce(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0x2ED1FE, 0x517E, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0x2ED1FE, 0x517E, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0x2ED1FE, 0x517E, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond(WDChaineMultilangue.getString("", ""), 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_ACTION1
 */
public void clicSurBoutonGauche()
//  le clic dans la ZML exécutera le code de clic de ce bouton
//  A Faire : Ajoutez le code sur le clic de ce bouton
{
super.clicSurBoutonGauche();

// info("clic sur "+moimeme..nom)
WDAPIDialogue.info(new WDChaineU("clic sur ").opPlus(WDContexte.getMoiMeme().getProp(EWDPropriete.PROP_NOM)).getString());

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_ACTION1 mWD_BTN_ACTION1 = new GWDBTN_ACTION1();

/**
 * LIB_TitreAction1
 */
class GWDLIB_TitreAction1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Menu.ZM_ACTION4.LIB_TitreAction1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486055671199056670l);

super.setChecksum("942311148");

super.setNom("LIB_TitreAction1");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("Scanner la facture", "Accueil"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(-2, 57);

super.setTailleInitiale(185, 14);

super.setPlan(2);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -5.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_TitreAction1 mWD_LIB_TitreAction1 = new GWDLIB_TitreAction1();
class GWDZM_ACTION4_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de Menu.ZM_ACTION4
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Menu.ZM_ACTION4
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_ACTION1.initialiserObjet();
super.ajouterChamp(mWD_BTN_ACTION1);
mWD_LIB_TitreAction1.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(79);

super.setVisibleInitial(true);

super.setModeSelection(1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION4_Ligne1 mWD_ZM_ACTION4_Ligne1 = new GWDZM_ACTION4_Ligne1();
/**
 * Initialise tous les champs de Menu.ZM_ACTION4
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Menu.ZM_ACTION4
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION4_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION4_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2486055671198860062l);

super.setChecksum("942157404");

super.setNom("ZM_ACTION4");

super.setType(97);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Zone multiligne", "Zone multiligne"));

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(70, 41);

super.setTailleInitiale(181, 80);

super.setPlan(2);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(7);

super.setAltitude(20);

super.setAncrageInitial(4, 330, 1000, 500, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), -1, 0, 0x10000);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF4F4F4, 0x747474, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xF4F4F4, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION4
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// ExécuteTraitement(BTN_ACTION1, trtclic)
WDAPIVM.executeTraitement(mWD_BTN_ACTION1,18);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION4 mWD_ZM_ACTION4;

/**
 * N_CompteurMère
 */
class GWDN_CompteurMere extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°21 de Menu.N_CompteurMère
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486082020967964709l);

super.setChecksum("1086864362");

super.setNom("N_CompteurMère");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("N°Compteur mère", "No. Mother counter"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(85, 191);

super.setTailleInitiale(150, 19);

super.setPlan(1);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(21);

super.setAncrageInitial(5, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -8.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDN_CompteurMere mWD_N_CompteurMere;

/**
 * TexteSansLibelle
 */
class GWDTexteSansLibelle extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°22 de Menu.TexteSansLibelle
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,243,40);
super.setQuid(2486082020968095859l);

super.setChecksum("1086995056");

super.setNom("TexteSansLibelle");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("", ""));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(39, 228);

super.setTailleInitiale(243, 44);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(22);

super.setAncrageInitial(5, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("< Texte d'indication >", "< Texte d'indication >"));

super.setNumTab(5);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), -1, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteSansLibelle mWD_TexteSansLibelle;

/**
 * Valider
 */
class GWDValider extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°23 de Menu.Valider
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486082020968226947l);

super.setChecksum("1087127056");

super.setNom("Valider");

super.setType(4);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Valider", "Valider"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(95, 298);

super.setTailleInitiale(130, 28);

super.setPlan(1);

super.setImageEtat(5);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(23);

super.setAncrageInitial(9, 1000, 1000, 500, 1000, 0);

super.setNumTab(6);

super.setLettreAppel(65535);

super.setTypeBouton(1);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Pict_Correct_16_5.png?E5", "C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Pict_Correct_16_5.png?E5"), 0, 1, 5, null, null, null);

super.setStyleLibelleRepos(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleSurvol(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleEnfonce(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0xE8C6B0, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10", "C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10"), 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur Valider
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// Si TexteSansLibelle <> "" ALORS
if(mWD_TexteSansLibelle.opDiff(""))
{
// 	Principale.N_Ref = TexteSansLibelle
WDAPIHF.getFichierSansCasseNiAccent("principale").getRubriqueSansCasseNiAccent("n_ref").setValeur(mWD_TexteSansLibelle);

// 	HEnregistre(Principale)
WDAPIHF.hEnregistre(WDAPIHF.getFichierSansCasseNiAccent("principale"));

// 	NbCompteur est un entier
WDObjet vWD_NbCompteur = new WDEntier4();



// 	NbMenageSansCompteur est un entier
WDObjet vWD_NbMenageSansCompteur = new WDEntier4();



// 	RecupCompteur est un entier  = Saisie("Le nombre de compteur",NbCompteur)	
WDObjet vWD_RecupCompteur = new WDEntier4();


vWD_RecupCompteur.setValeur(WDAPIDialogue.saisie("Le nombre de compteur",vWD_NbCompteur));


// 	Selon RecupCompteur
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon0 = vWD_RecupCompteur;
if(_WDExpSelon0.opEgal(1))
{
// 			Intermédiaire.Nbr_Compteur = NbCompteur
WDAPIHF.getFichierSansCasseNiAccent("intermediaire").getRubriqueSansCasseNiAccent("nbr_compteur").setValeur(vWD_NbCompteur);

// 			HEnregistre(Intermédiaire)
WDAPIHF.hEnregistre(WDAPIHF.getFichierSansCasseNiAccent("intermediaire"));

}
else if(_WDExpSelon0.opEgal(2))
{
// 			Menu..Plan = +1
GWDPFacturation.ms_Project.mWD_Menu.setProp(EWDPropriete.PROP_PLAN,1);

}
else {
}

}

// 	RecupMenageSansCompteur est un entier  = Saisie("Le nombre de chambre qui consomme du courant mais qui sont sans compteur",NbMenageSansCompteur)
WDObjet vWD_RecupMenageSansCompteur = new WDEntier4();


vWD_RecupMenageSansCompteur.setValeur(WDAPIDialogue.saisie("Le nombre de chambre qui consomme du courant mais qui sont sans compteur",vWD_NbMenageSansCompteur));


// 	SELON RecupMenageSansCompteur
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon1 = vWD_RecupMenageSansCompteur;
if(_WDExpSelon1.opEgal(1))
{
// 			Intermédiaire.ConsoSansPaye = NbMenageSansCompteur
WDAPIHF.getFichierSansCasseNiAccent("intermediaire").getRubriqueSansCasseNiAccent("consosanspaye").setValeur(vWD_NbMenageSansCompteur);

// 			HEnregistre(Intermédiaire)
WDAPIHF.hEnregistre(WDAPIHF.getFichierSansCasseNiAccent("intermediaire"));

// 			SI NbCompteur <> 0 ALORS	
if(vWD_NbCompteur.opDiff(0))
{
// 				Libellé2 = NbCompteur
mWD_Libelle2.setValeur(vWD_NbCompteur);

// 				Libellé1 = NbCompteur
mWD_Libelle1.setValeur(vWD_NbCompteur);

// 				N_CompteurMère..Visible = False
mWD_N_CompteurMere.setProp(EWDPropriete.PROP_VISIBLE,false);

// 				TexteSansLibelle..Visible = False
mWD_TexteSansLibelle.setProp(EWDPropriete.PROP_VISIBLE,false);

// 				Valider..Visible = False
this.setProp(EWDPropriete.PROP_VISIBLE,false);

// 				ZoneMultiligne1..Visible =Vrai
mWD_ZoneMultiligne1.setProp(EWDPropriete.PROP_VISIBLE,true);

}
else
{
// 				Libellé2 = NbCompteur
mWD_Libelle2.setValeur(vWD_NbCompteur);

// 				N_CompteurMère..Visible = Vrai
mWD_N_CompteurMere.setProp(EWDPropriete.PROP_VISIBLE,true);

// 				TexteSansLibelle..Visible = Vrai
mWD_TexteSansLibelle.setProp(EWDPropriete.PROP_VISIBLE,true);

// 				Valider..Visible = Vrai
this.setProp(EWDPropriete.PROP_VISIBLE,true);

// 				ZoneMultiligne1..Visible = Faux
mWD_ZoneMultiligne1.setProp(EWDPropriete.PROP_VISIBLE,false);

}

}
else if(_WDExpSelon1.opEgal(2))
{
// 			Menu..Plan =+1
GWDPFacturation.ms_Project.mWD_Menu.setProp(EWDPropriete.PROP_PLAN,1);

}
else {
}

}

// 	SI Libellé2 <> 0 ALORS
if(mWD_Libelle2.opDiff(0))
{
// 		ZoneMultiligne1.Valider1..Visible = Faux
mWD_ZoneMultiligne1.mWD_Valider1.setProp(EWDPropriete.PROP_VISIBLE,false);

}
else
{
// 		ZoneMultiligne1.Valider1..Visible = Vrai
mWD_ZoneMultiligne1.mWD_Valider1.setProp(EWDPropriete.PROP_VISIBLE,true);

}

}
else
{
// 	DonneFocus(TexteSansLibelle)
WDAPIDivers.donneFocus(mWD_TexteSansLibelle);

// 	Menu..Plan = +1
GWDPFacturation.ms_Project.mWD_Menu.setProp(EWDPropriete.PROP_PLAN,1);

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDValider mWD_Valider;

/**
 * ZoneMultiligne1
 */
class GWDZoneMultiligne1 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°24 de Menu.ZoneMultiligne1
////////////////////////////////////////////////////////////////////////////

/**
 * ZoneMultiligne1_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Menu.ZoneMultiligne1
////////////////////////////////////////////////////////////////////////////

/**
 * TexteInterne
 */
class GWDTexteInterne extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Menu.ZoneMultiligne1.TexteInterne
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,217,21);
super.setRectCompPrincipal(0,21,217,19);
super.setQuid(2486095992577950853l);

super.setChecksum("1168239415");

super.setNom("TexteInterne");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("N°Référence", "Texte"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(44, 24);

super.setTailleInitiale(217, 42);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(1);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteInterne mWD_TexteInterne = new GWDTexteInterne();

/**
 * Interrupteur
 */
class GWDInterrupteur extends WDInterrupteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Menu.ZoneMultiligne1.Interrupteur
////////////////////////////////////////////////////////////////////////////

/**
 * Interrupteur_Option_0
 */
class GWDInterrupteur_Option_0 extends WDCaseACocher
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Menu.ZoneMultiligne1.Interrupteur.Interrupteur_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle(WDChaineMultilangue.getString("Électronique", "Option 1"));

super.setHauteurOption(0);

super.setStyleLibelleOption(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDInterrupteur_Option_0 mWD_Interrupteur_Option_0 = new GWDInterrupteur_Option_0();
/**
 * Initialise tous les champs de Menu.ZoneMultiligne1.Interrupteur
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Menu.ZoneMultiligne1.Interrupteur
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_Interrupteur_Option_0);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,139,42);
super.setQuid(2486097633272879051l);

super.setChecksum("1185662291");

super.setNom("Interrupteur");

super.setType(5);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("&Interrupteur", "&Interrupteur"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(44, 80);

super.setTailleInitiale(139, 42);

super.setValeurInitiale("0");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 1, true, true, false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -7.000000, 0), -1, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));

super.setParamAnimationChamp(18, 19, 300);
super.setParamAnimationChamp(19, 20, 300);

super.setImageCoche("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_CBox_Table.png?E12_A1A6A1A6A1A6A1A6A1A6A1A6_Radio", 6);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDInterrupteur mWD_Interrupteur = new GWDInterrupteur();

/**
 * TexteInterne1
 */
class GWDTexteInterne1 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de Menu.ZoneMultiligne1.TexteInterne1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,217,21);
super.setRectCompPrincipal(0,21,217,19);
super.setQuid(2486098539524362711l);

super.setChecksum("1199045338");

super.setNom("TexteInterne1");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Utilisateur", "Texte"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(44, 143);

super.setTailleInitiale(217, 42);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(3);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteInterne1 mWD_TexteInterne1 = new GWDTexteInterne1();

/**
 * TexteInterne2
 */
class GWDTexteInterne2 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de Menu.ZoneMultiligne1.TexteInterne2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,217,21);
super.setRectCompPrincipal(0,21,217,19);
super.setQuid(2486098561000514896l);

super.setChecksum("1200361048");

super.setNom("TexteInterne2");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("N°Téléphone", "Texte"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(49, 226);

super.setTailleInitiale(217, 42);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("Whatsapp", ""));

super.setNumTab(4);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteInterne2 mWD_TexteInterne2 = new GWDTexteInterne2();

/**
 * Valider2
 */
class GWDValider2 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de Menu.ZoneMultiligne1.Valider2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486101211021250283l);

super.setChecksum("1226276332");

super.setNom("Valider2");

super.setType(4);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("", ""));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(225, 313);

super.setTailleInitiale(30, 30);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(5, 1000, 1000, 500, 1000, 0);

super.setNumTab(5);

super.setLettreAppel(65535);

super.setTypeBouton(1);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\next.png?E5", "C:\\Mes Projets Mobile\\Facturation\\next.png?E5"), 0, 1, 5, null, null, null);

super.setStyleLibelleRepos(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleSurvol(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleEnfonce(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0xE8C6B0, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10", "C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10"), 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur Valider2
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// Si Val(Libellé2) <> 0 ALORS
if(WDAPIChaine.val(mWD_Libelle2).opDiff(0))
{
// 	SI Val(Libellé2) - 1 < Libellé1 ALORS
if(WDAPIChaine.val(mWD_Libelle2).opMoins(1).opInf(mWD_Libelle1))
{
// 		Libellé2 = Val(Libellé2) - 1
mWD_Libelle2.setValeur(WDAPIChaine.val(mWD_Libelle2).opMoins(1));

}
else
{
// 		Libellé2 = Val(Libellé2)
mWD_Libelle2.setValeur(WDAPIChaine.val(mWD_Libelle2));

}

// 	Valider3..Visible = Vrai
mWD_Valider3.setProp(EWDPropriete.PROP_VISIBLE,true);

}
else
{
// 	Valider2..Visible = Faux
this.setProp(EWDPropriete.PROP_VISIBLE,false);

// 	Valider3..Visible = Faux
mWD_Valider3.setProp(EWDPropriete.PROP_VISIBLE,false);

// 	valider1..Visible = Vrai
mWD_Valider1.setProp(EWDPropriete.PROP_VISIBLE,true);

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDValider2 mWD_Valider2 = new GWDValider2();

/**
 * Valider3
 */
class GWDValider3 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de Menu.ZoneMultiligne1.Valider3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486102413623383055l);

super.setChecksum("1237566504");

super.setNom("Valider3");

super.setType(4);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("", ""));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(49, 314);

super.setTailleInitiale(30, 30);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setNumTab(6);

super.setLettreAppel(65535);

super.setTypeBouton(1);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\prévious.png?E5", "C:\\Mes Projets Mobile\\Facturation\\prévious.png?E5"), 0, 1, 5, null, null, null);

super.setStyleLibelleRepos(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleSurvol(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleEnfonce(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0xE8C6B0, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10", "C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10"), 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur Valider3
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// SI Val(Libellé2) <> 0 ALORS
if(WDAPIChaine.val(mWD_Libelle2).opDiff(0))
{
// 	Si Libellé2 < Libellé1 ALORS
if(mWD_Libelle2.opInf(mWD_Libelle1))
{
// 	Libellé2 = Val(Libellé2) + 1
mWD_Libelle2.setValeur(WDAPIChaine.val(mWD_Libelle2).opPlus(1));

}
else
{
// 		Libellé2 = Val(Libellé2)
mWD_Libelle2.setValeur(WDAPIChaine.val(mWD_Libelle2));

}

}
else
{
// 	Retour
return;

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDValider3 mWD_Valider3 = new GWDValider3();

/**
 * Valider1
 */
class GWDValider1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de Menu.ZoneMultiligne1.Valider1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486102645558093801l);

super.setChecksum("1244043320");

super.setNom("Valider1");

super.setType(4);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Valider", "Valider"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(87, 314);

super.setTailleInitiale(130, 28);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(5, 0, 1000, 500, 500, 0);

super.setNumTab(7);

super.setLettreAppel(65535);

super.setTypeBouton(1);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Pict_Correct_16_5.png?E5", "C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Pict_Correct_16_5.png?E5"), 0, 1, 5, null, null, null);

super.setStyleLibelleRepos(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleSurvol(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleEnfonce(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0xE8C6B0, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10", "C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10"), 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur Valider1
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// Menu..Plan =+2
GWDPFacturation.ms_Project.mWD_Menu.setProp(EWDPropriete.PROP_PLAN,2);

// TexteSansLibelle1 = TexteSansLibelle..ValeurAffichée
mWD_TexteSansLibelle1.setValeur(mWD_TexteSansLibelle.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDValider1 mWD_Valider1 = new GWDValider1();

/**
 * Image1
 */
class GWDImage1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de Menu.ZoneMultiligne1.Image1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486201511905747934l);

super.setChecksum("1739535672");

super.setNom("Image1");

super.setType(30001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("", ""));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(191, 80);

super.setTailleInitiale(64, 42);

super.setValeurInitiale(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\vue.png", "C:\\Mes Projets Mobile\\Facturation\\vue.png"));

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), -1, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDImage1 mWD_Image1 = new GWDImage1();
class GWDZoneMultiligne1_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de Menu.ZoneMultiligne1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Menu.ZoneMultiligne1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_TexteInterne.initialiserObjet();
super.ajouterChamp(mWD_TexteInterne);
mWD_Interrupteur.initialiserObjet();
super.ajouterChamp(mWD_Interrupteur);
mWD_TexteInterne1.initialiserObjet();
super.ajouterChamp(mWD_TexteInterne1);
mWD_TexteInterne2.initialiserObjet();
super.ajouterChamp(mWD_TexteInterne2);
mWD_Valider2.initialiserObjet();
super.ajouterChamp(mWD_Valider2);
mWD_Valider3.initialiserObjet();
super.ajouterChamp(mWD_Valider3);
mWD_Valider1.initialiserObjet();
super.ajouterChamp(mWD_Valider1);
mWD_Image1.initialiserObjet();
super.ajouterChamp(mWD_Image1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(352);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZoneMultiligne1_Ligne1 mWD_ZoneMultiligne1_Ligne1 = new GWDZoneMultiligne1_Ligne1();
/**
 * Initialise tous les champs de Menu.ZoneMultiligne1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Menu.ZoneMultiligne1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZoneMultiligne1_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZoneMultiligne1_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2486094583819436744l);

super.setChecksum("1159041386");

super.setNom("ZoneMultiligne1");

super.setType(97);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Zone multiligne", "Multiline zone"));

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 84);

super.setTailleInitiale(304, 352);

super.setPlan(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setNumTab(4);

super.setAltitude(24);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), -1, 0, 0x10000);

super.setCouleurSeparateur(0xC8C8C8);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xF4F4F4, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZoneMultiligne1 mWD_ZoneMultiligne1;

/**
 * Libellé2
 */
class GWDLibelle2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°25 de Menu.Libellé2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486241146097054398l);

super.setChecksum("1972641596");

super.setNom("Libellé2");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("0", "Static"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(292, 41);

super.setTailleInitiale(20, 25);

super.setPlan(1);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(25);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de Libellé2
 */
public void init()
{
super.init();

// Valider3..Visible = Faux
mWD_ZoneMultiligne1.mWD_Valider3.setProp(EWDPropriete.PROP_VISIBLE,false);

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLibelle2 mWD_Libelle2;

/**
 * Valider4
 */
class GWDValider4 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°26 de Menu.Valider4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486252867262273801l);

super.setChecksum("-2122853896");

super.setNom("Valider4");

super.setType(4);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Valider", "Valider"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(98, 456);

super.setTailleInitiale(136, 27);

super.setPlan(2);

super.setImageEtat(5);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(26);

super.setAncrageInitial(5, 1000, 1000, 500, 1000, 0);

super.setNumTab(15);

super.setLettreAppel(65535);

super.setTypeBouton(1);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Pict_Correct_16_5.png?E5", "C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Pict_Correct_16_5.png?E5"), 0, 1, 5, null, null, null);

super.setStyleLibelleRepos(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleSurvol(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleEnfonce(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0xE8C6B0, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10", "C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10"), 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur Valider4
 */
public void clicSurBoutonGauche()
// Si TexteSansLibelle2 <> "" ET TexteSansLibelle3 <> "" ET TexteSansLibelle4 <> "" ET TexteSansLibelle5 <> "" ET TexteSansLibelle6 <> "" ALORS
{
super.clicSurBoutonGauche();

// 	Menu..Plan = +3
GWDPFacturation.ms_Project.mWD_Menu.setProp(EWDPropriete.PROP_PLAN,3);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDValider4 mWD_Valider4;

/**
 * Libellé1
 */
class GWDLibelle1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°27 de Menu.Libellé1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486318108405636775l);

super.setChecksum("-1532702428");

super.setNom("Libellé1");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("0", "Static"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(269, 41);

super.setTailleInitiale(20, 25);

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(27);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLibelle1 mWD_Libelle1;

/**
 * TexteInterne3
 */
class GWDTexteInterne3 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°28 de Menu.TexteInterne3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,154,21);
super.setRectCompPrincipal(0,21,154,28);
super.setQuid(2486338612856977097l);

super.setChecksum("-1255228892");

super.setNom("TexteInterne3");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("N°Référence", "Texte"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(158, 58);

super.setTailleInitiale(154, 51);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(28);

super.setAncrageInitial(5, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(17);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteInterne3 mWD_TexteInterne3;

/**
 * TexteInterne4
 */
class GWDTexteInterne4 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°29 de Menu.TexteInterne4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,142,21);
super.setRectCompPrincipal(0,21,142,28);
super.setQuid(2486338776067083674l);

super.setChecksum("-1253879525");

super.setNom("TexteInterne4");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Utilisateur", "Texte"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 58);

super.setTailleInitiale(142, 51);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(29);

super.setAncrageInitial(5, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(16);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteInterne4 mWD_TexteInterne4;

/**
 * TexteInterne5
 */
class GWDTexteInterne5 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°30 de Menu.TexteInterne5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,142,21);
super.setRectCompPrincipal(0,21,142,28);
super.setQuid(2486338840492984417l);

super.setChecksum("-1252488207");

super.setNom("TexteInterne5");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString(" Nouvel Index/Kwh", "Texte"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 117);

super.setTailleInitiale(142, 51);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(30);

super.setAncrageInitial(5, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(18);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteInterne5 mWD_TexteInterne5;

/**
 * TexteInterne6
 */
class GWDTexteInterne6 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°31 de Menu.TexteInterne6
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,154,21);
super.setRectCompPrincipal(0,21,154,28);
super.setQuid(2486338861969201872l);

super.setChecksum("-1251107227");

super.setNom("TexteInterne6");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Ancien Index/Kwh", "Texte"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(158, 117);

super.setTailleInitiale(154, 51);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(31);

super.setAncrageInitial(5, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(19);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteInterne6 mWD_TexteInterne6;

/**
 * TexteInterne7
 */
class GWDTexteInterne7 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°32 de Menu.TexteInterne7
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,142,21);
super.setRectCompPrincipal(0,21,142,28);
super.setQuid(2486338896330324168l);

super.setChecksum("-1249723291");

super.setNom("TexteInterne7");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Conso. /Kwh", "Texte"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(82, 187);

super.setTailleInitiale(142, 51);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(32);

super.setAncrageInitial(5, 0, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(20);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteInterne7 mWD_TexteInterne7;

/**
 * Valider5
 */
class GWDValider5 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°33 de Menu.Valider5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486340442539620135l);

super.setChecksum("-1228652612");

super.setNom("Valider5");

super.setType(4);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Valider", "Valider"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(96, 455);

super.setTailleInitiale(114, 26);

super.setPlan(3);

super.setImageEtat(5);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(33);

super.setAncrageInitial(9, 1000, 1000, 500, 1000, 0);

super.setNumTab(26);

super.setLettreAppel(65535);

super.setTypeBouton(1);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Pict_Correct_16_5.png?E5", "C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Pict_Correct_16_5.png?E5"), 0, 1, 5, null, null, null);

super.setStyleLibelleRepos(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleSurvol(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleEnfonce(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0xE8C6B0, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10", "C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10"), 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur Valider5
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// MoiMême..Visible = faux
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_VISIBLE,false);

// Facture..Visible = Vrai
mWD_Facture.setProp(EWDPropriete.PROP_VISIBLE,true);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDValider5 mWD_Valider5;

/**
 * Facture
 */
class GWDFacture extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°34 de Menu.Facture
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486349496472511355l);

super.setChecksum("-1086819252");

super.setNom("Facture");

super.setType(4);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Facture", "Valider"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(96, 455);

super.setTailleInitiale(114, 26);

super.setPlan(3);

super.setImageEtat(5);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(false);

super.setAltitude(34);

super.setAncrageInitial(9, 1000, 1000, 500, 1000, 0);

super.setNumTab(27);

super.setLettreAppel(65535);

super.setTypeBouton(1);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\facture1.png?E5", "C:\\Mes Projets Mobile\\Facturation\\facture1.png?E5"), 0, 1, 5, null, null, null);

super.setStyleLibelleRepos(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleSurvol(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setStyleLibelleEnfonce(0x2C2B2D, creerPolice_GEN("Tahoma", -8.000000, 0), 0, 0x10000);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0xE8C6B0, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond(WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10", "C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10"), 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDFacture mWD_Facture;

/**
 * N_CompteurMère10
 */
class GWDN_CompteurMere10 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°35 de Menu.N_CompteurMère10
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486588035264910679l);

super.setChecksum("-483017389");

super.setNom("N_CompteurMère10");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("Total", "No. Mother counter"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 331);

super.setTailleInitiale(136, 19);

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(35);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -8.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDN_CompteurMere10 mWD_N_CompteurMere10;

/**
 * TexteSansLibelle7
 */
class GWDTexteSansLibelle7 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°36 de Menu.TexteSansLibelle7
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,2,133,28);
super.setQuid(2486588035265041767l);

super.setChecksum("-482886757");

super.setNom("TexteSansLibelle7");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("", ""));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(142, 324);

super.setTailleInitiale(134, 32);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(36);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(12);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), -1, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteSansLibelle7 mWD_TexteSansLibelle7;

/**
 * N_CompteurMère11
 */
class GWDN_CompteurMere11 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°37 de Menu.N_CompteurMère11
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486588035265172855l);

super.setChecksum("-482755213");

super.setNom("N_CompteurMère11");

super.setType(3);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setLibelle(WDChaineMultilangue.getString("FrCFA", "FrCFA"));

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(273, 324);

super.setTailleInitiale(39, 32);

super.setPlan(2);

super.setCadrageHorizontal(2);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(37);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, 0xFFFFFFFF, creerPolice_GEN("Tahoma", -5.000000, 1), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDN_CompteurMere11 mWD_N_CompteurMere11;

/**
 * TexteInterne8
 */
class GWDTexteInterne8 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°38 de Menu.TexteInterne8
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,154,21);
super.setRectCompPrincipal(0,21,154,28);
super.setQuid(2486592364605207592l);

super.setChecksum("-469754292");

super.setNom("TexteInterne8");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Montant/FrCFA", "Texte"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(158, 246);

super.setTailleInitiale(154, 51);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(38);

super.setAncrageInitial(5, 0, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(22);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteInterne8 mWD_TexteInterne8;

/**
 * TexteInterne9
 */
class GWDTexteInterne9 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°39 de Menu.TexteInterne9
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,146,21);
super.setRectCompPrincipal(0,21,146,28);
super.setQuid(2486592699614110795l);

super.setChecksum("-468300099");

super.setNom("TexteInterne9");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Impayé/FrCFA", "Texte"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(8, 246);

super.setTailleInitiale(146, 51);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(39);

super.setAncrageInitial(5, 0, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(21);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteInterne9 mWD_TexteInterne9;

/**
 * TexteInterne10
 */
class GWDTexteInterne10 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°40 de Menu.TexteInterne10
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,184,21);
super.setRectCompPrincipal(0,21,184,28);
super.setQuid(2486593184946970426l);

super.setChecksum("-466744803");

super.setNom("TexteInterne10");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Total / FrCFA", "Texte"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(68, 314);

super.setTailleInitiale(184, 51);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(40);

super.setAncrageInitial(5, 0, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(23);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteInterne10 mWD_TexteInterne10;

/**
 * TexteInterne11
 */
class GWDTexteInterne11 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°41 de Menu.TexteInterne11
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,142,21);
super.setRectCompPrincipal(0,21,142,28);
super.setQuid(2486593348157207997l);

super.setChecksum("-465264442");

super.setNom("TexteInterne11");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("Fait le ", "Texte"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(8, 373);

super.setTailleInitiale(142, 51);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(41);

super.setAncrageInitial(5, 0, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(24);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteInterne11 mWD_TexteInterne11;

/**
 * TexteInterne12
 */
class GWDTexteInterne12 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°42 de Menu.TexteInterne12
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,142,21);
super.setRectCompPrincipal(0,21,142,28);
super.setQuid(2486593369633556258l);

super.setChecksum("-463752656");

super.setNom("TexteInterne12");

super.setType(20001);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setLibelle(WDChaineMultilangue.getString("A Payer avant le", "Texte"));

super.setMenuContextuelSysteme();

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(170, 373);

super.setTailleInitiale(142, 51);

super.setValeurInitiale(WDChaineMultilangue.getString("", ""));

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(42);

super.setAncrageInitial(5, 0, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication(WDChaineMultilangue.getString("", ""));

super.setNumTab(25);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));

super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x5F5F5F, creerPolice_GEN("Tahoma", -8.000000, 0), 3, 0, 0x10000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xC8C8C8, 0x484848, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Facturation\\Gabarits\\WM\\180 Morelia\\Morelia_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x10000, creerPolice_GEN("Tahoma", -8.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x685D2, 0x552, 0x2ED1FE, 4.000000, 4.000000, 1, 1), 0x2C2B2D, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTexteInterne12 mWD_TexteInterne12;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de Menu
////////////////////////////////////////////////////////////////////////////
public void fWD_executeBouton( WDObjet vWD_pChampZML )
{
initExecProcLocale("ExecuteBouton");


try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_i = new WDEntier4();



// i est un entier = 1

vWD_i.setValeur(1);


// BOUCLE
while(true)
{
// 	sResChamp est une chaine  = EnumèreChamp(pChampZML..nomcomplet, i)
WDObjet vWD_sResChamp = new WDChaineU();


vWD_sResChamp.setValeur(WDAPIDivers.enumereChamp(vWD_pChampZML.getProp(EWDPropriete.PROP_NOMCOMPLET),vWD_i.getInt()));


// 	si sResChamp="" alors sortir
if(vWD_sResChamp.opEgal(""))
{
// 	si sResChamp="" alors sortir
break;

//////////////////////////////////////////////////////////
// Code Inaccessible
// 
}

// 	si {sResChamp, indChamp}..type=typBouton alors
if(WDIndirection.get(vWD_sResChamp.getString(),4).getProp(EWDPropriete.PROP_TYPE).opEgal(4))
{
// 		ExécuteTraitement(sResChamp, trtclic)
WDAPIVM.executeTraitement(vWD_sResChamp,18);

// 		retour
return;

}

}


}
finally
{
finExecProcLocale();
}

}




/**
 * Traitement: Déclarations globales de Menu
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


// Menu..Plan = +1
GWDPFacturation.ms_Project.mWD_Menu.setProp(EWDPropriete.PROP_PLAN,1);

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre Menu
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZM_ACTION1 = new GWDZM_ACTION1();
mWD_ZM_ACTION2 = new GWDZM_ACTION2();
mWD_ZM_ACTION3 = new GWDZM_ACTION3();
mWD_Facturation = new GWDFacturation();
mWD_N_CompteurMere1 = new GWDN_CompteurMere1();
mWD_TexteSansLibelle1 = new GWDTexteSansLibelle1();
mWD_N_CompteurMere2 = new GWDN_CompteurMere2();
mWD_TexteSansLibelle2 = new GWDTexteSansLibelle2();
mWD_N_CompteurMere3 = new GWDN_CompteurMere3();
mWD_TexteSansLibelle3 = new GWDTexteSansLibelle3();
mWD_N_CompteurMere4 = new GWDN_CompteurMere4();
mWD_N_CompteurMere5 = new GWDN_CompteurMere5();
mWD_TexteSansLibelle5 = new GWDTexteSansLibelle5();
mWD_N_CompteurMere6 = new GWDN_CompteurMere6();
mWD_N_CompteurMere7 = new GWDN_CompteurMere7();
mWD_N_CompteurMere8 = new GWDN_CompteurMere8();
mWD_TexteSansLibelle4 = new GWDTexteSansLibelle4();
mWD_TexteSansLibelle6 = new GWDTexteSansLibelle6();
mWD_N_CompteurMere9 = new GWDN_CompteurMere9();
mWD_ZM_ACTION4 = new GWDZM_ACTION4();
mWD_N_CompteurMere = new GWDN_CompteurMere();
mWD_TexteSansLibelle = new GWDTexteSansLibelle();
mWD_Valider = new GWDValider();
mWD_ZoneMultiligne1 = new GWDZoneMultiligne1();
mWD_Libelle2 = new GWDLibelle2();
mWD_Valider4 = new GWDValider4();
mWD_Libelle1 = new GWDLibelle1();
mWD_TexteInterne3 = new GWDTexteInterne3();
mWD_TexteInterne4 = new GWDTexteInterne4();
mWD_TexteInterne5 = new GWDTexteInterne5();
mWD_TexteInterne6 = new GWDTexteInterne6();
mWD_TexteInterne7 = new GWDTexteInterne7();
mWD_Valider5 = new GWDValider5();
mWD_Facture = new GWDFacture();
mWD_N_CompteurMere10 = new GWDN_CompteurMere10();
mWD_TexteSansLibelle7 = new GWDTexteSansLibelle7();
mWD_N_CompteurMere11 = new GWDN_CompteurMere11();
mWD_TexteInterne8 = new GWDTexteInterne8();
mWD_TexteInterne9 = new GWDTexteInterne9();
mWD_TexteInterne10 = new GWDTexteInterne10();
mWD_TexteInterne11 = new GWDTexteInterne11();
mWD_TexteInterne12 = new GWDTexteInterne12();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre Menu
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2485957659829475473l);

super.setChecksum("732750492");

super.setNom("Menu");

super.setType(1);

super.setBulle(WDChaineMultilangue.getString("", ""));

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", WDChaineMultilangue.getString("", ""));

super.setCouleur(0x0);

super.setCouleurFond(0xF4F4F4);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 603);

super.setTitre(WDChaineMultilangue.getString("Menu", ""));

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(2);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond(WDChaineMultilangue.getString("", ""), 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Menu
////////////////////////////////////////////////////////////////////////////
mWD_ZM_ACTION1.initialiserObjet();
super.ajouter("ZM_ACTION1", mWD_ZM_ACTION1);
mWD_ZM_ACTION2.initialiserObjet();
super.ajouter("ZM_ACTION2", mWD_ZM_ACTION2);
mWD_ZM_ACTION3.initialiserObjet();
super.ajouter("ZM_ACTION3", mWD_ZM_ACTION3);
mWD_Facturation.initialiserObjet();
super.ajouter("Facturation", mWD_Facturation);
mWD_N_CompteurMere1.initialiserObjet();
super.ajouter("N_CompteurMère1", mWD_N_CompteurMere1);
mWD_TexteSansLibelle1.initialiserObjet();
super.ajouter("TexteSansLibelle1", mWD_TexteSansLibelle1);
mWD_N_CompteurMere2.initialiserObjet();
super.ajouter("N_CompteurMère2", mWD_N_CompteurMere2);
mWD_TexteSansLibelle2.initialiserObjet();
super.ajouter("TexteSansLibelle2", mWD_TexteSansLibelle2);
mWD_N_CompteurMere3.initialiserObjet();
super.ajouter("N_CompteurMère3", mWD_N_CompteurMere3);
mWD_TexteSansLibelle3.initialiserObjet();
super.ajouter("TexteSansLibelle3", mWD_TexteSansLibelle3);
mWD_N_CompteurMere4.initialiserObjet();
super.ajouter("N_CompteurMère4", mWD_N_CompteurMere4);
mWD_N_CompteurMere5.initialiserObjet();
super.ajouter("N_CompteurMère5", mWD_N_CompteurMere5);
mWD_TexteSansLibelle5.initialiserObjet();
super.ajouter("TexteSansLibelle5", mWD_TexteSansLibelle5);
mWD_N_CompteurMere6.initialiserObjet();
super.ajouter("N_CompteurMère6", mWD_N_CompteurMere6);
mWD_N_CompteurMere7.initialiserObjet();
super.ajouter("N_CompteurMère7", mWD_N_CompteurMere7);
mWD_N_CompteurMere8.initialiserObjet();
super.ajouter("N_CompteurMère8", mWD_N_CompteurMere8);
mWD_TexteSansLibelle4.initialiserObjet();
super.ajouter("TexteSansLibelle4", mWD_TexteSansLibelle4);
mWD_TexteSansLibelle6.initialiserObjet();
super.ajouter("TexteSansLibelle6", mWD_TexteSansLibelle6);
mWD_N_CompteurMere9.initialiserObjet();
super.ajouter("N_CompteurMère9", mWD_N_CompteurMere9);
mWD_ZM_ACTION4.initialiserObjet();
super.ajouter("ZM_ACTION4", mWD_ZM_ACTION4);
mWD_N_CompteurMere.initialiserObjet();
super.ajouter("N_CompteurMère", mWD_N_CompteurMere);
mWD_TexteSansLibelle.initialiserObjet();
super.ajouter("TexteSansLibelle", mWD_TexteSansLibelle);
mWD_Valider.initialiserObjet();
super.ajouter("Valider", mWD_Valider);
mWD_ZoneMultiligne1.initialiserObjet();
super.ajouter("ZoneMultiligne1", mWD_ZoneMultiligne1);
mWD_Libelle2.initialiserObjet();
super.ajouter("Libellé2", mWD_Libelle2);
mWD_Valider4.initialiserObjet();
super.ajouter("Valider4", mWD_Valider4);
mWD_Libelle1.initialiserObjet();
super.ajouter("Libellé1", mWD_Libelle1);
mWD_TexteInterne3.initialiserObjet();
super.ajouter("TexteInterne3", mWD_TexteInterne3);
mWD_TexteInterne4.initialiserObjet();
super.ajouter("TexteInterne4", mWD_TexteInterne4);
mWD_TexteInterne5.initialiserObjet();
super.ajouter("TexteInterne5", mWD_TexteInterne5);
mWD_TexteInterne6.initialiserObjet();
super.ajouter("TexteInterne6", mWD_TexteInterne6);
mWD_TexteInterne7.initialiserObjet();
super.ajouter("TexteInterne7", mWD_TexteInterne7);
mWD_Valider5.initialiserObjet();
super.ajouter("Valider5", mWD_Valider5);
mWD_Facture.initialiserObjet();
super.ajouter("Facture", mWD_Facture);
mWD_N_CompteurMere10.initialiserObjet();
super.ajouter("N_CompteurMère10", mWD_N_CompteurMere10);
mWD_TexteSansLibelle7.initialiserObjet();
super.ajouter("TexteSansLibelle7", mWD_TexteSansLibelle7);
mWD_N_CompteurMere11.initialiserObjet();
super.ajouter("N_CompteurMère11", mWD_N_CompteurMere11);
mWD_TexteInterne8.initialiserObjet();
super.ajouter("TexteInterne8", mWD_TexteInterne8);
mWD_TexteInterne9.initialiserObjet();
super.ajouter("TexteInterne9", mWD_TexteInterne9);
mWD_TexteInterne10.initialiserObjet();
super.ajouter("TexteInterne10", mWD_TexteInterne10);
mWD_TexteInterne11.initialiserObjet();
super.ajouter("TexteInterne11", mWD_TexteInterne11);
mWD_TexteInterne12.initialiserObjet();
super.ajouter("TexteInterne12", mWD_TexteInterne12);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return false;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return false;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPFacturation.ms_Project.mWD_Menu;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "180 MORELIA#WM";
}
}
