package com.teamneo.modjam.misc;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Properties;

public final class Localization {
	private final HashMap<String, Properties> languageMaps = new HashMap<String, Properties>();

	private final String langDir;

	public Localization(String dir) {
		this.langDir = dir;
	}

	public void loadLanguage(String lang) throws IOException {
		Properties langFile = new Properties(this.languageMaps.get(lang));
		InputStreamReader reader = new InputStreamReader(getClass().getResourceAsStream(this.langDir + "/" + lang + ".properties"));
		langFile.load(reader);
		reader.close();
		this.languageMaps.put(lang, langFile);
	}

	public String translate(String name, String lang) {
		if (languageMaps.containsKey(lang)) {
			return languageMaps.get(lang).getProperty(name);
		} else {
			return name;
		}
	}
}