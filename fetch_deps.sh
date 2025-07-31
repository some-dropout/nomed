#!/bin/bash

font_ver=5.15
font_url="https://github.com/nomfoundation/font/releases/download/v${font_ver}/NomNaTong-Regular.otf"

dict_url="https://github.com/some-dropout/nomdb/raw/refs/heads/main/main.csv"

# fail fast
set -e

# verbose
set -x

cd assets

wget -nv --show-progress -N "$font_url"

wget -nv --show-progress "$dict_url" -O dict.csv
