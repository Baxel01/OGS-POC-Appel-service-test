package org.acme.mails;

import org.acme.mails.MailModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@org.springframework.stereotype.Component("mail")
public class MailProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.mails.MailModel> {

    public MailProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        this(app, correlations, new org.kie.kogito.handlers.SendEmailService_send_2_Handler());
    }

    @org.springframework.beans.factory.annotation.Autowired()
    public MailProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.handlers.SendEmailService_send_2_Handler sendEmailService_send_2_Handler) {
        super(app, java.util.Arrays.asList(sendEmailService_send_2_Handler), correlations);
        activate();
    }

    public MailProcess() {
    }

    @Override()
    public org.acme.mails.MailProcessInstance createInstance(org.acme.mails.MailModel value) {
        return new org.acme.mails.MailProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.mails.MailProcessInstance createInstance(java.lang.String businessKey, org.acme.mails.MailModel value) {
        return new org.acme.mails.MailProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.acme.mails.MailProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.acme.mails.MailModel value) {
        return new org.acme.mails.MailProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.acme.mails.MailModel createModel() {
        return new org.acme.mails.MailModel();
    }

    public org.acme.mails.MailProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.mails.MailModel) value);
    }

    public org.acme.mails.MailProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.mails.MailModel) value);
    }

    public org.acme.mails.MailProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.mails.MailProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.mails.MailProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.mails.MailProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("mail", true);
        factory.variable("recipient", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("message", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.name("mail");
        factory.packageName("org.acme.mails");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode1 = factory.endNode(1);
        endNode1.name("End");
        endNode1.terminate(false);
        endNode1.metaData("UniqueId", "_BF8F09D3-1A71-4FFB-9CB7-FAE1FCEF8C49");
        endNode1.metaData("x", 711);
        endNode1.metaData("width", 56);
        endNode1.metaData("y", 222);
        endNode1.metaData("height", 56);
        endNode1.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode2 = factory.workItemNode(2);
        workItemNode2.name("Send email");
        workItemNode2.workName("org.acme.mails.services.SendEmailService_send_2_Handler");
        workItemNode2.workParameter("NodeName", "Send email");
        workItemNode2.workParameter("Interface", "org.acme.mails.services.SendEmailService");
        workItemNode2.workParameter("Operation", "send");
        workItemNode2.workParameter("interfaceImplementationRef", "org.acme.mails.services.SendEmailService");
        workItemNode2.workParameter("operationImplementationRef", "send");
        workItemNode2.workParameter("implementation", "Java");
        workItemNode2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("recipient", "recipient", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_7B613191-5F43-47C7-B337-BA9C46D57AB2_recipientInputX", "recipient", "String", null), null, null));
        workItemNode2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("message", "message", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_7B613191-5F43-47C7-B337-BA9C46D57AB2_messageInputX", "message", "String", null), null, null));
        workItemNode2.done();
        workItemNode2.metaData("UniqueId", "_7B613191-5F43-47C7-B337-BA9C46D57AB2");
        workItemNode2.metaData("Implementation", "Java");
        workItemNode2.metaData("elementname", "Send email");
        workItemNode2.metaData("Type", "Service Task");
        workItemNode2.metaData("OperationRef", "_7B613191-5F43-47C7-B337-BA9C46D57AB2_ServiceOperation");
        workItemNode2.metaData("x", 443);
        workItemNode2.metaData("width", 154);
        workItemNode2.metaData("y", 199);
        workItemNode2.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode3 = factory.startNode(3);
        startNode3.name("Start");
        startNode3.interrupting(false);
        startNode3.metaData("UniqueId", "_D5D5A6CD-D3D4-490C-AB20-1F538D1DCF88");
        startNode3.metaData("x", 272);
        startNode3.metaData("width", 56);
        startNode3.metaData("y", 222);
        startNode3.metaData("height", 56);
        startNode3.done();
        factory.connection(2, 1, "_578B9F6E-C6E5-422C-95F9-52A2D10F3BF2");
        factory.connection(3, 2, "_28359338-2ADE-4952-9CFB-3E7EF8A4677B");
        factory.validate();
        return factory.getProcess();
    }
}
