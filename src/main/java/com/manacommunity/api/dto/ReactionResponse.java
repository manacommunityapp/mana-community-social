package com.manacommunity.api.dto;

import com.manacommunity.common.enums.*;
import com.manacommunity.common.enums.ReactionType;

import java.util.Map;

public record ReactionResponse(
    int totalReactions,
    Map<String, Long> reactionCounts,
    ReactionType currentUserReaction
) {}


