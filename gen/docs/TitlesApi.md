# TitlesApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**titlesGet**](TitlesApi.md#titlesGet) | **GET** /titles/ | 
[**titlesPost**](TitlesApi.md#titlesPost) | **POST** /titles/ | 
[**titlesTitlesIdDelete**](TitlesApi.md#titlesTitlesIdDelete) | **DELETE** /titles/{titles_id}/ | 
[**titlesTitlesIdGet**](TitlesApi.md#titlesTitlesIdGet) | **GET** /titles/{titles_id}/ | 
[**titlesTitlesIdPatch**](TitlesApi.md#titlesTitlesIdPatch) | **PATCH** /titles/{titles_id}/ | 


<a name="titlesGet"></a>
# **titlesGet**
> List&lt;InlineResponse2004&gt; titlesGet(category, genre, name, year)



Получить список всех объектов   Права доступа: **Доступно без токена** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TitlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    TitlesApi apiInstance = new TitlesApi(defaultClient);
    String category = "category_example"; // String | фильтрует по slug категории
    String genre = "genre_example"; // String | фильтрует по slug genre
    String name = "name_example"; // String | фильтрует по части названия объекта
    BigDecimal year = new BigDecimal(); // BigDecimal | фильтрует по году
    try {
      List<InlineResponse2004> result = apiInstance.titlesGet(category, genre, name, year);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TitlesApi#titlesGet");
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
 **category** | **String**| фильтрует по slug категории | [optional]
 **genre** | **String**| фильтрует по slug genre | [optional]
 **name** | **String**| фильтрует по части названия объекта | [optional]
 **year** | **BigDecimal**| фильтрует по году | [optional]

### Return type

[**List&lt;InlineResponse2004&gt;**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список объектов с пагинацией |  -  |

<a name="titlesPost"></a>
# **titlesPost**
> Title titlesPost(titleCreate)



Создать произведение для отзывов.  Права доступа: **Администратор**. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TitlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure API key authorization: jwt_auth
    ApiKeyAuth jwt_auth = (ApiKeyAuth) defaultClient.getAuthentication("jwt_auth");
    jwt_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_auth.setApiKeyPrefix("Token");

    TitlesApi apiInstance = new TitlesApi(defaultClient);
    TitleCreate titleCreate = new TitleCreate(); // TitleCreate | 
    try {
      Title result = apiInstance.titlesPost(titleCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TitlesApi#titlesPost");
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
 **titleCreate** | [**TitleCreate**](TitleCreate.md)|  | [optional]

### Return type

[**Title**](Title.md)

### Authorization

[jwt_auth](../README.md#jwt_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список объектов |  -  |
**400** | Ошибка |  -  |
**401** | Необходим JWT токен |  -  |
**403** | Нет прав доступа |  -  |

<a name="titlesTitlesIdDelete"></a>
# **titlesTitlesIdDelete**
> titlesTitlesIdDelete(titlesId)



Удалить произведение.  Права доступа: **Администратор**. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TitlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure API key authorization: jwt_auth
    ApiKeyAuth jwt_auth = (ApiKeyAuth) defaultClient.getAuthentication("jwt_auth");
    jwt_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_auth.setApiKeyPrefix("Token");

    TitlesApi apiInstance = new TitlesApi(defaultClient);
    BigDecimal titlesId = new BigDecimal(); // BigDecimal | ID объекта
    try {
      apiInstance.titlesTitlesIdDelete(titlesId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TitlesApi#titlesTitlesIdDelete");
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
 **titlesId** | **BigDecimal**| ID объекта |

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
**404** | Объект не найден |  -  |

<a name="titlesTitlesIdGet"></a>
# **titlesTitlesIdGet**
> Title titlesTitlesIdGet(titlesId)



Информация об объекте   Права доступа: **Доступно без токена** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TitlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    TitlesApi apiInstance = new TitlesApi(defaultClient);
    BigDecimal titlesId = new BigDecimal(); // BigDecimal | ID объекта
    try {
      Title result = apiInstance.titlesTitlesIdGet(titlesId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TitlesApi#titlesTitlesIdGet");
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
 **titlesId** | **BigDecimal**| ID объекта |

### Return type

[**Title**](Title.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Объект |  -  |
**404** | Объект не найден |  -  |

<a name="titlesTitlesIdPatch"></a>
# **titlesTitlesIdPatch**
> Title titlesTitlesIdPatch(titlesId, titleCreate)



Обновить информацию об объекте   Права доступа: **Администратор** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TitlesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure API key authorization: jwt_auth
    ApiKeyAuth jwt_auth = (ApiKeyAuth) defaultClient.getAuthentication("jwt_auth");
    jwt_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_auth.setApiKeyPrefix("Token");

    TitlesApi apiInstance = new TitlesApi(defaultClient);
    BigDecimal titlesId = new BigDecimal(); // BigDecimal | ID объекта
    TitleCreate titleCreate = new TitleCreate(); // TitleCreate | 
    try {
      Title result = apiInstance.titlesTitlesIdPatch(titlesId, titleCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TitlesApi#titlesTitlesIdPatch");
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
 **titlesId** | **BigDecimal**| ID объекта |
 **titleCreate** | [**TitleCreate**](TitleCreate.md)|  | [optional]

### Return type

[**Title**](Title.md)

### Authorization

[jwt_auth](../README.md#jwt_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Объект |  -  |
**401** | Необходим JWT токен |  -  |
**403** | Нет прав доступа |  -  |
**404** | Объект не найден |  -  |

