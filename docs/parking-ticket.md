Part b - Parking Ticket Simulator
=================================

Create a set of classes simulating a police officer issuing a parking
ticket.

-   Class - ParkedCar has the following responsibilities:

    + To know the car's make, model, color, license number and number of minutes the car has been parked.

- Class - ParkingTicket has the following responsibilities:

    +   To report the make, model, color and license number of an illegally parked car.
    +   Report the fine - which is \$25.00 for first hour plus \$10.00 for each additional hour
    +   Report the name and badge number of the police officer issuing the ticket.

-   Class - PoliceOfficer has the following responsibilities:

    +   To know the name and badge number
    +   To examine a parked car and parking meter object and determine whether the car's time has expired.
    +   To issue a parking ticket if the car time has expired.

Parking Ticket Simulator
========================

Learning objectives
-------------------

1.  Analyze requirements, design, code and test Java programs

Understanding requirements
--------------------------

Design to simulate a system where a police officer issues a parking ticket.

You should design a set of classes that work together as a Parking Simulator.

Designing
---------

Similar to the approach followed in the previous task, let’s decide what
classes, methods and fields should be required.

Since the PoliceOfficer will make the decision on whether to issue ticket,
issueTicket method belongs to PoliceOfficer. ParkedCar, ParkedTicket and
ParkedMeter are independent entities described below.

ParkedCar Class has the following responsibilities:

- To know the car's make, model, color, license number and number of minutes the
  car has been parked. Create getter and setter methods for all the fields.

ParkingMeter Class only responsibility is as follows:

- To know the number of minutes of parking time that has been purchased.

ParkingTicket Class has the following responsibilities:

- Report the make, model, color and license number of an illegally parked car.
- Report the fine - which is \$25.00 for first hour plus \$10.00 for each additional hour
- Report the name and badge number of the police officer issuing the ticket.

PoliceOfficer Class has the following responsibilities:

- To know the name and badge number
- To examine a parked car and parking meter object and determine whether the car's time has expired.
- To issue a parking ticket if the car time has expired.rite the test classes including testing situations:
        + ParkedVehicle is with in, out of and just in the parking time purchased.
        + Ticketing under 1 hour and more than 1 hour test cases.

Topics to Learn
---------------

1.  Object Oriented Programming
2.  Association in design
3.  Class diagram

