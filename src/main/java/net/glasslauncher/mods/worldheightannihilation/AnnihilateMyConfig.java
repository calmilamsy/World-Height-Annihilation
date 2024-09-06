package net.glasslauncher.mods.worldheightannihilation;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;
import net.glasslauncher.mods.gcapi3.api.ConfigRoot;

public class AnnihilateMyConfig {

    @ConfigRoot(value = "main", visibleName = "Annihilate My World")
    public static final Config INSTANCE = new Config();

    public static class Config {

        @ConfigEntry(
                name = "Overworld Height",
                description = "Maximum of 1024.",
                minLength = 16,
                maxLength = 1024
        )
        public Integer overworldHeight = 128;

        @ConfigEntry(
                name = "Overworld Y Offset",
                description = "Offsets the world Y value by this amount. Adjust height accordingly.",
                minLength = -1024,
                maxLength = 1024
        )
        public Integer minOverworldY = 0;

        @ConfigEntry(
                name = "Nether Height",
                description = "Maximum of 1024.",
                minLength = 16,
                maxLength = 1024
        )
        public Integer netherHeight = 128;

        @ConfigEntry(
                name = "Nether Y Offset",
                minLength = -1024,
                maxLength = 1024,
                description = "Offsets the world Y value by this amount. Adjust height accordingly."
        )
        public Integer minNetherY = 0;
    }
}
