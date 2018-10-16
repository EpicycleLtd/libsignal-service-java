/**
 * Copyright (C) 2014-2016 Open Whisper Systems
 *
 * Licensed according to the LICENSE file in this repository.
 */

package org.whispersystems.signalservice.internal.push;


import com.fasterxml.jackson.annotation.JsonProperty;

public class OutgoingPushMessage {

  @JsonProperty
  private int    type;
  @JsonProperty
  private int    destinationDeviceId;
  @JsonProperty
  private int    destinationRegistrationId;
  @JsonProperty
  private String content;
  @JsonProperty
  private boolean silent;
  @JsonProperty
  private long timestamp; // to use with old read receipts

  public OutgoingPushMessage(int type,
                             int destinationDeviceId,
                             int destinationRegistrationId,
                             String content,
                             boolean silent)
  {
    this.type                      = type;
    this.destinationDeviceId       = destinationDeviceId;
    this.destinationRegistrationId = destinationRegistrationId;
    this.content                   = content;
    this.silent                    = silent;
    this.timestamp                 = 0;
  }

  public OutgoingPushMessage withReplacedTimestamp(long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public OutgoingPushMessage withReplacedType(int type) {
    this.type = type;
    return this;
  }
}
