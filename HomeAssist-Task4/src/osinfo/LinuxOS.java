package osinfo;

import plugindef.portOS;

public class LinuxOS implements portOS {
	
	public static portOS load() {
		System.out.println("loading LinuxOS ...");
		return new LinuxOS();
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
		return "Linux is a community-developed Unix-like open source operating system that is supported on most major computer platforms.";
	}
	
}