package net.glasslauncher.mods.worldheightannihilation.mixin;

import net.glasslauncher.mods.worldheightannihilation.AnnihilateMyConfig;
import net.minecraft.world.dimension.NetherDimension;
import net.modificationstation.stationapi.api.world.dimension.StationDimension;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(NetherDimension.class)
public class AnnihilateMyNether implements StationDimension {

    @Override
    public int getHeight() {
        return AnnihilateMyConfig.INSTANCE.netherHeight;
    }

    @Override
    public int getBottomY() {
        return -AnnihilateMyConfig.INSTANCE.minNetherY;
    }
}
