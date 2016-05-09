package gg.gro;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.*;

public class ContainerEventDemo implements Extension {

    void beforeBeanDiscovery(@Observes BeforeBeanDiscovery event) {
        log("BeforeBeanDiscovery");
    }

    <T> void processAnnotatedType(@Observes ProcessAnnotatedType<T> event) {
        log("ProcessAnnotatedType", "scanning type: " + event.getAnnotatedType()
                                                             .getJavaClass()
                                                             .getName());
    }

    void afterTypeDiscovery(@Observes AfterTypeDiscovery event) {
        log("AfterTypeDiscovery");
    }

    void processInjectionTarget(@Observes ProcessInjectionTarget event) {
        log("ProcessInjectionTarget", event.getInjectionTarget()
                                           .toString());
    }

    void processProducer(@Observes ProcessProducer event) {
        log("ProcessProducer", event.getProducer()
                                    .toString());
    }

    void processInjectionPoint(@Observes ProcessInjectionPoint event) {
        log("ProcessInjectionPoint", event.getInjectionPoint()
                                          .toString());
    }

    void processBeanAttributes(@Observes ProcessBeanAttributes event) {
        log("ProcessBeanAttributes", event.getBeanAttributes()
                                          .toString());
    }

    void processBean(@Observes ProcessBean event) {
        log("ProcessBean", event.getBean()
                                .toString());
    }

    void processObserverMethod(@Observes ProcessObserverMethod event) {
        log("ProcessObserverMethod");
    }

    void afterBeanDiscovery(@Observes AfterBeanDiscovery event) {
        log("AfterBeanDiscovery");
    }

    void afterDeploymentValidation(@Observes AfterDeploymentValidation event) {
        log("AfterDeploymentValidation");
    }

    void log(String event) {
        log(event, null);
    }

    void log(String event, String info) {
        System.err.println("Event " + event + " fired" + (info == null ? "" : ": " + info));
    }

}
