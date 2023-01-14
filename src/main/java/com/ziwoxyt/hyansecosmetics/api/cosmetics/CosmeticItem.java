package com.ziwoxyt.hyansecosmetics.api.cosmetics;

import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CosmeticItem {

    public CosmeticItem(String cosmeticName, CosmeticType cosmeticType, @NotNull String permission,
                        ItemStack cosmeticItem, ItemStack unlockedItem, ItemStack lockedItem,
                        boolean paintable, List<String> commandsOnEquip, List<String> commandsOnUnequip,
                        Color defaultColor) {
        throw new IllegalArgumentException("Dummy Plugin! :D");
    }

    public CosmeticType getCosmeticType() {
        throw new IllegalArgumentException("Dummy Plugin! :D");
    }

    public String getCosmeticName() {
        throw new IllegalArgumentException("Dummy Plugin! :D");
    }

    @NotNull
    public String getPermission() {
        throw new IllegalArgumentException("Dummy Plugin! :D");
    }

    public ItemStack getCosmeticItem() {
        throw new IllegalArgumentException("Dummy Plugin! :D");
    }

    public ItemStack getUnlockedItem() {
        throw new IllegalArgumentException("Dummy Plugin! :D");
    }

    public ItemStack getLockedItem() {
        throw new IllegalArgumentException("Dummy Plugin! :D");
    }

    public ItemStack getItemState(Player player) {
        return player.hasPermission(getPermission()) ? getUnlockedItem() : getLockedItem();
    }

    public boolean isPaintable() {
        throw new IllegalArgumentException("Dummy Plugin! :D");
    }

    public List<String> getCommandsOnEquip() {
        throw new IllegalArgumentException("Dummy Plugin! :D");
    }

    public List<String> getCommandsOnUnequip() {
        throw new IllegalArgumentException("Dummy Plugin! :D");
    }

    public Color getDefaultColor() {
        throw new IllegalArgumentException("Dummy Plugin! :D");
    }

    public ItemStack getCosmeticStack(@Nullable Color color) {
        throw new IllegalArgumentException("Dummy Plugin! :D");
    }

    public void equipCosmetic(CosmeticPlayer cosmeticPlayer, @Nullable Color color) {
        throw new IllegalArgumentException("Dummy Plugin! :D");
    }

    public void equipCosmeticClientSide(CosmeticPlayer cosmeticPlayer, @Nullable Color color) {
        throw new IllegalArgumentException("Dummy Plugin! :D");
    }

}
