package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ResourceQuotaStatusFluentImpl<A extends V1ResourceQuotaStatusFluent<A>> extends BaseFluent<A> implements V1ResourceQuotaStatusFluent<A>{
  public V1ResourceQuotaStatusFluentImpl() {
  }
  public V1ResourceQuotaStatusFluentImpl(V1ResourceQuotaStatus instance) {
    this.withHard(instance.getHard());

    this.withUsed(instance.getUsed());

  }
  private Map<String,Quantity> hard;
  private Map<String,Quantity> used;
  public A addToHard(String key,Quantity value) {
    if(this.hard == null && key != null && value != null) { this.hard = new LinkedHashMap(); }
    if(key != null && value != null) {this.hard.put(key, value);} return (A)this;
  }
  public A addToHard(Map<String,Quantity> map) {
    if(this.hard == null && map != null) { this.hard = new LinkedHashMap(); }
    if(map != null) { this.hard.putAll(map);} return (A)this;
  }
  public A removeFromHard(String key) {
    if(this.hard == null) { return (A) this; }
    if(key != null && this.hard != null) {this.hard.remove(key);} return (A)this;
  }
  public A removeFromHard(Map<String,Quantity> map) {
    if(this.hard == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.hard != null){this.hard.remove(key);}}} return (A)this;
  }
  public Map<String,Quantity> getHard() {
    return this.hard;
  }
  public <K,V>A withHard(Map<String,Quantity> hard) {
    if (hard == null) { this.hard =  null;} else {this.hard = new LinkedHashMap(hard);} return (A) this;
  }
  public Boolean hasHard() {
    return this.hard != null;
  }
  public A addToUsed(String key,Quantity value) {
    if(this.used == null && key != null && value != null) { this.used = new LinkedHashMap(); }
    if(key != null && value != null) {this.used.put(key, value);} return (A)this;
  }
  public A addToUsed(Map<String,Quantity> map) {
    if(this.used == null && map != null) { this.used = new LinkedHashMap(); }
    if(map != null) { this.used.putAll(map);} return (A)this;
  }
  public A removeFromUsed(String key) {
    if(this.used == null) { return (A) this; }
    if(key != null && this.used != null) {this.used.remove(key);} return (A)this;
  }
  public A removeFromUsed(Map<String,Quantity> map) {
    if(this.used == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.used != null){this.used.remove(key);}}} return (A)this;
  }
  public Map<String,Quantity> getUsed() {
    return this.used;
  }
  public <K,V>A withUsed(Map<String,Quantity> used) {
    if (used == null) { this.used =  null;} else {this.used = new LinkedHashMap(used);} return (A) this;
  }
  public Boolean hasUsed() {
    return this.used != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ResourceQuotaStatusFluentImpl that = (V1ResourceQuotaStatusFluentImpl) o;
    if (hard != null ? !hard.equals(that.hard) :that.hard != null) return false;
    if (used != null ? !used.equals(that.used) :that.used != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(hard,  used,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (hard != null && !hard.isEmpty()) { sb.append("hard:"); sb.append(hard + ","); }
    if (used != null && !used.isEmpty()) { sb.append("used:"); sb.append(used); }
    sb.append("}");
    return sb.toString();
  }
  
}