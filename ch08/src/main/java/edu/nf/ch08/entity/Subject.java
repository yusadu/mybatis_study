package edu.nf.ch08.entity;

import lombok.Data;
import org.apache.ibatis.annotations.Update;

/**
 * @author wangl
 * @date 2020/11/11
 */
@Data
public class Subject {
    private Integer subId;
    private String subName;
}
