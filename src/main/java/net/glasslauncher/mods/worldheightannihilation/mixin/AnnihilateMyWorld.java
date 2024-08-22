package net.glasslauncher.mods.worldheightannihilation.mixin;

import net.glasslauncher.mods.worldheightannihilation.AnnihilateMyConfig;
import net.minecraft.world.dimension.OverworldDimension;
import net.modificationstation.stationapi.api.world.dimension.StationDimension;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(OverworldDimension.class)
public class AnnihilateMyWorld implements StationDimension {

    @Override
    public int getHeight() {
        return AnnihilateMyConfig.INSTANCE.overworldHeight;
    }

    @Override
    public int getBottomY() {
        return -AnnihilateMyConfig.INSTANCE.minOverworldY;
    }
}
