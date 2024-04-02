package id.co.tokobuah.constant;

import id.co.tokobuah.model.Buah;
import java.util.ArrayList;
import java.util.List;
public class BuahConstant {

    public static final String mNotFound = "Buah not found";
    public static final String mEmptyData = "No Data Available";
    public static final String mCreateSuccess = "Buah created successfully";
    public static final String mCreatedFailed = "Failed to create Buah";
    public static final String mUpdateSuccess = "Buah updated successfully";
    public static final String mUpdateFailed = "Failed to update Buah";
    public static final String mDeleteSuccess = "Buah deleted successfully";
    public static final String mDeleteFailed = "Failed to delete Buah";
    public static final String qAllDataActive = "SELECT * FROM tob_msbuah WHERE bua_status = ?1";
}
