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
import java.math.BigDecimal;
import org.openapitools.client.model.Comment;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.ValidationError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommentsApi
 */
@Ignore
public class CommentsApiTest {

    private final CommentsApi api = new CommentsApi();

    
    /**
     * 
     *
     * Удалить комментарий к отзыву по id.  Права доступа: **Автор комментария, модератор или администратор**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void titlesTitleIdReviewsReviewIdCommentsCommentIdDeleteTest() throws ApiException {
        BigDecimal titleId = null;
        BigDecimal reviewId = null;
        BigDecimal commentId = null;
        api.titlesTitleIdReviewsReviewIdCommentsCommentIdDelete(titleId, reviewId, commentId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Получить комментарий для отзыва по id.  Права доступа: **Доступно без токена.** 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void titlesTitleIdReviewsReviewIdCommentsCommentIdGetTest() throws ApiException {
        BigDecimal titleId = null;
        BigDecimal reviewId = null;
        BigDecimal commentId = null;
        Comment response = api.titlesTitleIdReviewsReviewIdCommentsCommentIdGet(titleId, reviewId, commentId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Частично обновить комментарий к отзыву по id.  Права доступа: **Автор комментария, модератор или администратор**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void titlesTitleIdReviewsReviewIdCommentsCommentIdPatchTest() throws ApiException {
        BigDecimal titleId = null;
        BigDecimal reviewId = null;
        BigDecimal commentId = null;
        Comment comment = null;
        Comment response = api.titlesTitleIdReviewsReviewIdCommentsCommentIdPatch(titleId, reviewId, commentId, comment);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Получить список всех комментариев к отзыву по id  Права доступа: **Доступно без токена.** 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void titlesTitleIdReviewsReviewIdCommentsGetTest() throws ApiException {
        BigDecimal titleId = null;
        BigDecimal reviewId = null;
        List<InlineResponse2001> response = api.titlesTitleIdReviewsReviewIdCommentsGet(titleId, reviewId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Создать новый комментарий для отзыва.  Права доступа: **Аутентифицированные пользователи.** 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void titlesTitleIdReviewsReviewIdCommentsPostTest() throws ApiException {
        BigDecimal titleId = null;
        BigDecimal reviewId = null;
        Comment comment = null;
        Comment response = api.titlesTitleIdReviewsReviewIdCommentsPost(titleId, reviewId, comment);

        // TODO: test validations
    }
    
}
