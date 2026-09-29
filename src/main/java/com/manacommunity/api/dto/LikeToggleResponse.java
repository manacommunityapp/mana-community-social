package com.manacommunity.api.dto;

import com.manacommunity.common.enums.*;
public record LikeToggleResponse(
    int likesCount,
    boolean liked
) {}

