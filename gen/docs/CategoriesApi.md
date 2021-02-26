# CategoriesApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categoriesGet**](CategoriesApi.md#categoriesGet) | **GET** /categories/ | 
[**categoriesPost**](CategoriesApi.md#categoriesPost) | **POST** /categories/ | 
[**categoriesSlugDelete**](CategoriesApi.md#categoriesSlugDelete) | **DELETE** /categories/{slug}/ | 


<a name="categoriesGet"></a>
# **categoriesGet**
> List&lt;InlineResponse2003&gt; categoriesGet(search)



Получить список всех категорий  Права доступа: **Доступно без токена** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    String search = "search_example"; // String | фильтрует по названию категории
    try {
      List<InlineResponse2003> result = apiInstance.categoriesGet(search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#categoriesGet");
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
 **search** | **String**| фильтрует по названию категории | [optional]

### Return type

[**List&lt;InlineResponse2003&gt;**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список категорий с пагинацией |  -  |

<a name="categoriesPost"></a>
# **categoriesPost**
> Category categoriesPost(category)



Создать категорию.  Права доступа: **Администратор.** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure API key authorization: jwt_auth
    ApiKeyAuth jwt_auth = (ApiKeyAuth) defaultClient.getAuthentication("jwt_auth");
    jwt_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_auth.setApiKeyPrefix("Token");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Category category = new Category(); // Category | 
    try {
      Category result = apiInstance.categoriesPost(category);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#categoriesPost");
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
 **category** | [**Category**](Category.md)|  | [optional]

### Return type

[**Category**](Category.md)

### Authorization

[jwt_auth](../README.md#jwt_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список категорий |  -  |
**400** | Ошибка |  -  |
**401** | Необходим JWT токен |  -  |
**403** | Нет прав доступа |  -  |

<a name="categoriesSlugDelete"></a>
# **categoriesSlugDelete**
> categoriesSlugDelete(slug)



Удалить категорию.  Права доступа: **Администратор.** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure API key authorization: jwt_auth
    ApiKeyAuth jwt_auth = (ApiKeyAuth) defaultClient.getAuthentication("jwt_auth");
    jwt_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_auth.setApiKeyPrefix("Token");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    String slug = "slug_example"; // String | Slug категории
    try {
      apiInstance.categoriesSlugDelete(slug);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#categoriesSlugDelete");
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
 **slug** | **String**| Slug категории |

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
**404** | Категория не найдена |  -  |

