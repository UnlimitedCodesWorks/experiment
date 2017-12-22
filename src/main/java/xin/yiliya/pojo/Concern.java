package xin.yiliya.pojo;

import java.util.Date;

public class Concern {
    private Integer id;

    private Integer concernerId;

    private Integer concernedId;

    private Date concernTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConcernerId() {
        return concernerId;
    }

    public void setConcernerId(Integer concernerId) {
        this.concernerId = concernerId;
    }

    public Integer getConcernedId() {
        return concernedId;
    }

    public void setConcernedId(Integer concernedId) {
        this.concernedId = concernedId;
    }

    public Date getConcernTime() {
        return concernTime;
    }

    public void setConcernTime(Date concernTime) {
        this.concernTime = concernTime;
    }
}