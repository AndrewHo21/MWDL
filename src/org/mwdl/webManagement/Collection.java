package org.mwdl.webManagement;

/**
 * Represents a collection landing pages, by holding all the info needed to create one
 *
 * @author Jon Wiggins
 * @version 6/9/17
 */

public class Collection {

    public int collectionNumber;
    public String title;
    public String urlTitle;
    public String publisherLink;
    public String publisher;
    public String text;
    public String imageName;
    public String des;
    public String browse;
    public boolean isActive;
    public String note;
    public String refinedPublisher;
    public int imageHeight;
    public int imageWidth;


    /**
     * This object holds all of the information needed to create a collection landing page
     *
     * Note that if imageWidth is 0, it will be set to 250
     * Note that if imageHeight is 0, it will be set to 250
     *
     * Should be read from newCollectionData.csv which stores the data in the following format
     *  Collection Number, Passed Inspection, Note, Title, Publisher, Article Text, Article Image, Image Height, Image Length, Image Description
     */
    public Collection(int collectionNumber, boolean isActive, String note, String title, String publisher, String text, String img, int height, int width, String des){
        this.collectionNumber = collectionNumber;
        this.isActive = isActive;
        this.note = note;
        this.title = title;
        this.publisher= publisher;
        this.publisherLink = publisher;
        this.imageName = img;
        this.imageHeight = height;
        this.imageWidth = width;
        this.des= des;

        //Normalize the article text by removing the special markers
        this.text = text.replace("%comma%",",").replace("%newline%","<br/>");

        refinedPublisher = publisher
                .replace(" ","")
                .replace(".","")
                .replace("-","")
                .replace("(","")
                .replace(")","")
                .replace(",","");

        //Removes any special things from the title
        // I don't think any titles have <p> or <b>, but just to be sure
        this.urlTitle = title
                //pretty sure these ones aren't even needed tbh
                .replaceAll("%comma%","")
                .replaceAll("</p>","")
                .replaceAll("<p>","")
                .replaceAll("<b>","")
                .replaceAll("</b>","");

        //Remove any character that is not a letter or number
        // This normalizes the tile to just raw text for the title
        urlTitle = urlTitle.replaceAll("[^a-zA-Z0-9]", "");

        //ensure that the imageName size is not 0
        if(imageHeight == 0)
            this.imageHeight = 250;
        if(imageWidth == 0)
            this.imageWidth = 250;
    }

    /**
     * Just used to print out Collection objects with a bit of formatting for debugging
     */
    public String toString(){
        return "Number: "+collectionNumber +
                "\nisActive: " + isActive +
                "\nNote: " + note +
                "\nTitle: " + title +
                "\nURLTitle: " + urlTitle +
                "\nPublisher: " + publisherLink +
                "\nText: " + text +
                "\nImage: " + imageName +
                "\nImage Height: " + imageHeight +
                "\nImage Width: " + imageWidth +
                "\nDescription: " + des;
    }

    /**
     * Note that the exlibiris browse link is just a search link with the title of the collection in the link
     *
     * @return the Exlibirs browse link
     */
    public String getExlibirisLink(){
        return "https://utah-primoprod.hosted.exlibrisgroup.com/primo-explore/search?query=lsr04,exact"
                + collectionNumber
                + "&tab=default_tab&search_scope=mw&vid=MWDL&offset=0";
    }

}
