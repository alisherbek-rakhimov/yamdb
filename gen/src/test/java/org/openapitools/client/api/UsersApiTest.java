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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.InlineResponse2002;
import org.openapitools.client.model.User;
import org.openapitools.client.model.ValidationError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * 
     *
     * Получить список всех пользователей.  Права доступа: **Администратор** 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersGetTest() throws ApiException {
        String search = null;
        List<InlineResponse2002> response = api.usersGet(search);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Получить данные своей учетной записи  Права доступа: **Любой авторизованный пользователь** 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersMeGetTest() throws ApiException {
        List<User> response = api.usersMeGet();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Изменить данные своей учетной записи  Права доступа: **Любой авторизованный пользователь** 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersMePatchTest() throws ApiException {
        User user = null;
        User response = api.usersMePatch(user);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Создание пользователя.  Права доступа: **Администратор**\&quot; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersPostTest() throws ApiException {
        User user = null;
        User response = api.usersPost(user);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Удалить пользователя по username.  Права доступа: **Администратор.** 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUsernameDeleteTest() throws ApiException {
        String username = null;
        api.usersUsernameDelete(username);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Получить пользователя по username.  Права доступа: **Администратор** 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUsernameGetTest() throws ApiException {
        String username = null;
        User response = api.usersUsernameGet(username);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Изменить данные пользователя по username.  Права доступа: **Администратор.** 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUsernamePatchTest() throws ApiException {
        String username = null;
        User user = null;
        User response = api.usersUsernamePatch(username, user);

        // TODO: test validations
    }
    
}