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
import org.openapitools.client.model.Genre;
import org.openapitools.client.model.InlineResponse2005;
import org.openapitools.client.model.ValidationError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GenresApi
 */
@Ignore
public class GenresApiTest {

    private final GenresApi api = new GenresApi();

    
    /**
     * 
     *
     * Получить список всех жанров  Права доступа: **Доступно без токена** 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genresGetTest() throws ApiException {
        String search = null;
        List<InlineResponse2005> response = api.genresGet(search);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Создать жанр.  Права доступа: **Администратор**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genresPostTest() throws ApiException {
        Genre response = api.genresPost();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Удалить жанр.  Права доступа: **Администратор**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genresSlugDeleteTest() throws ApiException {
        String slug = null;
        api.genresSlugDelete(slug);

        // TODO: test validations
    }
    
}
