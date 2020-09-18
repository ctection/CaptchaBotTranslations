package main.ctection.captchabot;

public class TranslationManager {

	private String lang = "en";

	public String[] supported_languages = new String[999];

	public TranslationManager(String p_lang) {
		supported_languages[0] = "en";
		supported_languages[1] = "de";
		supported_languages[2] = "es";
		lang = p_lang;
	}

	public void setLanguage(String p_lang) {
		lang = p_lang;
	}

	//No Permission to Execute Header
	public String returnNoPermTitle() {
		if(lang.equals("de")) {
			return "Genehmigungsfehler";
		}else if(lang.equals("es")){
			return "Error de Permisos";
		}else {
			return "Permission Error";
		}
	}

	//No Permission to Execute
	public String returnNoPermDescription(String permission_node) {
		if(lang.equals("de")) {
			return "Dir fehlen `"+permission_node+"` Rechte um diesen Befehl auszuführen.";
		}else if(lang.equals("es")){
			return "Te falta acceso a `"+permission_node+"` Para Ejecutar este comando.";
		}else {
			return "You are missing the `"+permission_node+"` Permission to execute this command.";
		}
	}

	//Premium Only Command Header
	public String returnPremiumOnlyTitle() {
		if(lang.equals("de")) {
			return "Premium oder Enterprise Abonnement erforderlich";
		}else if(lang.equals("es")){
			return "Requieres de la Suscripción Premium o Enterprise";
		}else {
			return "Premium or Enterprise Subscription Required";
		}
	}

	//Premium Only Command Description
	public String returnPremiumOnlyDescription() {
		if(lang.equals("de")) {
			return "Dieser Befehl ist nur für Premium Server verfügbar. Besorge dir hier Premium: https://ctection.com/shop/ oder antworte c/premium für mehr Informationen.";
		}else if(lang.equals("es")){
			return "Este comando está restringido a servidores Premium. Puedes comprar Premium en: https://ctection.com/shop/ o escribe c/premium para obtener mas información.";
		}else {
			return "This command is locked to Premium Servers. Purchase Premium here: https://ctection.com/shop/ or type c/premium for more information.";
		}
	}

	//Votelocked Command Header
	public String returnVotelockedTitle() {
		if(lang.equals("de")) {
			return "Dieser Befehl ist nur für Voter zugänglich";
		}else if(lang.equals("es")){
			return "Este comando está Limitado a los Votantes";
		}else {
			return "This command is Votelocked";
		}
	}

	//Votelocked Command Description
    public String returnVotelockedDescription() {
		if(lang.equals("de")) {
			return "Bitte stimme für CaptchaBot mit dem folgendem Link ab um fortzufahren:\nhttps://discordbots.org/bot/554631615565922364/vote\n\n*Premium und Enterprise Server haben keine Vote-gesperrten Befehle. Besuche https://ctection.com/shop/ um Premium zu besorgen.";
		}else if(lang.equals("es")){
			return "Por favor, vota usando el siguiente enlace:\nhttps://discordbots.org/bot/554631615565922364/vote/n/nLos Servidores Premium y Enterprise evitan los bloqueos de voto. Para adquirir, visita https://ctection.com/shop/";";
		}else {
			return "Please vote using the link below to continue:\nhttps://discordbots.org/bot/554631615565922364/vote\n\n*Premium and Enterprise Servers bypass vote-locks. To purchase, visit https://ctection.com/shop/";
		}
	}
	
	public String returnGenericCaptchaBotAdvert() {
		if(lang.equals("de")) {
			return "Sichere deinen Server von böswilligen Benutzern und automatisierten Angriffen: **[Lade CaptchaBot Ein!](https://discordcaptcha.com/invite/?ref=DM)**";
		}else if(lang.equals("es")){
			return "Asegura tu Servidor frente a usuarios maliciosos y ataques automatizados: **[Invita a CaptchaBot!](https://discordcaptcha.com/invite/?ref=DM)**";
		}else {
			return "Secure your server from malicious users and automated attacks: **[Invite CaptchaBot!](https://discordcaptcha.com/invite/?ref=DM)**";
		}
	}

	//KICK COMMAND TRANSLATIONS
	//No Members Tagged Header
	public String returnKickRequireTaggedMembersTitle() {
		if(lang.equals("de")) {
			return "Unbekannter Nutzer";
		}else if(lang.equals("es")){
			return "Usuario Desconocido";
		}else {
			return "Unknown User";
		}
	}

