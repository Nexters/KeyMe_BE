package com.nexters.keyme.statistics.domain.internaldto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StatisticInfo {
    private long ownerId;
    private long questionId;
    private int ownerScore;
}
