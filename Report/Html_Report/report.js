$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@s1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the \"\u003cusername\u003e\"  in username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter the \"\u003cpassword\u003e\" In password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click on the login Button and it navigate to search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "hotel-booking-in-adactin-application;login-page;;1"
    },
    {
      "cells": [
        "abcd",
        "1234"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-application;login-page;;2"
    },
    {
      "cells": [
        "efgh",
        "5678"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;login-page;;3"
    },
    {
      "cells": [
        "dhaakshayani",
        "ammu2394"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;login-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@s1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the \"abcd\"  in username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter the \"1234\" In password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click on the login Button and it navigate to search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 3283619100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_username_Field(String)"
});
formatter.result({
  "duration": 203396500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_the_In_password_field(String)"
});
formatter.result({
  "duration": 121868401,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_on_the_login_Button_and_it_navigate_to_search_Hotel_Page()"
});
formatter.result({
  "duration": 1580154499,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@s1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the \"efgh\"  in username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter the \"5678\" In password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click on the login Button and it navigate to search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 591059100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "efgh",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_username_Field(String)"
});
formatter.result({
  "duration": 160185400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5678",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_the_In_password_field(String)"
});
formatter.result({
  "duration": 128235999,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_on_the_login_Button_and_it_navigate_to_search_Hotel_Page()"
});
formatter.result({
  "duration": 1904479800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@s1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the \"dhaakshayani\"  in username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter the \"ammu2394\" In password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click on the login Button and it navigate to search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 871304100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dhaakshayani",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_username_Field(String)"
});
formatter.result({
  "duration": 147763799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ammu2394",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_the_In_password_field(String)"
});
formatter.result({
  "duration": 122041700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_on_the_login_Button_and_it_navigate_to_search_Hotel_Page()"
});
formatter.result({
  "duration": 2803151900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@s2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user Select the Location",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User Select the Hotel",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user Select the type of room",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user select the number of rooms",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user enter the check In Date",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user enter the check out Date",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user select the Adults per room",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user select the childrens per room",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user Click on the Search Button and it navigate to Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Location()"
});
formatter.result({
  "duration": 1235782001,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Hotel()"
});
formatter.result({
  "duration": 1200166200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_type_of_room()"
});
formatter.result({
  "duration": 1218676500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_number_of_rooms()"
});
formatter.result({
  "duration": 1191050200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_check_In_Date()"
});
formatter.result({
  "duration": 1139188700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_check_out_Date()"
});
formatter.result({
  "duration": 1137297000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_Adults_per_room()"
});
formatter.result({
  "duration": 1206552300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_childrens_per_room()"
});
formatter.result({
  "duration": 1185439200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_on_the_Search_Button_and_it_navigate_to_Select_Hotel_Page()"
});
formatter.result({
  "duration": 3863757199,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Select Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@s3"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "user select the hotel",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user click on continue button and it navigate to book a hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_select_the_hotel()"
});
formatter.result({
  "duration": 1154366600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_continue_button_and_it_navigate_to_book_a_hotel_page()"
});
formatter.result({
  "duration": 2941524999,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Book a Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@s4"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "user enter the first Name in First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user enter the Last Name in Last Name Field",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user enter  the Billing Address in Billing Address Field",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user enter the Credit Card No in the Credit Card No Field",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "user Select the Credit Card Type in the Credit Card Type Field",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "user Select the Expiry Date in  Month Field",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "user Select the Expiry Date in Year Field",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "user Select the CVV Number in CVV Number Field",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "user click on the booknow button and it navigate to  Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_enter_the_first_Name_in_First_Name_Field()"
});
formatter.result({
  "duration": 1185916200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_Last_Name_in_Last_Name_Field()"
});
formatter.result({
  "duration": 1196377600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_Billing_Address_in_Billing_Address_Field()"
});
formatter.result({
  "duration": 1199393200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_Credit_Card_No_in_the_Credit_Card_No_Field()"
});
formatter.result({
  "duration": 1226430001,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Credit_Card_Type_in_the_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 1302872900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Expiry_Date_in_Month_Field()"
});
formatter.result({
  "duration": 1230394600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Expiry_Date_in_Year_Field()"
});
formatter.result({
  "duration": 1360531699,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_CVV_Number_in_CVV_Number_Field()"
});
formatter.result({
  "duration": 1169882900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_booknow_button_and_it_navigate_to_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 1192528900,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@s5"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "user click on the Log out Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_Log_out_Button()"
});
formatter.result({
  "duration": 2133103799,
  "status": "passed"
});
});