	//No Members Tagged
	public String returnKickRequireTaggedMembersDescription() {
		if(lang.equals("de")) {
			return "Bitte nenne durch einen Mention welche(r) Nutzer gekickt werden soll. Es können maximal 10 Nutzer genannt werden. Beispiel: kick @User1 @User2 @User3";
		}else if(lang.equals("es")){
			return "Por favor, menciona a/los usuario(s) a expulsar. El limite son 10 usuarios de una sola vez. Ejemplo: kick @User1 @User2 @User3";
		}else {
			return "Please mention the user(s) to kick. A maximum of 10 users can be kicked at the same time. Example: kick @User1 @User2 @User3";
		}
	}

	//Successful Kick
	public String returnKickSuccessfulDescription(int no) {
		if(lang.equals("de")) {
			return no+" Nutzer wurden erfolgreich gekickt.";
		}else if(lang.equals("es")){
			return "Se han Expulsado "+no+" miembros.";
		}else {
			return "Kicked "+no+" Members successfully.";
		}
	}

	public String returnKickSuccessfulTitle() {
		if(lang.equals("de")) {
			return "Nutzer Gekickt";
		}else if(lang.equals("es")){
			return "Miembros Expulsados";
		}else {
			return "Kicked Members";
		}
	}

	//KICK COMMAND TRANSLATIONS
	//No Members Tagged Header
	public String returnBanRequireTaggedMembersTitle() {
		if(lang.equals("de")) {
			return "Unbekannter Nutzer";
		}else if(lang.equals("es")){
			return "Usuario Desconocido";
		}else {
			return "Unknown User";
		}
	}

	//No Members Tagged
	public String returnBanRequireTaggedMembersDescription() {
		if(lang.equals("de")) {
			return "Bitte nenne durch einen Mention welche(r) Nutzer verbannt werden soll(en). Es können maximal 10 Nutzer genannt werden. Beispiel: ban @User1 @User2 @User3";
		}else if(lang.equals("es")){
			return "Por favor, menciona al/los usuario/s a Banear. El limite son 10 usuarios de una sola vez. Ejemplo: ban @User1 @User2 @User3";
		}else {
			return "Please mention the user(s) to ban. A maximum of 10 users can be banned at the same time. Example: ban @User1 @User2 @User3";
		}
	}

	//Successful Kick
	public String returnBanSuccessfulDescription(int no) {
		if(lang.equals("de")) {
			return no+" Nutzer wurden erfolgreich verbannt.";
		}else if(lang.equals("es")){
			return "Baneados "+no+" miembros.";
		}else {
			return "Banned "+no+" Members successfully.";
		}
	}

	public String returnBanSuccessfulTitle() {
		if(lang.equals("de")) {
			return "Nutzer Verbannt";
		}else if(lang.equals("es")){
			return "Miembros Baneados";
		}else {
			return "Banned Members";
		}
	}

	//UNVERIFY COMMAND TRANSLATIONS
	//No Members Tagged Header
	public String returnUnverifyRequireTaggedMembersTitle() {
		if(lang.equals("de")) {
			return "Unbekannter Nutzer";
		}else if(lang.equals("es")){
			return "Usuario Desconocido";
		}else {
			return "Unknown User";
		}
	}

	//No Members Tagged
	public String returnUnverifyRequireTaggedMembersDescription() {
		if(lang.equals("de")) {
			return "Bitte nenne durch einen Mention welche(r) Nutzer unverifiziert werden soll(en). Es können maximal 10 Nutzer unverifiziert werden. Beispiel: ban @User1 @User2 @User3";
		}else if(lang.equals("es")){
			return "Por favor, menciona al/los usuario/s para quitarles la verificación. El limite son 10 usuarios de una sola vez. Ejemplo: ban @User1 @User2 @User3";
		}else {
			return "Please mention the user(s) to unverify. A maximum of 10 users can be unverified at the same time. Example: ban @User1 @User2 @User3";
		}
	}

	//Successful Kick
	public String returnUnverifySuccessfulDescription(int no) {
		if(lang.equals("de")) {
			return no+" Nutzer wurden erfolgreich unverifiziert.";
		}else if(lang.equals("es")){
			return "Se ha quitado la verificación a "+no+" miembros.";
		}else {
			return "Unverified "+no+" Members successfully.";
		}
	}

	public String returnUnverifySuccessfulTitle() {
		if(lang.equals("de")) {
			return "Nutzer Unverifiziert";
		}else if(lang.equals("es")){
			return "Miembro/s sin verificar";
		}else {
			return "Unverified Member(s)";
		}
	}

	//WHOIS COMMAND TRANSLATIONS
	//No Members Tagged Header
	public String returnWhoisRequireTaggedMembersTitle() {
		if(lang.equals("de")) {
			return "Unbekannter Nutzer";
		}else if(lang.equals("es")){
			return "Usuario Desconocido";
		}else {
			return "Unknown User";
		}
	}

	//No Members Tagged
	public String returnWhoisRequireTaggedMembersDescription() {
		if(lang.equals("de")) {
			return "Bitte nenne durch einen Mention welcher Nutzer identifiziert werden soll.";
		}else if(lang.equals("es")){
			return "Por favor, menciona al usuario a identificar.";
		}else {
			return "Please mention the user to identify.";
		}
	}

