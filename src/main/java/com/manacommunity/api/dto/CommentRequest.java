package com.manacommunity.api.dto;

import com.manacommunity.common.enums.*;
import jakarta.validation.constraints.NotBlank;

public record CommentRequest(
    @NotBlank String content,
    Long parentId
) {}

