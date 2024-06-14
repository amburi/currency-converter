# Currency Converter

An application for performing currency exchange rate conversions. The app allows users to input the source and target currencies, enter an amount, and trigger the conversion from the source to the target currency. The app displays a list of conversions and current exchange rates for the selected source currency.

## Table of Contents

- [Business Requirements](#business-requirements)
- [Functional Requirements](#functional-requirements)
- [API Endpoints](#api-endpoints)
- [Example API Responses](#example-api-responses)
- [Technologies Used](#technologies-used)
- [Partner API](#partner-api)
- [Configuration](#configuration)
- [How to Run](#how-to-run)
- [Future Goals](#future-goals)
- [License](#license)

## Business Requirements

1. **Currency Conversion**: Users should be able to convert between different currencies using up-to-date exchange rates.
2. **Currency Symbol Display**: The application should provide a list of available currency symbols for users to choose from.
3. **Accurate Conversion Rates**: Conversion rates must reflect real-time rates from a reliable source.
4. **Error Handling**: Proper error messages should be displayed to users for invalid requests or server errors.
5. **User Privacy**: The application should handle user data securely and not store sensitive information unnecessarily.

## Functional Requirements

1. **GET /symbol Endpoint**:
   - Returns a list of 3-character currency codes available for exchange.
   
2. **GET /convert Endpoint**:
   - Accepts parameters `from`, `to`, and `amount`.
   - Returns the conversion rate from `from` currency to `to` currency based on `amount`.
   - Provides the converted amount (`targetAmount`) and the original amount (`sourceAmount`).

## API Endpoints

API Base URL: `http://localhost:8080`

- `GET /symbol`: Returns a list of 3-character currency codes available for exchange.
- `GET /convert?from=EUR&to=INR&amount=100`: Returns the conversion rate.
  - `from` and `to` should be the 3-character currency codes available for exchange.
  - `amount` is the amount on which conversion information will be fetched and displayed.

## Example API Responses

### Get Available Currency Symbols
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

### Convert Currency
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

## Technologies Used

- Java 1.8.0_332
- Gradle 4.10.x
- Spring Boot 2.5.2
- JUnit 4.13.2
- [exchangerate.host](https://exchangerate.host/) — Partner APIs

## Partner API

[Exchange rates API](https://exchangerate.host/) is a simple and lightweight free service for current and historical foreign exchange rates & crypto exchange rates.

## Configuration

Update partner API configuration in `src/main/resources/application.properties`:

```properties
currency.baseUrl=https://api.exchangerate.host/
currency.path.symbol=latest
currency.path.convert=convert
currency.accessKey=<API_Key>
```

## How to Run

1. **Start the Application**:
   ```sh
   gradle bootRun
   ```
   The server will be available at `http://localhost:8080`.

2. **Run Tests**:
   ```sh
   gradle test
   ```

## Future Goals

- Reorganize conversion API `GET /convert`
- Add validation for `GET /convert`
- Improve unit test cases
- Upgrade Gradle, Spring Boot, and JUnit versions

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Developed by [Amburi Roy](https://www.linkedin.com/in/amburi/). For any inquiries, please contact via LinkedIn.
