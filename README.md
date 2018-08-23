# celsius2fahrenheit


## Passo 0: Crie, teste e depois publique o seu projeto no GitHub.
Este projeto https://github.com/rodrigoandrades/celsius2fahrenheit.git


## Passo 1 - Conteinerizar a aplicação com o Docker 
Arquivo Dockerfile


## Passo 2 - Operar a aplicação com balanceamento de carga em 3 instâncias distintas
```
# build image
docker build -t cel2fah .

# launch nginx-proxy
docker run -d -p 80:80 -e DEFAULT_HOST=proxy.example -v /var/run/docker.sock:/tmp/docker.sock:ro --name nginx jwilder/nginx-proxy

# launch instance 1
docker run -d -p 8080 -e VIRTUAL_HOST=proxy.example cel2fah

# launch instance 2
docker run -d -p 8080 -e VIRTUAL_HOST=proxy.example cel2fah

# launch instance 3
docker run -d -p 8080 -e VIRTUAL_HOST=proxy.example cel2fah

# test
http://localhost/api/cel2fah?celsius=43
```

## Passo 3 - Operar a aplicação publicada no Azure como um conteiner Docker


## Passo 4 - Operar a aplicação como um serviço Docker Swarm


## Passo 5 - Resumo





## build docker image
docker build -t app .

## run docker
docker run -d -p 8080:8080 app