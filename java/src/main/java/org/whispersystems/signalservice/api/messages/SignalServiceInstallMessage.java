package org.whispersystems.signalservice.api.messages;


public class SignalServiceInstallMessage {

    public enum Type {

        UNKNOWN(0), GROUP_REQUEST(1), GROUP_RESPONSE(2);

        private final int value;

        Type(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private final Type type;
    private final long timestamp;

    public SignalServiceInstallMessage(Type type, long timestamp) {
        this.timestamp = timestamp;
        this.type = type;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public Type getType() {
        return type;
    }

    public boolean isGroupRequest() {
        return type == Type.GROUP_REQUEST;
    }

    public boolean isGroupResponse() {
        return type == Type.GROUP_RESPONSE;
    }
}
