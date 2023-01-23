![img.png](img/img.png)

# api-first-development i.e. Contract First Development

## Contract first development using Swagger API

## Dependencies

- Java Development Kit - JDK 11

## Backend

- Using: http://localhost:8080 for the project!


### General setup (Guide)


- In service see as follows:

    -   Database in case of dev and prod: MyQL Server (environment variables set for project, pls. user your own!)

  - In case of test: H2 in memory database used (see application.properties for setup under test folder)

- Environment Variables as follows: 

| Name               | Value        | Remark            | Extra remark                                             |
|--------------------|--------------|-------------------|----------------------------------------------------------|
| DB_PORT            | 3306         | default           |                                                          |
| DB_URL             | no such info | pls use your own!       |                                                          |
| DB_USER            | root         | default           |                                                          |
| DB_PASSWORD        | no such info | pls use your own! | [MYSQL Installation Guide](https://dev.mysql.com/doc/mysql-installation-excerpt/5.7/en/) |