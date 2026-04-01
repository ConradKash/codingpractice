FROM python:3.11-slim

# Install system dependencies for GeoDjango
RUN apt-get update && apt-get install -y \
    binutils \
    libproj-dev \
    gdal-bin \
    libgdal-dev \
    python3-gdal \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /code
COPY requirements.txt .
RUN pip install -r requirements.txt
COPY . .
