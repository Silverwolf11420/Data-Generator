package mod.silverwolfs.silverwolfsbuildingblocks.datagen;

import mod.silverwolfs.silverwolfsbuildingblocks.init.ItemInit;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraftforge.common.Tags;
import java.util.function.Consumer;

public class Recipes extends RecipeProvider {

    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(ItemInit.BLACK_STAINED_ACACIA_PLANKS.get())
                .key('x', Blocks.ACACIA_PLANKS)
                .key('d', Tags.Items.DYES_BLACK)
                .patternLine("xd")
                .setGroup("silvewolfsbuildingblocks")
                .addCriterion("acacia_planks", InventoryChangeTrigger.Instance.forItems(Blocks.ACACIA_PLANKS))
                .build(consumer);
    }
}