package com.manacommunity.api.dto.chat;

/** Body for POST /api/chat/conversations/direct ΓÇö the other user's id. */
public record StartDirectRequest(Long userId) {}
