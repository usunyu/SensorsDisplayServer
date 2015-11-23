from rest_framework import permissions, status
from rest_framework.views import APIView
from rest_framework.response import Response

class WriteSensorsData(APIView):
    permission_classes = (permissions.AllowAny,)

    def post(self, request, format=None):

        ReadSensorsData.CURRENT_SENSOR_TYPE = request.data['sensorType']
        ReadSensorsData.CURRENT_SENSOR_VALUES = request.data['sensorValues']

        return Response(status=status.HTTP_200_OK)

class ReadSensorsData(APIView):
    permission_classes = (permissions.AllowAny,)

    CURRENT_SENSOR_TYPE = ''
    CURRENT_SENSOR_VALUES = []

    def get(self, request, format=None):

        result = {
            'sensorType': self.CURRENT_SENSOR_TYPE,
            'sensorValues': self.CURRENT_SENSOR_VALUES,
        }

        return Response(result, status=status.HTTP_200_OK)