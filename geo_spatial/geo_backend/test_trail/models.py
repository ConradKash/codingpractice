from django.db import models

# Create your models here.
class PointOfInterest(models.Model):
    name = models.CharField(max_length=100)
    
    # 1. PointField: Stores a single coordinate (Lon, Lat)
    # Default SRID is 4326 (WGS 84 / GPS coordinates)
    location = models.PointField()
    
    # 2. PolygonField: Stores an enclosed area (e.g., a city boundary)
    boundary = models.PolygonField(null=True, blank=True)
    
    # 3. LineStringField: Stores a path (e.g., a road or river)
    path = models.LineStringField(null=True, blank=True)

    def __str__(self):
        return self.name