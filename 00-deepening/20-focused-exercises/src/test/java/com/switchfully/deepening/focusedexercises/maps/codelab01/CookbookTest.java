package com.switchfully.deepening.focusedexercises.maps.codelab01;

/**
 * Codelab01:
 *
 * Remove the comments from the first test. Write just enough code to make this test succeed.
 * Continue to the next test and repeat.
 */
class CookbookTest {

    private Cookbook cookbook = new Cookbook();

//    @Nested
//    @DisplayName("save a recipe")
//    public class SaveARecipe {
//
//        @Test
//        void givenANewRecipe_willAlwaysSucceed() {
//            //GIVEN
//            Recipe recipe = new Recipe("Put the egg in boiling water for 5 minutes.");
//
//            //WHEN
//            cookbook.save("boiled egg", recipe);
//
//            //THEN
//            //No assert
//        }
//
//        @Test
//        void givenNullAsAName_willThrowException() {
//            //GIVEN
//            Recipe recipe = new Recipe("Put the egg in boiling water for 5 minutes.");
//
//            //WHEN && THEN
//            Assertions.assertThatThrownBy(() -> cookbook.save(null, recipe))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("Please provide a name");
//        }
//
//        @Test
//        void givenANameSmallerThan3_willThrowException() {
//            //GIVEN
//            Recipe recipe = new Recipe("Put the egg in boiling water for 5 minutes.");
//
//            //WHEN && THEN
//            Assertions.assertThatThrownBy(() -> cookbook.save("ba", recipe))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("A recipe name must be at least 3 characters long");
//        }
//
//        @Test
//        void givenANullName_willThrowException() {
//            //GIVEN
//            Recipe recipe = null;
//
//            //WHEN && THEN
//            Assertions.assertThatThrownBy(() -> cookbook.save("boiled egg", recipe))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("Cannot save a null recipe");
//        }
//
//        @Test
//        void givenAnAlreadyExistingRecipe_willThrowException() {
//            //GIVEN
//            Recipe recipe = new Recipe("Put the egg in boiling water for 5 minutes.");
//            Recipe duplicated_recipe = new Recipe("Keep the egg in your armpit for 5 hours.");
//            cookbook.save("boiled egg", recipe);
//
//            //WHEN && THEN
//            Assertions.assertThatThrownBy(() -> cookbook.save("boiled egg", duplicated_recipe))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("Recipe already exists");
//        }
//    }
//
//    @Nested
//    @DisplayName("find a recipe")
//    public class FindRecipe {
//
//        @Test
//        void givenARecipeWithTheSameName_willReturnThatRecipe() {
//            //GIVEN
//            Recipe recipe = new Recipe("Put the egg in boiling water for 5 minutes.");
//            cookbook.save("boiled egg", recipe);
//
//            //WHEN
//            Recipe actualRecipe = cookbook.find("boiled egg");
//
//            //THEN
//            Assertions.assertThat(actualRecipe).isEqualTo(recipe);
//        }
//
//        @Test
//        void givenNoRecipeOfTheSameName_willReturnNull() {
//            //GIVEN
//            Recipe recipe = new Recipe("Put the egg in boiling water for 5 minutes.");
//            cookbook.save("boiled egg", recipe);
//
//            //WHEN
//            Recipe actualRecipe = cookbook.find("pizza");
//
//            //THEN
//            Assertions.assertThat(actualRecipe).isNull();;
//        }
//    }
//
//    @Nested
//    @DisplayName("delete a recipe")
//    public class DeleteRecipe {
//        @Test
//        void givenARecipeOfTheSameName_willRemoveThatRecipe() {
//            //GIVEN
//            Recipe recipe = new Recipe("Put the egg in boiling water for 5 minutes.");
//            cookbook.save("boiled egg", recipe);
//
//            //WHEN
//            cookbook.delete("boiled egg");
//
//            //THEN
//            Recipe actualRecipe = cookbook.find("boiled egg");
//            Assertions.assertThat(actualRecipe).isNull();;
//        }
//
//        @Test
//        void givenNoRecipeOfTheSameName_willThrowException() {
//            //GIVEN
//
//            //WHEN & THEN
//            Assertions.assertThatThrownBy(() -> cookbook.delete("pizza"))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("No recipe with name pizza exists");
//        }
//    }
//
//    @Nested
//    @DisplayName("update a recipe")
//    public class UpdateRecipe {
//        @Test
//        void givenARecipeWithSameName_willUpdateRecipe() {
//            //GIVEN
//            Recipe recipe = new Recipe("Put the egg in boiling water for 5 minutes.");
//            cookbook.save("boiled egg", recipe);
//
//            //WHEN
//            Recipe newRecipe = new Recipe("Buy a boiled egg from the shop.");
//            cookbook.update("boiled egg", newRecipe);
//
//            //THEN
//            Recipe actualRecipe = cookbook.find("boiled egg");
//            Assertions.assertThat(actualRecipe).isEqualTo(newRecipe);
//        }
//
//        @Test
//        void givenNoRecipeWithSameName_willUpdateRecipe() {
//            //GIVEN
//
//            //WHEN & THEN
//            Recipe newRecipe = new Recipe("Buy a boiled egg from the shop.");
//            Assertions.assertThatThrownBy(() -> cookbook.update("boiled egg", newRecipe))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("No recipe with name boiled egg exists");
//        }
//    }
}
