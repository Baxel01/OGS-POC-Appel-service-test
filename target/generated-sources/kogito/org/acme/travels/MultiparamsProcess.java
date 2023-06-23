package org.acme.travels;

import org.acme.travels.MultiparamsModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.StringDataType;
import org.jbpm.process.core.datatype.impl.type.IntegerDataType;

@org.springframework.stereotype.Component("multiparams")
public class MultiparamsProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.travels.MultiparamsModel> {

    public MultiparamsProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        this(app, correlations, new org.kie.kogito.handlers.HelloService_hello_2_Handler());
    }

    @org.springframework.beans.factory.annotation.Autowired()
    public MultiparamsProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.handlers.HelloService_hello_2_Handler helloService_hello_2_Handler) {
        super(app, java.util.Arrays.asList(helloService_hello_2_Handler), correlations);
        activate();
    }

    public MultiparamsProcess() {
    }

    @Override()
    public org.acme.travels.MultiparamsProcessInstance createInstance(org.acme.travels.MultiparamsModel value) {
        return new org.acme.travels.MultiparamsProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.travels.MultiparamsProcessInstance createInstance(java.lang.String businessKey, org.acme.travels.MultiparamsModel value) {
        return new org.acme.travels.MultiparamsProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.acme.travels.MultiparamsProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.acme.travels.MultiparamsModel value) {
        return new org.acme.travels.MultiparamsProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.acme.travels.MultiparamsModel createModel() {
        return new org.acme.travels.MultiparamsModel();
    }

    public org.acme.travels.MultiparamsProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.travels.MultiparamsModel) value);
    }

    public org.acme.travels.MultiparamsProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.travels.MultiparamsModel) value);
    }

    public org.acme.travels.MultiparamsProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.MultiparamsProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.travels.MultiparamsProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.MultiparamsProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("multiparams", true);
        factory.variable("name", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("age", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Integer.class), null, "customTags", null);
        factory.name("Multip Params service task");
        factory.packageName("org.acme.travels");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode1 = factory.endNode(1);
        endNode1.name("End");
        endNode1.terminate(false);
        endNode1.metaData("UniqueId", "_DC890802-5A77-47F4-BEA8-A2AA34DDD8EC");
        endNode1.metaData("x", 470);
        endNode1.metaData("width", 56);
        endNode1.metaData("y", 100);
        endNode1.metaData("height", 56);
        endNode1.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode2 = factory.workItemNode(2);
        workItemNode2.name("Task");
        workItemNode2.workName("org.acme.travels.services.HelloService_hello_2_Handler");
        workItemNode2.workParameter("NodeName", "Task");
        workItemNode2.workParameter("Interface", "org.acme.travels.services.HelloService");
        workItemNode2.workParameter("Operation", "hello");
        workItemNode2.workParameter("interfaceImplementationRef", "org.acme.travels.services.HelloService");
        workItemNode2.workParameter("operationImplementationRef", "hello");
        workItemNode2.workParameter("implementation", "Java");
        workItemNode2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("name", "name", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_750337AF-3A39-4B58-9CA6-947FCE6E61DB_nameInputX", "name", "String", null), null, null));
        workItemNode2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("age", "age", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_750337AF-3A39-4B58-9CA6-947FCE6E61DB_ageInputX", "age", "Integer", null), null, null));
        workItemNode2.done();
        workItemNode2.metaData("UniqueId", "_750337AF-3A39-4B58-9CA6-947FCE6E61DB");
        workItemNode2.metaData("Implementation", "Java");
        workItemNode2.metaData("elementname", "Task");
        workItemNode2.metaData("Type", "Service Task");
        workItemNode2.metaData("OperationRef", "_750337AF-3A39-4B58-9CA6-947FCE6E61DB_ServiceOperation");
        workItemNode2.metaData("x", 236);
        workItemNode2.metaData("width", 154);
        workItemNode2.metaData("y", 77);
        workItemNode2.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode3 = factory.startNode(3);
        startNode3.name("Start");
        startNode3.interrupting(false);
        startNode3.metaData("UniqueId", "_08E6A86F-0A12-49EE-AB48-E972FEB9D989");
        startNode3.metaData("x", 100);
        startNode3.metaData("width", 56);
        startNode3.metaData("y", 100);
        startNode3.metaData("height", 56);
        startNode3.done();
        factory.connection(2, 1, "_E3E3A65A-475F-4CEA-A036-CCC8E76157F5");
        factory.connection(3, 2, "_6B02D1C2-1814-4F49-9669-4BBB023E704B");
        factory.validate();
        return factory.getProcess();
    }
}
