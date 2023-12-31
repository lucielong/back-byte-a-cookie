INSERT INTO client (id, name, email, profile_picture_id, password)
VALUES (1, 'John Doe', 'john.doe@example.com', NULL, 'mdp1'),
       (2, 'Jane Smith', 'jane.smith@example.com', NULL, 'mdp2'),
       (3, 'Takima', 'takima@takima.fr', NULL, 'mdp3');



INSERT INTO recipe (id, name, image_id, description, difficulty, time, client_id, date, ingredients)
VALUES (1, 'cookie', NULL,
        'Preheat the oven to 350°F (175°C), In a mixing bowl combine melted chocolate flour and sugar, Form the dough into small balls and place them on a baking sheet, Bake for 10-12 minutes until lightly browned',
        'EASY', 20, 1, CURRENT_TIMESTAMP, '100 grams of Chocolate,150 grams of Flour,100 grams of Sugar'),
       (2, 'brownie', NULL,
        'Preheat the oven to 325°F (165°C), Melt chocolate and butter in a saucepan,  Beat eggs and sugar in a separate bowl, Combine the chocolate mixture with the eggs, Stir in flour and nuts, Pour into a baking dish and bake for 30-35 minutes',
        'HARD', 35, 1, CURRENT_TIMESTAMP,
        '200 grams of Chocolate,150 grams of Butter,200 grams of Sugar,100 grams of Nuts'),
       (3, 'cinnamon Roll', NULL,
        'Prepare the dough by mixing flour yeast sugar and milk, Roll out the dough and  spread butter and cinnamon sugar over it,  Roll the dough into a log and cut into slices,  Place the slices in a baking pan and bake for 25-30 minutes',
        'MEDIUM', 45, 1, CURRENT_TIMESTAMP,
        '300 grams of Flour,50 grams of Yeast,100 grams of Sugar,100 ml of Milk,50 grams of Butter,50 grams of Cinnamon'),
       (4, 'flan', NULL,
        'Preheat the oven to 350°F (175°C), In a saucepan heat milk until hot but not boiling, Whisk eggs and sugar in a bowl, Gradually add hot milk to the egg mixture stirring constantly, Pour into ramekins and bake for 40-45 minutes in a water bath',
        'EASY', 60, 1, CURRENT_TIMESTAMP, '200 grams of Sugar,500 ml of Milk,4 pieces of Eggs'),
       (5, 'macaron', NULL,
        'Preheat the oven to 300°F (150°C), Beat egg whites and sugar until stiff peaks form, Fold in almond flour and mix until smooth, Pipe the mixture onto a baking sheet and bake for 15-18 minutes, Sandwich with filling',
        'HARD', 45, 1, CURRENT_TIMESTAMP, '150 grams of Almond flour,200 grams of Sugar,4 pieces of Egg whites'),
       (6, 'fondant', NULL,
        'Preheat the oven to 350°F (175°C), Melt chocolate and butter in a bowl, Beat eggs and sugar in another bowl, Combine the chocolate mixture with the eggs, Stir in flour, Pour into a baking dish and bake for 25-30 minutes',
        'EASY', 50, 1, CURRENT_TIMESTAMP,
        '300 grams of Chocolate, 150 grams of Butter,200 grams of Sugar,100 grams of Flour'),
       (7, 'marbré', NULL,
        'Preheat the oven to 350°F (175°C), Prepare two batters one vanilla and one chocolate, Alternate pouring the batters into a cake pan,  Use a knife to create a marbled effect,  Bake for 45-50 minutes',
        'EASY', 105, 1, CURRENT_TIMESTAMP,
        '250 grams of Flour,200 grams of Butter,150 grams of Sugar,100 grams of Chocolate'),
       (8, 'eclair', NULL,
        'Preheat the oven to 400°F (200°C), Bring water and butter to a boil, Stir in flour until the mixture forms a ball, Beat in eggs one at a time, Pipe the dough onto a baking sheet and bake for 25-30 minutes, Fill with pastry cream',
        'HARD', 120, 1, CURRENT_TIMESTAMP, '300 grams of Flour,250 grams of Butter,5 pieces of Eggs'),
       (9, 'madeleine', NULL,
        'Preheat the oven to 375°F (190°C), Beat eggs and sugar until fluffy, Fold in flour and melted butter, Spoon the batter into madeleine molds and bake for 10-12 minutes until golden',
        'HARD', 135, 1, CURRENT_TIMESTAMP, '200 grams of Flour,150 grams of Butter,150 grams of Sugar,3 pieces of Eggs'),
       (10, 'blondie', NULL,
        'Preheat the oven to 350°F (175°C), Melt white chocolate and butter in a saucepan, Beat eggs and sugar in a separate bowl, Combine the chocolate mixture with the eggs, Stir in flour and nuts,  Pour into a baking dish and bake for 30-35 minutes',
        'MEDIUM', 15, 1, CURRENT_TIMESTAMP,
        '250 grams of White Chocolate,200 grams of Butter,200 grams of Sugar,4 pieces of Eggs'),
       (11, 'financier', NULL,
        'Preheat the oven to 350°F (175°C), Brown butter in a saucepan, Mix almond flour sugar and egg whites in a bowl, Stir in melted butter, Pour into molds and bake for 20-25 minutes',
        'HARD', 20, 1, CURRENT_TIMESTAMP,
        '200 grams of Almond flour,250 grams of Butter,250 grams of Sugar,4 pieces of Egg whites'),
       (12, 'croissant', NULL,
        'Preheat the oven to 400°F (200°C), Mix yeast sugar and milk, Add flour and butter, Knead the dough and let it rise, Roll out the dough cut triangles and roll them up, Bake for 15-20 minutes',
        'EASY', 25, 1, CURRENT_TIMESTAMP, '300 grams of Flour,250 grams of Butter,100 grams of Sugar,3 pieces of Eggs'),
       (13, 'brioche', NULL,
        'Preheat the oven to 350°F (175°C), Mix flour sugar and yeast in a bowl, Add eggs and butter, Knead the dough and let it rise, Shape the dough into a loaf and bake for 30-35 minutes',
        'EASY', 15, 1, CURRENT_TIMESTAMP, '250 grams of Flour,200 grams of Butter,150 grams of Sugar,2 pieces of Eggs'),
       (14, 'shortbread', NULL,
        'Preheat the oven to 325°F (165°C), Cream butter and sugar together, Stir in flour to form a dough, Press the dough into a pan and prick with a fork, Bake for 30-35 minutes until golden brown',
        'MEDIUM', 45, 1, CURRENT_TIMESTAMP, '300 grams of Flour,200 grams of Sugar,250 grams of Butter'),
       (15, 'donuts', NULL,
        'Preheat the oil to 375°F (190°C), Mix flour sugar and milk, Add eggs and butter. Knead the dough and let it rise, Roll out the dough cut circles and fry until golden, Coat with sugar',
        'MEDIUM', 60, 1, CURRENT_TIMESTAMP, '400 grams of Flour,150 grams of Sugar,250 milliliters of Milk,3 pieces of Eggs'),
       (16, 'chouquette', NULL,
        'Preheat the oven to 400°F (200°C), Bring water butter and sugar to a boil, Remove from heat and add flour, Mix in eggs, Pipe small rounds onto a baking sheet and bake for 20-25 minutes',
        'MEDIUM', 35, 1, CURRENT_TIMESTAMP, '350 grams of Flour,200 grams of Butter,150 grams of Sugar, 4 pieces of Eggs'),
       (17, 'gaufre', NULL,
        'Preheat the waffle iron, Beat eggs and sugar until fluffy, Add flour and melted butter, Cook in the waffle iron until golden brown, Serve hot',
        'MEDIUM', 115, 1, CURRENT_TIMESTAMP, '400 grams of Flour,200 grams of Sugar,250 grams of Butter,3 pieces of Eggs'),
       (18, 'crumble', NULL,
        'Preheat the oven to 375°F (190°C), Mix flour sugar and butter to form crumbs, Spread fruit in a baking dish and cover with crumbs, Bake for 30-35 minutes until golden brown',
        'MEDIUM', 65, 1, CURRENT_TIMESTAMP,
        '300 grams of Flour,150 grams of Sugar,200 grams of Butter,500 grams of Fruit'),
       (19, 'cheesecake', NULL,
        'Preheat the oven to 325°F (165°C), Mix cream cheese and sugar until smooth, Add eggs and beat until combined, Pour the mixture into a crust and bake for 40-45 minutes, Chill before serving',
        'MEDIUM', 25, 1, CURRENT_TIMESTAMP, '500 grams of Cream cheese,200 grams of Sugar,4 pieces of Eggs'),
       (20, 'tarte', NULL,
        'Preheat the oven to 350°F (175°C), Mix flour sugar and butter to make the crust, Press the dough into a tart pan and bake for 10 minutes, Combine cream cheese sugar and eggs for the filling, Pour into the crust and bake for 40-45 minutes',
        'MEDIUM', 15, 1, CURRENT_TIMESTAMP,
        '400 grams of Flour,250 grams of Butter,200 grams of Sugar,500 grams of Cream cheese,300 grams of Fruits');

INSERT INTO comment (id, client_id, recipe_id, rating, body, date)
VALUES (1, 1, 1, 5, 'Delicious!', CURRENT_TIMESTAMP),
       (2, 2, 1, 4, 'Great recipe!', CURRENT_TIMESTAMP),
       (3, 1, 2, 5, NULL, CURRENT_TIMESTAMP);


