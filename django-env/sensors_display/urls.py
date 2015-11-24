"""sensors_display URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/1.8/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  url(r'^$', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  url(r'^$', Home.as_view(), name='home')
Including another URLconf
    1. Add an import:  from blog import urls as blog_urls
    2. Add a URL to urlpatterns:  url(r'^blog/', include(blog_urls))
"""
from django.conf.urls import include, url
from django.contrib import admin

from sensors_display import views, apis

urlpatterns = [
    url(r'^admin/', include(admin.site.urls)),
    # index urls
    url(r'^$', views.index),
    # rest framework urls
    url(r'^api-auth/', include('rest_framework.urls', namespace='rest_framework')),
    # write/read data api
    url(r'^api/write/$', apis.SensorsData.as_view()),
    # write/read range api
    url(r'^api/read/$', apis.SensorRange.as_view()),
]
