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
package org.acme.travels;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;
import org.kie.kogito.ProcessInput;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "travellers", name = "Travellers", hidden = true)
@ProcessInput(processName = "travellers")
public class TravellersModelInput implements Model, MapInput, MapInputId, MapOutput, MappableToModel<TravellersModel> {

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "stored")
    @javax.validation.Valid()
    private java.lang.Boolean stored;

    public java.lang.Boolean getStored() {
        return stored;
    }

    public void setStored(java.lang.Boolean stored) {
        this.stored = stored;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "traveller")
    @javax.validation.Valid()
    private org.acme.travels.springboot.Traveller traveller;

    public org.acme.travels.springboot.Traveller getTraveller() {
        return traveller;
    }

    public void setTraveller(org.acme.travels.springboot.Traveller traveller) {
        this.traveller = traveller;
    }

    @Override()
    public TravellersModel toModel() {
        TravellersModel result = new TravellersModel();
        result.setStored(getStored());
        result.setTraveller(getTraveller());
        return result;
    }
}
