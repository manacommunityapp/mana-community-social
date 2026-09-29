package com.manacommunity.api.dto;

import com.manacommunity.common.enums.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ReportRequest(
    @NotBlank String contentType,
    @NotNull Long contentId,
    @NotBlank String reason,
    String description
) {}

