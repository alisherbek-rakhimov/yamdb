/*
 * YaMDb API
 * запросы к API начинаются с `/api/v1/`  # Описание Проект **YaMDb** собирает отзывы пользователей на произведения. Произведения делятся на категории: «Книги», «Фильмы», «Музыка».  # Алгоритм регистрации пользователей 1. Пользователь отправляет запрос с параметром `email` на `/auth/email/`. 2. **YaMDB** отправляет письмо с кодом подтверждения (`confirmation_code`) на адрес  `email` . 3. Пользователь отправляет запрос с параметрами `email` и `confirmation_code` на `/auth/token/`, в ответе на запрос ему приходит `token` (JWT-токен). 4. При желании пользователь отправляет PATCH-запрос на `/users/me/` и заполняет поля в своём профайле (описание полей — в документации).  # Пользовательские роли - **Аноним** — может просматривать описания произведений, читать отзывы и комментарии. - **Аутентифицированный пользователь** — может, как и **Аноним**, читать всё, дополнительно он может публиковать отзывы и ставить рейтинг произведениям (фильмам/книгам/песенкам), может комментировать чужие отзывы и ставить им оценки; может редактировать и удалять **свои** отзывы и комментарии. - **Модератор** — те же права, что и у **Аутентифицированного пользователя** плюс право удалять **любые** отзывы и комментарии. - **Администратор** — полные права на управление проектом и всем его содержимым. Может создавать и удалять категории и произведения. Может назначать роли пользователям. - **Администратор Django** — те же права, что и у роли **Администратор**. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Category;
import org.openapitools.client.model.InlineResponse2003;
import org.openapitools.client.model.ValidationError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoriesApi {
    private ApiClient localVarApiClient;

    public CategoriesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CategoriesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for categoriesGet
     * @param search фильтрует по названию категории (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список категорий с пагинацией </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call categoriesGetCall(String search, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/categories/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call categoriesGetValidateBeforeCall(String search, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = categoriesGetCall(search, _callback);
        return localVarCall;

    }

    /**
     * 
     * Получить список всех категорий  Права доступа: **Доступно без токена** 
     * @param search фильтрует по названию категории (optional)
     * @return List&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список категорий с пагинацией </td><td>  -  </td></tr>
     </table>
     */
    public List<InlineResponse2003> categoriesGet(String search) throws ApiException {
        ApiResponse<List<InlineResponse2003>> localVarResp = categoriesGetWithHttpInfo(search);
        return localVarResp.getData();
    }

    /**
     * 
     * Получить список всех категорий  Права доступа: **Доступно без токена** 
     * @param search фильтрует по названию категории (optional)
     * @return ApiResponse&lt;List&lt;InlineResponse2003&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список категорий с пагинацией </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<InlineResponse2003>> categoriesGetWithHttpInfo(String search) throws ApiException {
        okhttp3.Call localVarCall = categoriesGetValidateBeforeCall(search, null);
        Type localVarReturnType = new TypeToken<List<InlineResponse2003>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Получить список всех категорий  Права доступа: **Доступно без токена** 
     * @param search фильтрует по названию категории (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список категорий с пагинацией </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call categoriesGetAsync(String search, final ApiCallback<List<InlineResponse2003>> _callback) throws ApiException {

        okhttp3.Call localVarCall = categoriesGetValidateBeforeCall(search, _callback);
        Type localVarReturnType = new TypeToken<List<InlineResponse2003>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for categoriesPost
     * @param category  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список категорий </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call categoriesPostCall(Category category, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = category;

        // create path and map variables
        String localVarPath = "/categories/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "jwt_auth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call categoriesPostValidateBeforeCall(Category category, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = categoriesPostCall(category, _callback);
        return localVarCall;

    }

    /**
     * 
     * Создать категорию.  Права доступа: **Администратор.** 
     * @param category  (optional)
     * @return Category
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список категорий </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
     </table>
     */
    public Category categoriesPost(Category category) throws ApiException {
        ApiResponse<Category> localVarResp = categoriesPostWithHttpInfo(category);
        return localVarResp.getData();
    }

    /**
     * 
     * Создать категорию.  Права доступа: **Администратор.** 
     * @param category  (optional)
     * @return ApiResponse&lt;Category&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список категорий </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Category> categoriesPostWithHttpInfo(Category category) throws ApiException {
        okhttp3.Call localVarCall = categoriesPostValidateBeforeCall(category, null);
        Type localVarReturnType = new TypeToken<Category>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Создать категорию.  Права доступа: **Администратор.** 
     * @param category  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список категорий </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call categoriesPostAsync(Category category, final ApiCallback<Category> _callback) throws ApiException {

        okhttp3.Call localVarCall = categoriesPostValidateBeforeCall(category, _callback);
        Type localVarReturnType = new TypeToken<Category>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for categoriesSlugDelete
     * @param slug Slug категории (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Категория не найдена </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call categoriesSlugDeleteCall(String slug, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/categories/{slug}/"
            .replaceAll("\\{" + "slug" + "\\}", localVarApiClient.escapeString(slug.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "jwt_auth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call categoriesSlugDeleteValidateBeforeCall(String slug, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'slug' is set
        if (slug == null) {
            throw new ApiException("Missing the required parameter 'slug' when calling categoriesSlugDelete(Async)");
        }
        

        okhttp3.Call localVarCall = categoriesSlugDeleteCall(slug, _callback);
        return localVarCall;

    }

    /**
     * 
     * Удалить категорию.  Права доступа: **Администратор.** 
     * @param slug Slug категории (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Категория не найдена </td><td>  -  </td></tr>
     </table>
     */
    public void categoriesSlugDelete(String slug) throws ApiException {
        categoriesSlugDeleteWithHttpInfo(slug);
    }

    /**
     * 
     * Удалить категорию.  Права доступа: **Администратор.** 
     * @param slug Slug категории (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Категория не найдена </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> categoriesSlugDeleteWithHttpInfo(String slug) throws ApiException {
        okhttp3.Call localVarCall = categoriesSlugDeleteValidateBeforeCall(slug, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Удалить категорию.  Права доступа: **Администратор.** 
     * @param slug Slug категории (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Категория не найдена </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call categoriesSlugDeleteAsync(String slug, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = categoriesSlugDeleteValidateBeforeCall(slug, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
