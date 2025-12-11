package net.poayt.oneatatime.event;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.util.registry.Registry

public class BlockDetection {
    private static int blocksBroken = 0;

    PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, blockEntity) -> {
        blocksBroken++;

    });
}