	//HELP COMMAND TRANSLATIONS
	public String returnHelpSupportedByPremiumTitle() {
		if(lang.equals("de")) {
			return "Unterstützt durch Premium";
		}else if(lang.equals("es")){
			return "Reservado a Premium";
		}else {
			return "Supported by Premium";
		}
	}

	public String returnHelpSupportedByPremiumDescription() {
		if(lang.equals("de")) {
			return "*Teste Premium kostenlos für 7 Tage auf https://ctection.com/shop/.*";
		}else if(lang.equals("es")){
			return "*Prueba Premium gratis durante 7 Dias ahora en https://ctection.com/shop/.*";
		}else {
			return "*Try Premium for free for 7 Days now at https://ctection.com/shop/.*";
		}
	}

	public String returnHelpUserCommandsTitle() {
		if(lang.equals("de")) {
			return "Benutzerbefehle";
		}else if(lang.equals("es")){
			return "Comandos de Usuario";
		}else {
			return "User Commands";
		}
	}

	public String returnHelpUserCommandsDescription() {
		if(lang.equals("de")) {
			return "*Um alle Benutzerbefehle zu sehen, schreibe __c/help user__*";
		}else if(lang.equals("es")){
			return "*Para ver todos los comandos de usuario accesibles, escribe __c/help user__*";
		}else {
			return "*To see all user-accessible commands, type __c/help user__*";
		}
	}

	public String returnGenericErrorTitle() {
		if(lang.equals("de")) {
			return "Fehler";
		}else if(lang.equals("es")){
			return "Error";
		}else {
			return "Error";
		}
	}
	
	public String returnGenericErrorDescription() {
		if(lang.equals("de")) {
			return "Etwas ist schief gelaufen. Bitte versuche es später erneut.";
		}else if(lang.equals("es")){
			return "Algo ha ido mal. Prueba de nuevo mas tarde.";
		}else {
			return "Something went wrong. Please try again later.";
		}
	}
	
	public String returnGenericSuccessTitle() {
		if(lang.equals("de")) {
			return "Erfolg";
		}else if(lang.equals("es")){
			return "Éxito";
		}else {
			return "Success";
		}
	}
	
	public String returnGenericModuleEnabledChange(String module) {
		if(lang.equals("de")) {
			return module+" wurde aktiviert.";
		}else if(lang.equals("es")){
			return module+" ha sido habilitado";
		}else {
			return module+" has been enabled";
		}
	}
	
	public String returnGenericModuleDisabledChange(String module) {
		if(lang.equals("de")) {
			return module+" wurde deaktiviert.";
		}else if(lang.equals("es")){
			return module+" ha sido deshabilitado";
		}else {
			return module+" has been disabled";
		}
	}
	
	public String returnGenericModuleEnabled(String module) {
		if(lang.equals("de")) {
			return module+" ist aktuell aktiviert.";
		}else if(lang.equals("es")){
			return module+" está actualmente habilitado";
		}else {
			return module+" is currently enabled";
		}
	}
	
	public String returnGenericModuleDisabled(String module) {
		if(lang.equals("de")) {
			return module+" ist aktuell deaktiviert.";
		}else if(lang.equals("es")){
			return module+" está actualmente deshabilitado";
		}else {
			return module+" is currently disabled";
		}
	}
	
	public String returnGenericTryAgainTitle() {
		if(lang.equals("de")) {
			return "Versuche es erneut";
		}else if(lang.equals("es")){
			return "Prueba de Nuevo";
		}else {
			return "Try Again";
		}
	}
	
	public String returnGenericChannelMissingErrorDescription() {
		if(lang.equals("de")) {
			return "Bitte erwähne einen Textkanal.";
		}else if(lang.equals("es")){
			return "Por favor, menciona un canal.";
		}else {
			return "Please mention a channel.";
		}
	}
	
	public String returnGenericRemainingAttempts() {
		if(lang.equals("de")) {
			return "Verbleibende Versuche";
		}else if(lang.equals("es")){
			return "Intentos restantes";
		}else {
			return "Remaining attempts";
		}
	}
	
	public String returnGenericVerifiedTitle() {
		if(lang.equals("de")) {
			return "Verifiziert";
		}else if(lang.equals("es")){
			return "Verificado";
		}else {
			return "Verified";
		}
	}
	
	public String returnGenericNotSet() {
		if(lang.equals("de")) {
			return "Nicht gesetzt";
		}else if(lang.equals("es")){
			return "No establecido";
		}else {
			return "Not set";
		}
	}
	
	public String returnGenericNone() {
		if(lang.equals("de")) {
			return "Keine";
		}else if(lang.equals("es")){
			return "Ninguno";
		}else {
			return "None";
		}
	}
	
