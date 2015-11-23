from django.shortcuts import render

def index(request):
    context = {}
    return render(request, 'sensors_display/index.html', context)