package us.cnlist.lavabank.extrn.unicom24;

import lombok.Data;
import us.cnlist.lavabank.entity.LoanType;

import java.util.Date;

@Data
public class UserData {
    private LoanType loanType;
    private String lastName;
    private String firstName;
    private String middleName;
    private String passportNo;
    private String phone;
    private String email;
    private String passportCode;
    private Date passportDate;
    private String cityAdsId;
    private String street;
    private String house;
    private String subId = "0xff";
    private String factCity;
    private String factStreet;
    private String factHouse;
    private Date birthDate;
    private String birthPlace;
    private String job;
    private String jobAddress;
    private String jobPhone;
    private String jobPosition;
    private String jobSalary;
    private String creditSumm;
    private String pledge;


}