	public String returnGenericEnabled() {
		if(lang.equals("de")) {
			return "Aktiviert";
		}else if(lang.equals("es")){
			return "Habilitado";
		}else {
			return "Enabled";
		}
	}
	
	public String returnGenericDisabled() {
		if(lang.equals("de")) {
			return "Deaktiviert";
		}else if(lang.equals("es")){
			return "Deshabilitado";
		}else {
			return "Disabled";
		}
	}
	
	public String returnGenericVerifiedMembers() {
		if(lang.equals("de")) {
			return "Verifizierte Mitglieder";
		}else if(lang.equals("es")){
			return "Miembros Verificados";
		}else {
			return "Verified Members";
		}
	}
	
	public String returnGenericSuspiciousMembers() {
		if(lang.equals("de")) {
			return "Verdächtige Mitglieder";
		}else if(lang.equals("es")){
			return "Miembros Sospechosos";
		}else {
			return "Suspicious Members";
		}
	}
	
	public String returnGenericSuspiciousBots() {
		if(lang.equals("de")) {
			return "Verdächtige Bots";
		}else if(lang.equals("es")){
			return "Bots Sospechosos";
		}else {
			return "Suspicious Bots";
		}
	}
	
	public String returnGenericAmountDetected(String amount) {
		if(lang.equals("de")) {
			return amount+" erkannt";
		}else if(lang.equals("es")){
			return amount+" detectados";
		}else {
			return amount+" detected";
		}
	}
	
	public String returnGenericStartingTitle(String action) {
		if(lang.equals("de")) {
			return "Starte "+action;
		}else if(lang.equals("es")){
			return "Iniciando "+action
		}else {
			return "Starting "+action;
		}
	}
	
	public String returnGenericThisMightTakeAWhileTitle() {
		if(lang.equals("de")) {
			return "Dies könnte eine Weile dauern...";
		}else if(lang.equals("es")){
			return "Esto puede tardar un poco...";
		}else {
			return "This might take a while...";
		}
	}
	
	public String returnGenericCheckDMs() {
		if(lang.equals("de")) {
			return "Bitte überprüfe deine Direktnachrichten.";
		}else if(lang.equals("es")){
			return "Por favor, revisa tus mensajes privados.";
		}else {
			return "Please check your Direct Messages.";
		}
	}
	
	//VERIFICATION PROCESS TRANSLATIONS
	
	public String returnVerificationAutomaticSuccessful() {
		if(lang.equals("de")) {
			return "Dein Account wurde automatisch verifiziert.";
		}else if(lang.equals("es")){
			return "Tu cuenta ha sido verificada de forma automática.";
		}else {
			return "Your Account has been automatically verified.";
		}
	}
	
	public String returnVerificationSuccessful() {
		if(lang.equals("de")) {
			return "Dein Account wurde verifiziert.";
		}else if(lang.equals("es")){
			return "Tu cuenta ha sido verificada.";
		}else {
			return "Your Account has been verified.";
		}
	}
	
	public String returnVerificationManualPrompt() {
		if(lang.equals("de")) {
			return "Bitte absolviere diesen CAPTCHA um fortzufahren";
		}else if(lang.equals("es")){
			return "Por favor, completa este CAPTCHA para continuar";
		}else {
			return "Please complete this CAPTCHA to continue";
		}
	}
	
	public String returnVerificationManualDetailedPromptTitle() {
		if(lang.equals("de")) {
			return "CaptchaBot | Verifikation benötigt";
		}else if(lang.equals("es")){
			return "CaptchaBot | Verificación Necesaria";
		}else {
			return "CaptchaBot | Verification Needed";
		}
	}
	
	public String returnVerificationManualDetailedPrompt() {
		if(lang.equals("de")) {
			return "Bitte gebe die Wörter des oberen Bildes an um den Verifikationsprozess zu beenden.";
		}else if(lang.equals("es")){
			return "Por favor, escribe las Palabras de la imagen de arriba para completar la Verificación.";
		}else {
			return "Please enter the words from the image above to complete the Verification Process.";
		}
	}
	
	public String returnVerificationManualDMPrompt() {
		if(lang.equals("de")) {
			return "Bitte überprüfe deine Direktnachrichten um mit dem Verifikationsprozess fortzufahren";
		}else if(lang.equals("es")){
			return "Por favor, comprueba tus mensajes privados para continuar con el proceso de verificación";
		}else {
			return "Please check your direct messages to continue the verification process";
		}
	}
	
	public String returnVerificationInvalidCodeDescription() {
		if(lang.equals("de")) {
			return "Diese Antwort ist nicht korrekt. Bitte versuche es nochmal.";
		}else if(lang.equals("es")){
			return "El codigo que has introducido es incorrecto. Por favor, vuelve a intentarlo";
		}else {
			return "The code you entered is incorrect. Please try again";
		}
	}
	

