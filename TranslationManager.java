package main.ctection.captchabot;

public class TranslationManager {

	private String lang = "en";

	public String[] supported_languages = new String[999];

	public TranslationManager(String p_lang) {
		supported_languages[0] = "en";
		supported_languages[1] = "de";
		lang = p_lang;
	}

	public void setLanguage(String p_lang) {
		lang = p_lang;
	}

	//No Permission to Execute Header
	public String returnNoPermTitle() {
		if(lang.equals("de")) {
			return "Genehmigungsfehler";
		}else {
			return "Permission Error";
		}
	}

	//No Permission to Execute
	public String returnNoPermDescription(String permission_node) {
		if(lang.equals("de")) {
			return "Dir fehlen `"+permission_node+"` Rechte um diesen Befehl auszuführen.";
		}else {
			return "You are missing the `"+permission_node+"` Permission to execute this command.";
		}
	}

	//KICK COMMAND TRANSLATIONS
	//No Members Tagged Header
	public String returnKickRequireTaggedMembersTitle() {
		if(lang.equals("de")) {
			return "Unbekannter Nutzer";
		}else {
			return "Unknown User";
		}
	}

	//No Members Tagged
	public String returnKickRequireTaggedMembersDescription() {
		if(lang.equals("de")) {
			return "Bitte nenne durch einen Mention welche(r) Nutzer gekickt werden soll. Es können maximal 10 Nutzer genannt werden. Beispiel: kick @User1 @User2 @User3";
		}else {
			return "Please mention the user(s) to kick. A maximum of 10 users can be kicked at the same time. Example: kick @User1 @User2 @User3";
		}
	}

	//Successful Kick
	public String returnKickSuccessfulDescription(int no) {
		if(lang.equals("de")) {
			return no+" Nutzer wurden erfolgreich gekickt.";
		}else {
			return "Kicked "+no+" Members successfully.";
		}
	}

	public String returnKickSuccessfulTitle() {
		if(lang.equals("de")) {
			return "Nutzer Gekickt";
		}else {
			return "Kicked Members";
		}
	}

	//KICK COMMAND TRANSLATIONS
	//No Members Tagged Header
	public String returnBanRequireTaggedMembersTitle() {
		if(lang.equals("de")) {
			return "Unbekannter Nutzer";
		}else {
			return "Unknown User";
		}
	}

	//No Members Tagged
	public String returnBanRequireTaggedMembersDescription() {
		if(lang.equals("de")) {
			return "Bitte nenne durch einen Mention welche(r) Nutzer verbannt werden soll(en). Es können maximal 10 Nutzer genannt werden. Beispiel: ban @User1 @User2 @User3";
		}else {
			return "Please mention the user(s) to ban. A maximum of 10 users can be banned at the same time. Example: ban @User1 @User2 @User3";
		}
	}

	//Successful Kick
	public String returnBanSuccessfulDescription(int no) {
		if(lang.equals("de")) {
			return no+" Nutzer wurden erfolgreich verbannt.";
		}else {
			return "Banned "+no+" Members successfully.";
		}
	}

	public String returnBanSuccessfulTitle() {
		if(lang.equals("de")) {
			return "Nutzer Verbannt";
		}else {
			return "Banned Members";
		}
	}

	//UNVERIFY COMMAND TRANSLATIONS
	//No Members Tagged Header
	public String returnUnverifyRequireTaggedMembersTitle() {
		if(lang.equals("de")) {
			return "Unbekannter Nutzer";
		}else {
			return "Unknown User";
		}
	}

	//No Members Tagged
	public String returnUnverifyRequireTaggedMembersDescription() {
		if(lang.equals("de")) {
			return "Bitte nenne durch einen Mention welche(r) Nutzer unverifiziert werden soll(en). Es können maximal 10 Nutzer unverifiziert werden. Beispiel: ban @User1 @User2 @User3";
		}else {
			return "Please mention the user(s) to unverify. A maximum of 10 users can be unverified at the same time. Example: ban @User1 @User2 @User3";
		}
	}

	//Successful Kick
	public String returnUnverifySuccessfulDescription(int no) {
		if(lang.equals("de")) {
			return no+" Nutzer wurden erfolgreich unverifiziert.";
		}else {
			return "Unverified "+no+" Members successfully.";
		}
	}

	public String returnUnverifySuccessfulTitle() {
		if(lang.equals("de")) {
			return "Nutzer Unverifiziert";
		}else {
			return "Unverified Member(s)";
		}
	}

	//WHOIS COMMAND TRANSLATIONS
	//No Members Tagged Header
	public String returnWhoisRequireTaggedMembersTitle() {
		if(lang.equals("de")) {
			return "Unbekannter Nutzer";
		}else {
			return "Unknown User";
		}
	}

