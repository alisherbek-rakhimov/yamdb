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


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for User
 */
public class UserTest {
    private final User model = new User();

    /**
     * Model tests for User
     */
    @Test
    public void testUser() {
        // TODO: test User
    }

    /**
     * Test the property 'firstName'
     */
    @Test
    public void firstNameTest() {
        // TODO: test firstName
    }

    /**
     * Test the property 'lastName'
     */
    @Test
    public void lastNameTest() {
        // TODO: test lastName
    }

    /**
     * Test the property 'username'
     */
    @Test
    public void usernameTest() {
        // TODO: test username
    }

    /**
     * Test the property 'bio'
     */
    @Test
    public void bioTest() {
        // TODO: test bio
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'role'
     */
    @Test
    public void roleTest() {
        // TODO: test role
    }

}
