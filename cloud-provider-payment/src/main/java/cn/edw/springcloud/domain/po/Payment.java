package cn.edw.springcloud.domain.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Edwin Xu
 * @date 3/3/2021 5:12 PM.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Payment implements Serializable {
    private int id;
    private String serial;
}
