# heremobilitytest
short appium exam

## Getting Started

1. clone the project

git clone https://github.com/Buezrello/heremobilitytest.git

2. Create in IntelliJ a new maven project from existing source

3. Run Appium, connect android device (do not use simulator)

4. Run tests directly from IDE or from command line with "mvn test"


### Important notice

1. I test the history in the every test. I start and quit a driver before and after every test so the calculator
start "clean". It's the correct way to test. First of all, tests should be independent of one another,
this is the best practice. I had a lot of problems trying to build test chains, it rarely ends well.

Secondly, I was asked to use JUnit, and in this framework the test dependency mechanism developed ugly.
In TestNG it implemented much better - but I prefer not use it even with TestNG.

2. The expression "(10 - 2) * 2 != 20" clearly incorrect. The android calculator does not have "not equal" option
and do not return boolean value. So I guess the meaning is 2! (2 factorial) - but in this case the result is 16.
It is what I did in the test.