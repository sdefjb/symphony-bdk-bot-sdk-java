package com.symphony.bot.sdk.internal.sse.model;

/**
 * Base interface for any custom events that should to be published through SSE channels
 *
 * @author Marcus Secato
 *
 */
public interface SsePublishable {

  String getType();

  String getId();

}