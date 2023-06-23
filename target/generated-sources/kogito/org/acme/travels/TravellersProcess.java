package org.acme.travels;

import org.acme.travels.TravellersModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.BooleanDataType;

@org.springframework.stereotype.Component("travellers")
public class TravellersProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.travels.TravellersModel> {

    public TravellersProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        this(app, correlations, new org.kie.kogito.handlers.GreetingTravellerService_greetTraveller_3_Handler(), new org.kie.kogito.handlers.TravellerAuditService_auditTraveller_7_Handler(), new org.kie.kogito.handlers.StoreTravellerService_storeTraveller_2_Handler());
    }

    @org.springframework.beans.factory.annotation.Autowired()
    public TravellersProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.handlers.GreetingTravellerService_greetTraveller_3_Handler greetingTravellerService_greetTraveller_3_Handler, org.kie.kogito.handlers.TravellerAuditService_auditTraveller_7_Handler travellerAuditService_auditTraveller_7_Handler, org.kie.kogito.handlers.StoreTravellerService_storeTraveller_2_Handler storeTravellerService_storeTraveller_2_Handler) {
        super(app, java.util.Arrays.asList(greetingTravellerService_greetTraveller_3_Handler, travellerAuditService_auditTraveller_7_Handler, storeTravellerService_storeTraveller_2_Handler), correlations);
        activate();
    }

    public TravellersProcess() {
    }

    @Override()
    public org.acme.travels.TravellersProcessInstance createInstance(org.acme.travels.TravellersModel value) {
        return new org.acme.travels.TravellersProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.travels.TravellersProcessInstance createInstance(java.lang.String businessKey, org.acme.travels.TravellersModel value) {
        return new org.acme.travels.TravellersProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.acme.travels.TravellersProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.acme.travels.TravellersModel value) {
        return new org.acme.travels.TravellersProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.acme.travels.TravellersModel createModel() {
        return new org.acme.travels.TravellersModel();
    }

    public org.acme.travels.TravellersProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.travels.TravellersModel) value);
    }

    public org.acme.travels.TravellersProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.travels.TravellersModel) value);
    }

    public org.acme.travels.TravellersProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.TravellersProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.travels.TravellersProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.TravellersProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("travellers", true);
        factory.variable("stored", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), null, "customTags", null);
        factory.variable("traveller", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.travels.springboot.Traveller.class), null, "customTags", null);
        factory.name("travellers");
        factory.packageName("org.acme.travels");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode1 = factory.endNode(1);
        endNode1.name("Done");
        endNode1.terminate(false);
        endNode1.metaData("UniqueId", "_0528A25B-7F32-4721-9B3C-86E6329EA06E");
        endNode1.metaData("elementname", "Done");
        endNode1.metaData("x", 1552);
        endNode1.metaData("width", 56);
        endNode1.metaData("y", 141);
        endNode1.metaData("height", 56);
        endNode1.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode2 = factory.workItemNode(2);
        workItemNode2.name("Store traveler");
        workItemNode2.workName("org.acme.travels.services.StoreTravellerService_storeTraveller_2_Handler");
        workItemNode2.workParameter("NodeName", "Store traveler");
        workItemNode2.workParameter("Interface", "org.acme.travels.services.StoreTravellerService");
        workItemNode2.workParameter("Operation", "storeTraveller");
        workItemNode2.workParameter("interfaceImplementationRef", "org.acme.travels.services.StoreTravellerService");
        workItemNode2.workParameter("operationImplementationRef", "storeTraveller");
        workItemNode2.workParameter("implementation", "Java");
        workItemNode2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("traveller", "traveller", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A8ABE78D-A12A-4E34-B8F4-1045A00FF60A_ParameterInputX", "Parameter", "org.acme.travels.springboot.Traveller", null), null, null));
        workItemNode2.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_A8ABE78D-A12A-4E34-B8F4-1045A00FF60A_ResultOutputX", "Result", "java.lang.Boolean", null)), new org.jbpm.workflow.core.impl.DataDefinition("stored", "stored", "java.lang.Object", null), null, null));
        workItemNode2.done();
        workItemNode2.metaData("UniqueId", "_A8ABE78D-A12A-4E34-B8F4-1045A00FF60A");
        workItemNode2.metaData("Implementation", "Java");
        workItemNode2.metaData("elementname", "Store traveler");
        workItemNode2.metaData("Type", "Service Task");
        workItemNode2.metaData("OperationRef", "_A8ABE78D-A12A-4E34-B8F4-1045A00FF60A_ServiceOperation");
        workItemNode2.metaData("x", 526);
        workItemNode2.metaData("width", 154);
        workItemNode2.metaData("y", 118);
        workItemNode2.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode3 = factory.workItemNode(3);
        workItemNode3.name("Greet new traveler");
        workItemNode3.workName("org.acme.travels.services.GreetingTravellerService_greetTraveller_3_Handler");
        workItemNode3.workParameter("NodeName", "Greet new traveler");
        workItemNode3.workParameter("Interface", "org.acme.travels.services.GreetingTravellerService");
        workItemNode3.workParameter("Operation", "greetTraveller");
        workItemNode3.workParameter("interfaceImplementationRef", "org.acme.travels.services.GreetingTravellerService");
        workItemNode3.workParameter("operationImplementationRef", "greetTraveller");
        workItemNode3.workParameter("implementation", "Java");
        workItemNode3.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("traveller", "traveller", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_8750BBC2-DF5F-414C-8B36-FEB4726ACABF_ParameterInputX", "Parameter", "org.acme.travels.springboot.Traveller", null), null, null));
        workItemNode3.done();
        workItemNode3.metaData("UniqueId", "_8750BBC2-DF5F-414C-8B36-FEB4726ACABF");
        workItemNode3.metaData("Implementation", "Java");
        workItemNode3.metaData("elementname", "Greet new traveler");
        workItemNode3.metaData("Type", "Service Task");
        workItemNode3.metaData("OperationRef", "_8750BBC2-DF5F-414C-8B36-FEB4726ACABF_ServiceOperation");
        workItemNode3.metaData("x", 948);
        workItemNode3.metaData("width", 154);
        workItemNode3.metaData("y", 118);
        workItemNode3.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode4 = factory.startNode(4);
        startNode4.name("Start Event");
        startNode4.interrupting(true);
        startNode4.metaData("UniqueId", "_4D347C24-28B2-43D6-98B6-A0BEFACD0586");
        startNode4.metaData("elementname", "Start Event");
        startNode4.metaData("x", 390);
        startNode4.metaData("width", 56);
        startNode4.metaData("y", 141);
        startNode4.metaData("height", 56);
        startNode4.done();
        org.jbpm.ruleflow.core.factory.JoinFactory<?> joinNode5 = factory.joinNode(5);
        joinNode5.name("Join");
        joinNode5.type(2);
        joinNode5.metaData("UniqueId", "_83E4F4F7-AE13-430C-A7F6-4423726D3A30");
        joinNode5.metaData("x", 1182);
        joinNode5.metaData("width", 56);
        joinNode5.metaData("y", 141);
        joinNode5.metaData("height", 56);
        joinNode5.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode6 = factory.splitNode(6);
        splitNode6.name("Stored Traveler?");
        splitNode6.type(2);
        splitNode6.metaData("UniqueId", "_A48937D1-3A43-4674-B7C5-86F565A6A115");
        splitNode6.metaData("elementname", "Stored Traveler?");
        splitNode6.metaData("x", 760);
        splitNode6.metaData("width", 56);
        splitNode6.metaData("y", 141);
        splitNode6.metaData("Default", null);
        splitNode6.metaData("height", 56);
        splitNode6.constraint(3, "_C4DA86D6-A1B9-4F31-B085-5C72E055C9B5", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean stored = (java.lang.Boolean) kcontext.getVariable("stored");
            org.acme.travels.springboot.Traveller traveller = (org.acme.travels.springboot.Traveller) kcontext.getVariable("traveller");
            return stored;
        }, 0, false);
        splitNode6.constraint(5, "_8673F498-8EB5-4F1A-92B1-E6FD3B6267BB", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean stored = (java.lang.Boolean) kcontext.getVariable("stored");
            org.acme.travels.springboot.Traveller traveller = (org.acme.travels.springboot.Traveller) kcontext.getVariable("traveller");
            return !stored;
        }, 0, false);
        splitNode6.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode7 = factory.workItemNode(7);
        workItemNode7.name("Audit Traveler");
        workItemNode7.workName("org.acme.travels.services.TravellerAuditService_auditTraveller_7_Handler");
        workItemNode7.workParameter("NodeName", "Audit Traveler");
        workItemNode7.workParameter("Interface", "org.acme.travels.services.TravellerAuditService");
        workItemNode7.workParameter("Operation", "auditTraveller");
        workItemNode7.workParameter("interfaceImplementationRef", "org.acme.travels.services.TravellerAuditService");
        workItemNode7.workParameter("operationImplementationRef", "auditTraveller");
        workItemNode7.workParameter("implementation", "Java");
        workItemNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("traveller", "traveller", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_7BDFC996-E0DA-4AFA-8DCE-A3A716E13E7D_ParameterInputX", "Parameter", "org.acme.travels.springboot.Traveller", null), null, null));
        workItemNode7.done();
        workItemNode7.metaData("UniqueId", "_7BDFC996-E0DA-4AFA-8DCE-A3A716E13E7D");
        workItemNode7.metaData("Implementation", "Java");
        workItemNode7.metaData("elementname", "Audit Traveler");
        workItemNode7.metaData("Type", "Service Task");
        workItemNode7.metaData("OperationRef", "_7BDFC996-E0DA-4AFA-8DCE-A3A716E13E7D_ServiceOperation");
        workItemNode7.metaData("x", 1318);
        workItemNode7.metaData("width", 154);
        workItemNode7.metaData("y", 118);
        workItemNode7.metaData("height", 102);
        factory.connection(7, 1, "_4086415A-0DF6-4312-839E-92463D63DFD6");
        factory.connection(4, 2, "_35A951D5-30A9-4FD9-90C0-6161FF57A0BB");
        factory.connection(6, 3, "_C4DA86D6-A1B9-4F31-B085-5C72E055C9B5");
        factory.connection(3, 5, "_A9687AE7-FFC3-4EDB-8ADF-402C1CE1D624");
        factory.connection(6, 5, "_8673F498-8EB5-4F1A-92B1-E6FD3B6267BB");
        factory.connection(2, 6, "_B4E6F084-202B-456E-B33C-B4C6F9B59437");
        factory.connection(5, 7, "_CF9AA353-E42F-429B-8AC0-652761C9566C");
        factory.validate();
        return factory.getProcess();
    }
}
