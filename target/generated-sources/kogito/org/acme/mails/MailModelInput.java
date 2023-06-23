/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.mails;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;
import org.kie.kogito.ProcessInput;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "mail", name = "Mail", hidden = true)
@ProcessInput(processName = "mail")
public class MailModelInput implements Model, MapInput, MapInputId, MapOutput, MappableToModel<MailModel> {

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "recipient")
    @javax.validation.Valid()
    private java.lang.String recipient;

    public java.lang.String getRecipient() {
        return recipient;
    }

    public void setRecipient(java.lang.String recipient) {
        this.recipient = recipient;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "message")
    @javax.validation.Valid()
    private java.lang.String message;

    public java.lang.String getMessage() {
        return message;
    }

    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    @Override()
    public MailModel toModel() {
        MailModel result = new MailModel();
        result.setRecipient(getRecipient());
        result.setMessage(getMessage());
        return result;
    }
}
