package net.glasslauncher.mods.worldheightannihilation;

import blue.endless.jankson.Comment;
import net.glasslauncher.mods.api.gcapi.api.ConfigName;
import net.glasslauncher.mods.api.gcapi.api.GConfig;
import net.glasslauncher.mods.api.gcapi.api.MaxLength;

public class AnnihilateMyConfig {

    @GConfig(value = "main", visibleName = "Annihilate My World")
    public static final Config INSTANCE = new Config();

    public static class Config {

        @ConfigName("Overworld Height")
        @MaxLength(1024) // Any higher and you're just asking for issues.
        @Comment("Maximum of 1024.")
        public Integer overworldHeight = 128;

        @ConfigName("Overworld Y Negative Offset")
        @MaxLength(896)
        @Comment("Sinks the world down by this value into the negatives. Adjust height accordingly.")
        public Integer minOverworldY = 0;

        @ConfigName("Nether Height")
        @MaxLength(1024) // Any higher and you're just asking for issues.
        @Comment("Maximum of 1024.")
        public Integer netherHeight = 128;

        @ConfigName("Nether Y Negative Offset")
        @MaxLength(896)
        @Comment("Sinks the world down by this value into the negatives. Adjust height accordingly.")
        public Integer minNetherY = 0;
    }
}
