# CommentsApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**titlesTitleIdReviewsReviewIdCommentsCommentIdDelete**](CommentsApi.md#titlesTitleIdReviewsReviewIdCommentsCommentIdDelete) | **DELETE** /titles/{title_id}/reviews/{review_id}/comments/{comment_id}/ | 
[**titlesTitleIdReviewsReviewIdCommentsCommentIdGet**](CommentsApi.md#titlesTitleIdReviewsReviewIdCommentsCommentIdGet) | **GET** /titles/{title_id}/reviews/{review_id}/comments/{comment_id}/ | 
[**titlesTitleIdReviewsReviewIdCommentsCommentIdPatch**](CommentsApi.md#titlesTitleIdReviewsReviewIdCommentsCommentIdPatch) | **PATCH** /titles/{title_id}/reviews/{review_id}/comments/{comment_id}/ | 
[**titlesTitleIdReviewsReviewIdCommentsGet**](CommentsApi.md#titlesTitleIdReviewsReviewIdCommentsGet) | **GET** /titles/{title_id}/reviews/{review_id}/comments/ | 
[**titlesTitleIdReviewsReviewIdCommentsPost**](CommentsApi.md#titlesTitleIdReviewsReviewIdCommentsPost) | **POST** /titles/{title_id}/reviews/{review_id}/comments/ | 


<a name="titlesTitleIdReviewsReviewIdCommentsCommentIdDelete"></a>
# **titlesTitleIdReviewsReviewIdCommentsCommentIdDelete**
> titlesTitleIdReviewsReviewIdCommentsCommentIdDelete(titleId, reviewId, commentId)



Удалить комментарий к отзыву по id.  Права доступа: **Автор комментария, модератор или администратор**. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure API key authorization: jwt_auth
    ApiKeyAuth jwt_auth = (ApiKeyAuth) defaultClient.getAuthentication("jwt_auth");
    jwt_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_auth.setApiKeyPrefix("Token");

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    BigDecimal titleId = new BigDecimal(); // BigDecimal | ID объекта для оценки
    BigDecimal reviewId = new BigDecimal(); // BigDecimal | ID отзыва
    BigDecimal commentId = new BigDecimal(); // BigDecimal | ID комментария
    try {
      apiInstance.titlesTitleIdReviewsReviewIdCommentsCommentIdDelete(titleId, reviewId, commentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#titlesTitleIdReviewsReviewIdCommentsCommentIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **titleId** | **BigDecimal**| ID объекта для оценки |
 **reviewId** | **BigDecimal**| ID отзыва |
 **commentId** | **BigDecimal**| ID комментария |

### Return type

null (empty response body)

### Authorization

[jwt_auth](../README.md#jwt_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** |  |  -  |
**401** | Необходим JWT токен |  -  |
**403** | Нет прав доступа |  -  |
**404** | Не найден объект оценки, отзыв или комментарий |  -  |

<a name="titlesTitleIdReviewsReviewIdCommentsCommentIdGet"></a>
# **titlesTitleIdReviewsReviewIdCommentsCommentIdGet**
> Comment titlesTitleIdReviewsReviewIdCommentsCommentIdGet(titleId, reviewId, commentId)



Получить комментарий для отзыва по id.  Права доступа: **Доступно без токена.** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    BigDecimal titleId = new BigDecimal(); // BigDecimal | ID объекта для оценки
    BigDecimal reviewId = new BigDecimal(); // BigDecimal | ID отзыва
    BigDecimal commentId = new BigDecimal(); // BigDecimal | ID комментария
    try {
      Comment result = apiInstance.titlesTitleIdReviewsReviewIdCommentsCommentIdGet(titleId, reviewId, commentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#titlesTitleIdReviewsReviewIdCommentsCommentIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **titleId** | **BigDecimal**| ID объекта для оценки |
 **reviewId** | **BigDecimal**| ID отзыва |
 **commentId** | **BigDecimal**| ID комментария |

### Return type

[**Comment**](Comment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**404** | Не найден объект оценки, отзыв или комментарий |  -  |

<a name="titlesTitleIdReviewsReviewIdCommentsCommentIdPatch"></a>
# **titlesTitleIdReviewsReviewIdCommentsCommentIdPatch**
> Comment titlesTitleIdReviewsReviewIdCommentsCommentIdPatch(titleId, reviewId, commentId, comment)



Частично обновить комментарий к отзыву по id.  Права доступа: **Автор комментария, модератор или администратор**. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure API key authorization: jwt_auth
    ApiKeyAuth jwt_auth = (ApiKeyAuth) defaultClient.getAuthentication("jwt_auth");
    jwt_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_auth.setApiKeyPrefix("Token");

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    BigDecimal titleId = new BigDecimal(); // BigDecimal | ID объекта для оценки
    BigDecimal reviewId = new BigDecimal(); // BigDecimal | ID отзыва
    BigDecimal commentId = new BigDecimal(); // BigDecimal | ID комментария
    Comment comment = new Comment(); // Comment | 
    try {
      Comment result = apiInstance.titlesTitleIdReviewsReviewIdCommentsCommentIdPatch(titleId, reviewId, commentId, comment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#titlesTitleIdReviewsReviewIdCommentsCommentIdPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **titleId** | **BigDecimal**| ID объекта для оценки |
 **reviewId** | **BigDecimal**| ID отзыва |
 **commentId** | **BigDecimal**| ID комментария |
 **comment** | [**Comment**](Comment.md)|  | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization

[jwt_auth](../README.md#jwt_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** | Ошибка |  -  |
**401** | Необходим JWT токен |  -  |
**403** | Нет прав доступа |  -  |
**404** | Не найден объект оценки, отзыв или комментарий |  -  |

<a name="titlesTitleIdReviewsReviewIdCommentsGet"></a>
# **titlesTitleIdReviewsReviewIdCommentsGet**
> List&lt;InlineResponse2001&gt; titlesTitleIdReviewsReviewIdCommentsGet(titleId, reviewId)



Получить список всех комментариев к отзыву по id  Права доступа: **Доступно без токена.** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    BigDecimal titleId = new BigDecimal(); // BigDecimal | ID объекта для оценки
    BigDecimal reviewId = new BigDecimal(); // BigDecimal | ID отзыва
    try {
      List<InlineResponse2001> result = apiInstance.titlesTitleIdReviewsReviewIdCommentsGet(titleId, reviewId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#titlesTitleIdReviewsReviewIdCommentsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **titleId** | **BigDecimal**| ID объекта для оценки |
 **reviewId** | **BigDecimal**| ID отзыва |

### Return type

[**List&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список комментариев с пагинацией |  -  |
**404** | Не найден объект оценки или отзыв |  -  |

<a name="titlesTitleIdReviewsReviewIdCommentsPost"></a>
# **titlesTitleIdReviewsReviewIdCommentsPost**
> Comment titlesTitleIdReviewsReviewIdCommentsPost(titleId, reviewId, comment)



Создать новый комментарий для отзыва.  Права доступа: **Аутентифицированные пользователи.** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure API key authorization: jwt_auth
    ApiKeyAuth jwt_auth = (ApiKeyAuth) defaultClient.getAuthentication("jwt_auth");
    jwt_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_auth.setApiKeyPrefix("Token");

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    BigDecimal titleId = new BigDecimal(); // BigDecimal | ID объекта для оценки
    BigDecimal reviewId = new BigDecimal(); // BigDecimal | ID отзыва
    Comment comment = new Comment(); // Comment | 
    try {
      Comment result = apiInstance.titlesTitleIdReviewsReviewIdCommentsPost(titleId, reviewId, comment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#titlesTitleIdReviewsReviewIdCommentsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **titleId** | **BigDecimal**| ID объекта для оценки |
 **reviewId** | **BigDecimal**| ID отзыва |
 **comment** | [**Comment**](Comment.md)|  | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization

[jwt_auth](../README.md#jwt_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** | Ошибка |  -  |
**401** | Необходим JWT токен |  -  |
**404** | Не найден объект оценки или отзыв |  -  |

