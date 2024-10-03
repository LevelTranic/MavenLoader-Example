package one.tranic.mavenloader.example.spigot;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        try {
            new org.jooq.util.xml.jaxb.Catalog();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
