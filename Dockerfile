FROM eclipse-temurin:latest

RUN apt update -y && apt install -y \
    build-essential \
    git \    
    vim \
    vim-fugitive \
    vim-scripts \
    && rm -Rf /var/lib/apt/lists/*

RUN git config --global user.name "francisco" && \
    git config --global user.email "franciscoricardo.dev@gmail.com." && \
    git config --global core.editor "vim"

ENTRYPOINT ["/algorithms/scripts/docker-entrypoint.sh"]
CMD ["/algorithms/scripts/docker-cmd-script.sh"]

# EOF



