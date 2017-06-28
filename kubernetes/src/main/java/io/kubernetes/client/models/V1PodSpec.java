/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V1Affinity;
import io.kubernetes.client.models.V1Container;
import io.kubernetes.client.models.V1LocalObjectReference;
import io.kubernetes.client.models.V1PodSecurityContext;
import io.kubernetes.client.models.V1Toleration;
import io.kubernetes.client.models.V1Volume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PodSpec is a description of a pod.
 */
@ApiModel(description = "PodSpec is a description of a pod.")

public class V1PodSpec {
  @SerializedName("activeDeadlineSeconds")
  private Long activeDeadlineSeconds = null;

  @SerializedName("affinity")
  private V1Affinity affinity = null;

  @SerializedName("automountServiceAccountToken")
  private Boolean automountServiceAccountToken = null;

  @SerializedName("containers")
  private List<V1Container> containers = new ArrayList<V1Container>();

  @SerializedName("dnsPolicy")
  private String dnsPolicy = null;

  @SerializedName("hostIPC")
  private Boolean hostIPC = null;

  @SerializedName("hostNetwork")
  private Boolean hostNetwork = null;

  @SerializedName("hostPID")
  private Boolean hostPID = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("imagePullSecrets")
  private List<V1LocalObjectReference> imagePullSecrets = new ArrayList<V1LocalObjectReference>();

  @SerializedName("initContainers")
  private List<V1Container> initContainers = new ArrayList<V1Container>();

  @SerializedName("nodeName")
  private String nodeName = null;

  @SerializedName("nodeSelector")
  private Map<String, String> nodeSelector = new HashMap<String, String>();

  @SerializedName("restartPolicy")
  private String restartPolicy = null;

  @SerializedName("schedulerName")
  private String schedulerName = null;

  @SerializedName("securityContext")
  private V1PodSecurityContext securityContext = null;

  @SerializedName("serviceAccount")
  private String serviceAccount = null;

  @SerializedName("serviceAccountName")
  private String serviceAccountName = null;

  @SerializedName("subdomain")
  private String subdomain = null;

  @SerializedName("terminationGracePeriodSeconds")
  private Long terminationGracePeriodSeconds = null;

  @SerializedName("tolerations")
  private List<V1Toleration> tolerations = new ArrayList<V1Toleration>();

  @SerializedName("volumes")
  private List<V1Volume> volumes = new ArrayList<V1Volume>();

  public V1PodSpec activeDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

   /**
   * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
   * @return activeDeadlineSeconds
  **/
  @ApiModelProperty(example = "null", value = "Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.")
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  public V1PodSpec affinity(V1Affinity affinity) {
    this.affinity = affinity;
    return this;
  }

   /**
   * If specified, the pod's scheduling constraints
   * @return affinity
  **/
  @ApiModelProperty(example = "null", value = "If specified, the pod's scheduling constraints")
  public V1Affinity getAffinity() {
    return affinity;
  }

  public void setAffinity(V1Affinity affinity) {
    this.affinity = affinity;
  }

  public V1PodSpec automountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

   /**
   * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
   * @return automountServiceAccountToken
  **/
  @ApiModelProperty(example = "null", value = "AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.")
  public Boolean getAutomountServiceAccountToken() {
    return automountServiceAccountToken;
  }

