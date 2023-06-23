package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@org.springframework.stereotype.Component()
public class StoreTravellerService_storeTraveller_2_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.acme.travels.services.StoreTravellerService service;

    public StoreTravellerService_storeTraveller_2_Handler() {
        this(new org.acme.travels.services.StoreTravellerService());
    }

    @org.springframework.beans.factory.annotation.Autowired(required = false)
    @org.springframework.context.annotation.Lazy()
    public StoreTravellerService_storeTraveller_2_Handler(org.acme.travels.services.StoreTravellerService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.storeTraveller((org.acme.travels.springboot.Traveller) workItem.getParameter("Parameter"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("Result", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.acme.travels.services.StoreTravellerService_storeTraveller_2_Handler";
    }
}
