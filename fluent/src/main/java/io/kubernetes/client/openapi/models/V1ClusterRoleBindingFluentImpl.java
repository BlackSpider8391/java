/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ClusterRoleBindingFluentImpl<A extends V1ClusterRoleBindingFluent<A>>
    extends BaseFluent<A> implements V1ClusterRoleBindingFluent<A> {
  public V1ClusterRoleBindingFluentImpl() {}

  public V1ClusterRoleBindingFluentImpl(
      io.kubernetes.client.openapi.models.V1ClusterRoleBinding instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withRoleRef(instance.getRoleRef());

    this.withSubjects(instance.getSubjects());
  }

  private String apiVersion;
  private java.lang.String kind;
  private V1ObjectMetaBuilder metadata;
  private V1RoleRefBuilder roleRef;
  private ArrayList<V1SubjectBuilder> subjects;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }

  public V1ClusterRoleBindingFluent.MetadataNested<A> withNewMetadata() {
    return new V1ClusterRoleBindingFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new V1ClusterRoleBindingFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.MetadataNested<A>
      editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  /**
   * This method has been deprecated, please use method buildRoleRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1RoleRef getRoleRef() {
    return this.roleRef != null ? this.roleRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1RoleRef buildRoleRef() {
    return this.roleRef != null ? this.roleRef.build() : null;
  }

  public A withRoleRef(io.kubernetes.client.openapi.models.V1RoleRef roleRef) {
    _visitables.get("roleRef").remove(this.roleRef);
    if (roleRef != null) {
      this.roleRef = new V1RoleRefBuilder(roleRef);
      _visitables.get("roleRef").add(this.roleRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasRoleRef() {
    return this.roleRef != null;
  }

  public V1ClusterRoleBindingFluent.RoleRefNested<A> withNewRoleRef() {
    return new V1ClusterRoleBindingFluentImpl.RoleRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.RoleRefNested<A>
      withNewRoleRefLike(io.kubernetes.client.openapi.models.V1RoleRef item) {
    return new io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluentImpl.RoleRefNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.RoleRefNested<A>
      editRoleRef() {
    return withNewRoleRefLike(getRoleRef());
  }

  public io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.RoleRefNested<A>
      editOrNewRoleRef() {
    return withNewRoleRefLike(
        getRoleRef() != null
            ? getRoleRef()
            : new io.kubernetes.client.openapi.models.V1RoleRefBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.RoleRefNested<A>
      editOrNewRoleRefLike(io.kubernetes.client.openapi.models.V1RoleRef item) {
    return withNewRoleRefLike(getRoleRef() != null ? getRoleRef() : item);
  }

  public A addToSubjects(Integer index, io.kubernetes.client.openapi.models.V1Subject item) {
    if (this.subjects == null) {
      this.subjects = new java.util.ArrayList<V1SubjectBuilder>();
    }
    io.kubernetes.client.openapi.models.V1SubjectBuilder builder =
        new io.kubernetes.client.openapi.models.V1SubjectBuilder(item);
    _visitables
        .get("subjects")
        .add(index >= 0 ? index : _visitables.get("subjects").size(), builder);
    this.subjects.add(index >= 0 ? index : subjects.size(), builder);
    return (A) this;
  }

  public A setToSubjects(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Subject item) {
    if (this.subjects == null) {
      this.subjects =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1SubjectBuilder>();
    }
    io.kubernetes.client.openapi.models.V1SubjectBuilder builder =
        new io.kubernetes.client.openapi.models.V1SubjectBuilder(item);
    if (index < 0 || index >= _visitables.get("subjects").size()) {
      _visitables.get("subjects").add(builder);
    } else {
      _visitables.get("subjects").set(index, builder);
    }
    if (index < 0 || index >= subjects.size()) {
      subjects.add(builder);
    } else {
      subjects.set(index, builder);
    }
    return (A) this;
  }

  public A addToSubjects(io.kubernetes.client.openapi.models.V1Subject... items) {
    if (this.subjects == null) {
      this.subjects =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1SubjectBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Subject item : items) {
      io.kubernetes.client.openapi.models.V1SubjectBuilder builder =
          new io.kubernetes.client.openapi.models.V1SubjectBuilder(item);
      _visitables.get("subjects").add(builder);
      this.subjects.add(builder);
    }
    return (A) this;
  }

  public A addAllToSubjects(Collection<io.kubernetes.client.openapi.models.V1Subject> items) {
    if (this.subjects == null) {
      this.subjects =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1SubjectBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Subject item : items) {
      io.kubernetes.client.openapi.models.V1SubjectBuilder builder =
          new io.kubernetes.client.openapi.models.V1SubjectBuilder(item);
      _visitables.get("subjects").add(builder);
      this.subjects.add(builder);
    }
    return (A) this;
  }

  public A removeFromSubjects(io.kubernetes.client.openapi.models.V1Subject... items) {
    for (io.kubernetes.client.openapi.models.V1Subject item : items) {
      io.kubernetes.client.openapi.models.V1SubjectBuilder builder =
          new io.kubernetes.client.openapi.models.V1SubjectBuilder(item);
      _visitables.get("subjects").remove(builder);
      if (this.subjects != null) {
        this.subjects.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromSubjects(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Subject> items) {
    for (io.kubernetes.client.openapi.models.V1Subject item : items) {
      io.kubernetes.client.openapi.models.V1SubjectBuilder builder =
          new io.kubernetes.client.openapi.models.V1SubjectBuilder(item);
      _visitables.get("subjects").remove(builder);
      if (this.subjects != null) {
        this.subjects.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromSubjects(
      Predicate<io.kubernetes.client.openapi.models.V1SubjectBuilder> predicate) {
    if (subjects == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1SubjectBuilder> each = subjects.iterator();
    final List visitables = _visitables.get("subjects");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1SubjectBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildSubjects instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public List<io.kubernetes.client.openapi.models.V1Subject> getSubjects() {
    return subjects != null ? build(subjects) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1Subject> buildSubjects() {
    return subjects != null ? build(subjects) : null;
  }

  public io.kubernetes.client.openapi.models.V1Subject buildSubject(java.lang.Integer index) {
    return this.subjects.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1Subject buildFirstSubject() {
    return this.subjects.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1Subject buildLastSubject() {
    return this.subjects.get(subjects.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1Subject buildMatchingSubject(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SubjectBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1SubjectBuilder item : subjects) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingSubject(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SubjectBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1SubjectBuilder item : subjects) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withSubjects(java.util.List<io.kubernetes.client.openapi.models.V1Subject> subjects) {
    if (this.subjects != null) {
      _visitables.get("subjects").removeAll(this.subjects);
    }
    if (subjects != null) {
      this.subjects = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1Subject item : subjects) {
        this.addToSubjects(item);
      }
    } else {
      this.subjects = null;
    }
    return (A) this;
  }

  public A withSubjects(io.kubernetes.client.openapi.models.V1Subject... subjects) {
    if (this.subjects != null) {
      this.subjects.clear();
    }
    if (subjects != null) {
      for (io.kubernetes.client.openapi.models.V1Subject item : subjects) {
        this.addToSubjects(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasSubjects() {
    return subjects != null && !subjects.isEmpty();
  }

  public V1ClusterRoleBindingFluent.SubjectsNested<A> addNewSubject() {
    return new V1ClusterRoleBindingFluentImpl.SubjectsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.SubjectsNested<A>
      addNewSubjectLike(io.kubernetes.client.openapi.models.V1Subject item) {
    return new io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluentImpl
        .SubjectsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.SubjectsNested<A>
      setNewSubjectLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1Subject item) {
    return new io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluentImpl
        .SubjectsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.SubjectsNested<A>
      editSubject(java.lang.Integer index) {
    if (subjects.size() <= index)
      throw new RuntimeException("Can't edit subjects. Index exceeds size.");
    return setNewSubjectLike(index, buildSubject(index));
  }

  public io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.SubjectsNested<A>
      editFirstSubject() {
    if (subjects.size() == 0)
      throw new RuntimeException("Can't edit first subjects. The list is empty.");
    return setNewSubjectLike(0, buildSubject(0));
  }

  public io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.SubjectsNested<A>
      editLastSubject() {
    int index = subjects.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last subjects. The list is empty.");
    return setNewSubjectLike(index, buildSubject(index));
  }

  public io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.SubjectsNested<A>
      editMatchingSubject(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SubjectBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < subjects.size(); i++) {
      if (predicate.test(subjects.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching subjects. No match found.");
    return setNewSubjectLike(index, buildSubject(index));
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ClusterRoleBindingFluentImpl that = (V1ClusterRoleBindingFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (roleRef != null ? !roleRef.equals(that.roleRef) : that.roleRef != null) return false;
    if (subjects != null ? !subjects.equals(that.subjects) : that.subjects != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, kind, metadata, roleRef, subjects, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (kind != null) {
      sb.append("kind:");
      sb.append(kind + ",");
    }
    if (metadata != null) {
      sb.append("metadata:");
      sb.append(metadata + ",");
    }
    if (roleRef != null) {
      sb.append("roleRef:");
      sb.append(roleRef + ",");
    }
    if (subjects != null && !subjects.isEmpty()) {
      sb.append("subjects:");
      sb.append(subjects);
    }
    sb.append("}");
    return sb.toString();
  }

  class MetadataNestedImpl<N>
      extends V1ObjectMetaFluentImpl<V1ClusterRoleBindingFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.MetadataNested<N>,
          Nested<N> {
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1ClusterRoleBindingFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  class RoleRefNestedImpl<N>
      extends V1RoleRefFluentImpl<V1ClusterRoleBindingFluent.RoleRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.RoleRefNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    RoleRefNestedImpl(io.kubernetes.client.openapi.models.V1RoleRef item) {
      this.builder = new V1RoleRefBuilder(this, item);
    }

    RoleRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1RoleRefBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1RoleRefBuilder builder;

    public N and() {
      return (N) V1ClusterRoleBindingFluentImpl.this.withRoleRef(builder.build());
    }

    public N endRoleRef() {
      return and();
    }
  }

  class SubjectsNestedImpl<N>
      extends V1SubjectFluentImpl<V1ClusterRoleBindingFluent.SubjectsNested<N>>
      implements io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent.SubjectsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SubjectsNestedImpl(java.lang.Integer index, V1Subject item) {
      this.index = index;
      this.builder = new V1SubjectBuilder(this, item);
    }

    SubjectsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1SubjectBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SubjectBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ClusterRoleBindingFluentImpl.this.setToSubjects(index, builder.build());
    }

    public N endSubject() {
      return and();
    }
  }
}
