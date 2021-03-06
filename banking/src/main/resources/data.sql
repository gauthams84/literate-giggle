DROP TABLE IF EXISTS ACCOUNT;
DROP TABLE IF EXISTS TRANSACTION;

CREATE TABLE ACCOUNT (
ACCOUNT_NUMBER INTEGER PRIMARY KEY,
ACCOUNT_NAME VARCHAR2(300 CHAR),
ACCOUNT_TYPE VARCHAR2(300 CHAR),
BALANCE_DATE DATE,
CURRENCY VARCHAR2(300 CHAR),
ACCOUNT_BALANCE INTEGER
);

CREATE TABLE TRANSACTION (
ACCOUNT_NUMBER INTEGER,
CREDIT_AMOUNT NUMBER,
DEBIT_AMOUNT NUMBER,
TRANSACTION_DATE DATE,
TRANSACTION_TYPE VARCHAR2(300 CHAR),
TRANSACTION_NARRATIVE VARCHAR2(300 CHAR)
);

INSERT INTO ACCOUNT (ACCOUNT_NUMBER, ACCOUNT_NAME, ACCOUNT_TYPE, BALANCE_DATE, CURRENCY, ACCOUNT_BALANCE)
VALUES (585309209, 'SGSavings726', 'Savings', sysdate, 'SGD', 84375.24);

INSERT INTO ACCOUNT (ACCOUNT_NUMBER, ACCOUNT_NAME, ACCOUNT_TYPE, BALANCE_DATE, CURRENCY, ACCOUNT_BALANCE)
VALUES (791066619, 'AUSavings933', 'Savings', sysdate, 'AUD', 88005.93);

INSERT INTO ACCOUNT (ACCOUNT_NUMBER, ACCOUNT_NAME, ACCOUNT_TYPE, BALANCE_DATE, CURRENCY, ACCOUNT_BALANCE)
VALUES (321143048, 'AUCurrent433', 'Current', sysdate, 'AUD', 38010.62);

INSERT INTO ACCOUNT (ACCOUNT_NUMBER, ACCOUNT_NAME, ACCOUNT_TYPE, BALANCE_DATE, CURRENCY, ACCOUNT_BALANCE)
VALUES (347786244, 'SGCurrent166', 'Current', sysdate, 'SGD', 50664.65);


INSERT INTO TRANSACTION (ACCOUNT_NUMBER, CREDIT_AMOUNT,  DEBIT_AMOUNT, TRANSACTION_DATE, TRANSACTION_TYPE, TRANSACTION_NARRATIVE)
VALUES (585309209, 54000.14, 0, sysdate, 'credit', 'little saving');

INSERT INTO TRANSACTION (ACCOUNT_NUMBER, CREDIT_AMOUNT,  DEBIT_AMOUNT, TRANSACTION_DATE, TRANSACTION_TYPE, TRANSACTION_NARRATIVE)
VALUES (585309209, 30375.10, 0, sysdate, 'credit', 'little saving1');

INSERT INTO TRANSACTION (ACCOUNT_NUMBER, CREDIT_AMOUNT,  DEBIT_AMOUNT, TRANSACTION_DATE, TRANSACTION_TYPE, TRANSACTION_NARRATIVE)
VALUES (791066619, 48000.43, 0, sysdate, 'credit', 'some saving');

INSERT INTO TRANSACTION (ACCOUNT_NUMBER, CREDIT_AMOUNT,  DEBIT_AMOUNT, TRANSACTION_DATE, TRANSACTION_TYPE, TRANSACTION_NARRATIVE)
VALUES (791066619, 40005.50, 0, sysdate, 'credit', 'some saving1');

INSERT INTO TRANSACTION (ACCOUNT_NUMBER, CREDIT_AMOUNT,  DEBIT_AMOUNT, TRANSACTION_DATE, TRANSACTION_TYPE, TRANSACTION_NARRATIVE)
VALUES (321143048, 30000.50, 0, sysdate, 'credit', 'aussie saving');

INSERT INTO TRANSACTION (ACCOUNT_NUMBER, CREDIT_AMOUNT,  DEBIT_AMOUNT, TRANSACTION_DATE, TRANSACTION_TYPE, TRANSACTION_NARRATIVE)
VALUES (321143048, 8010.12, 0, sysdate, 'credit', 'aussie saving1');

INSERT INTO TRANSACTION (ACCOUNT_NUMBER, CREDIT_AMOUNT,  DEBIT_AMOUNT, TRANSACTION_DATE, TRANSACTION_TYPE, TRANSACTION_NARRATIVE)
VALUES (347786244, 25000.50, 0, sysdate, 'credit', 'singpr saving');

INSERT INTO TRANSACTION (ACCOUNT_NUMBER, CREDIT_AMOUNT,  DEBIT_AMOUNT, TRANSACTION_DATE, TRANSACTION_TYPE, TRANSACTION_NARRATIVE)
VALUES (347786244, 25664.15, 0, sysdate, 'credit', 'singpr saving1');


