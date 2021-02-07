package com.switchfully.deepening.focusedexercises.sets.codelab01;

/**
 * Test for the TimeClock class
 *
 * This class will keep track  of the people that have checked in and checked out during the day.
 *
 * At the end of the day the system will be restarted and all data will be reset.
 *
 * Please remove the tests one by one and make them succeed.
 */
class TimeClockTest {

    private TimeClock timeClock = new TimeClock();
//
//    @Nested
//    @DisplayName("check in")
//    public class CheckIn {
//
//        @Test
//        void givenAPerson_willNotThrowAnError() {
//            //GIVEN
//            Employee employee = new Employee("Louis DeZesde");
//
//            //WHEN & THEN
//            timeClock.checkIn(employee);
//        }
//
//        @Test
//        void givenNull_willThrowAnError() {
//            //GIVEN
//            Employee employee = null;
//
//            //WHEN & THEN
//            Assertions.assertThatThrownBy(() -> timeClock.checkIn(employee))
//                    .isInstanceOf(NullPointerException.class)
//                    .hasMessage("Error: Employee is null");
//        }
//    }
//
//    @Nested
//    @DisplayName("check out")
//    public class CheckOut {
//
//        @Test
//        void givenAPerson_willNotThrowAnError() {
//            //GIVEN
//            Employee employee = new Employee("Louis DeZesde");
//
//            //WHEN & THEN
//            timeClock.checkOut(employee);
//        }
//
//        @Test
//        void givenNull_willThrowAnError() {
//            //GIVEN
//            Employee employee = null;
//
//            //WHEN & THEN
//            Assertions.assertThatThrownBy(() -> timeClock.checkOut(employee))
//                    .isInstanceOf(NullPointerException.class)
//                    .hasMessage("Error: Employee is null");
//        }
//    }
//
//    @Nested
//    @DisplayName("number of people still at work")
//    public class NumberOfPeopleStillAtWork {
//
//        @Test
//        void givenOnePersonLoggedIn_willReturn1() {
//            //GIVEN
//            Employee employee = new Employee("Louis DeZesde");
//            timeClock.checkIn(employee);
//
//            //WHEN
//            int numberOfPeopleStillAtWork = timeClock.numberOfPeopleStillAtWork();
//
//            //THEN
//            Assertions.assertThat(numberOfPeopleStillAtWork).isEqualTo(1);
//        }
//
//        @Test
//        void givenTwoEmployeesCheckedInOneCheckedOut_willReturn1() {
//            //GIVEN
//            timeClock.checkIn(new Employee("Louis DeZesde"));
//            timeClock.checkIn(new Employee("Patrick Padroes"));
//            timeClock.checkOut(new Employee("Patrick Padroes"));
//
//            //WHEN
//            int numberOfPeopleStillAtWork = timeClock.numberOfPeopleStillAtWork();
//
//            //THEN
//            Assertions.assertThat(numberOfPeopleStillAtWork).isEqualTo(1);
//        }
//
//        @Test
//        void givenTwoEmployeesCheckedInAndAnotherCheckedOut_willReturn2() {
//            //GIVEN
//            timeClock.checkIn(new Employee("Louis DeZesde"));
//            timeClock.checkIn(new Employee("Patrick Padroes"));
//            timeClock.checkOut(new Employee("James Jimenez"));
//
//            //WHEN
//            int numberOfPeopleStillAtWork = timeClock.numberOfPeopleStillAtWork();
//
//            //THEN
//            Assertions.assertThat(numberOfPeopleStillAtWork).isEqualTo(2);
//        }
//
//        @Test
//        void givenEmployeeWhoChecksInMultipleTimes_willReturn1() {
//            //GIVEN
//            timeClock.checkIn(new Employee("Louis DeZesde"));
//            timeClock.checkIn(new Employee("Louis DeZesde"));
//            timeClock.checkIn(new Employee("Louis DeZesde"));
//            timeClock.checkIn(new Employee("Louis DeZesde"));
//
//            //WHEN
//            int numberOfPeopleStillAtWork = timeClock.numberOfPeopleStillAtWork();
//
//            //THEN
//            Assertions.assertThat(numberOfPeopleStillAtWork).isEqualTo(1);
//        }
//    }
//
//    @Nested
//    @DisplayName("is employee at work")
//    public class isEmployeeAtWork {
//        @Test
//        void givenNoEmployeesCheckedIn_willReturnFalse() {
//            //GIVEN
//            Employee employee = new Employee("employee1");
//
//            //WHEN
//            boolean isEmployeeAtWork = timeClock.isEmployeeAtWork(employee);
//
//            //THEN
//            Assertions.assertThat(isEmployeeAtWork).isFalse();
//        }
//
//        @Test
//        void givenEmployeeCheckedIn_willReturnTrue() {
//            //GIVEN
//            Employee employee = new Employee("employee1");
//            timeClock.checkIn(employee);
//
//            //WHEN
//            boolean isEmployeeAtWork = timeClock.isEmployeeAtWork(employee);
//
//            //THEN
//            Assertions.assertThat(isEmployeeAtWork).isTrue();
//        }
//
//        @Test
//        void givenEmployeeCheckedInAndCheckedOut_willReturnTrue() {
//            //GIVEN
//            Employee employee = new Employee("employee1");
//            timeClock.checkIn(employee);
//            timeClock.checkOut(employee);
//
//            //WHEN
//            boolean isEmployeeAtWork = timeClock.isEmployeeAtWork(employee);
//
//            //THEN
//            Assertions.assertThat(isEmployeeAtWork).isFalse();
//        }
//
//    }
//
//    @Nested
//    @DisplayName("get number of employees that have used the system")
//    public class GetNumberOfEmployeesThatHaveUsedTheSystem {
//
//        @Test
//        void givenAnEmployeeWhoChecksInAndChecksOutAnOtherEmployeeWithOnlyACheckinAndAnotherWithOnlyACheckout() {
//            //GIVEN
//            timeClock.checkIn(new Employee("employee1"));
//            timeClock.checkOut(new Employee("employee1"));
//            timeClock.checkOut(new Employee("employee2"));
//            timeClock.checkOut(new Employee("employee3"));
//
//            //WHEN
//            int numberOfEmployeesThatHaveUsedTheSystem = timeClock.getNumberOfEmployeesThatHaveUsedTheSystem();
//
//            //THEN
//            Assertions.assertThat(numberOfEmployeesThatHaveUsedTheSystem).isEqualTo(3);
//
//        }
//    }
}
