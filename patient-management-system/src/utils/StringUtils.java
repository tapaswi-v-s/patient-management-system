package utils;

import models.Hospital;
import models.enums.DoctorType;
import models.enums.UserType;

import java.util.Arrays;
import java.util.List;
import models.enums.VitalSign;

public class StringUtils {

    public static List<UserType> getUserTypes(){
        // Convert Enums to string
        return List.of(UserType.values());
    }

    static public List<String> getDoctorCategory(){
        // Convert Enums to string
        return Arrays.stream(DoctorType.values()).map(Enum::name).toList();
    }

    static public List<VitalSign> getVitalSigns(){
        // Convert Enums to string
        return List.of(VitalSign.values());
    }
    
    static public List<String> getTimings(){
        String[] arr = {"10:00 AM","10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM",
                    "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM"};
        return List.of(arr);
    }


}
