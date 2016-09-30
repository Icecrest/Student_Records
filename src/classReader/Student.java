package classReader;

import java.util.ArrayList;

/**
 * Written by SCurley on 9/21/2016.
 */
public class Student {
    private String name;
    private String address;
    private String phoneNumber;
    private String major;

    public Student(String name, String address, String phoneNumber, String major){
        this.name = name;
        this.address = address;
        this.phoneNumber = fixNumber(phoneNumber);
        this.major = major;
    }

    public String getVar(String var){
        switch(var.toLowerCase()) {
            case "name":
                return name;
            case "address":
                return address;
            case "phonenumber":
                return phoneNumber;
            case "major":
                return major;
            default:
                return null;
        }
    }

    public String fixNumber(String num){
        StringBuilder builder = new StringBuilder();
        ArrayList<Character> nums = new ArrayList<Character>();
        for(char c : num.toCharArray()){
            nums.add(c);
        }
        nums.add(0,'(');
        nums.add(4,')');
        nums.add(8,'-');
        for(char c : nums){
            builder.append(c);
        }
        return builder.toString();
    }

}
