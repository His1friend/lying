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
 * @TableName decision_options
 */
@TableName(value ="decision_options")
@Data
public class DecisionOptions implements Serializable {
    /**
     * 
     */
    @TableId
    private String optionId;

    /**
     * 
     */
    private String decisionId;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private String leadsTo;

    /**
     * 
     */
    private Integer isCorrect;

    /**
     * 
     */
    private String explanation;

    /**
     * 
     */
    private Date createdAt;

    /**
     * 
     */
    private Date updatedAt;

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
        DecisionOptions other = (DecisionOptions) that;
        return (this.getOptionId() == null ? other.getOptionId() == null : this.getOptionId().equals(other.getOptionId()))
            && (this.getDecisionId() == null ? other.getDecisionId() == null : this.getDecisionId().equals(other.getDecisionId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getLeadsTo() == null ? other.getLeadsTo() == null : this.getLeadsTo().equals(other.getLeadsTo()))
            && (this.getIsCorrect() == null ? other.getIsCorrect() == null : this.getIsCorrect().equals(other.getIsCorrect()))
            && (this.getExplanation() == null ? other.getExplanation() == null : this.getExplanation().equals(other.getExplanation()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOptionId() == null) ? 0 : getOptionId().hashCode());
        result = prime * result + ((getDecisionId() == null) ? 0 : getDecisionId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getLeadsTo() == null) ? 0 : getLeadsTo().hashCode());
        result = prime * result + ((getIsCorrect() == null) ? 0 : getIsCorrect().hashCode());
        result = prime * result + ((getExplanation() == null) ? 0 : getExplanation().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", optionId=").append(optionId);
        sb.append(", decisionId=").append(decisionId);
        sb.append(", content=").append(content);
        sb.append(", leadsTo=").append(leadsTo);
        sb.append(", isCorrect=").append(isCorrect);
        sb.append(", explanation=").append(explanation);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}