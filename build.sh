#!/bin/bash

set -ex

mvn -v

ls

mvn package -DskipTests

ls

set +ex
