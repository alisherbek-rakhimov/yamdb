from django.contrib.auth import get_user_model
from django.db import models

User = get_user_model()


class Category(models.Model):
    title = models.CharField(max_length=255)


class Title(models.Model):
    owner = models.ForeignKey(User, on_delete=models.CASCADE, related_name='titles')
    category = models.ForeignKey(Category, on_delete=models.CASCADE, related_name='category')


class Review(models.Model):
    title = models.ForeignKey(Title, on_delete=models.CASCADE, related_name='reviews')
    text = models.TextField()
    rating = models.IntegerField(choices=(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), null=True, blank=True)


class Genre(models.Model):
    genre = models.ManyToManyField(Title, on_delete=models.CASCADE, related_name='genres')


class Comment(models.Model):
    review = models.ForeignKey(Review, on_delete=models.CASCADE, related_name='comments')
    text = models.TextField()

    # class Meta:
    #     unique_together