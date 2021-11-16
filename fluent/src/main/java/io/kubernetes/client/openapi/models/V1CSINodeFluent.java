package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CSINodeFluent<A extends io.kubernetes.client.openapi.models.V1CSINodeFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public java.lang.Boolean hasApiVersion();
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0);
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
  public java.lang.Boolean hasMetadata();
  public io.kubernetes.client.openapi.models.V1CSINodeFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1CSINodeFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1CSINodeFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1CSINodeFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1CSINodeFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CSINodeSpec getSpec();
  public io.kubernetes.client.openapi.models.V1CSINodeSpec buildSpec();
  public A withSpec(io.kubernetes.client.openapi.models.V1CSINodeSpec spec);
  public java.lang.Boolean hasSpec();
  public io.kubernetes.client.openapi.models.V1CSINodeFluent.SpecNested<A> withNewSpec();
  public io.kubernetes.client.openapi.models.V1CSINodeFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1CSINodeSpec item);
  public io.kubernetes.client.openapi.models.V1CSINodeFluent.SpecNested<A> editSpec();
  public io.kubernetes.client.openapi.models.V1CSINodeFluent.SpecNested<A> editOrNewSpec();
  public io.kubernetes.client.openapi.models.V1CSINodeFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1CSINodeSpec item);
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1CSINodeFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1CSINodeSpecFluent<io.kubernetes.client.openapi.models.V1CSINodeFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  
}