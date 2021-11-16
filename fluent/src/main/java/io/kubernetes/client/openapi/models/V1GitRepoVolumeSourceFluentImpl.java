package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1GitRepoVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceFluent<A>{
  public V1GitRepoVolumeSourceFluentImpl() {
  }
  public V1GitRepoVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1GitRepoVolumeSource instance) {
    this.withDirectory(instance.getDirectory());

    this.withRepository(instance.getRepository());

    this.withRevision(instance.getRevision());

  }
  private java.lang.String directory;
  private java.lang.String repository;
  private java.lang.String revision;
  public java.lang.String getDirectory() {
    return this.directory;
  }
  public A withDirectory(java.lang.String directory) {
    this.directory=directory; return (A) this;
  }
  public java.lang.Boolean hasDirectory() {
    return this.directory != null;
  }
  
  /**
   * Method is deprecated. use withDirectory instead.
   */
  @java.lang.Deprecated
  public A withNewDirectory(java.lang.String arg0) {
    return (A)withDirectory(new String(arg0));
  }
  public java.lang.String getRepository() {
    return this.repository;
  }
  public A withRepository(java.lang.String repository) {
    this.repository=repository; return (A) this;
  }
  public java.lang.Boolean hasRepository() {
    return this.repository != null;
  }
  
  /**
   * Method is deprecated. use withRepository instead.
   */
  @java.lang.Deprecated
  public A withNewRepository(java.lang.String arg0) {
    return (A)withRepository(new String(arg0));
  }
  public java.lang.String getRevision() {
    return this.revision;
  }
  public A withRevision(java.lang.String revision) {
    this.revision=revision; return (A) this;
  }
  public java.lang.Boolean hasRevision() {
    return this.revision != null;
  }
  
  /**
   * Method is deprecated. use withRevision instead.
   */
  @java.lang.Deprecated
  public A withNewRevision(java.lang.String arg0) {
    return (A)withRevision(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1GitRepoVolumeSourceFluentImpl that = (V1GitRepoVolumeSourceFluentImpl) o;
    if (directory != null ? !directory.equals(that.directory) :that.directory != null) return false;
    if (repository != null ? !repository.equals(that.repository) :that.repository != null) return false;
    if (revision != null ? !revision.equals(that.revision) :that.revision != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(directory,  repository,  revision,  super.hashCode());
  }
  
}