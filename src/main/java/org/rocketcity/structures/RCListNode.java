package org.rocketcity.structures;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class RCListNode {
    private int value;
    private RCListNode nextNode;

    public RCListNode(int value) {
        this.value = value;
        this.nextNode = null;
    }
}
