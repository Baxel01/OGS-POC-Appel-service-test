package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@org.springframework.stereotype.Component()
public class SendEmailService_send_2_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.acme.mails.services.SendEmailService service;

    public SendEmailService_send_2_Handler() {
        this(new org.acme.mails.services.SendEmailService());
    }

    @org.springframework.beans.factory.annotation.Autowired(required = false)
    @org.springframework.context.annotation.Lazy()
    public SendEmailService_send_2_Handler(org.acme.mails.services.SendEmailService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        service.send((java.lang.String) workItem.getParameter("recipient"), (java.lang.String) workItem.getParameter("message"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.emptyMap());
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.acme.mails.services.SendEmailService_send_2_Handler";
    }
}
