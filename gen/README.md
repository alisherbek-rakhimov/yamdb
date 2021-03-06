# openapi-java-client

YaMDb API
- API version: 1.0.0
  - Build date: 2021-02-19T13:29:47.716016900+05:00[Asia/Tashkent]

запросы к API начинаются с `/api/v1/`

# Описание
Проект **YaMDb** собирает отзывы пользователей на произведения. Произведения делятся на категории: «Книги», «Фильмы», «Музыка».

# Алгоритм регистрации пользователей
1. Пользователь отправляет запрос с параметром `email` на `/auth/email/`.
2. **YaMDB** отправляет письмо с кодом подтверждения (`confirmation_code`) на адрес  `email` .
3. Пользователь отправляет запрос с параметрами `email` и `confirmation_code` на `/auth/token/`, в ответе на запрос ему приходит `token` (JWT-токен).
4. При желании пользователь отправляет PATCH-запрос на `/users/me/` и заполняет поля в своём профайле (описание полей — в документации).

# Пользовательские роли
- **Аноним** — может просматривать описания произведений, читать отзывы и комментарии.
- **Аутентифицированный пользователь** — может, как и **Аноним**, читать всё, дополнительно он может публиковать отзывы и ставить рейтинг произведениям (фильмам/книгам/песенкам), может комментировать чужие отзывы и ставить им оценки; может редактировать и удалять **свои** отзывы и комментарии.
- **Модератор** — те же права, что и у **Аутентифицированного пользователя** плюс право удалять **любые** отзывы и комментарии.
- **Администратор** — полные права на управление проектом и всем его содержимым. Может создавать и удалять категории и произведения. Может назначать роли пользователям.
- **Администратор Django** — те же права, что и у роли **Администратор**.



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    AuthApi apiInstance = new AuthApi(defaultClient);
    UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE = new UNKNOWN_BASE_TYPE(); // UNKNOWN_BASE_TYPE | 
    try {
      Object result = apiInstance.authEmailPost(UNKNOWN_BASE_TYPE);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authEmailPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**authEmailPost**](docs/AuthApi.md#authEmailPost) | **POST** /auth/email/ | 
*AuthApi* | [**authTokenPost**](docs/AuthApi.md#authTokenPost) | **POST** /auth/token/ | 
*CategoriesApi* | [**categoriesGet**](docs/CategoriesApi.md#categoriesGet) | **GET** /categories/ | 
*CategoriesApi* | [**categoriesPost**](docs/CategoriesApi.md#categoriesPost) | **POST** /categories/ | 
*CategoriesApi* | [**categoriesSlugDelete**](docs/CategoriesApi.md#categoriesSlugDelete) | **DELETE** /categories/{slug}/ | 
*CommentsApi* | [**titlesTitleIdReviewsReviewIdCommentsCommentIdDelete**](docs/CommentsApi.md#titlesTitleIdReviewsReviewIdCommentsCommentIdDelete) | **DELETE** /titles/{title_id}/reviews/{review_id}/comments/{comment_id}/ | 
*CommentsApi* | [**titlesTitleIdReviewsReviewIdCommentsCommentIdGet**](docs/CommentsApi.md#titlesTitleIdReviewsReviewIdCommentsCommentIdGet) | **GET** /titles/{title_id}/reviews/{review_id}/comments/{comment_id}/ | 
*CommentsApi* | [**titlesTitleIdReviewsReviewIdCommentsCommentIdPatch**](docs/CommentsApi.md#titlesTitleIdReviewsReviewIdCommentsCommentIdPatch) | **PATCH** /titles/{title_id}/reviews/{review_id}/comments/{comment_id}/ | 
*CommentsApi* | [**titlesTitleIdReviewsReviewIdCommentsGet**](docs/CommentsApi.md#titlesTitleIdReviewsReviewIdCommentsGet) | **GET** /titles/{title_id}/reviews/{review_id}/comments/ | 
*CommentsApi* | [**titlesTitleIdReviewsReviewIdCommentsPost**](docs/CommentsApi.md#titlesTitleIdReviewsReviewIdCommentsPost) | **POST** /titles/{title_id}/reviews/{review_id}/comments/ | 
*GenresApi* | [**genresGet**](docs/GenresApi.md#genresGet) | **GET** /genres/ | 
*GenresApi* | [**genresPost**](docs/GenresApi.md#genresPost) | **POST** /genres/ | 
*GenresApi* | [**genresSlugDelete**](docs/GenresApi.md#genresSlugDelete) | **DELETE** /genres/{slug}/ | 
*ReviewsApi* | [**titlesTitleIdReviewsGet**](docs/ReviewsApi.md#titlesTitleIdReviewsGet) | **GET** /titles/{title_id}/reviews/ | 
*ReviewsApi* | [**titlesTitleIdReviewsPost**](docs/ReviewsApi.md#titlesTitleIdReviewsPost) | **POST** /titles/{title_id}/reviews/ | 
*ReviewsApi* | [**titlesTitleIdReviewsReviewIdDelete**](docs/ReviewsApi.md#titlesTitleIdReviewsReviewIdDelete) | **DELETE** /titles/{title_id}/reviews/{review_id}/ | 
*ReviewsApi* | [**titlesTitleIdReviewsReviewIdGet**](docs/ReviewsApi.md#titlesTitleIdReviewsReviewIdGet) | **GET** /titles/{title_id}/reviews/{review_id}/ | 
*ReviewsApi* | [**titlesTitleIdReviewsReviewIdPatch**](docs/ReviewsApi.md#titlesTitleIdReviewsReviewIdPatch) | **PATCH** /titles/{title_id}/reviews/{review_id}/ | 
*TitlesApi* | [**titlesGet**](docs/TitlesApi.md#titlesGet) | **GET** /titles/ | 
*TitlesApi* | [**titlesPost**](docs/TitlesApi.md#titlesPost) | **POST** /titles/ | 
*TitlesApi* | [**titlesTitlesIdDelete**](docs/TitlesApi.md#titlesTitlesIdDelete) | **DELETE** /titles/{titles_id}/ | 
*TitlesApi* | [**titlesTitlesIdGet**](docs/TitlesApi.md#titlesTitlesIdGet) | **GET** /titles/{titles_id}/ | 
*TitlesApi* | [**titlesTitlesIdPatch**](docs/TitlesApi.md#titlesTitlesIdPatch) | **PATCH** /titles/{titles_id}/ | 
*UsersApi* | [**usersGet**](docs/UsersApi.md#usersGet) | **GET** /users/ | 
*UsersApi* | [**usersMeGet**](docs/UsersApi.md#usersMeGet) | **GET** /users/me/ | 
*UsersApi* | [**usersMePatch**](docs/UsersApi.md#usersMePatch) | **PATCH** /users/me/ | 
*UsersApi* | [**usersPost**](docs/UsersApi.md#usersPost) | **POST** /users/ | 
*UsersApi* | [**usersUsernameDelete**](docs/UsersApi.md#usersUsernameDelete) | **DELETE** /users/{username}/ | 
*UsersApi* | [**usersUsernameGet**](docs/UsersApi.md#usersUsernameGet) | **GET** /users/{username}/ | 
*UsersApi* | [**usersUsernamePatch**](docs/UsersApi.md#usersUsernamePatch) | **PATCH** /users/{username}/ | 


## Documentation for Models

 - [Category](docs/Category.md)
 - [Comment](docs/Comment.md)
 - [Genre](docs/Genre.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [Review](docs/Review.md)
 - [Title](docs/Title.md)
 - [TitleCreate](docs/TitleCreate.md)
 - [Token](docs/Token.md)
 - [User](docs/User.md)
 - [ValidationError](docs/ValidationError.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### jwt_auth

- **Type**: API key
- **API key parameter name**: Bearer
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



