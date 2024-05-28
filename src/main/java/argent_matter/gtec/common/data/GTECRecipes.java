package argent_matter.gtec.common.data;


import argent_matter.gtec.data.recipe.disabled.BastnasiteChainRecipes;
import argent_matter.gtec.data.recipe.disabled.MonaziteChainRecipes;
import argent_matter.gtec.data.recipe.disabled.PlatinumLineRecipes;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;


public class GTECRecipes {


    public static void init(Consumer<FinishedRecipe> provider) {
        PlatinumLineRecipes.init(provider);
        MonaziteChainRecipes.init(provider);
        BastnasiteChainRecipes.init(provider);

    }
}
