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


import java.math.BigDecimal;
import org.openapitools.client.model.InlineResponse2004;
import org.openapitools.client.model.Title;
import org.openapitools.client.model.TitleCreate;
import org.openapitools.client.model.ValidationError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TitlesApi {
    private ApiClient localVarApiClient;

    public TitlesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TitlesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for titlesGet
     * @param category фильтрует по slug категории (optional)
     * @param genre фильтрует по slug genre (optional)
     * @param name фильтрует по части названия объекта (optional)
     * @param year фильтрует по году (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список объектов с пагинацией </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call titlesGetCall(String category, String genre, String name, BigDecimal year, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/titles/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (category != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("category", category));
        }

        if (genre != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("genre", genre));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (year != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("year", year));
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
    private okhttp3.Call titlesGetValidateBeforeCall(String category, String genre, String name, BigDecimal year, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = titlesGetCall(category, genre, name, year, _callback);
        return localVarCall;

    }

    /**
     * 
     * Получить список всех объектов   Права доступа: **Доступно без токена** 
     * @param category фильтрует по slug категории (optional)
     * @param genre фильтрует по slug genre (optional)
     * @param name фильтрует по части названия объекта (optional)
     * @param year фильтрует по году (optional)
     * @return List&lt;InlineResponse2004&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список объектов с пагинацией </td><td>  -  </td></tr>
     </table>
     */
    public List<InlineResponse2004> titlesGet(String category, String genre, String name, BigDecimal year) throws ApiException {
        ApiResponse<List<InlineResponse2004>> localVarResp = titlesGetWithHttpInfo(category, genre, name, year);
        return localVarResp.getData();
    }

    /**
     * 
     * Получить список всех объектов   Права доступа: **Доступно без токена** 
     * @param category фильтрует по slug категории (optional)
     * @param genre фильтрует по slug genre (optional)
     * @param name фильтрует по части названия объекта (optional)
     * @param year фильтрует по году (optional)
     * @return ApiResponse&lt;List&lt;InlineResponse2004&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список объектов с пагинацией </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<InlineResponse2004>> titlesGetWithHttpInfo(String category, String genre, String name, BigDecimal year) throws ApiException {
        okhttp3.Call localVarCall = titlesGetValidateBeforeCall(category, genre, name, year, null);
        Type localVarReturnType = new TypeToken<List<InlineResponse2004>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Получить список всех объектов   Права доступа: **Доступно без токена** 
     * @param category фильтрует по slug категории (optional)
     * @param genre фильтрует по slug genre (optional)
     * @param name фильтрует по части названия объекта (optional)
     * @param year фильтрует по году (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список объектов с пагинацией </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call titlesGetAsync(String category, String genre, String name, BigDecimal year, final ApiCallback<List<InlineResponse2004>> _callback) throws ApiException {

        okhttp3.Call localVarCall = titlesGetValidateBeforeCall(category, genre, name, year, _callback);
        Type localVarReturnType = new TypeToken<List<InlineResponse2004>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for titlesPost
     * @param titleCreate  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список объектов </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call titlesPostCall(TitleCreate titleCreate, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = titleCreate;

        // create path and map variables
        String localVarPath = "/titles/";

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
    private okhttp3.Call titlesPostValidateBeforeCall(TitleCreate titleCreate, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = titlesPostCall(titleCreate, _callback);
        return localVarCall;

    }

    /**
     * 
     * Создать произведение для отзывов.  Права доступа: **Администратор**. 
     * @param titleCreate  (optional)
     * @return Title
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список объектов </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
     </table>
     */
    public Title titlesPost(TitleCreate titleCreate) throws ApiException {
        ApiResponse<Title> localVarResp = titlesPostWithHttpInfo(titleCreate);
        return localVarResp.getData();
    }

    /**
     * 
     * Создать произведение для отзывов.  Права доступа: **Администратор**. 
     * @param titleCreate  (optional)
     * @return ApiResponse&lt;Title&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список объектов </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Title> titlesPostWithHttpInfo(TitleCreate titleCreate) throws ApiException {
        okhttp3.Call localVarCall = titlesPostValidateBeforeCall(titleCreate, null);
        Type localVarReturnType = new TypeToken<Title>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Создать произведение для отзывов.  Права доступа: **Администратор**. 
     * @param titleCreate  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список объектов </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call titlesPostAsync(TitleCreate titleCreate, final ApiCallback<Title> _callback) throws ApiException {

        okhttp3.Call localVarCall = titlesPostValidateBeforeCall(titleCreate, _callback);
        Type localVarReturnType = new TypeToken<Title>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for titlesTitlesIdDelete
     * @param titlesId ID объекта (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Объект не найден </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call titlesTitlesIdDeleteCall(BigDecimal titlesId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/titles/{titles_id}/"
            .replaceAll("\\{" + "titles_id" + "\\}", localVarApiClient.escapeString(titlesId.toString()));

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
    private okhttp3.Call titlesTitlesIdDeleteValidateBeforeCall(BigDecimal titlesId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'titlesId' is set
        if (titlesId == null) {
            throw new ApiException("Missing the required parameter 'titlesId' when calling titlesTitlesIdDelete(Async)");
        }
        

        okhttp3.Call localVarCall = titlesTitlesIdDeleteCall(titlesId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Удалить произведение.  Права доступа: **Администратор**. 
     * @param titlesId ID объекта (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Объект не найден </td><td>  -  </td></tr>
     </table>
     */
    public void titlesTitlesIdDelete(BigDecimal titlesId) throws ApiException {
        titlesTitlesIdDeleteWithHttpInfo(titlesId);
    }

    /**
     * 
     * Удалить произведение.  Права доступа: **Администратор**. 
     * @param titlesId ID объекта (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Объект не найден </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> titlesTitlesIdDeleteWithHttpInfo(BigDecimal titlesId) throws ApiException {
        okhttp3.Call localVarCall = titlesTitlesIdDeleteValidateBeforeCall(titlesId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Удалить произведение.  Права доступа: **Администратор**. 
     * @param titlesId ID объекта (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Объект не найден </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call titlesTitlesIdDeleteAsync(BigDecimal titlesId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = titlesTitlesIdDeleteValidateBeforeCall(titlesId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for titlesTitlesIdGet
     * @param titlesId ID объекта (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Объект </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Объект не найден </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call titlesTitlesIdGetCall(BigDecimal titlesId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/titles/{titles_id}/"
            .replaceAll("\\{" + "titles_id" + "\\}", localVarApiClient.escapeString(titlesId.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call titlesTitlesIdGetValidateBeforeCall(BigDecimal titlesId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'titlesId' is set
        if (titlesId == null) {
            throw new ApiException("Missing the required parameter 'titlesId' when calling titlesTitlesIdGet(Async)");
        }
        

        okhttp3.Call localVarCall = titlesTitlesIdGetCall(titlesId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Информация об объекте   Права доступа: **Доступно без токена** 
     * @param titlesId ID объекта (required)
     * @return Title
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Объект </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Объект не найден </td><td>  -  </td></tr>
     </table>
     */
    public Title titlesTitlesIdGet(BigDecimal titlesId) throws ApiException {
        ApiResponse<Title> localVarResp = titlesTitlesIdGetWithHttpInfo(titlesId);
        return localVarResp.getData();
    }

    /**
     * 
     * Информация об объекте   Права доступа: **Доступно без токена** 
     * @param titlesId ID объекта (required)
     * @return ApiResponse&lt;Title&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Объект </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Объект не найден </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Title> titlesTitlesIdGetWithHttpInfo(BigDecimal titlesId) throws ApiException {
        okhttp3.Call localVarCall = titlesTitlesIdGetValidateBeforeCall(titlesId, null);
        Type localVarReturnType = new TypeToken<Title>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Информация об объекте   Права доступа: **Доступно без токена** 
     * @param titlesId ID объекта (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Объект </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Объект не найден </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call titlesTitlesIdGetAsync(BigDecimal titlesId, final ApiCallback<Title> _callback) throws ApiException {

        okhttp3.Call localVarCall = titlesTitlesIdGetValidateBeforeCall(titlesId, _callback);
        Type localVarReturnType = new TypeToken<Title>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for titlesTitlesIdPatch
     * @param titlesId ID объекта (required)
     * @param titleCreate  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Объект </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Объект не найден </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call titlesTitlesIdPatchCall(BigDecimal titlesId, TitleCreate titleCreate, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = titleCreate;

        // create path and map variables
        String localVarPath = "/titles/{titles_id}/"
            .replaceAll("\\{" + "titles_id" + "\\}", localVarApiClient.escapeString(titlesId.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call titlesTitlesIdPatchValidateBeforeCall(BigDecimal titlesId, TitleCreate titleCreate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'titlesId' is set
        if (titlesId == null) {
            throw new ApiException("Missing the required parameter 'titlesId' when calling titlesTitlesIdPatch(Async)");
        }
        

        okhttp3.Call localVarCall = titlesTitlesIdPatchCall(titlesId, titleCreate, _callback);
        return localVarCall;

    }

    /**
     * 
     * Обновить информацию об объекте   Права доступа: **Администратор** 
     * @param titlesId ID объекта (required)
     * @param titleCreate  (optional)
     * @return Title
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Объект </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Объект не найден </td><td>  -  </td></tr>
     </table>
     */
    public Title titlesTitlesIdPatch(BigDecimal titlesId, TitleCreate titleCreate) throws ApiException {
        ApiResponse<Title> localVarResp = titlesTitlesIdPatchWithHttpInfo(titlesId, titleCreate);
        return localVarResp.getData();
    }

    /**
     * 
     * Обновить информацию об объекте   Права доступа: **Администратор** 
     * @param titlesId ID объекта (required)
     * @param titleCreate  (optional)
     * @return ApiResponse&lt;Title&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Объект </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Объект не найден </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Title> titlesTitlesIdPatchWithHttpInfo(BigDecimal titlesId, TitleCreate titleCreate) throws ApiException {
        okhttp3.Call localVarCall = titlesTitlesIdPatchValidateBeforeCall(titlesId, titleCreate, null);
        Type localVarReturnType = new TypeToken<Title>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Обновить информацию об объекте   Права доступа: **Администратор** 
     * @param titlesId ID объекта (required)
     * @param titleCreate  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Объект </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Необходим JWT токен </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Нет прав доступа </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Объект не найден </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call titlesTitlesIdPatchAsync(BigDecimal titlesId, TitleCreate titleCreate, final ApiCallback<Title> _callback) throws ApiException {

        okhttp3.Call localVarCall = titlesTitlesIdPatchValidateBeforeCall(titlesId, titleCreate, _callback);
        Type localVarReturnType = new TypeToken<Title>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
