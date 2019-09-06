# spring-boot-test

Url to get flights 'http://localhost:8080/list/flights'.
In flight demo by default flights are sorted by departuretime ascending order

## For sorting. 
- Pass "sortBy" request parameter with any of this values "arrival/departure/arrivalTime/departureTime"
- Pass "order" request parameter with any of this values "asc/desc"
- Example url -> "http://localhost:8080/list/flights?sortBy=arrivaltime&order=desc"
## For pagination.
- Pass "start" and "end" request parameter
- Example url -> "http://localhost:8080/list/flights?sortBy=arrivaltime&order=desc&start=5&end=10"
## For filter.
- Pass "keyword" request parameter
- Example url -> "http://localhost:8080/flights/list?keyword=Greece"
- To perform filter on "arrivalTime" and "departureTime"
  - Pass "filterBy","from" and "to" request parameter
  - Example url -> "http://localhost:8080/flights/list?filterBy=arrivalTime&from=2019-01-20&to=2019-05-27"


> Note -> As data from both rest api is inconsistent.so pagination,sort,filter will be perform on current dataset which is retrived from given API's
