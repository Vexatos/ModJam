package com.teamneo.modjam.misc;

public final class Language{
	private static Localization local = new Localization("/assets/teamneo/lang/");
	
	public static void addAll(){
		
	}
	
	private static String getLocalizedName(String key, String lang){
		return local.translate(key, lang);
	}
	
	private static String getLocalizedName(String key){
<<<<<<< HEAD
		return getLocalizedName(key, SessionData.CURRENT_LANG);
=======
		return key;
		
>>>>>>> dcf09bd68c059f07269f5a6447b88a8908b3be6d
	}
}