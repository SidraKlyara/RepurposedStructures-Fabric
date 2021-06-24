package com.telepathicgrunt.repurposedstructures.configs;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;


@Config(name = "Shipwrecks")
public class RSShipwrecksConfig implements ConfigData {

    @ConfigEntry.Gui.Tooltip(count = 0)
    @ConfigEntry.Gui.PrefixText
    @ConfigEntry.Gui.RequiresRestart
    @Comment("How rare are End Shipwreck in End Highlands biomes."
            + "\n1 for spawning in most chunks and 1001 for none.")
    @ConfigEntry.BoundedDiscrete(min = 1, max = 1001)
    public int endShipwreckMaxChunkDistance = 24;


    @ConfigEntry.Gui.Tooltip(count = 0)
    @ConfigEntry.Gui.PrefixText
    @ConfigEntry.Gui.RequiresRestart
    @Comment("How rare are Nether Bricks Shipwreck in any non-warped or non-crimson Nether biome."
            + "\n1 for spawning in most chunks and 1001 for none.")
    @ConfigEntry.BoundedDiscrete(min = 1, max = 1001)
    public int netherBricksShipwreckMaxChunkDistance = 51;


    @ConfigEntry.Gui.Tooltip(count = 0)
    @ConfigEntry.Gui.PrefixText
    @ConfigEntry.Gui.RequiresRestart
    @Comment("How rare are Crimson Shipwreck in Crimson Nether biome."
            + "\n1 for spawning in most chunks and 1001 for none.")
    @ConfigEntry.BoundedDiscrete(min = 1, max = 1001)
    public int crimsonShipwreckMaxChunkDistance = 41;


    @ConfigEntry.Gui.Tooltip(count = 0)
    @ConfigEntry.Gui.PrefixText
    @ConfigEntry.Gui.RequiresRestart
    @Comment("How rare are Warped Shipwreck in Warped Nether biome."
            + "\n1 for spawning in most chunks and 1001 for none.")
    @ConfigEntry.BoundedDiscrete(min = 1, max = 1001)
    public int warpedShipwreckMaxChunkDistance = 41;
}
