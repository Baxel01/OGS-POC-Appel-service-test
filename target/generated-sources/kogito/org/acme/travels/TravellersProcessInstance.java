package org.acme.travels;

import org.acme.travels.TravellersModel;

public class TravellersProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<TravellersModel> {

    public TravellersProcessInstance(org.acme.travels.TravellersProcess process, TravellersModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public TravellersProcessInstance(org.acme.travels.TravellersProcess process, TravellersModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public TravellersProcessInstance(org.acme.travels.TravellersProcess process, TravellersModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public TravellersProcessInstance(org.acme.travels.TravellersProcess process, TravellersModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public TravellersProcessInstance(org.acme.travels.TravellersProcess process, TravellersModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(TravellersModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(TravellersModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
