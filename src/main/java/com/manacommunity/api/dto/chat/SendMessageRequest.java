package com.manacommunity.api.dto.chat;

import com.manacommunity.common.enums.*;
/** Body for POST /api/chat/conversations/{id}/messages. */
public record SendMessageRequest(String content) {}

