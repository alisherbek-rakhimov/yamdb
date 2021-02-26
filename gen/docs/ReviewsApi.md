# ReviewsApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**titlesTitleIdReviewsGet**](ReviewsApi.md#titlesTitleIdReviewsGet) | **GET** /titles/{title_id}/reviews/ | 
[**titlesTitleIdReviewsPost**](ReviewsApi.md#titlesTitleIdReviewsPost) | **POST** /titles/{title_id}/reviews/ | 
[**titlesTitleIdReviewsReviewIdDelete**](ReviewsApi.md#titlesTitleIdReviewsReviewIdDelete) | **DELETE** /titles/{title_id}/reviews/{review_id}/ | 
[**titlesTitleIdReviewsReviewIdGet**](ReviewsApi.md#titlesTitleIdReviewsReviewIdGet) | **GET** /titles/{title_id}/reviews/{review_id}/ | 
[**titlesTitleIdReviewsReviewIdPatch**](ReviewsApi.md#titlesTitleIdReviewsReviewIdPatch) | **PATCH** /titles/{title_id}/reviews/{review_id}/ | 


<a name="titlesTitleIdReviewsGet"></a>
# **titlesTitleIdReviewsGet**
> List&lt;InlineResponse200&gt; titlesTitleIdReviewsGet(titleId)



Получить список всех отзывов.  Права доступа: **Доступно без токена.** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    ReviewsApi apiInstance = new ReviewsApi(defaultClient);
    BigDecimal titleId = new BigDecimal(); // BigDecimal | ID объекта для оценки
    try {
      List<InlineResponse200> result = apiInstance.titlesTitleIdReviewsGet(titleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewsApi#titlesTitleIdReviewsGet");
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

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список отзывов с пагинацией |  -  |
**404** | Не найден объект оценки |  -  |

<a name="titlesTitleIdReviewsPost"></a>
# **titlesTitleIdReviewsPost**
> Review titlesTitleIdReviewsPost(titleId, review)



Создать новый отзыв. Пользователь может оставить только один отзыв на один объект.  Права доступа: **Аутентифицированные пользователи.** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure API key authorization: jwt_auth
    ApiKeyAuth jwt_auth = (ApiKeyAuth) defaultClient.getAuthentication("jwt_auth");
    jwt_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_auth.setApiKeyPrefix("Token");

    ReviewsApi apiInstance = new ReviewsApi(defaultClient);
    BigDecimal titleId = new BigDecimal(); // BigDecimal | ID объекта для оценки
    Review review = new Review(); // Review | 
    try {
      Review result = apiInstance.titlesTitleIdReviewsPost(titleId, review);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewsApi#titlesTitleIdReviewsPost");
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
 **review** | [**Review**](Review.md)|  | [optional]

### Return type

[**Review**](Review.md)

### Authorization

[jwt_auth](../README.md#jwt_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Новый отзыв |  -  |
**400** | Ошибка |  -  |
**401** | Необходим JWT токен |  -  |
**404** | Не найден объект оценки |  -  |

<a name="titlesTitleIdReviewsReviewIdDelete"></a>
# **titlesTitleIdReviewsReviewIdDelete**
> titlesTitleIdReviewsReviewIdDelete(titleId, reviewId)



Удалить отзыв по id  Права доступа: **Автор отзыва, модератор или администратор.** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure API key authorization: jwt_auth
    ApiKeyAuth jwt_auth = (ApiKeyAuth) defaultClient.getAuthentication("jwt_auth");
    jwt_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_auth.setApiKeyPrefix("Token");

    ReviewsApi apiInstance = new ReviewsApi(defaultClient);
    BigDecimal titleId = new BigDecimal(); // BigDecimal | ID объекта для оценки
    BigDecimal reviewId = new BigDecimal(); // BigDecimal | ID отзыва
    try {
      apiInstance.titlesTitleIdReviewsReviewIdDelete(titleId, reviewId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewsApi#titlesTitleIdReviewsReviewIdDelete");
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
**404** | Не найден объект оценки |  -  |

<a name="titlesTitleIdReviewsReviewIdGet"></a>
# **titlesTitleIdReviewsReviewIdGet**
> Review titlesTitleIdReviewsReviewIdGet(titleId, reviewId)



Получить отзыв по id.  Права доступа: **Доступно без токена.** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    ReviewsApi apiInstance = new ReviewsApi(defaultClient);
    BigDecimal titleId = new BigDecimal(); // BigDecimal | ID объекта для оценки
    BigDecimal reviewId = new BigDecimal(); // BigDecimal | ID отзыва
    try {
      Review result = apiInstance.titlesTitleIdReviewsReviewIdGet(titleId, reviewId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewsApi#titlesTitleIdReviewsReviewIdGet");
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

[**Review**](Review.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Отзыв |  -  |
**404** | Не найден объект оценки |  -  |

<a name="titlesTitleIdReviewsReviewIdPatch"></a>
# **titlesTitleIdReviewsReviewIdPatch**
> Review titlesTitleIdReviewsReviewIdPatch(titleId, reviewId, review)



Частично обновить отзыв по id.  Права доступа: **Автор отзыва, модератор или администратор.** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure API key authorization: jwt_auth
    ApiKeyAuth jwt_auth = (ApiKeyAuth) defaultClient.getAuthentication("jwt_auth");
    jwt_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_auth.setApiKeyPrefix("Token");

    ReviewsApi apiInstance = new ReviewsApi(defaultClient);
    BigDecimal titleId = new BigDecimal(); // BigDecimal | ID объекта для оценки
    BigDecimal reviewId = new BigDecimal(); // BigDecimal | ID отзыва
    Review review = new Review(); // Review | 
    try {
      Review result = apiInstance.titlesTitleIdReviewsReviewIdPatch(titleId, reviewId, review);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewsApi#titlesTitleIdReviewsReviewIdPatch");
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
 **review** | [**Review**](Review.md)|  | [optional]

### Return type

[**Review**](Review.md)

### Authorization

[jwt_auth](../README.md#jwt_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Отзыв |  -  |
**400** | Ошибка |  -  |
**401** | Необходим JWT токен |  -  |
**403** | Нет прав доступа |  -  |
**404** | Не найден объект оценки |  -  |

