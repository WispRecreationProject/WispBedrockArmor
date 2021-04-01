package dev.yhdiamond.wispbedrockarmor;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class ItemManager {
    public static ItemStack BEDROCK_SWORD = ItemBuilder.of(Material.NETHERITE_SWORD)
            .name(ChatColor.DARK_PURPLE + "Bedrock Sword")
            .enchantment(Enchantment.DAMAGE_ALL, 5)
            .modelData(10)
            .build();
    public static ItemStack BEDROCK_CHESTPLATE = ItemBuilder.of(Material.NETHERITE_CHESTPLATE)
            .name(ChatColor.DARK_PURPLE + "Bedrock Chestplate")
            .enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3)
            .modelData(30)
            .build();
    public static ItemStack BEDROCK_LEGGINGS = ItemBuilder.of(Material.NETHERITE_LEGGINGS)
            .name(ChatColor.DARK_PURPLE + "Bedrock Leggings")
            .enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3)
            .modelData(40)
            .build();
    public static ItemStack BEDROCK_HELMET = ItemBuilder.of(Material.NETHERITE_HELMET)
            .name(ChatColor.DARK_PURPLE + "Bedrock Helmet")
            .enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3)
            .modelData(20)
            .build();
    public static ItemStack BEDROCK_BOOTS = ItemBuilder.of(Material.NETHERITE_BOOTS)
            .name(ChatColor.DARK_PURPLE + "Bedrock Boots")
            .enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3)
            .modelData(50)
            .build();
}
