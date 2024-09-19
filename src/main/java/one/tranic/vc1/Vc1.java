package one.tranic.vc1;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Dependency;
import com.velocitypowered.api.plugin.Plugin;
import one.tranic.mavenloader.api.MavenLibraryResolver;
import org.slf4j.Logger;

@Plugin(id = "vc1", name = "vc1", version = BuildConstants.VERSION, url = "https://tranic.one", authors = {"404"}, dependencies = {@Dependency(id = "maven-loader")})
public class Vc1 {

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        try {
            MavenLibraryResolver resolver = new MavenLibraryResolver();
            resolver.addDependency("org.jooq:jooq:3.17.7");
            new org.jooq.util.xml.jaxb.Catalog();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