  public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
  }

  public V1PodSpec containers(List<V1Container> containers) {
    this.containers = containers;
    return this;
  }

  public V1PodSpec addContainersItem(V1Container containersItem) {
    this.containers.add(containersItem);
    return this;
  }

   /**
   * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/containers
   * @return containers
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/containers")
  public List<V1Container> getContainers() {
    return containers;
  }

  public void setContainers(List<V1Container> containers) {
    this.containers = containers;
  }

  public V1PodSpec dnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
    return this;
  }

   /**
   * Set DNS policy for containers within the pod. One of 'ClusterFirstWithHostNet', 'ClusterFirst' or 'Default'. Defaults to \"ClusterFirst\". To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
   * @return dnsPolicy
  **/
  @ApiModelProperty(example = "null", value = "Set DNS policy for containers within the pod. One of 'ClusterFirstWithHostNet', 'ClusterFirst' or 'Default'. Defaults to \"ClusterFirst\". To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.")
  public String getDnsPolicy() {
    return dnsPolicy;
  }

  public void setDnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
  }

  public V1PodSpec hostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
    return this;
  }

   /**
   * Use the host's ipc namespace. Optional: Default to false.
   * @return hostIPC
  **/
  @ApiModelProperty(example = "null", value = "Use the host's ipc namespace. Optional: Default to false.")
  public Boolean getHostIPC() {
    return hostIPC;
  }

  public void setHostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
  }

  public V1PodSpec hostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
    return this;
  }

   /**
   * Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.
   * @return hostNetwork
  **/
  @ApiModelProperty(example = "null", value = "Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.")
  public Boolean getHostNetwork() {
    return hostNetwork;
  }

  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }

  public V1PodSpec hostPID(Boolean hostPID) {
    this.hostPID = hostPID;
    return this;
  }

   /**
   * Use the host's pid namespace. Optional: Default to false.
   * @return hostPID
  **/
  @ApiModelProperty(example = "null", value = "Use the host's pid namespace. Optional: Default to false.")
  public Boolean getHostPID() {
    return hostPID;
  }

  public void setHostPID(Boolean hostPID) {
    this.hostPID = hostPID;
  }

  public V1PodSpec hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.
   * @return hostname
  **/
  @ApiModelProperty(example = "null", value = "Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public V1PodSpec imagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public V1PodSpec addImagePullSecretsItem(V1LocalObjectReference imagePullSecretsItem) {
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

   /**
   * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: http://kubernetes.io/docs/user-guide/images#specifying-imagepullsecrets-on-a-pod
   * @return imagePullSecrets
  **/
  @ApiModelProperty(example = "null", value = "ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: http://kubernetes.io/docs/user-guide/images#specifying-imagepullsecrets-on-a-pod")
  public List<V1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }

  public void setImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }

  public V1PodSpec initContainers(List<V1Container> initContainers) {
    this.initContainers = initContainers;
    return this;
  }

  public V1PodSpec addInitContainersItem(V1Container initContainersItem) {
    this.initContainers.add(initContainersItem);
    return this;
  }

   /**
   * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, or Liveness probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/containers
   * @return initContainers
  **/
  @ApiModelProperty(example = "null", value = "List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, or Liveness probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/containers")
  public List<V1Container> getInitContainers() {
    return initContainers;
  }

  public void setInitContainers(List<V1Container> initContainers) {
    this.initContainers = initContainers;
  }

  public V1PodSpec nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
   * @return nodeName
  **/
  @ApiModelProperty(example = "null", value = "NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public V1PodSpec nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public V1PodSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: http://kubernetes.io/docs/user-guide/node-selection/README
   * @return nodeSelector
  **/
  @ApiModelProperty(example = "null", value = "NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: http://kubernetes.io/docs/user-guide/node-selection/README")
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public V1PodSpec restartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

   /**
   * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: http://kubernetes.io/docs/user-guide/pod-states#restartpolicy
   * @return restartPolicy
  **/
  @ApiModelProperty(example = "null", value = "Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: http://kubernetes.io/docs/user-guide/pod-states#restartpolicy")
  public String getRestartPolicy() {
    return restartPolicy;
  }

  public void setRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
  }

  public V1PodSpec schedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
    return this;
  }

   /**
   * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
   * @return schedulerName
  **/
  @ApiModelProperty(example = "null", value = "If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.")
  public String getSchedulerName() {
    return schedulerName;
  }

  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }

  public V1PodSpec securityContext(V1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

   /**
   * SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.
   * @return securityContext
  **/
  @ApiModelProperty(example = "null", value = "SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.")
  public V1PodSecurityContext getSecurityContext() {
    return securityContext;
  }

  public void setSecurityContext(V1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
  }

  public V1PodSpec serviceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

   /**
   * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
   * @return serviceAccount
  **/
  @ApiModelProperty(example = "null", value = "DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.")
  public String getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  public V1PodSpec serviceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: http://releases.k8s.io/HEAD/docs/design/service_accounts.md
   * @return serviceAccountName
  **/
  @ApiModelProperty(example = "null", value = "ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: http://releases.k8s.io/HEAD/docs/design/service_accounts.md")
  public String getServiceAccountName() {
    return serviceAccountName;
  }

  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }

  public V1PodSpec subdomain(String subdomain) {
    this.subdomain = subdomain;
    return this;
  }

   /**
   * If specified, the fully qualified Pod hostname will be \"<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>\". If not specified, the pod will not have a domainname at all.
   * @return subdomain
  **/
  @ApiModelProperty(example = "null", value = "If specified, the fully qualified Pod hostname will be \"<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>\". If not specified, the pod will not have a domainname at all.")
  public String getSubdomain() {
    return subdomain;
  }

  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }

  public V1PodSpec terminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return this;
  }

   /**
   * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
   * @return terminationGracePeriodSeconds
  **/
  @ApiModelProperty(example = "null", value = "Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.")
  public Long getTerminationGracePeriodSeconds() {
    return terminationGracePeriodSeconds;
  }

  public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
  }

  public V1PodSpec tolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public V1PodSpec addTolerationsItem(V1Toleration tolerationsItem) {
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * If specified, the pod's tolerations.
   * @return tolerations
  **/
  @ApiModelProperty(example = "null", value = "If specified, the pod's tolerations.")
  public List<V1Toleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }

  public V1PodSpec volumes(List<V1Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public V1PodSpec addVolumesItem(V1Volume volumesItem) {
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * List of volumes that can be mounted by containers belonging to the pod. More info: http://kubernetes.io/docs/user-guide/volumes
   * @return volumes
  **/
  @ApiModelProperty(example = "null", value = "List of volumes that can be mounted by containers belonging to the pod. More info: http://kubernetes.io/docs/user-guide/volumes")
  public List<V1Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<V1Volume> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodSpec v1PodSpec = (V1PodSpec) o;
    return Objects.equals(this.activeDeadlineSeconds, v1PodSpec.activeDeadlineSeconds) &&
        Objects.equals(this.affinity, v1PodSpec.affinity) &&
        Objects.equals(this.automountServiceAccountToken, v1PodSpec.automountServiceAccountToken) &&
        Objects.equals(this.containers, v1PodSpec.containers) &&
        Objects.equals(this.dnsPolicy, v1PodSpec.dnsPolicy) &&
        Objects.equals(this.hostIPC, v1PodSpec.hostIPC) &&
        Objects.equals(this.hostNetwork, v1PodSpec.hostNetwork) &&
        Objects.equals(this.hostPID, v1PodSpec.hostPID) &&
        Objects.equals(this.hostname, v1PodSpec.hostname) &&
        Objects.equals(this.imagePullSecrets, v1PodSpec.imagePullSecrets) &&
        Objects.equals(this.initContainers, v1PodSpec.initContainers) &&
        Objects.equals(this.nodeName, v1PodSpec.nodeName) &&
        Objects.equals(this.nodeSelector, v1PodSpec.nodeSelector) &&
        Objects.equals(this.restartPolicy, v1PodSpec.restartPolicy) &&
        Objects.equals(this.schedulerName, v1PodSpec.schedulerName) &&
        Objects.equals(this.securityContext, v1PodSpec.securityContext) &&
        Objects.equals(this.serviceAccount, v1PodSpec.serviceAccount) &&
        Objects.equals(this.serviceAccountName, v1PodSpec.serviceAccountName) &&
        Objects.equals(this.subdomain, v1PodSpec.subdomain) &&
        Objects.equals(this.terminationGracePeriodSeconds, v1PodSpec.terminationGracePeriodSeconds) &&
        Objects.equals(this.tolerations, v1PodSpec.tolerations) &&
        Objects.equals(this.volumes, v1PodSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, affinity, automountServiceAccountToken, containers, dnsPolicy, hostIPC, hostNetwork, hostPID, hostname, imagePullSecrets, initContainers, nodeName, nodeSelector, restartPolicy, schedulerName, securityContext, serviceAccount, serviceAccountName, subdomain, terminationGracePeriodSeconds, tolerations, volumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodSpec {\n");
    
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
    sb.append("    hostIPC: ").append(toIndentedString(hostIPC)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    hostPID: ").append(toIndentedString(hostPID)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("    terminationGracePeriodSeconds: ").append(toIndentedString(terminationGracePeriodSeconds)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

