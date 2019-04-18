package com.elmunats.crudmaximo.base;

/**
 * Created by Reja on 19,January,2019
 * Jakarta, Indonesia.
 */
public class BaseParam {
    /**
     * Basic Param
     */
    public static final int TRUE = 1;
    public static final int FALSE = 0;
    public static final String EMPTY_STRING = "";
    public static final String STRIP = "-";

    /**
     *  Dummy Authentication URL parameter
     */
    public static final String DEV_URL = "http://172.16.20.221:9080/maximo/oslc/os/";

    /**
     *  Base URL Parameter
     */
    public static final String BASE_URL="http://klaai01.this.id:9080/maximo/oslc/os/";

    /**
     * Authentication parameter
     */
    public static final String MAX_AUTH = "MAXAUTH";
    public static final String USERNAME = "maxadmin";
    public static final String PASSWORD = "klaaiadm"; //klaaiadm

    /**
     * Intent message key
     */
    public static final String INTENT_PERSON_UID = "personUID";
    public static final String INTENT_VALIDATE_PATTERN = "validatePattern";

    /**
     * Shared Preferences Key
     */
    public static final String THIS_ID = "id.thisid.dakota";

    /**
     *  Character Encoding Param
     *
     *
     */

    public static final String CHARACTER_UTF8 = "UTF-8";

    /**
     *  Workorder status Param
     *
     */
    public static final String APPROVED = "APPR";
    public static final String INPROGRESS = "INPRG";
    public static final String COMPLETED = "COMPLETE";
    public static final String CLOSED   = "CLOSE";
    public static final String DONE = "DONE";
    public static final String REVISED = "REVISED";

    /**
     * Workorder Adapter Param
     *
     */
    public static final String WONUM = "Wonum";
    public static final String DESCRIPTION = "Description";
    public static final String DATE = "Date";
    public static final String HOURSSTART = "Hours start";
    public static final String HOURSFINISH = "Hours Finish";
    public static final String PERIOD = "Period";
    public static final String SUPERVISOR = "Supervisor";
    public static final String LOCATIONS = "Locations";
    public static final String LISTITEM = "List Item";
    public static final String CSO = "Labor";
    public static final String STATUS = "Status";




}
