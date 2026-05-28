package fr.madu59.ptp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Ptp {
	public static final String MOD_ID = "ptp";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private Ptp() {}
}