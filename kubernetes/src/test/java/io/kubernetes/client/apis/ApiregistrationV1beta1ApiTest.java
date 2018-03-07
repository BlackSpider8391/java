/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.apis;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1APIResourceList;
import io.kubernetes.client.models.V1DeleteOptions;
import io.kubernetes.client.models.V1Status;
import io.kubernetes.client.models.V1beta1APIService;
import io.kubernetes.client.models.V1beta1APIServiceList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiregistrationV1beta1Api
 */
@Ignore
public class ApiregistrationV1beta1ApiTest {

    private final ApiregistrationV1beta1Api api = new ApiregistrationV1beta1Api();

    
    /**
     * 
     *
     * create an APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAPIServiceTest() throws ApiException {
        V1beta1APIService body = null;
        String pretty = null;
        V1beta1APIService response = api.createAPIService(body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete an APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAPIServiceTest() throws ApiException {
        String name = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteAPIService(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionAPIServiceTest() throws ApiException {
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionAPIService(pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        V1APIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAPIServiceTest() throws ApiException {
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1APIServiceList response = api.listAPIService(pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAPIServiceTest() throws ApiException {
        String name = null;
        Object body = null;
        String pretty = null;
        V1beta1APIService response = api.patchAPIService(name, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAPIServiceTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1beta1APIService response = api.readAPIService(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAPIServiceTest() throws ApiException {
        String name = null;
        V1beta1APIService body = null;
        String pretty = null;
        V1beta1APIService response = api.replaceAPIService(name, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAPIServiceStatusTest() throws ApiException {
        String name = null;
        V1beta1APIService body = null;
        String pretty = null;
        V1beta1APIService response = api.replaceAPIServiceStatus(name, body, pretty);

        // TODO: test validations
    }
    
}
