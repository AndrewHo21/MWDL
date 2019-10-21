package org.mwdl.data;

/**
 * Holds variables that are used throughout the project
 *
 * Mostly paths to files and folders that are needed.
 *
 * This makes moving the project to a new computer easier, as you can just change the path here
 *  rather than finding all the uses across the project.
 *
 * @author Jonathan Wiggins
 * @version 5/9/18
 */
public class ProjectConstants {

    /**
     * Holds the name of the Collection Data CSV file
     *
     * Every interaction with the Collection Data CSV file should use this pointer
     */
    public static final String CollectionDataCSV = "collectionData101519.csv";


    /**
     * Holds the name of the Partner Data CSV file
     *
     * Every interaction with the Partner Data CSV file should use this pointer
     */
    public static final String PartnerDataCSV = "PartnerData81418.csv";

    /**
     * Holds the name of the Hub Partner Map CSV file
     *
     * Every interaction with the Hub Partner Map CSV file should use this pointer
     */
    public static final String HubPartnerMapCSV = "HubPartnerMap.csv";

    /**
     * Holds the name of the Education Toolkit data CSV file
     *
     * Ever interaction with this file should use this pointer
     */
    public static final String EducationToolKitDataCSV = "EducationData81318.csv";

    /**
     * Holds the directory wherein the Master Lists for Analytics from Google Analytics
     *  are stored
     */
    public static final String MasterListDirectory = "MasterLists/";

    /**
     * Holds the directory wherein the Generated Analytics files should be stored by the Analytics Generator
     */
    public static final String GeneratedAnalyticsDirectory = "GeneratedAnalytics/";

    /**
     * Holds the directory wherein the Partner Pages will be stored by the PartnerPageMaker
     */
    public static final String PartnerPageDirectory = "partners/";

    /**
     * Holds the directory wherein the Collection Pages will be stored by the CollectionPageMaker
     */
    public static final String CollectionPageDirectory = "collections/";

    /**
     * Holds the directory wherein the AMP Collection Pages will be stored by the CollectionPageMaker
     */
    public static final String AMPCollectionPageDirectory = "ampcollections/";

    /**
     * Holds the directory wherein the AMP Partner Pages will be stored by the PartnerPageMaker
     */
    public static final String AMPPartnerPageDirectory = "amppartners/";


}
