package com.spotify.music.connection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonDeserialize(using = OfflineStateJsonDeserializer.class)
@JsonSerialize(using = OfflineStateJsonSerializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OfflineState implements JacksonModel {

    public static class OfflineStateJsonDeserializer extends JsonDeserializer<OfflineState> {
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ java.lang.Object deserialize(com.fasterxml.jackson.core.JsonParser r3, com.fasterxml.jackson.databind.DeserializationContext r4) {
            /*
                r2 = this;
                java.lang.Class<com.fasterxml.jackson.databind.JsonNode> r4 = com.fasterxml.jackson.databind.JsonNode.class
                java.lang.Object r3 = r3.readValueAs(r4)
                com.fasterxml.jackson.databind.JsonNode r3 = (com.fasterxml.jackson.databind.JsonNode) r3
                java.lang.String r4 = "connection"
                com.fasterxml.jackson.databind.JsonNode r3 = r3.findValue(r4)
                java.lang.String r4 = "status"
                com.fasterxml.jackson.databind.JsonNode r3 = r3.findValue(r4)
                java.lang.String r3 = r3.asText()
                int r4 = r3.hashCode()
                r0 = 2
                r1 = 1
                switch(r4) {
                    case -1548612125: goto L_0x0040;
                    case -1012222381: goto L_0x0036;
                    case -424567171: goto L_0x002c;
                    case -48584405: goto L_0x0022;
                    default: goto L_0x0021;
                }
            L_0x0021:
                goto L_0x004a
            L_0x0022:
                java.lang.String r4 = "reconnecting"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x004a
                r3 = 2
                goto L_0x004b
            L_0x002c:
                java.lang.String r4 = "forced_offline"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x004a
                r3 = 1
                goto L_0x004b
            L_0x0036:
                java.lang.String r4 = "online"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x004a
                r3 = 0
                goto L_0x004b
            L_0x0040:
                java.lang.String r4 = "offline"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x004a
                r3 = 3
                goto L_0x004b
            L_0x004a:
                r3 = -1
            L_0x004b:
                if (r3 == 0) goto L_0x005a
                if (r3 == r1) goto L_0x0057
                if (r3 == r0) goto L_0x0054
                com.spotify.music.connection.OfflineState$State r3 = com.spotify.music.connection.OfflineState.State.OFFLINE
                goto L_0x005c
            L_0x0054:
                com.spotify.music.connection.OfflineState$State r3 = com.spotify.music.connection.OfflineState.State.RECONNECTING
                goto L_0x005c
            L_0x0057:
                com.spotify.music.connection.OfflineState$State r3 = com.spotify.music.connection.OfflineState.State.FORCED_OFFLINE
                goto L_0x005c
            L_0x005a:
                com.spotify.music.connection.OfflineState$State r3 = com.spotify.music.connection.OfflineState.State.ONLINE
            L_0x005c:
                com.spotify.music.connection.OfflineState r3 = com.spotify.music.connection.OfflineState.create(r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.connection.OfflineState.OfflineStateJsonDeserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.lang.Object");
        }
    }

    public static class OfflineStateJsonSerializer extends JsonSerializer<OfflineState> {
        public /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            OfflineState offlineState = (OfflineState) obj;
            jsonGenerator.writeStartObject();
            jsonGenerator.writeFieldName("connection");
            jsonGenerator.writeStartObject();
            jsonGenerator.writeBooleanField("force_offline", offlineState.offlineState() == State.FORCED_OFFLINE);
            jsonGenerator.writeEndObject();
            jsonGenerator.writeEndObject();
        }
    }

    public enum State {
        ONLINE,
        OFFLINE,
        FORCED_OFFLINE,
        RECONNECTING
    }

    public abstract State offlineState();

    public static OfflineState create(State state) {
        return new AutoValue_OfflineState(state);
    }

    public boolean offline() {
        return State.ONLINE != offlineState();
    }
}