	//SETUP COMMAND TRANSLATIONS
	public String returnSetupStepZeroDescription() {
		if(lang.equals("de")) {
			return "Willkommen im CaptchaBot Setup!\n\nWährend des setups werden wir alle wichtigen Einstellungen durchgehen um CaptchaBot aufzusetzen.\nBitte schreibe 'next' um fortzufahren.";
		}else if(lang.equals("es")){
			return "Bienvenido a la configuración de CaptchaBot !\n\nDurante la configuración, pasaremos por todas aquellas opciones necesarias para que CaptchaBot funcione correctamente.\nPor favor, escribe 'next' para continuar.";
		}else {
			return "Welcome to the CaptchaBot Setup!\n\nDuring this setup, we will go through everything you need to use CaptchaBot correctly.\nPlease type 'next' to continue.";
		}
	}

	public String returnSetupStepTitle(int step) {
		if(lang.equals("de")) {
			return "Setup - Schritt "+step;
		}else if(lang.equals("es")){
			return "Configuración - Paso "+step;
		}else {
			return "Setup - Step "+step;
		}
	}

	public String returnSetupRoleNotFoundError(String role) {
		if(lang.equals("de")) {
			return "Die angegebene Rolle '"+role+"' konnte nicht gefunden werden.\n\n*Hinweis: Nicht die Rolle erwähnen - nur mit dem Namen antworten.*";
		}else if(lang.equals("es")){
			return "No encuentro un rol llamado '"+role+"'.\n\n*Importante: No menciones el rol, simplemente escribe su nombre.*";
		}else {
			return "Can't find a role called '"+role+"'.\n\n*Notice: Do not mention the role, simply type it's name.*";
		}
	}

	public String returnSetupVerificationPoolNotFoundError() {
		if(lang.equals("de")) {
			return "Konnte keinen Textkanal namens 'verification-pool' finden. Bitte nenne den Verifikationskanal zu 'verification-pool' und versuche es erneut.";
		}else if(lang.equals("es")){
			return "No pude encontrar un canal llamado 'verification-pool'. Por favor, renombra tu canal de verificación a 'verification-pool' y vuelve a intentarlo.*";
		}else {
			return "Couldn't find a channel called 'verification-pool'. Please rename your verification channel to 'verification-pool' and try again.";
		}
	}

	public String returnSetupRoleHierarchyError() {
		if(lang.equals("de")) {
			return "Die Rollenhierarchie ist nicht korrekt. Bitte platziere die CaptchaBot Rolle höher als die Verifikationsrolle\n\nMehr Infos: https://discordcaptcha.xyz/hc/doku.php?id=captchabot:role_hierarchy";
		}else if(lang.equals("es")){
			return "La gerarquia de roles es incorrecta. Por favor, asegurate de que el rol CaptchaBot es superior al rol de Verificado.\n\nMas información: https://discordcaptcha.xyz/hc/doku.php?id=captchabot:role_hierarchy";
		}else {
			return "The Role Hierarchy is invalid. Please make sure that the CaptchaBot role is higher than the Verification Role.\n\nMore info: https://discordcaptcha.xyz/hc/doku.php?id=captchabot:role_hierarchy";
		}
	}

	public String returnSetupFinishedTitle() {
		if(lang.equals("de")) {
			return "Setup - Fertig";
		}else if(lang.equals("es")){
			return "Configuración - Finalizada";
		}else {
			return "Setup - Finished";
		}
	}

	//STEP ONE
	public String returnSetupStepOneDescription() {
		if(lang.equals("de")) {
			return "Erstellen des Verifikationskanals\n\nCaptchaBot übernimmt die Verifikation hauptsächlich über Textkanäle. Bitte erstelle einen `verification-pool` Textkanal, setze die Rechte manuell und schreibe 'next' oder **schreibe 'auto' um CaptchaBot automatisch einen Textkanal generieren zu lassen.**";
		}else if(lang.equals("es")){
			return "Creando un canal de Verificación.\n\nCaptchaBot gestiona las verificaciones por medio de canales de texto. Por favor crea un canal verification-pool, establece los permisos manualmente y escribe 'next' o **escribe 'auto' para que CaptchaBot lo haga automaticamente**";
		}else {
			return "Creating a Verification Pool.\n\nCaptchaBot mostly handles verification through text-channels. Please create a verification-pool channel, set the permissions manually and type 'next' or **type 'auto' to let CaptchaBot automatically generate a verification pool**";
		}
	}

