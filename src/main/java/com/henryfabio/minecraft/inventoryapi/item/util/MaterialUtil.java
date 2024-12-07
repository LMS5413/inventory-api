package com.henryfabio.minecraft.inventoryapi.item.util;

import com.cryptomorin.xseries.XMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

public final class MaterialUtil {

    public static ItemStack convertFromLegacy(String materialName, int damage) {
        try {
            return new ItemStack(Material.getMaterial(materialName), 1, (short) damage);
        } catch (Exception error) {
            return XMaterial.matchXMaterial(materialName).map(XMaterial::parseItem).orElse(null);
        }
    }

}
