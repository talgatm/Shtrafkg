package kg.shtraf.shtrafkg.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fine {

    @SerializedName("result")
    @Expose
    public List<Result> result  ;
    @SerializedName("number")
    @Expose
    public String number;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}