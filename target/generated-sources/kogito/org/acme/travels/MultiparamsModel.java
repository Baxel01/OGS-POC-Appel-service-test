/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
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

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "multiparams", name = "Multiparams", hidden = false)
public class MultiparamsModel implements org.kie.kogito.Model, MapInput, MapInputId, MapOutput, MappableToModel<MultiparamsModelOutput> {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    @javax.validation.Valid()
    private java.lang.String name;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "age")
    @javax.validation.Valid()
    private java.lang.Integer age;

    public java.lang.Integer getAge() {
        return age;
    }

    public void setAge(java.lang.Integer age) {
        this.age = age;
    }

    @Override()
    public MultiparamsModelOutput toModel() {
        MultiparamsModelOutput result = new MultiparamsModelOutput();
        result.setId(getId());
        result.setName(getName());
        result.setAge(getAge());
        return result;
    }
}
