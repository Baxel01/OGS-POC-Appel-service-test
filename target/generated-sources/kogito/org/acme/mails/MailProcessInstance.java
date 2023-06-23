package org.acme.mails;

import org.acme.mails.MailModel;

public class MailProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<MailModel> {

    public MailProcessInstance(org.acme.mails.MailProcess process, MailModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public MailProcessInstance(org.acme.mails.MailProcess process, MailModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public MailProcessInstance(org.acme.mails.MailProcess process, MailModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public MailProcessInstance(org.acme.mails.MailProcess process, MailModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public MailProcessInstance(org.acme.mails.MailProcess process, MailModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(MailModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(MailModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
