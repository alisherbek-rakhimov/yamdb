# GenresApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**genresGet**](GenresApi.md#genresGet) | **GET** /genres/ | 
[**genresPost**](GenresApi.md#genresPost) | **POST** /genres/ | 
[**genresSlugDelete**](GenresApi.md#genresSlugDelete) | **DELETE** /genres/{slug}/ | 


<a name="genresGet"></a>
# **genresGet**
> List&lt;InlineResponse2005&gt; genresGet(search)



Получить список всех жанров  Права доступа: **Доступно без токена** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GenresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    GenresApi apiInstance = new GenresApi(defaultClient);
    String search = "search_example"; // String | фильтрует по названию жанра
    try {
      List<InlineResponse2005> result = apiInstance.genresGet(search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenresApi#genresGet");
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
 **search** | **String**| фильтрует по названию жанра | [optional]

### Return type

[**List&lt;InlineResponse2005&gt;**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список жанров с пагинацией |  -  |

<a name="genresPost"></a>
# **genresPost**
> Genre genresPost()



Создать жанр.  Права доступа: **Администратор**. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GenresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure API key authorization: jwt_auth
    ApiKeyAuth jwt_auth = (ApiKeyAuth) defaultClient.getAuthentication("jwt_auth");
    jwt_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_auth.setApiKeyPrefix("Token");

    GenresApi apiInstance = new GenresApi(defaultClient);
    try {
      Genre result = apiInstance.genresPost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenresApi#genresPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Genre**](Genre.md)

### Authorization

[jwt_auth](../README.md#jwt_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список жанров |  -  |
**400** | Ошибка |  -  |
**401** | Необходим JWT токен |  -  |
**403** | Нет прав доступа |  -  |

<a name="genresSlugDelete"></a>
# **genresSlugDelete**
> genresSlugDelete(slug)



Удалить жанр.  Права доступа: **Администратор**. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GenresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    GenresApi apiInstance = new GenresApi(defaultClient);
    String slug = "slug_example"; // String | Slug жанра
    try {
      apiInstance.genresSlugDelete(slug);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenresApi#genresSlugDelete");
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
 **slug** | **String**| Slug жанра |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** |  |  -  |
**401** | Необходим JWT токен |  -  |
**403** | Нет прав доступа |  -  |
**404** | Жанр не найден |  -  |

