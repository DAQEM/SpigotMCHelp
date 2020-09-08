package me.daqem.spigothelp.CatGuy;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockCookEvent;
import org.bukkit.inventory.ItemStack;

public class SmeltListener implements Listener {

    @EventHandler
    public void SmeltAsNuggets(BlockCookEvent event) {
        ItemStack smeltedBlocks = event.getResult();
        if (smeltedBlocks.getType() == Material.IRON_INGOT) {
            Bukkit.broadcastMessage(smeltedBlocks.toString());
            event.setResult(new ItemStack(Material.IRON_NUGGET, 1));
        }
    }
}
