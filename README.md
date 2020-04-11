# benefits_calc_back_end

## Project Description and Explanation

This application provides a means for the front end to retrieve user benefits. The user will log in using a username and password on the front end. The user’s username and password are then checked against the allAuthorizedList.json for authorization. If authentication is correct the user’s unique identifier is sent forward to the UI from the list. A call is then made with this unique ID from the UI against the IDs located in allBenefitsList.json. If a match is found the user’s benefits are sent forward.

## Project setup

```
Follow instructions from this https://docs.spring.io/spring-boot/docs/current/reference/html/deployment.html#deployment-install website to deploy to your local environment.
```

## Future Features

Implement a hock for grabbing data from a database.
