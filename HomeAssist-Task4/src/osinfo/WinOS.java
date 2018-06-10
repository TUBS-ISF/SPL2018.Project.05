package osinfo;

import plugindef.portOS;

public class WinOS implements portOS {
	
	public static portOS load() {
		System.out.println("loading WinOS ...");
		return new WinOS();
	}
	
	@Override
	public String getOSName() {
		return System.getProperty("os.name");
	}

	@Override
	public String getOSVersion() {
		return System.getProperty("os.version");
	}

	@Override
	public String getDescription() {
		return "Windows OS, computer operating system (OS) developed by Microsoft Corporation to run personal computers (PCs).";
	}
	
}