	//STEP TWO
	public String returnSetupStepTwoDescription() {
		if(lang.equals("de")) {
			return "Setzen der Verifizierungsrolle\n\nBitte antworte mit dem **Namen der Rolle, welche Verifizierten Nutzern gegeben werden soll** oder mit **auto** um CaptchaBot automatisch eine Rolle generieren zu lassen!\n*Hinweis: Nicht die Rolle erwähnen - nur mit dem Namen antworten.*";
		}else if(lang.equals("es")){
			return "Creando un canal de Verificación.\n\nCaptchaBot gestiona las verificaciones por medio de canales de texto. Por favor crea un canal verification-pool, establece los permisos manualmente y escribe 'next' o **escribe 'auto' para que CaptchaBot lo haga automaticamente**";
		}else {
			return "Setting the Verification Role\n\nPlease enter the **name of the role to be given to verified members** or type **auto** to let CaptchaBot generate one for you!\n*Notice: Do not mention the role, simply type it's name.*";
		}
	}

	//STEP THREE
	public String returnSetupStepThreeDescription() {
		if(lang.equals("de")) {
			return "Adjustierung der globalen und Rollenrechte\n\nAdjustiere die Rechte sodass die (at)everyone Rolle keine Nachrichten senden oder lesen kann und die Verifikationsrolle Nachrichten lesen oder senden kann. Setze die Rechte auch so, dass **neue Nutzer in dem verification-pool Textkanal Nachrichten senden können um sich zu Verifizieren.**\n*Antworte mit '**next**' wenn du diese Einstellungen selber vornehmen willst oder antworte '**auto**' um CaptchaBot diese Einstellungen automatisch vornehmen zu lassen.*";
		}else if(lang.equals("es")){
			return "Configuración Global y de Permisos de Roles\n\nAjusta los permisos para que el rol everyone no pueda leer/enviar mensajes mientras que el rol de verificado si que pueda. También, **asegurate de configurar los permisos del canal verification-pool para que los nuevos miembros puedan escribir en el.**\n*Escribe '**next**' si has configurado estas cosas manualmente. Escribe '**auto**' para que CaptchaBot lo haga por ti.*";
		}else {
			return "Adjust Global and Role Permissions\n\nAdjust your Role Permissions so that the (at)everyone role can't read and send messages and so that the Role set as verification-role can. Also, **make sure that you adjust the permissions for the verification-pool so that new members can see and type in it to verify.**\n*Type '**next**' if you have done these things manually or type '**auto**' to let CaptchaBot do them for you.*";
		}
	}

	//STEP FOUR
	public String returnSetupStepFourDescription() {
		if(lang.equals("de")) {
			return "Soll automatische DM Verifizierung aktiviert sein? \n\nFalls diese Einstellung aktiviert ist, wird automatisch ein Verifikationsprozess in den Direktnachrichten des neuen Nutzers gestartet. Der verification-pool Textkanal wird weiterhin für Nutzer benötigt, welche den Verifikationsprozess in den Direktnachrichten nicht abschließen.\n\nAntworte mit **enable** um DM Verifikation einzuschalten oder antworte **next** um die Einstellung ausgeschaltet zu lassen.";
		}else if(lang.equals("es")){
			return "Quieres habilitar la verificación por DM automatica? \n\nHabilitar este ajuste comenzará de forma automatica el proceso de verificación en los mensajes privados de los nuevos usuarios. El canal de verificacion sigue siendo necesario para dar una opción a miembros que fallen la verificación por MD.\n\nEscribe **enable** para habilitar la verificación por MD, o escribe **next** para dejarla deshabilitada.";
		}else {
			return "Would you like to enable automatic DM Verification? \n\nEnabling this setting will automatically start the verification process inside the new member's DMs. The verification pool will still be needed to provdide a fallback solution for members who fail the verification process inside their DMs.\n\nPlease type **enable** to enable DM Verification, or type **next** to leave the setting disabled.";
		}
	}

	//STEP FIVE
	public String returnSetupStepFiveDescription() {
		if(lang.equals("de")) {
			return "**CaptchaBot Server Liste**\n\nSoll dieser Server zur [CaptchaBot Server Liste](https://discordcaptcha.xyz/servers/) hinzugefügt werden? Antworte **register** um den Server hinzuzufügen oder **next** um diesen Schritt zu überspringen.";
		}else if(lang.equals("es")){
			return "**CaptchaBot Server List**\n\nQuieres listar tu servidor en la [CaptchaBot Server List](https://discordcaptcha.xyz/servers/)? Escribe **register** para listarlo o **next** para continuar sin listarlo.";
		}else {
			return "**CaptchaBot Server List**\n\nDo you want to submit your server to the [CaptchaBot Server List](https://discordcaptcha.xyz/servers/)? Type **register** to register or **next** to skip.";
		}
	}

