package net.njay.modules2.module;

import org.jdom2.Document;

public interface Module{
	 
	void onEnable();
	void onDisable();
	Module parse(Document doc);
	
}