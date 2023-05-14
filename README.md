# MineTracker-Minecraft-Spigot
A spigot plugin that announces when a player mines a block.

To download the plugin without making needing to build the plugin go to the  Builds folder and download the Minetracker.jar file but if you want to make changes from the default you will need to build the project yourself.

To change the block to be mined for the server to announce to the entire server change the line:
"Material[] blocksToAnnounce = {Material.DIAMOND_ORE, Material.EMERALD_ORE}; Change "Material.DIAMOND_ORE" to: "Material.BLOCK_NAME_IN_ALL_CAPS" or to add more materials add a comma after the last block set in the array and set it to "Material.BLOCK_NAME" wher BLOCK_NAME is the name of the block in all caps with underscores serving as spaces.
