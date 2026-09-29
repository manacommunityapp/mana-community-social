package com.manacommunity.api.dto;

import com.manacommunity.common.enums.*;
import com.manacommunity.common.enums.ReactionType;
import jakarta.validation.constraints.NotNull;

public record ReactionRequest(
    @NotNull ReactionType reactionType
) {}