	//SETUP FINISHED
	public String returnSetupFinishedDescription() {
		if(lang.equals("de")) {
			return "CaptchaBot ist nun bereit um diesen Discord Server zu schützen!\n***Wichtige Befehle:***\n**c/auth** - Sendet dir die Anmeldedaten für das Dashboard. Dort kann CaptchaBot für die beste Nutzererfahrung verstellt werden.\n**c/massverify** - Gibt jedem Member der momentan in dem Server ist die Verifikationsrolle\n**c/serverlist** - Verwalte deinen CaptchaBot Serverlisteneintrag\n**c/antinsfw** - Verhindere es Leuten NSFW Medien in Nicht-NSFW Kanälen zu posten.\n**c/antidox** - Verhindere DOXing auf dem Server\n\n\nFalls du noch Fragen hast oder Hilfe brauchst, kannst du uns immer in unserem Support-Server erreichen: https://discordcaptcha.xyz/i/?c=captchabot";
		}else if(lang.equals("es")){
			return "CaptchaBot está listo para proteger tu servidor.\n***Comandos Útiles:***\n**c/auth** - Te envia las credenciales para acceder al panel para customizar CaptchaBot para obtener la mejor experiencia\n**c/massverify** - Verifica a todos los miembros de tu servidor de golpe\n**c/serverlist** - Edita tu entrada en la Lista de Servidores\n**c/antinsfw** - Previene el envio de contenido NSFW en los canales No-NSFW\n**c/antidox** - Previene el Doxing en tu servidor\n\n\nSi tienes cualquier pregunta o necesitas ayuda, sientete libre de unirte a nuestro servidor de asistencia: https://discordcaptcha.xyz/i/?c=captchabot";
		}else {
			return "CaptchaBot is now ready to protect your Discord server.\n***Useful Commands:***\n**c/auth** - Sends you the credentials for the dashboard to customize CaptchaBot for the best experience\n**c/massverify** - Assign all current members the Verified Role\n**c/serverlist** - Manage your Server list entry\n**c/antinsfw** - Prevent NSFW Media from being posted within Non-NSFW Channels\n**c/antidox** - Prevent DOXing on your Server\n\n\nIf you have any questions or need support, feel free to join our support server by clicking here: https://discordcaptcha.xyz/i/?c=captchabot";
		}
	}

	//WHOIS Command
	public String returnWhoisGenericTitle() {
		if(lang.equals("de")) {
			return "CaptchaBot WhoIs";
		}else if(lang.equals("es")){
			return "CaptchaBot WhoIs";
		}else {
			return "CaptchaBot WhoIs";
		}
	}

	public String returnWhoisGenericFieldUsernameTitle() {
		if(lang.equals("de")) {
			return "Nutzername";
		}else if(lang.equals("es")){
			return "Nombre de Usuario";
		}else {
			return "Username";
		}
	}

	public String returnWhoisGenericFieldAccountCreatedOnTitle() {
		if(lang.equals("de")) {
			return "Account erstellt am";
		}else if(lang.equals("es")){
			return "Cuenta creada en";
		}else {
			return "Account created on";
		}
	}

	public String returnWhoisGenericFieldJoinedOnTitle() {
		if(lang.equals("de")) {
			return "Beigetreten am";
		}else if(lang.equals("es")){
			return "Se unió el";
		}else {
			return "Joined on";
		}
	}

	public String returnWhoisGenericFieldRolesTitle() {
		if(lang.equals("de")) {
			return "Rollen";
		}else if(lang.equals("es")){
			return "Roles";
		}else {
			return "Roles";
		}
	}

	public String returnWhoisGenericFieldVerificationScoreTitle() {
		if(lang.equals("de")) {
			return "Verifikationsergebniss";
		}else if(lang.equals("es")){
			return "Puntuación de Verificación";
		}else {
			return "Verification Score";
		}
	}
	
	//CUSTOM PREFIX COMMAND
	public String returnCustomPrefixTitle() {
		if(lang.equals("de")) {
			return "Benutzerdefinierter Präfix";
		}else if(lang.equals("es")){
			return "Prefijo Personalizado";
		}else {
			return "Custom Prefix";
		}
	}
	
	public String returnCustomPrefixSuccess() {
		if(lang.equals("de")) {
			return "Präfix geändert!";
		}else if(lang.equals("es")){
			return "Prefijo Cambiado";
		}else {
			return "Prefix changed!";
		}
	}
	
	public String returnCustomPrefixMissingArgument() {
		if(lang.equals("de")) {
			return "Bitte gebe einen neuen Präfix an.";
		}else if(lang.equals("es")){
			return "Por favor, proporciona un nuevo prefijo";
		}else {
			return "Please provide a new prefix.";
		}
	}
	
	//LOG COMMAND
	public String returnLogEnabled() {
		if(lang.equals("de")) {
			return "Logging wurde aktiviert";
		}else if(lang.equals("es")){
			return "Los Logs han sido habilitados";
		}else {
			return "Logging has been enabled";
		}
	}
	
