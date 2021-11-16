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
public interface V1ScaleFluent<A extends io.kubernetes.client.openapi.models.V1ScaleFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
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
  public io.kubernetes.client.openapi.models.V1ScaleFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1ScaleFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1ScaleFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1ScaleFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1ScaleFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ScaleSpec getSpec();
  public io.kubernetes.client.openapi.models.V1ScaleSpec buildSpec();
  public A withSpec(io.kubernetes.client.openapi.models.V1ScaleSpec spec);
  public java.lang.Boolean hasSpec();
  public io.kubernetes.client.openapi.models.V1ScaleFluent.SpecNested<A> withNewSpec();
  public io.kubernetes.client.openapi.models.V1ScaleFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1ScaleSpec item);
  public io.kubernetes.client.openapi.models.V1ScaleFluent.SpecNested<A> editSpec();
  public io.kubernetes.client.openapi.models.V1ScaleFluent.SpecNested<A> editOrNewSpec();
  public io.kubernetes.client.openapi.models.V1ScaleFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1ScaleSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ScaleStatus getStatus();
  public io.kubernetes.client.openapi.models.V1ScaleStatus buildStatus();
  public A withStatus(io.kubernetes.client.openapi.models.V1ScaleStatus status);
  public java.lang.Boolean hasStatus();
  public io.kubernetes.client.openapi.models.V1ScaleFluent.StatusNested<A> withNewStatus();
  public io.kubernetes.client.openapi.models.V1ScaleFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V1ScaleStatus item);
  public io.kubernetes.client.openapi.models.V1ScaleFluent.StatusNested<A> editStatus();
  public io.kubernetes.client.openapi.models.V1ScaleFluent.StatusNested<A> editOrNewStatus();
  public io.kubernetes.client.openapi.models.V1ScaleFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V1ScaleStatus item);
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1ScaleFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ScaleSpecFluent<io.kubernetes.client.openapi.models.V1ScaleFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ScaleStatusFluent<io.kubernetes.client.openapi.models.V1ScaleFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}