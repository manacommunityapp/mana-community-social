package com.manacommunity.api.dto;

import com.manacommunity.common.enums.*;
public record TrendingResponse(
    Long id,
    String topic,
    String topicType,
    int postCount,
    int engagementCount,
    double score
) {}

