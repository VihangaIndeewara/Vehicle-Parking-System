package db;

import model.Driver;

import java.util.ArrayList;

public class driverDataSet {
    public static ArrayList<Driver> driverTable= new ArrayList();

    static {
        driverTable.add(new Driver("Sumith Kumara", "7835348345V", "B6474845","Panadura",0725637456));
        driverTable.add(new Driver("Amila Pathirana", "8826253734V", "B3354674 ","Galle",0711111111));
        driverTable.add(new Driver("Jithmal Perera", "9283289272V", "B3674589","Horana",0772452457));
        driverTable.add(new Driver("Sumith Dissanayaka", "9425245373V", "B8366399","Kaluthara",0722222222));
        driverTable.add(new Driver("Sumanasiri Herath", "8976544373V", "B3537538","Beruwala",0772534436));
        driverTable.add(new Driver("Awantha Fernando", " 9173537839V",  "B3554789" ,"Colombo 5", 0714534356));
        driverTable.add(new Driver("Charith Sudara", "9573536833V", "B6835836", "Baththaramulla", 0771536662));
        driverTable.add(new Driver("Prashan Dineth", "9362426738V", "B2683536", "Wadduwa", 0715353434));
        driverTable.add(new Driver("Chethiya Dilan", "9162353436V", "B6836836", "Panadura", 0772436737));
        driverTable.add(new Driver("Dushantha Perera", "9255556343V", "B3334435", "Matara" ,0777245343));
        driverTable.add(new Driver("Sumith Udayanga", "8735354355V", "B3573783", "Galle", 0703635442));
        driverTable.add(new Driver("Dinesh Udara", "9026344373V" ,"B5343783" ,"Hettimulla", 0713333333));
        driverTable.add(new Driver("Udana Chathuranga", "9692653338V" ,"B7888632", "Kottawa", 0772442444));
        driverTable.add(new Driver("Mohommad Riaz", "9124537733V", "B3638537", "Kaluthara", 0777544222));
        driverTable.add(new Driver("Sandun Kumara", "9563524267V", "B2263333", "Panadura", 0772325544));
        driverTable.add(new Driver("Priyanga Perera", "9135343537V" ,"B3853753" ,"Matara" ,0723344562));

    }
}
