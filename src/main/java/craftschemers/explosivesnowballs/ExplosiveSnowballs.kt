package craftschemers.explosivesnowballs

import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Level

class ExplosiveSnowballs : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.log(Level.INFO, "Hello, world!")
        logger.log(Level.INFO, "Another log!")
        This is a compile error!
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}