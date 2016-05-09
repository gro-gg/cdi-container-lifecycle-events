package gg.gro;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.BeforeBeanDiscovery;
import javax.enterprise.inject.spi.Extension;

public class ContainerEventDemo implements Extension {
    void beforeBeanDiscovery(@Observes BeforeBeanDiscovery bbd) {
        System.err.println("Event BeforeBeanDiscovery fired");
    }
}
