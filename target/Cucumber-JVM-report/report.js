$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("demoqa.feature");
formatter.feature({
  "line": 1,
  "name": "Verifying features for demoqa.com",
  "description": "",
  "id": "verifying-features-for-demoqa.com",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Wrong data provision On Practice Form",
  "description": "",
  "id": "verifying-features-for-demoqa.com;wrong-data-provision-on-practice-form",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Wrong"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to the Practice Form page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I type in Name as a numeric value \"\u003cFirst Name\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I type in Last Name \"\u003cLast Name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I type in wrong Email Id \"\u003cEmail Id\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select Gender Male",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I type in wrong mobile number with less that ten numbers \"\u003cMobile Number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click submit button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "there shall appear on the places a red highlight where the incorrect data is provided",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "verifying-features-for-demoqa.com;wrong-data-provision-on-practice-form;",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Email Id",
        "Mobile Number"
      ],
      "line": 15,
      "id": "verifying-features-for-demoqa.com;wrong-data-provision-on-practice-form;;1"
    },
    {
      "cells": [
        "796543",
        "Chatterjee",
        "ssl-27hotmail.com",
        "074244"
      ],
      "line": 16,
      "id": "verifying-features-for-demoqa.com;wrong-data-provision-on-practice-form;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 470100,
  "status": "passed"
});
formatter.before({
  "duration": 231200,
  "status": "passed"
});
formatter.before({
  "duration": 353000,
  "status": "passed"
});
formatter.before({
  "duration": 986600,
  "status": "passed"
});
formatter.before({
  "duration": 308000,
  "status": "passed"
});
formatter.before({
  "duration": 310200,
  "status": "passed"
});
formatter.before({
  "duration": 366700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Wrong data provision On Practice Form",
  "description": "",
  "id": "verifying-features-for-demoqa.com;wrong-data-provision-on-practice-form;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Wrong"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to the Practice Form page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I type in Name as a numeric value \"796543\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I type in Last Name \"Chatterjee\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I type in wrong Email Id \"ssl-27hotmail.com\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select Gender Male",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I type in wrong mobile number with less that ten numbers \"074244\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click submit button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "there shall appear on the places a red highlight where the incorrect data is provided",
  "keyword": "Then "
});
formatter.match({
  "location": "WrongdataprovisionOnPracticeFormTest.i_go_to_the_Practice_Form_page()"
});
formatter.result({
  "duration": 20872955700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "796543",
      "offset": 35
    }
  ],
  "location": "WrongdataprovisionOnPracticeFormTest.i_type_in_Name_as_a_numeric_value(String)"
});
formatter.result({
  "duration": 3220946900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chatterjee",
      "offset": 21
    }
  ],
  "location": "WrongdataprovisionOnPracticeFormTest.i_type_in_Last_Name(String)"
});
formatter.result({
  "duration": 3139280400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ssl-27hotmail.com",
      "offset": 26
    }
  ],
  "location": "WrongdataprovisionOnPracticeFormTest.i_type_in_wrong_Email_Id(String)"
});
formatter.result({
  "duration": 3164781800,
  "status": "passed"
});
formatter.match({
  "location": "WrongdataprovisionOnPracticeFormTest.i_select_Gender_Male()"
});
formatter.result({
  "duration": 3111809100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "074244",
      "offset": 58
    }
  ],
  "location": "WrongdataprovisionOnPracticeFormTest.i_type_in_wrong_mobile_number_with_less_that_ten_numbers(String)"
});
formatter.result({
  "duration": 3109651300,
  "status": "passed"
});
formatter.match({
  "location": "WrongdataprovisionOnPracticeFormTest.i_click_submit_button()"
});
formatter.result({
  "duration": 6154488400,
  "status": "passed"
});
formatter.match({
  "location": "WrongdataprovisionOnPracticeFormTest.there_shall_appear_on_the_places_a_red_highlight_where_the_incorrect_data_is_provided()"
});
formatter.result({
  "duration": 6246467900,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "Correct data provision On Practice Form",
  "description": "",
  "id": "verifying-features-for-demoqa.com;correct-data-provision-on-practice-form",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Correct"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "that I go to the Practice Form page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I type in Name \"\u003cFirst Name\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I typed Last Name \"\u003cLast Name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I type in Email \"\u003cEmail Id\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I select Gender as Male",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I type in mobile \"\u003cMobile Number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select from the calendar date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I type in Subjects \"\u003cSubject\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select Hobbies Sports",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select Hobbies Reading",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I upload a png file",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I type in Current Adress \"\u003cCurrent Adress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I select NCR as state",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I select Noida as city",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "there shall appear a message Thanks for submitting the form",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "I verify on the result view that Student name matches with the provided name",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I verify on the result view email matches with the provided email",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I verify on the result view Gender matches with the provided data",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I verify on the result view Mobile name matches with the provided number",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I verify on the result view Date of birth name matches with the provided date",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I verify on the result view Subjects matches with the provided data",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I verify on the result view Hobbies matches with the provided data",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I verify on the result view Uploaded png name matches with the provided png name",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I verify on the result view Address matches with the provided address",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I verify on the result view State matches with the provided state name",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I verify on the result view City matches with the provided city name",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I click close",
  "keyword": "And "
});
formatter.examples({
  "line": 49,
  "name": "",
  "description": "",
  "id": "verifying-features-for-demoqa.com;correct-data-provision-on-practice-form;",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Email Id",
        "Mobile Number",
        "Subject",
        "Current Adress"
      ],
      "line": 50,
      "id": "verifying-features-for-demoqa.com;correct-data-provision-on-practice-form;;1"
    },
    {
      "cells": [
        "Amit",
        "Chatterjee",
        "ssl-27@hotmail.com",
        "07424499936",
        "Testing",
        "Hydearbad"
      ],
      "line": 51,
      "id": "verifying-features-for-demoqa.com;correct-data-provision-on-practice-form;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 196000,
  "status": "passed"
});
formatter.before({
  "duration": 211600,
  "status": "passed"
});
formatter.before({
  "duration": 183800,
  "status": "passed"
});
formatter.before({
  "duration": 141600,
  "status": "passed"
});
formatter.before({
  "duration": 163400,
  "status": "passed"
});
formatter.before({
  "duration": 170700,
  "status": "passed"
});
formatter.before({
  "duration": 142000,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Correct data provision On Practice Form",
  "description": "",
  "id": "verifying-features-for-demoqa.com;correct-data-provision-on-practice-form;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Correct"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "that I go to the Practice Form page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I type in Name \"Amit\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I typed Last Name \"Chatterjee\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I type in Email \"ssl-27@hotmail.com\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I select Gender as Male",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I type in mobile \"07424499936\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select from the calendar date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I type in Subjects \"Testing\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select Hobbies Sports",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select Hobbies Reading",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I upload a png file",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I type in Current Adress \"Hydearbad\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I select NCR as state",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I select Noida as city",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "there shall appear a message Thanks for submitting the form",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "I verify on the result view that Student name matches with the provided name",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I verify on the result view email matches with the provided email",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I verify on the result view Gender matches with the provided data",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I verify on the result view Mobile name matches with the provided number",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I verify on the result view Date of birth name matches with the provided date",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I verify on the result view Subjects matches with the provided data",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I verify on the result view Hobbies matches with the provided data",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I verify on the result view Uploaded png name matches with the provided png name",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I verify on the result view Address matches with the provided address",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I verify on the result view State matches with the provided state name",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I verify on the result view City matches with the provided city name",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I click close",
  "keyword": "And "
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.that_I_go_to_the_Practice_Form_page()"
});
formatter.result({
  "duration": 14049149000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amit",
      "offset": 16
    }
  ],
  "location": "CorrectdataprovisionOnPracticeFormTest.i_type_in_Name(String)"
});
formatter.result({
  "duration": 609510700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chatterjee",
      "offset": 19
    }
  ],
  "location": "CorrectdataprovisionOnPracticeFormTest.i_typed_Last_Name(String)"
});
formatter.result({
  "duration": 618563900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ssl-27@hotmail.com",
      "offset": 17
    }
  ],
  "location": "CorrectdataprovisionOnPracticeFormTest.i_type_in_Email(String)"
});
formatter.result({
  "duration": 646650100,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_select_Gender_as_Male()"
});
formatter.result({
  "duration": 611405000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "07424499936",
      "offset": 18
    }
  ],
  "location": "CorrectdataprovisionOnPracticeFormTest.i_type_in_mobile(String)"
});
formatter.result({
  "duration": 649435800,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_select_from_the_calendar_date_of_birth()"
});
formatter.result({
  "duration": 2692686800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testing",
      "offset": 20
    }
  ],
  "location": "CorrectdataprovisionOnPracticeFormTest.i_type_in_Subjects(String)"
});
formatter.result({
  "duration": 1245686200,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_select_Hobbies_Sports()"
});
formatter.result({
  "duration": 603576300,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_select_Hobbies_Reading()"
});
formatter.result({
  "duration": 599370500,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_upload_a_png_file()"
});
formatter.result({
  "duration": 2092682600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hydearbad",
      "offset": 26
    }
  ],
  "location": "CorrectdataprovisionOnPracticeFormTest.i_type_in_Current_Adress(String)"
});
formatter.result({
  "duration": 2153929400,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_select_NCR_as_state()"
});
formatter.result({
  "duration": 4271934600,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_select_Noida_as_city()"
});
formatter.result({
  "duration": 4341462100,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_click_Submit_button()"
});
formatter.result({
  "duration": 1128595400,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.there_shall_appear_a_message_Thanks_for_submitting_the_form()"
});
formatter.result({
  "duration": 3051108400,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_verify_on_the_result_view_that_Student_name_matches_with_the_provided_name()"
});
formatter.result({
  "duration": 3067161800,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_verify_on_the_result_view_email_matches_with_the_provided_email()"
});
formatter.result({
  "duration": 3056695100,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_verify_on_the_result_view_Gender_matches_with_the_provided_data()"
});
formatter.result({
  "duration": 3057465400,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_verify_on_the_result_view_Mobile_name_matches_with_the_provided_number()"
});
formatter.result({
  "duration": 3056936300,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_verify_on_the_result_view_Date_of_birth_name_matches_with_the_provided_date()"
});
formatter.result({
  "duration": 3037448800,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_verify_on_the_result_view_Subjects_matches_with_the_provided_data()"
});
formatter.result({
  "duration": 3056820200,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_verify_on_the_result_view_Hobbies_matches_with_the_provided_data()"
});
formatter.result({
  "duration": 3060750900,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_verify_on_the_result_view_Uploaded_png_name_matches_with_the_provided_png_name()"
});
formatter.result({
  "duration": 3035658500,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_verify_on_the_result_view_Address_matches_with_the_provided_address()"
});
formatter.result({
  "duration": 3050785700,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_verify_on_the_result_view_State_matches_with_the_provided_state_name()"
});
formatter.result({
  "duration": 3036111600,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_verify_on_the_result_view_City_matches_with_the_provided_city_name()"
});
formatter.result({
  "duration": 3043415600,
  "status": "passed"
});
formatter.match({
  "location": "CorrectdataprovisionOnPracticeFormTest.i_click_close()"
});
formatter.result({
  "duration": 88226600,
  "status": "passed"
});
formatter.before({
  "duration": 376100,
  "status": "passed"
});
formatter.before({
  "duration": 1347800,
  "status": "passed"
});
formatter.before({
  "duration": 302500,
  "status": "passed"
});
formatter.before({
  "duration": 781100,
  "status": "passed"
});
formatter.before({
  "duration": 4041200,
  "status": "passed"
});
formatter.before({
  "duration": 511000,
  "status": "passed"
});
formatter.before({
  "duration": 335300,
  "status": "passed"
});
formatter.scenario({
  "line": 54,
  "name": "To verify Alert button",
  "description": "",
  "id": "verifying-features-for-demoqa.com;to-verify-alert-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 53,
      "name": "@AlertButton"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "that I am on the Alerts page",
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "I click On the second button",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "after five seconds a message shall appear This alert appeared after five seconds",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "I click Ok",
  "keyword": "And "
});
formatter.match({
  "location": "VerifyAlertButtonTest.that_I_am_on_the_Alerts_page()"
});
formatter.result({
  "duration": 28962178100,
  "status": "passed"
});
formatter.match({
  "location": "VerifyAlertButtonTest.i_click_On_the_second_button()"
});
formatter.result({
  "duration": 2849877500,
  "status": "passed"
});
formatter.match({
  "location": "VerifyAlertButtonTest.after_five_seconds_a_message_shall_appear_This_alert_appeared_after_five_seconds()"
});
formatter.result({
  "duration": 11021010900,
  "status": "passed"
});
formatter.match({
  "location": "VerifyAlertButtonTest.i_click_Ok()"
});
formatter.result({
  "duration": 2225543000,
  "status": "passed"
});
formatter.before({
  "duration": 337600,
  "status": "passed"
});
formatter.before({
  "duration": 299100,
  "status": "passed"
});
formatter.before({
  "duration": 184000,
  "status": "passed"
});
formatter.before({
  "duration": 160100,
  "status": "passed"
});
formatter.before({
  "duration": 114100,
  "status": "passed"
});
formatter.before({
  "duration": 370600,
  "status": "passed"
});
formatter.before({
  "duration": 780100,
  "status": "passed"
});
formatter.scenario({
  "line": 61,
  "name": "To verify Hovering over",
  "description": "",
  "id": "verifying-features-for-demoqa.com;to-verify-hovering-over",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 60,
      "name": "@ToolTips"
    }
  ]
});
formatter.step({
  "line": 62,
  "name": "that I am on the Tool Tips page",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "I hover over the Hover me to see green button",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "I hover over the input space Hover me to see",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "the hover over messages should display",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyHoveringOverTest.that_I_am_on_the_Tool_Tips_page()"
});
formatter.result({
  "duration": 14536438800,
  "status": "passed"
});
formatter.match({
  "location": "VerifyHoveringOverTest.i_hover_over_the_Hover_me_to_see_green_button()"
});
formatter.result({
  "duration": 13166635400,
  "status": "passed"
});
formatter.match({
  "location": "VerifyHoveringOverTest.i_hover_over_the_input_space_Hover_me_to_see()"
});
formatter.result({
  "duration": 15443610700,
  "status": "passed"
});
formatter.match({
  "location": "VerifyHoveringOverTest.the_hover_over_messages_should_display()"
});
formatter.result({
  "duration": 135404500,
  "status": "passed"
});
formatter.before({
  "duration": 333300,
  "status": "passed"
});
formatter.before({
  "duration": 387100,
  "status": "passed"
});
formatter.before({
  "duration": 219400,
  "status": "passed"
});
formatter.before({
  "duration": 272500,
  "status": "passed"
});
formatter.before({
  "duration": 1580700,
  "status": "passed"
});
formatter.before({
  "duration": 271400,
  "status": "passed"
});
formatter.before({
  "duration": 182000,
  "status": "passed"
});
formatter.scenario({
  "line": 68,
  "name": "To verify Drag and drop",
  "description": "",
  "id": "verifying-features-for-demoqa.com;to-verify-drag-and-drop",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 67,
      "name": "@Draganddrop"
    }
  ]
});
formatter.step({
  "line": 69,
  "name": "that I am on the Droppable page",
  "keyword": "Given "
});
formatter.step({
  "line": 70,
  "name": "I drag and drop the Drag me object to the Drop here area",
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "the Drop here area shall change into Dropped",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "I verify that on the page that the result is showing as Dropped!",
  "keyword": "And "
});
formatter.match({
  "location": "DragandDropTest.that_I_am_on_the_Droppable_page()"
});
formatter.result({
  "duration": 16490123000,
  "status": "passed"
});
formatter.match({
  "location": "DragandDropTest.i_drag_and_drop_the_Drag_me_object_to_the_Drop_here_area()"
});
formatter.result({
  "duration": 357434700,
  "status": "passed"
});
formatter.match({
  "location": "DragandDropTest.the_Drop_here_area_shall_change_into_Dropped()"
});
formatter.result({
  "duration": 34598700,
  "status": "passed"
});
formatter.match({
  "location": "DragandDropTest.i_verify_that_on_the_page_that_the_result_is_showing_as_Dropped()"
});
formatter.result({
  "duration": 3244713900,
  "status": "passed"
});
formatter.before({
  "duration": 202200,
  "status": "passed"
});
formatter.before({
  "duration": 214000,
  "status": "passed"
});
formatter.before({
  "duration": 207300,
  "status": "passed"
});
formatter.before({
  "duration": 190000,
  "status": "passed"
});
formatter.before({
  "duration": 185800,
  "status": "passed"
});
formatter.before({
  "duration": 213600,
  "status": "passed"
});
formatter.before({
  "duration": 339000,
  "status": "passed"
});
formatter.scenario({
  "line": 75,
  "name": "To verify Small modal",
  "description": "",
  "id": "verifying-features-for-demoqa.com;to-verify-small-modal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 74,
      "name": "@Smallmodal"
    }
  ]
});
formatter.step({
  "line": 76,
  "name": "that I am on the Modal Dialogs page",
  "keyword": "Given "
});
formatter.step({
  "line": 77,
  "name": "I click on the Small modal button",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "the Small modal appears and I press Close",
  "keyword": "When "
});
formatter.step({
  "line": 79,
  "name": "the small modal should get closed",
  "keyword": "Then "
});
formatter.match({
  "location": "ModalDialogsTest.that_I_am_on_the_Modal_Dialogs_page()"
});
formatter.result({
  "duration": 15468638500,
  "status": "passed"
});
formatter.match({
  "location": "ModalDialogsTest.i_click_on_the_Small_modal_button()"
});
formatter.result({
  "duration": 625113200,
  "status": "passed"
});
formatter.match({
  "location": "ModalDialogsTest.the_Small_modal_appears_and_I_press_Close()"
});
formatter.result({
  "duration": 600806900,
  "status": "passed"
});
formatter.match({
  "location": "ModalDialogsTest.the_small_modal_should_get_closed()"
});
formatter.result({
  "duration": 206770600,
  "status": "passed"
});
formatter.before({
  "duration": 209800,
  "status": "passed"
});
formatter.before({
  "duration": 199700,
  "status": "passed"
});
formatter.before({
  "duration": 189200,
  "status": "passed"
});
formatter.before({
  "duration": 172700,
  "status": "passed"
});
formatter.before({
  "duration": 314400,
  "status": "passed"
});
formatter.before({
  "duration": 304600,
  "status": "passed"
});
formatter.before({
  "duration": 308600,
  "status": "passed"
});
formatter.scenario({
  "line": 82,
  "name": "To verify Date calculation and selection",
  "description": "",
  "id": "verifying-features-for-demoqa.com;to-verify-date-calculation-and-selection",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 81,
      "name": "@DateCalculation"
    }
  ]
});
formatter.step({
  "line": 83,
  "name": "that I am on the Date Picker page",
  "keyword": "Given "
});
formatter.step({
  "line": 84,
  "name": "calculate the date exactly a month from today date",
  "keyword": "When "
});
formatter.step({
  "line": 85,
  "name": "I select the correct year using the date picker",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "I select the correct month using the date picker",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "I select the correct day using the date picker",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "the chosen date shall be shown on the Select Date section",
  "keyword": "Then "
});
formatter.match({
  "location": "DateCalculationTest.that_I_am_on_the_Date_Picker_page()"
});
formatter.result({
  "duration": 16926862800,
  "status": "passed"
});
formatter.match({
  "location": "DateCalculationTest.calculate_the_date_exactly_a_month_from_today_date()"
});
formatter.result({
  "duration": 1183868400,
  "status": "passed"
});
formatter.match({
  "location": "DateCalculationTest.i_select_the_correct_year_using_the_date_picker()"
});
formatter.result({
  "duration": 628833600,
  "status": "passed"
});
formatter.match({
  "location": "DateCalculationTest.i_select_the_correct_month_using_the_date_picker()"
});
formatter.result({
  "duration": 670123500,
  "status": "passed"
});
formatter.match({
  "location": "DateCalculationTest.i_select_the_correct_day_using_the_date_picker()"
});
formatter.result({
  "duration": 4950714700,
  "status": "passed"
});
formatter.match({
  "location": "DateCalculationTest.the_chosen_date_shall_be_shown_on_the_Select_Date_section()"
});
formatter.result({
  "duration": 3211791200,
  "status": "passed"
});
});