	//No Members Tagged
	public String returnWhoisRequireTaggedMembersDescription() {
		if(lang.equals("de")) {
			return "Bitte nenne durch einen Mention welcher Nutzer identifiziert werden soll.";
		}else {
			return "Please mention the user to identify.";
		}
	}

	//HELP COMMAND TRANSLATIONS
	public String returnHelpSupportedByPremiumTitle() {
		if(lang.equals("de")) {
			return "Unterstützt durch Premium";
		}else {
			return "Supported by Premium";
		}
	}

	public String returnHelpSupportedByPremiumDescription() {
		if(lang.equals("de")) {
			return "*Teste Premium kostenlos für 7 Tage auf https://ctection.com/shop/.*";
		}else {
			return "*Try Premium for free for 7 Days now at https://ctection.com/shop/.*";
		}
	}

	public String returnHelpUserCommandsTitle() {
		if(lang.equals("de")) {
			return "Benutzerbefehle";
		}else {
			return "User Commands";
		}
	}

	public String returnHelpUserCommandsDescription() {
		if(lang.equals("de")) {
			return "*Um alle Benutzerbefehle zu sehen, schreibe __c/help user__*";
		}else {
			return "*To see all user-accessible commands, type __c/help user__*";
		}
	}
	
	public String returnGenericErrorTitle() {
		if(lang.equals("de")) {
			return "Fehler";
		}else {
			return "Error";
		}
	}
	
	//SETUP COMMAND TRANSLATIONS
	public String returnSetupStepZeroDescription() {
		if(lang.equals("de")) {
			return "Willkommen im CaptchaBot Setup!\n\nWährend des setups werden wir alle wichtigen Einstellungen durchgehen um CaptchaBot aufzusetzen.\nBitte schreibe 'next' um fortzufahren.";
		}else {
			return "Welcome to the CaptchaBot Setup!\n\nDuring this setup, we will go through everything you need to use CaptchaBot correctly.\nPlease type 'next' to continue.";
		}
	}

	public String returnSetupStepTitle(int step) {
		if(lang.equals("de")) {
			return "Setup - Schritt "+step;
		}else {
			return "Setup - Step "+step;
		}
	}
	
	public String returnSetupRoleNotFoundError(String role) {
		if(lang.equals("de")) {
			return "Die angegebene Rolle '"+role+"' konnte nicht gefunden werden.\n\n*Hinweis: Nicht die Rolle erwähnen - nur mit dem Namen antworten.*";
		}else {
			return "Can't find a role called '"+role+"'.\n\n*Notice: Do not mention the role, simply type it's name.*";
		}
	}
	
	public String returnSetupVerificationPoolNotFoundError() {
		if(lang.equals("de")) {
			return "Konnte keinen Textkanal namens 'verification-pool' finden. Bitte nenne den Verifikationskanal zu 'verification-pool' und versuche es erneut.";
		}else {
			return "Couldn't find a channel called 'verification-pool'. Please rename your verification channel to 'verification-pool' and try again.";
		}
	}
	
	public String returnSetupRoleHierarchyError() {
		if(lang.equals("de")) {
			return "Die Rollenhierarchie ist nicht korrekt. Bitte platziere die CaptchaBot Rolle höher als die Verifikationsrolle\n\nMehr Infos: https://discordcaptcha.xyz/hc/doku.php?id=captchabot:role_hierarchy";
		}else {
			return "The Role Hierarchy is invalid. Please make sure that the CaptchaBot role is higher than the Verification Role.\n\nMore info: https://discordcaptcha.xyz/hc/doku.php?id=captchabot:role_hierarchy";
		}
	}
	
	
	
	//STEP ONE
	public String returnSetupStepOneDescription() {
		if(lang.equals("de")) {
			return "Erstellen des Verifikationskanals\n\nCaptchaBot übernimmt die Verifikation hauptsächlich über Textkanäle. Bitte erstelle einen `verification-pool` Textkanal, setze die Rechte manuell und schreibe 'next' oder **schreibe 'auto' um CaptchaBot automatisch einen Textkanal generieren zu lassen.**";
		}else {
			return "Creating a Verification Pool.\n\nCaptchaBot mostly handles verification through text-channels. Please create a verification-pool channel, set the permissions manually and type 'next' or **type 'auto' to let CaptchaBot automatically generate a verification pool**";
		}
	}

	//STEP TWO
	public String returnSetupStepTwoDescription() {
		if(lang.equals("de")) {
			return "Setzen der Verifizierungsrolle\n\nBitte antworte mit dem **Namen der Rolle, welche Verifizierten Nutzern gegeben werden soll** oder mit **auto** um CaptchaBot automatisch eine Rolle generieren zu lassen!\n*Hinweis: Nicht die Rolle erwähnen - nur mit dem Namen antworten.*";
		}else {
			return "Setting the Verification Role\n\nPlease enter the **name of the role to be given to verified members** or type **auto** to let CaptchaBot generate one for you!\n*Notice: Do not mention the role, simply type it's name.*";
		}
	}




}
