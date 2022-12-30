# Currency Converter

A small helper app for performing currency exchange rate conversions. Create a concept for a currency conversion solution app that will input the source and target currency, enter an amount and trigger the conversion from source to target. The app will display a list of conversions and current exchange rates for the selected source currency.

## API Endpoints
API Base URL: `http://localhost:8080`
* `GET /symbol` API returns a list of 3-character currency codes that are available for exchange.
* `GET /convert?from=EUR&to=INR&amount=100` API returns the conversion rate
  * Here `from` and `to` should be the 3-character currency code available for exchanges
  * and `amount` on which conversion information will be fetched and displayed

Here's the output,
```
GET /symbol HTTP/1.1
User-Agent: PostmanRuntime/7.30.0
Accept: */*
Cache-Control: no-cache
Postman-Token: 44636757-4908-42d7-90de-f9e6810a3ac3
Host: localhost:8080
Accept-Encoding: gzip, deflate, br
Connection: keep-alive
 
HTTP/1.1 200 OK
Content-Type: application/json
Transfer-Encoding: chunked
Date: Fri, 30 Dec 2022 04:31:22 GMT
Keep-Alive: timeout=60
Connection: keep-alive
 
["FJD","MXN","STD","SCR","CDF","BBD","GTQ","CLP","HNL","UGX","ZAR","TND","STN","CUC","BSD","SLL","SDG","IQD","CUP","GMD","TWD","RSD","DOP","KMF","MYR","FKP","XOF","GEL","BTC","UYU","MAD","CVE","TOP","AZN","OMR","PGK","KES","SEK","CNH","BTN","UAH","GNF","ERN","MZN","SVC","ARS","QAR","IRR","XPD","CNY","THB","UZS","XPF","MRU","BDT","LYD","BMD","KWD","PHP","XPT","RUB","PYG","ISK","JMD","COP","MKD","USD","DZD","PAB","GGP","SGD","ETB","JEP","KGS","SOS","VUV","LAK","BND","XAF","LRD","XAG","CHF","HRK","ALL","DJF","VES","ZMW","TZS","VND","XAU","AUD","ILS","GHS","GYD","KPW","BOB","KHR","MDL","IDR","KYD","AMD","BWP","SHP","TRY","LBP","TJS","JOD","AED","HKD","RWF","EUR","LSL","DKK","CAD","BGN","MMK","MUR","NOK","SYP","IMP","ZWL","GIP","RON","LKR","NGN","CRC","CZK","PKR","XCD","ANG","HTG","BHD","KZT","SRD","SZL","SAR","TTD","YER","MVR","AFN","INR","AWG","KRW","NPR","JPY","MNT","AOA","PLN","GBP","SBD","BYN","HUF","BIF","MWK","MGA","XDR","BZD","BAM","EGP","MOP","NAD","SSP","NIO","PEN","NZD","WST","TMT","CLF","BRL"]
```

```
GET /convert?from=EUR&to=INR&amount=100 HTTP/1.1
User-Agent: PostmanRuntime/7.30.0
Accept: */*
Cache-Control: no-cache
Postman-Token: 9c6404df-8d1f-47f0-93ca-ca1b599320a4
Host: localhost:8080
Accept-Encoding: gzip, deflate, br
Connection: keep-alive
 
HTTP/1.1 200 OK
Content-Type: application/json
Transfer-Encoding: chunked
Date: Fri, 30 Dec 2022 04:32:03 GMT
Keep-Alive: timeout=60
Connection: keep-alive
 
{"targetCurrency":"INR","sourceCurrency":"EUR","targetAmount":"8824.309774","sourceAmount":"100"}
```


---
## Technologies used
* Java 1.8.0_332
* Gradle 4.10.x
* Spring Boot 2.5.2
* JUnit 4.13.2
* [exchangerate.host](https://exchangerate.host/) — Partner APIs
 
### Partner API

[Exchange rates API](https://exchangerate.host/) is a simple and lightweight free service for current and historical foreign exchange rates & crypto exchange rates. [ are used for currency exchange

---
## Configuration

Update partner API configuration in `src\main\resources\application.properties`

```
currency.baseUrl=https://api.exchangerate.host/
currency.path.symbol=latest
currency.path.convert=convert
currency.accesssKey=<API_Key>
```
---
## How to Run
* `gradle bootRun` command to run the server endpoint API in http://localhost:8080.
* Run tests `gradle test`




