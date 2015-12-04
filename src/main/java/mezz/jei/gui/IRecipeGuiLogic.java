package mezz.jei.gui;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

import mezz.jei.api.recipe.IRecipeCategory;

public interface IRecipeGuiLogic {
	enum Mode {
		INPUT, OUTPUT
	}

	@Nonnull
	String getPageString();

	void setRecipesPerPage(int recipesPerPage);

	boolean hasMultipleCategories();

	void previousRecipeCategory();

	void nextRecipeCategory();

	boolean hasMultiplePages();

	void previousPage();

	void nextPage();

	boolean setFocus(@Nonnull Focus focus, @Nonnull Mode mode);

	boolean setCategoryFocus();

	@Nullable
	IRecipeCategory getRecipeCategory();

	@Nonnull
	List<RecipeLayout> getRecipeWidgets(int posX, int posY, int spacingY);
}