	public String returnLogDisabled() {
		if(lang.equals("de")) {
			return "Logging wurde deaktiviert";
		}else if(lang.equals("es")){
			return "Los Logs han sido deshabilitados";
		}else {
			return "Logging has been disabled";
		}
	}
	
	public String returnLogChannelSet(String channel) {
		if(lang.equals("de")) {
			return "Der Logging Textkanal wurde zu "+channel+" gesetzt";
		}else if(lang.equals("es")){
			return "Los Logs han sido asignados al canal "+channel;
		}else {
			return "The log channel has been set to "+channel;
		}
	}
	
	public String returnLogDisabledMainDescription(String channel) {
		if(lang.equals("de")) {
			return "Aktueller Logging Textkanal: "+channel+"\n**Logging ist deaktiviert**\n\nAktionen: `enable`,`disable`,`setchannel`";
		}else if(lang.equals("es")){
			return "Canal de Logs Actual: "+channel+"\n**Los Logs están deshabilitados**\n\nAcciones: `enable`,`disable`,`setchannel`";
		}else {
			return "Current Log Channel: "+channel+"\n**Logging is disabled**\n\nActions: `enable`,`disable`,`setchannel`";
		}
	}
	
	public String returnLogEnabledMainDescription(String channel) {
		if(lang.equals("de")) {
			return "Aktueller Logging Textkanal: "+channel+"\n**Logging ist aktiviert**\n\nAktionen: `enable`,`disable`,`setchannel`";
		}else if(lang.equals("es")){
			return "Canal de Logs Actual: "+channel+"\n**Los Logs están habilitados**\n\nAcciones: `enable`,`disable`,`setchannel`";
		}else {
			return "Current Log Channel: "+channel+"\n**Logging is enabled**\n\nActions: `enable`,`disable`,`setchannel`";
		}
	}
	
	//AUTH COMMAND
	public String returnAuthSentTitle() {
		if(lang.equals("de")) {
			return "Anmeldedaten gesendet!";
		}else if(lang.equals("es")){
			return "¡Credenciales Enviadas!";
		}else {
			return "Credentials sent!";
		}
	}
	
	public String returnAuthSentDescription() {
		if(lang.equals("de")) {
			return "Die Anmeldedaten des Servers wurden dir durch eine Direktnachricht mitgeteilt.";
		}else if(lang.equals("es")){
			return "¡Se te han enviado las credenciales del servidor por MD!";
		}else {
			return "The guild's credentials have been sent to you via DM!";
		}
	}
	
	public String returnAuthDirectMessageTitle() {
		if(lang.equals("de")) {
			return "Deine Server Anmeldedaten";
		}else if(lang.equals("es")){
			return "¡Tus credenciales del servidor!";
		}else {
			return "Your Guild Credentials";
		}
	}
	
	public String returnAuthDirectMessageDescription(String server_id, String key) {
		if(lang.equals("de")) {
			return "Server ID: "+server_id+"\nKey: "+key+"\n\n*Nutze diese Anmeldedaten um dich in Dashboard bei https://console.discordcaptcha.xyz anzumelden.*";
		}else if(lang.equals("es")){
			return "ID del Servidor: "+server_id+"\nContraseña: "+key+"\n\n*Usa estas credenciales para identificarte en el panel de control en https://console.discordcaptcha.xyz*";
		}else {
			return "Guild ID: "+server_id+"\nKey: "+key+"\n\n*Use these credentials to log in to the Web-Dashboard at https://console.discordcaptcha.xyz*";
		}
	}
	
	//WARN COMMAND
	public String returnWarnSuccessTitle() {
		if(lang.equals("de")) {
			return "Nutzer wurde Verwarnt";
		}else if(lang.equals("es")){
			return "Usuario Advertido";
		}else {
			return "User warned";
		}
	}
	
	public String returnWarnSuccessDescription() {
		if(lang.equals("de")) {
			return "Nutzer wurde erfolgreich Verwarnt.";
		}else if(lang.equals("es")){
			return "Usuario advertido correctamente";
		}else {
			return "User was warned successfully.";
		}
	}
	
	public String returnWarnArgumentsMissingTitle() {
		if(lang.equals("de")) {
			return "Argumente Fehlen";
		}else if(lang.equals("es")){
			return "Faltan argumentos";
		}else {
			return "Arguments missing";
		}
	}
	
	public String returnWarnArgumentsMissingDescription() {
		if(lang.equals("de")) {
			return "Richtige Benutzung:\nc/warn @Nutzer Grund";
		}else if(lang.equals("es")){
			return "Uso correcto del comando:\nc/warn @Usuario Razón";
		}else {
			return "Proper command usage:\nc/warn @User Reason";
		}
	}


}
