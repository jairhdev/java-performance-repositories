# java-performance-repositories
API para teste de performance com banco de dados

# V1

* Banco de dados Postgres.
* Teste de INSERT.
* Tabela mais simples possível, com apenas uma coluna além da primary key.
* JpaRepository
* CrudRepository

## Para acessar a API
### JpaRepository
<http://localhost:8080/api/product/v1/jpa>

### CrudRepository
<http://localhost:8080/api/product/v1/crud>

## Exemplo request
```
{
    "quantitySave": 1000
}
```

## Exemplo response
```
{
    "quantitySave": 1000,
    "totalTimeMillis": 175,
    "totalTimeSeconds": 0
}
```
