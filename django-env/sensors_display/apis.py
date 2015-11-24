from rest_framework import permissions, status
from rest_framework.views import APIView
from rest_framework.response import Response

class SensorRange(APIView):
    permission_classes = (permissions.AllowAny,)

    MIN_VALUE = 0
    MAX_VALUE = 0

    def post(self, request, format=None):

        self.MIN_VALUE = request.data['min']
        self.MAX_VALUE = request.data['max']

        return Response(status=status.HTTP_200_OK)

    def get(self, request, format=None):

        result = {
            'min': self.MIN_VALUE,
            'max': self.MAX_VALUE,
        }

        return Response(result, status=status.HTTP_200_OK)


class SensorsData(APIView):
    permission_classes = (permissions.AllowAny,)

    CURRENT_SENSOR_TYPE = ''
    CURRENT_SENSOR_VALUES = []

    def post(self, request, format=None):

        self.CURRENT_SENSOR_TYPE = request.data['sensorType']
        self.CURRENT_SENSOR_VALUES = request.data['sensorValues']

        return Response(status=status.HTTP_200_OK)

    def get(self, request, format=None):

        result = {
            'sensorType': self.CURRENT_SENSOR_TYPE,
            'sensorValues': self.CURRENT_SENSOR_VALUES,
        }

        return Response(result, status=status.HTTP_200_OK)
