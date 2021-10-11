# AUTHENTICATION AND AUTHORISATION USING KEYCLOAK WITH SPRING BOOT
## Sampe of use keycloak
___

## Default settings for keycloak
1. PORT: 8000
2. Admin: sarpio
3. Admin password: sarpio

## Two accounts defined

| No| USERNAME  | PASSWORD |
|---| --------- | -------- |
| 1 | user      | user     |
| 2 | admin     | admin    |


## Endpoints

| No| Endpoint  | Athorization   |
|---| --------- | ------------   |
| 1 | /user     | user and admin |
| 2 | /admin    | admin          |
