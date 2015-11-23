from rest_framework import permissions, status
from rest_framework.views import APIView
from rest_framework.response import Response

TITLE_LIST = []
DATA_BUFFER = []

class WriteSensorsData(APIView):
    permission_classes = (permissions.AllowAny,)

    def get(self, request, format=None):

        print 'has been called'

        return Response(status=status.HTTP_200_OK)

class ReadSensorsData(APIView):
    permission_classes = (permissions.AllowAny,)

    def get(self, request, format=None):

        return Response(status=status.HTTP_200_OK)