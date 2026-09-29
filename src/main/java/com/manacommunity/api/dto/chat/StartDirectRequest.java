package com.manacommunity.api.dto.chat;

import com.manacommunity.common.enums.*;
/** Body for POST /api/chat/conversations/direct ΓÇö the other user's id. */
public record StartDirectRequest(Long userId) {}

