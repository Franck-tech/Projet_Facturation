/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Projet
 * Classe Android : Facturation
 * Date : 16/05/2022 14:00:13
 * Version de wdjava.dll  : 24.0.68.2
 */


package com.TechBox.facturation.wdgen;


import com.TechBox.facturation.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPFacturation extends WDProjet
{
/**
 * Accès au projet: Facturation
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPFacturation.ms_Project
 */
public static GWDPFacturation ms_Project;

 // Menu
public GWDFMenu mWD_Menu = new GWDFMenu();
 // accesseur de Menu
public GWDFMenu getMenu()
{
mWD_Menu.verifierOuverte();
return mWD_Menu;
}


 // Constructeur de la classe GWDPFacturation
public GWDPFacturation()
{
ajouterFenetre("Menu", mWD_Menu);

}

// Code de déclaration de Facturation
public void initProjet()
{
// HCréationSiInexistant("*")
WDAPIHF.hCreationSiInexistant(new WDChaineU("*"));

}





////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
static
{
// Allocation de l'objet global
GWDPFacturation.ms_Project = new GWDPFacturation();

// Définition des langues du projet
GWDPFacturation.ms_Project.setLangueProjet(new int[] {1, 4}, new int[] {0, 0}, 1, false);
GWDPFacturation.ms_Project.setNomAnalyseProjet("facturation");
GWDPFacturation.ms_Project.setModeGestionFichier(true);
GWDPFacturation.ms_Project.setCreationAutomatiqueFichierDonnees(true);
GWDPFacturation.ms_Project.setNomCollectionProcedure(new String[]{});
// Palette des couleurs
GWDPFacturation.ms_Project.setPaletteCouleurGabarit(new int[] {0x394AE1, 0x26A0FA, 0x6DBC61, 0x85A800, 0xD2AC54, 0xC9822B, 0xA95CF8, 0xB86592, 0xB74A5E, 0x654E44, 0xA5A595});
}
public String getVersionApplication(){ return "0.0.2.0";}
public String getNomSociete(){ return "TechBox";}
public String getNomAPK(){ return "Facturation";}
public int getIdNomApplication(){return com.TechBox.facturation.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.TechBox.facturation";}
public int getIdIconeApplication(){ return com.TechBox.facturation.R.drawable.i_c_o_n_e________1;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 160;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 480;
case LARGEUR_ECRAN : return 320;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
////////////////////////////////////////////////////////////////////////////
public String getAdresseEmail() 
{
return "ehlangermain@gmail.com";
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////
public String getFichierWDM()
{
return null;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\FACTURATION\\VUE.PNG",com.TechBox.facturation.R.drawable.vue_14, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\FACTURATION\\SCANNER.PNG?E5",com.TechBox.facturation.R.drawable.scanner_13_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\FACTURATION\\PRÉVIOUS.PNG?E5",com.TechBox.facturation.R.drawable.previous_12_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\FACTURATION\\PARAMÈTRE.PNG?E5",com.TechBox.facturation.R.drawable.parametre_11_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\FACTURATION\\NEXT.PNG?E5",com.TechBox.facturation.R.drawable.next_10_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\FACTURATION\\GABARITS\\WM\\180 MORELIA\\MORELIA_PICT_CORRECT_16_5.PNG?E5",com.TechBox.facturation.R.drawable.morelia_pict_correct_16_5_9_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\FACTURATION\\GABARITS\\WM\\180 MORELIA\\MORELIA_EDT.PNG?E5_3NP_8_8_8_8",com.TechBox.facturation.R.drawable.morelia_edt_8_np3_8_8_8_8_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\FACTURATION\\GABARITS\\WM\\180 MORELIA\\MORELIA_CBOX_TABLE.PNG?E12_A1A6A1A6A1A6A1A6A1A6A1A6_Radio",com.TechBox.facturation.R.drawable.morelia_cbox_table_7_selector_anim, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\FACTURATION\\GABARITS\\WM\\180 MORELIA\\MORELIA_BTN_STD.PNG?E5_A1A6A1A6A1_3NP_8_8_10_10",com.TechBox.facturation.R.drawable.morelia_btn_std_6_np3_8_8_10_10_selector_anim, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\FACTURATION\\FACTURE1.PNG?E5",com.TechBox.facturation.R.drawable.facture1_5_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\FACTURATION\\ACCUEIL.PNG?E5",com.TechBox.facturation.R.drawable.accueil_4_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\FACTURATION\\A PROPOS.PNG?E5",com.TechBox.facturation.R.drawable.a_propos_3_selector, "");
super.ajouterFichierAssocie("FacturationSQLite.db",com.TechBox.facturation.R.raw.facturationsqlite_2, "##BDD##/FacturationSQLite.db");
}


/**
 * Appel des méthodes d'initialisation des classes / collections de procédures / projet
 */
static void GWDPFacturation_InitProjet( String [] args)
{
GWDPFacturation.ms_Project.initialiserProjet("Facturation", "Application Android", args);
}

/**
 * Appel des méthodes de terminaison des projet / collections de procédures / classes
 */
static protected void GWDPFacturation_TermineProjet()
{

// Terminaison des collections de procédures et des classes

// Libération de l'objet global
GWDPFacturation.ms_Project = null;
}

/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public void init()
{
// Appel des méthodes d'initialisation
GWDPFacturation_InitProjet(null);
}
public void run()
{

GWDPFacturation.ms_Project.lancerProjet();
}
}
}
