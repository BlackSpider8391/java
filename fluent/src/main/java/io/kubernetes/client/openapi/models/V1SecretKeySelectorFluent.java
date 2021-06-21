package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1SecretKeySelectorFluent<A extends io.kubernetes.client.openapi.models.V1SecretKeySelectorFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getKey();
    public A withKey(java.lang.String key);
    public java.lang.Boolean hasKey();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKey instead.
     */
        public A withNewKey(java.lang.String original);
    public java.lang.String getName();
    public A withName(java.lang.String name);
    public java.lang.Boolean hasName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original);
    public java.lang.Boolean getOptional();
    public A withOptional(java.lang.Boolean optional);
    public java.lang.Boolean hasOptional();
}
