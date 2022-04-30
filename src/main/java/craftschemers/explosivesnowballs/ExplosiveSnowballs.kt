package craftschemers.explosivesnowballs

import org.bukkit.plugin.java.JavaPlugin

class ExplosiveSnowballs : JavaPlugin() {
    override fun onEnable() {

        println("Enabled")
        server.pluginManager.registerEvents(PlayerEventListener(), this)

    }

    override fun onDisable() {

    }
}