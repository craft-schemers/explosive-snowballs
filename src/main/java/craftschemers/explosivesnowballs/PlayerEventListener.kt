package craftschemers.explosivesnowballs

import net.kyori.adventure.text.Component
import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.event.player.PlayerJoinEvent

class PlayerEventListener : Listener {

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        event.player.sendMessage("Explosive Snowball Plugin\nThrow an explosive snowball!")
    }

    @EventHandler
    fun onPlayerDeath(event: PlayerDeathEvent) {
        val damageCause = event.player.lastDamageCause?.cause
        val damageEntity = event.player.lastDamageCause?.entity


        if (damageCause == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION && damageEntity?.type == EntityType.SNOWBALL) {
            event.deathMessage(Component.text("${event.player.name} died by snowball"))

        }
    }


}
