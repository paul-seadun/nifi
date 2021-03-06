/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.web.api.entity;

import io.swagger.annotations.ApiModelProperty;
import org.apache.nifi.web.api.dto.util.TimeAdapter;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.Set;

/**
 * A serialized representation of this class can be placed in the entity body of a request or response to or from the API. This particular entity holds a reference to a set of TemplateDTOs.
 */
@XmlRootElement(name = "templatesEntity")
public class TemplatesEntity extends Entity {

    private Set<TemplateEntity> templates;
    private Date generated;

    /**
     * The set of TemplateDTOs that is being serialized.
     *
     * @return The TemplateDTO object
     */
    public Set<TemplateEntity> getTemplates() {
        return templates;
    }

    public void setTemplates(Set<TemplateEntity> templates) {
        this.templates = templates;
    }

    /**
     * @return When this content was generated
     */
    @XmlJavaTypeAdapter(TimeAdapter.class)
    @ApiModelProperty(
            value = "When this content was generated.",
            dataType = "string"
    )
    public Date getGenerated() {
        return generated;
    }

    public void setGenerated(Date generated) {
        this.generated = generated;
    }
}
