package one.tranic.mavenloader.example.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Dependency;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(id = "maven-loader-example", name = "MavenLoaderExample", version = BuildConstants.VERSION, url = "https://tranic.one", authors = {"404"}, dependencies = {@Dependency(id = "maven-loader")})
public class Main {

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        try {
            new org.jooq.util.xml.jaxb.Catalog();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
