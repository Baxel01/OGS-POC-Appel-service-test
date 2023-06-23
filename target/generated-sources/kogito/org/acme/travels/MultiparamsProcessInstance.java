package org.acme.travels;

import org.acme.travels.MultiparamsModel;

public class MultiparamsProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<MultiparamsModel> {

    public MultiparamsProcessInstance(org.acme.travels.MultiparamsProcess process, MultiparamsModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public MultiparamsProcessInstance(org.acme.travels.MultiparamsProcess process, MultiparamsModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public MultiparamsProcessInstance(org.acme.travels.MultiparamsProcess process, MultiparamsModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public MultiparamsProcessInstance(org.acme.travels.MultiparamsProcess process, MultiparamsModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public MultiparamsProcessInstance(org.acme.travels.MultiparamsProcess process, MultiparamsModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(MultiparamsModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(MultiparamsModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
