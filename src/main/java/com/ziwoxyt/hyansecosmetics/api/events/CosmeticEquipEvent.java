package com.ziwoxyt.hyansecosmetics.api.events;

import com.ziwoxyt.hyansecosmetics.api.cosmetics.CosmeticItem;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class CosmeticEquipEvent extends Event {

    private final Player player;
    private final CosmeticItem cosmeticItem;

    public CosmeticEquipEvent(Player player, CosmeticItem cosmeticItem) {
        this.player = player;
        this.cosmeticItem = cosmeticItem;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Player getPlayer() {
        return player;
    }

    public CosmeticItem getCosmetic() {
        return cosmeticItem;
    }

}
