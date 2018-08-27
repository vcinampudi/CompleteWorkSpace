$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("googleSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Searching from Google Landing Page",
  "description": "In order to show the benefits of using SOB and Cucumber",
  "id": "searching-from-google-landing-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "searching from google",
  "description": "",
  "id": "searching-from-google-landing-page;searching-from-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigated to Google page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I type \"Selenium Object Bank\" in the search field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "it should show me the result of \"Selenium Object Bank\"",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleHome.i_navigated_to_Google_page()"
});
formatter.result({
  "duration": 143789039580,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium Object Bank",
      "offset": 8
    }
  ],
  "location": "GoogleHome.i_type_in_the_search_field(String)"
});
formatter.result({
  "duration": 3110756503,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium Object Bank",
      "offset": 33
    }
  ],
  "location": "GoogleHome.it_should_show_me_the_result_of(String)"
});
formatter.result({
  "duration": 182997149,
  "status": "passed"
});
});