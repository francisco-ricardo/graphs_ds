FROM eclipse-temurin:latest

RUN apt update -y && apt install -y \
    build-essential \
    vim \
    && rm -Rf /var/lib/apt/lists/*

ENTRYPOINT ["/graphs_ds/scripts/docker-entrypoint.sh"]
CMD ["/graphs_ds/scripts/docker-cmd-script.sh"]

# EOF



