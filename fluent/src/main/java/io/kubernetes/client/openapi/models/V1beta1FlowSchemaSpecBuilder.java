package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1FlowSchemaSpecBuilder extends io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluentImpl<io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpec,io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecBuilder> {

    io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1FlowSchemaSpecBuilder() {
        this(true);
    }

    public V1beta1FlowSchemaSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1FlowSchemaSpec(), validationEnabled);
    }

    public V1beta1FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1FlowSchemaSpec(), validationEnabled);
    }

    public V1beta1FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpec instance) {
        this(fluent, instance, true);
    }

    public V1beta1FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withDistinguisherMethod(instance.getDistinguisherMethod());
        
        fluent.withMatchingPrecedence(instance.getMatchingPrecedence());
        
        fluent.withPriorityLevelConfiguration(instance.getPriorityLevelConfiguration());
        
        fluent.withRules(instance.getRules());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpec instance) {
        this(instance,true);
    }

    public V1beta1FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withDistinguisherMethod(instance.getDistinguisherMethod());
        
        this.withMatchingPrecedence(instance.getMatchingPrecedence());
        
        this.withPriorityLevelConfiguration(instance.getPriorityLevelConfiguration());
        
        this.withRules(instance.getRules());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpec build() {
        V1beta1FlowSchemaSpec buildable = new V1beta1FlowSchemaSpec();
        buildable.setDistinguisherMethod(fluent.getDistinguisherMethod());
        buildable.setMatchingPrecedence(fluent.getMatchingPrecedence());
        buildable.setPriorityLevelConfiguration(fluent.getPriorityLevelConfiguration());
        buildable.setRules(fluent.getRules());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1FlowSchemaSpecBuilder that = (V1beta1FlowSchemaSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
