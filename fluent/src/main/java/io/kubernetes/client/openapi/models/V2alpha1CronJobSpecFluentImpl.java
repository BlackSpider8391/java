package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

public class V2alpha1CronJobSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent<A> {

    private java.lang.String concurrencyPolicy;
    private java.lang.Integer failedJobsHistoryLimit;
    private io.kubernetes.client.openapi.models.V2alpha1JobTemplateSpecBuilder jobTemplate;
    private java.lang.String schedule;
    private java.lang.Long startingDeadlineSeconds;
    private java.lang.Integer successfulJobsHistoryLimit;
    private java.lang.Boolean suspend;

    public V2alpha1CronJobSpecFluentImpl() {
    }

    public V2alpha1CronJobSpecFluentImpl(io.kubernetes.client.openapi.models.V2alpha1CronJobSpec instance) {
        this.withConcurrencyPolicy(instance.getConcurrencyPolicy());
        
        this.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit());
        
        this.withJobTemplate(instance.getJobTemplate());
        
        this.withSchedule(instance.getSchedule());
        
        this.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds());
        
        this.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit());
        
        this.withSuspend(instance.getSuspend());
    }

    public java.lang.String getConcurrencyPolicy() {
        return this.concurrencyPolicy;
    }

    public A withConcurrencyPolicy(java.lang.String concurrencyPolicy) {
        this.concurrencyPolicy=concurrencyPolicy; return (A) this;
    }

    public java.lang.Boolean hasConcurrencyPolicy() {
        return this.concurrencyPolicy != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withConcurrencyPolicy instead.
     */
        public A withNewConcurrencyPolicy(java.lang.String original) {
        return (A)withConcurrencyPolicy(new String(original));
    }

    public java.lang.Integer getFailedJobsHistoryLimit() {
        return this.failedJobsHistoryLimit;
    }

    public A withFailedJobsHistoryLimit(java.lang.Integer failedJobsHistoryLimit) {
        this.failedJobsHistoryLimit=failedJobsHistoryLimit; return (A) this;
    }

    public java.lang.Boolean hasFailedJobsHistoryLimit() {
        return this.failedJobsHistoryLimit != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildJobTemplate instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2alpha1JobTemplateSpec getJobTemplate() {
        return this.jobTemplate!=null?this.jobTemplate.build():null;
    }

    public io.kubernetes.client.openapi.models.V2alpha1JobTemplateSpec buildJobTemplate() {
        return this.jobTemplate!=null?this.jobTemplate.build():null;
    }

    public A withJobTemplate(io.kubernetes.client.openapi.models.V2alpha1JobTemplateSpec jobTemplate) {
        _visitables.get("jobTemplate").remove(this.jobTemplate);
        if (jobTemplate!=null){ this.jobTemplate= new io.kubernetes.client.openapi.models.V2alpha1JobTemplateSpecBuilder(jobTemplate); _visitables.get("jobTemplate").add(this.jobTemplate);} return (A) this;
    }

    public java.lang.Boolean hasJobTemplate() {
        return this.jobTemplate != null;
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplate() {
        return new io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluentImpl.JobTemplateNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplateLike(io.kubernetes.client.openapi.models.V2alpha1JobTemplateSpec item) {
        return new io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluentImpl.JobTemplateNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent.JobTemplateNested<A> editJobTemplate() {
        return withNewJobTemplateLike(getJobTemplate());
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent.JobTemplateNested<A> editOrNewJobTemplate() {
        return withNewJobTemplateLike(getJobTemplate() != null ? getJobTemplate(): new io.kubernetes.client.openapi.models.V2alpha1JobTemplateSpecBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent.JobTemplateNested<A> editOrNewJobTemplateLike(io.kubernetes.client.openapi.models.V2alpha1JobTemplateSpec item) {
        return withNewJobTemplateLike(getJobTemplate() != null ? getJobTemplate(): item);
    }

    public java.lang.String getSchedule() {
        return this.schedule;
    }

    public A withSchedule(java.lang.String schedule) {
        this.schedule=schedule; return (A) this;
    }

    public java.lang.Boolean hasSchedule() {
        return this.schedule != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSchedule instead.
     */
        public A withNewSchedule(java.lang.String original) {
        return (A)withSchedule(new String(original));
    }

    public java.lang.Long getStartingDeadlineSeconds() {
        return this.startingDeadlineSeconds;
    }

    public A withStartingDeadlineSeconds(java.lang.Long startingDeadlineSeconds) {
        this.startingDeadlineSeconds=startingDeadlineSeconds; return (A) this;
    }

    public java.lang.Boolean hasStartingDeadlineSeconds() {
        return this.startingDeadlineSeconds != null;
    }

    public java.lang.Integer getSuccessfulJobsHistoryLimit() {
        return this.successfulJobsHistoryLimit;
    }

    public A withSuccessfulJobsHistoryLimit(java.lang.Integer successfulJobsHistoryLimit) {
        this.successfulJobsHistoryLimit=successfulJobsHistoryLimit; return (A) this;
    }

    public java.lang.Boolean hasSuccessfulJobsHistoryLimit() {
        return this.successfulJobsHistoryLimit != null;
    }

    public java.lang.Boolean getSuspend() {
        return this.suspend;
    }

    public A withSuspend(java.lang.Boolean suspend) {
        this.suspend=suspend; return (A) this;
    }

    public java.lang.Boolean hasSuspend() {
        return this.suspend != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V2alpha1CronJobSpecFluentImpl that = (V2alpha1CronJobSpecFluentImpl) o;
        if (concurrencyPolicy != null ? !concurrencyPolicy.equals(that.concurrencyPolicy) :that.concurrencyPolicy != null) return false;
        if (failedJobsHistoryLimit != null ? !failedJobsHistoryLimit.equals(that.failedJobsHistoryLimit) :that.failedJobsHistoryLimit != null) return false;
        if (jobTemplate != null ? !jobTemplate.equals(that.jobTemplate) :that.jobTemplate != null) return false;
        if (schedule != null ? !schedule.equals(that.schedule) :that.schedule != null) return false;
        if (startingDeadlineSeconds != null ? !startingDeadlineSeconds.equals(that.startingDeadlineSeconds) :that.startingDeadlineSeconds != null) return false;
        if (successfulJobsHistoryLimit != null ? !successfulJobsHistoryLimit.equals(that.successfulJobsHistoryLimit) :that.successfulJobsHistoryLimit != null) return false;
        if (suspend != null ? !suspend.equals(that.suspend) :that.suspend != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(concurrencyPolicy,  failedJobsHistoryLimit,  jobTemplate,  schedule,  startingDeadlineSeconds,  successfulJobsHistoryLimit,  suspend,  super.hashCode());
    }

    public class JobTemplateNestedImpl<N> extends io.kubernetes.client.openapi.models.V2alpha1JobTemplateSpecFluentImpl<io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent.JobTemplateNested<N>> implements io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent.JobTemplateNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V2alpha1JobTemplateSpecBuilder builder;

            JobTemplateNestedImpl(io.kubernetes.client.openapi.models.V2alpha1JobTemplateSpec item) {
                this.builder = new io.kubernetes.client.openapi.models.V2alpha1JobTemplateSpecBuilder(this, item);
                        
            }

            JobTemplateNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V2alpha1JobTemplateSpecBuilder(this);
                        
            }

            public N and() {
                return (N) V2alpha1CronJobSpecFluentImpl.this.withJobTemplate(builder.build());
            }

            public N endJobTemplate() {
                return and();
            }
    }


}
