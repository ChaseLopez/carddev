package lib;

import java.util.ArrayList;

public class CardLirbrary
{
	// cardLibrary hold all of the sets containing all of the cards
	ArrayList<Set> cardLibrary;
	// holds location to files
	String path = "res/CardFile/";
	// hold extension of file type
	String extension = ".txt";
	// setNames holds values corresponding to files holding information on all the
	// cards of a specific set
	String[] setNames =
	{ "10e", "12xm", "1cmr", "1eld", "1iko", "1khm", "1m21", "1med", "1sld", "1slu", "1ss1", "1ss2", "1ss3", "1thb",
			"1znr", "2010", "2011", "2012", "2013", "2iko", "2xm", "4e", "5e", "6e", "7e", "8e", "9e", "a25", "advd",
			"aer", "aevg", "agvl", "ajvc", "akh", "alliances", "alpha", "an", "antiquities", "apocalypse", "arb",
			"archenemy", "avr", "bbd", "beta", "bfz", "bng", "bok", "btd", "c13", "c14", "c15", "c16", "c17", "c18",
			"c19", "c20", "cc1", "celd", "cfx", "chk", "cm2", "cma", "cmb1", "cmr", "cn2", "coldsnap", "commander",
			"conspiracy", "cthb", "dark", "darksteel", "dde", "ddi", "ddj", "ddk", "ddl", "ddm", "ddn", "ddo", "ddp",
			"ddq", "ddr", "ddt", "ddu", "dissension", "dka", "dom", "dragonsmaze", "dtk", "e01", "e02", "eld", "ema",
			"emn", "eventide", "exodus", "expeditions", "fd", "fe", "frf", "fs", "gatecrash", "gk1", "gk2", "gn2",
			"gnt", "grn", "gs1", "guildpact", "h17", "homelands", "hou", "ia", "iko", "ima", "innistrad", "invasion",
			"jmp", "jou", "judgment", "khc", "khm", "kld", "ktk", "lackey", "legends", "legions", "lorwyn", "m14",
			"m15", "m19", "m20", "m21", "mbs", "mh1", "mirage", "mirrodin", "mm", "mm2", "mm3", "modernmasters",
			"morningtide", "mp2", "mps", "mvm", "nemesis", "nph", "odyssey", "ogw", "onslaught", "origins", "p03",
			"p3k", "pc2", "pca", "pcsp", "pgp1", "planechase", "planeshift", "plc", "portal", "portal2", "promo",
			"prophecy", "ptg", "ravnica", "revised", "rix", "rna", "roe", "rtr", "scourge", "Set", "shadowmoor", "soa",
			"soi", "sok", "som", "special", "starter", "stronghold", "tbth", "tdag", "tempest", "tfth", "thb", "theros",
			"thp1", "thp2", "thp3", "torment", "tpr", "ts", "tsts", "ud", "ul", "uma", "und", "unglued", "unhinged",
			"unlimited", "ust", "uz", "vanguard", "visions", "vma", "w16", "w17", "war", "weatherlight", "worldwake",
			"xln", "zendikar", "znc", "znr" };

	public CardLirbrary()
	{
		cardLibrary = new ArrayList<Set>();
		// adds each new set to the card library array
		for (String set : setNames)
		{
			cardLibrary.add(new Set(path + set + extension));
		}
	}

	public Set getSet(int number)
	{
		return cardLibrary.get(number);
	}

	public ArrayList<Set> getLib()
	{
		return cardLibrary;
	}
}
