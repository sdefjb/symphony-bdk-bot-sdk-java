package com.symphony.bot.sdk.internal.event.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import model.events.UserLeftRoom;

/**
 * Symphony User left room event
 *
 * @author Marcus Secato
 */
@Data
@NoArgsConstructor
public class UserLeftRoomEvent extends BaseEvent {

  private StreamDetails stream;
  private UserDetails user;

  public UserLeftRoomEvent(UserLeftRoom event) {
    this.streamId = event.getStream().getStreamId();
    this.userId = event.getAffectedUser().getUserId();
    this.stream = new StreamDetails(event.getStream());
    this.user = new UserDetails(event.getAffectedUser());
  }

}