public class Cyclometer {
    public static void main (String[] args) {
    int secsTrip1=480;  //Amount of seconds in trip 1
    int secsTrip2=3220;  //Amount of seconds in trip 2
int countsTrip1=1561;  //Amount of rotations in trip 1
int countsTrip2=9037; //Amount of rotations in trip 2
double wheelDiameter=27.0,  //diameter of bicycle wheel
PI=3.14159, //circumfrence of circle
feetPerMile=5280,  //Amount of feet in 1 mile
inchesPerFoot=12,   //Amount of inches in 1 foot
secondsPerMinute=60;  //Amount of seconds in one minute
double distanceTrip1, distanceTrip2,totalDistance;  //Calculates total distance of trips
System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts."); //print numbers stored in variables
System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts."); //print numbers stored in variables
distanceTrip1=countsTrip1*wheelDiameter*PI; //distance of trip 1 in inches
distanceTrip1=inchesPerFoot*feetPerMile; //distance of trip 1 in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;
//print out the distances
System.out.println("Trip 1 was "+distanceTrip1+" miles"); //distance of trip 1
System.out.println("Trip 2 was "+distanceTrip2+" miles"); //distance of trip 2
System.out.println("The total distance was "+totalDistance+" miles"); //total distance
    }
}
