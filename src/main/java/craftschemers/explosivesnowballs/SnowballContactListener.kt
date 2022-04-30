package craftschemers.explosivesnowballs

import org.bukkit.entity.Snowball
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.ProjectileHitEvent

class SnowballContactListener : Listener {

    @EventHandler
    fun onProjectileHitEvent(event: ProjectileHitEvent) {
        if (event.entity is Snowball) {
            val snowball = event.entity
            val world = snowball.world
            world.createExplosion(snowball.location, 4f);
        }
    }

}