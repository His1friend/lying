package org.tjnutt.lying.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName user_choices
 */
@TableName(value ="user_choices")
@Data
public class UserChoices implements Serializable {
    /**
     * 
     */
    @TableId
    private String choiceId;

    /**
     * 
     */
    private String recordId;

    /**
     * 
     */
    private String decisionId;

    /**
     * 
     */
    private String optionId;

    /**
     * 
     */
    private Date chosenAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserChoices other = (UserChoices) that;
        return (this.getChoiceId() == null ? other.getChoiceId() == null : this.getChoiceId().equals(other.getChoiceId()))
            && (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getDecisionId() == null ? other.getDecisionId() == null : this.getDecisionId().equals(other.getDecisionId()))
            && (this.getOptionId() == null ? other.getOptionId() == null : this.getOptionId().equals(other.getOptionId()))
            && (this.getChosenAt() == null ? other.getChosenAt() == null : this.getChosenAt().equals(other.getChosenAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChoiceId() == null) ? 0 : getChoiceId().hashCode());
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getDecisionId() == null) ? 0 : getDecisionId().hashCode());
        result = prime * result + ((getOptionId() == null) ? 0 : getOptionId().hashCode());
        result = prime * result + ((getChosenAt() == null) ? 0 : getChosenAt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", choiceId=").append(choiceId);
        sb.append(", recordId=").append(recordId);
        sb.append(", decisionId=").append(decisionId);
        sb.append(", optionId=").append(optionId);
        sb.append(", chosenAt=").append(chosenAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}