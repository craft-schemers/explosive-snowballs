package craftschemers.explosivesnowballs

import org.bukkit.plugin.java.JavaPlugin

class ExplosiveSnowballs : JavaPlugin() {
    override fun onEnable() {

        println("Enabled")
        server.pluginManager.registerEvents(PlayerEventListener(), this)
        server.pluginManager.registerEvents(SnowballContactListener(), this)

    }

    override fun onDisable() {

    }
}
