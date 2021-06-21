package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ISCSIPersistentVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource,io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ISCSIPersistentVolumeSourceBuilder() {
        this(true);
    }

    public V1ISCSIPersistentVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ISCSIPersistentVolumeSource(), validationEnabled);
    }

    public V1ISCSIPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ISCSIPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ISCSIPersistentVolumeSource(), validationEnabled);
    }

    public V1ISCSIPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1ISCSIPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withChapAuthDiscovery(instance.getChapAuthDiscovery());
        
        fluent.withChapAuthSession(instance.getChapAuthSession());
        
        fluent.withFsType(instance.getFsType());
        
        fluent.withInitiatorName(instance.getInitiatorName());
        
        fluent.withIqn(instance.getIqn());
        
        fluent.withIscsiInterface(instance.getIscsiInterface());
        
        fluent.withLun(instance.getLun());
        
        fluent.withPortals(instance.getPortals());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        fluent.withSecretRef(instance.getSecretRef());
        
        fluent.withTargetPortal(instance.getTargetPortal());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ISCSIPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource instance) {
        this(instance,true);
    }

    public V1ISCSIPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withChapAuthDiscovery(instance.getChapAuthDiscovery());
        
        this.withChapAuthSession(instance.getChapAuthSession());
        
        this.withFsType(instance.getFsType());
        
        this.withInitiatorName(instance.getInitiatorName());
        
        this.withIqn(instance.getIqn());
        
        this.withIscsiInterface(instance.getIscsiInterface());
        
        this.withLun(instance.getLun());
        
        this.withPortals(instance.getPortals());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.withSecretRef(instance.getSecretRef());
        
        this.withTargetPortal(instance.getTargetPortal());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource build() {
        V1ISCSIPersistentVolumeSource buildable = new V1ISCSIPersistentVolumeSource();
        buildable.setChapAuthDiscovery(fluent.getChapAuthDiscovery());
        buildable.setChapAuthSession(fluent.getChapAuthSession());
        buildable.setFsType(fluent.getFsType());
        buildable.setInitiatorName(fluent.getInitiatorName());
        buildable.setIqn(fluent.getIqn());
        buildable.setIscsiInterface(fluent.getIscsiInterface());
        buildable.setLun(fluent.getLun());
        buildable.setPortals(fluent.getPortals());
        buildable.setReadOnly(fluent.getReadOnly());
        buildable.setSecretRef(fluent.getSecretRef());
        buildable.setTargetPortal(fluent.getTargetPortal());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ISCSIPersistentVolumeSourceBuilder that = (V1ISCSIPersistentVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
