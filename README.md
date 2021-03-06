## Table of contents
* [General info](#general-info)
* [Setup](#setup)
* [Constraints](#constraints)

## General Info
Project stub contains REST APIs for
1. Retrieving Banking Accounts - /banking/accounts
2. Reetrieving list of transactions for a given account number - /banking/transactions/{accountNumber}


## Setup
1. Execute the project as a regular Spring Boot app
2. The project makes use of H2 in-memory database as data repository. 
3. H2 console is enabled to view the tables. Access H2 console on http://localhost:8080/h2-console/ after server startup.

## Constraints
1. Have implemented simple Exception handler due to time constraints.
2. Simple JUnit tests have been implemented. No integration tests have been written.
3. Content Negotiation - Accepts JSON and XML

