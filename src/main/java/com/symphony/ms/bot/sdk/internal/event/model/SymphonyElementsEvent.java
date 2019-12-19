package com.symphony.ms.bot.sdk.internal.event.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import model.User;
import model.events.SymphonyElementsAction;

import java.util.Map;

/**
 * Symphony elements event
 *
 * @author Marcus Secato
 */
@Data
@NoArgsConstructor
public class SymphonyElementsEvent extends BaseEvent {

  private StreamDetails.StreamType streamType;
  private String formId;
  private Map<String, Object> formValues;
  private UserDetails user;

  public SymphonyElementsEvent(User initiator, SymphonyElementsAction action) {
    this.streamId = action.getStreamId();
    this.streamType = StreamDetails.StreamType.value(action.getStreamType());
    this.formId = action.getFormId();
    this.formValues = action.getFormValues();
    this.user = new UserDetails(initiator);
  }

}