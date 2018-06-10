package osinfo;

import plugindef.portOS;

public class MacOS implements portOS {
	
	public static portOS load() {
		System.out.println("loading MacOS ...");
		return new MacOS();
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
		return "Mac OS is the computer operating system for Apple Computer's Macintosh line of personal computers and workstations.";
	}
	
}