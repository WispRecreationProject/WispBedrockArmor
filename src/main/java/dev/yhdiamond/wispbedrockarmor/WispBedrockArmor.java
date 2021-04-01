package dev.yhdiamond.wispbedrockarmor;

import dev.yhdiamond.wispbedrockarmor.bstats.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class WispBedrockArmor extends JavaPlugin {

    @Override
    public void onEnable() {
        Recipe bedrockRecipe = new ShapedRecipe(new NamespacedKey(this, "bedrock_craft"), new ItemStack(Material.BEDROCK))
                .shape("ODO", "DOD", "ODO")
                .setIngredient('O', new RecipeChoice.ExactChoice(new ItemStack(Material.OBSIDIAN)))
                .setIngredient('D', new RecipeChoice.ExactChoice(new ItemStack(Material.DIAMOND)));
        Bukkit.addRecipe(bedrockRecipe);
        Recipe bedrockSwordRecipe = new ShapedRecipe(new NamespacedKey(this, "bedrock_sword_craft"), ItemManager.BEDROCK_SWORD)
                .shape(" B ", " B ", " S ")
                .setIngredient('B', new RecipeChoice.ExactChoice(new ItemStack(Material.BEDROCK)))
                .setIngredient('S', new RecipeChoice.ExactChoice(new ItemStack(Material.STICK)));
        Bukkit.addRecipe(bedrockSwordRecipe);
        Recipe bedrockChestplateRecipe = new ShapedRecipe(new NamespacedKey(this, "bedrock_chestplate_craft"), ItemManager.BEDROCK_CHESTPLATE)
                .shape("B B", "BBB", "BBB")
                .setIngredient('B', new RecipeChoice.ExactChoice(new ItemStack(Material.BEDROCK)));
        Bukkit.addRecipe(bedrockChestplateRecipe);
        Recipe bedrockLeggingsRecipe = new ShapedRecipe(new NamespacedKey(this, "bedrock_leggings_craft"), ItemManager.BEDROCK_LEGGINGS)
                .shape("BBB", "B B", "B B")
                .setIngredient('B', new RecipeChoice.ExactChoice(new ItemStack(Material.BEDROCK)));
        Bukkit.addRecipe(bedrockLeggingsRecipe);
        Recipe bedrockBootsRecipe = new ShapedRecipe(new NamespacedKey(this, "bedrock_boots_craft"), ItemManager.BEDROCK_BOOTS)
                .shape("B B", "B B")
                .setIngredient('B', new RecipeChoice.ExactChoice(new ItemStack(Material.BEDROCK)));
        Bukkit.addRecipe(bedrockBootsRecipe);
        Recipe bedrockHelmetRecipe = new ShapedRecipe(new NamespacedKey(this, "bedrock_helmet_craft"), ItemManager.BEDROCK_HELMET)
                .shape("BBB", "B B")
                .setIngredient('B', new RecipeChoice.ExactChoice(new ItemStack(Material.BEDROCK)));
        Bukkit.addRecipe(bedrockHelmetRecipe);

        new Metrics(this, 10881);
    }

}
