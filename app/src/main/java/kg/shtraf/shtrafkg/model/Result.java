package kg.shtraf.shtrafkg.model;

/**
 * Created by User on 01.06.2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("DocumentCode")
    @Expose
    public String documentCode;
    @SerializedName("ViolationDate")
    @Expose
    public String violationDate;
    @SerializedName("ViolationLocation")
    @Expose
    public String violationLocation;
    @SerializedName("Article")
    @Expose
    public String article;
    @SerializedName("ArticleDescription")
    @Expose
    public String articleDescription;
    @SerializedName("ViolationFine")
    @Expose
    public String violationFine;
    @SerializedName("Payed")
    @Expose
    public String payed;
    @SerializedName("AmountToPay")
    @Expose
    public String amountToPay;

    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public String getViolationDate() {
        return violationDate;
    }

    public void setViolationDate(String violationDate) {
        this.violationDate = violationDate;
    }

    public String getViolationLocation() {
        return violationLocation;
    }

    public void setViolationLocation(String violationLocation) {
        this.violationLocation = violationLocation;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    public String getViolationFine() {
        return violationFine;
    }

    public void setViolationFine(String violationFine) {
        this.violationFine = violationFine;
    }

    public String getPayed() {
        return payed;
    }

    public void setPayed(String payed) {
        this.payed = payed;
    }

    public String getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(String amountToPay) {
        this.amountToPay = amountToPay;
    }
}