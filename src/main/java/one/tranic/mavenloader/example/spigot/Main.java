package one.tranic.mavenloader.example.spigot;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        // If you choose to store maven.yml in Resources, you do not need to do it again here.
        /*try {
            MavenLibraryResolver resolver = new MavenLibraryResolver();
            resolver.addDependency("org.jooq:jooq:3.17.7");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/

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
