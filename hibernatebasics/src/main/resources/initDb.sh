#!/bin/bash
docker run -d --name postgres-server -p 5432:5432 -e "POSTGRES_PASSWORD=1234" postgres
