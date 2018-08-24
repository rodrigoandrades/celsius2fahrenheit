# celsius2fahrenheit


## Passo 0: Crie, teste e depois publique o seu projeto no GitHub.
Este projeto https://github.com/rodrigoandrades/celsius2fahrenheit.git


## Passo 1 - Conteinerizar a aplicação com o Docker 
Arquivo Dockerfile


## Passo 2 - Operar a aplicação com balanceamento de carga em 3 instâncias distintas
```
# contruir imagem docker
docker build -t cel2fah .

# instânciar nginx-proxy
docker run -d -p 80:80 -e DEFAULT_HOST=proxy.example -v /var/run/docker.sock:/tmp/docker.sock:ro --name nginx jwilder/nginx-proxy

# instânciar processo 1
docker run -d -p 8080 -e VIRTUAL_HOST=proxy.example cel2fah

# instânciar processo 2
docker run -d -p 8080 -e VIRTUAL_HOST=proxy.example cel2fah

# instânciar processo 3
docker run -d -p 8080 -e VIRTUAL_HOST=proxy.example cel2fah

# testar
http://localhost/api/cel2fah?celsius=43
```

## Passo 3 - Operar a aplicação publicada no Azure como um conteiner Docker
```
# criar uma conta no docker hub: https://hub.docker.com (já criado, não é necessário executar)

# contruir imagem docker (já criado, não é necessário executar)
docker build -t cel2fah .

# logar no docker hub (já criado, não é necessário executar)
docker login

# versionar imagem docker (já criado, não é necessário executar)
docker tag cel2fah pucarquiteranuvem/cel2fah

# enviar imagem docker (já criado, não é necessário executar)
docker push pucarquiteranuvem/cel2fah

# acessar: https://www.katacoda.com/courses/azure/deploying-container-instances

# efetuar login na azure
az login -u $username -p $password

# executar o comando:
az container create \
-g $resource \
--name cel2fah \
--image pucarquiteranuvem/cel2fah \
--ip-address public

# testar
http://<IP_GERADO>/api/cel2fah?celsius=43

```


## Passo 4 - Operar a aplicação como um serviço Docker Swarm


## Passo 5 - Resumo
