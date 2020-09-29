package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.connect.model.Message;
import com.spotify.mobile.android.connect.model.Message.Type;
import com.spotify.mobile.android.connect.model.UserData;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import java.io.IOException;

/* renamed from: mfm reason: default package */
public final class mfm {
    private static final ObjectMapper a = ((rnf) ggw.a(rnf.class)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a();

    private static String a(Type type, JacksonModel jacksonModel) {
        try {
            return a.writeValueAsString(new Message(type, (JsonNode) a.convertValue(jacksonModel, JsonNode.class)));
        } catch (JsonProcessingException | IllegalArgumentException e) {
            Logger.e(e, "Couldn't generate message", new Object[0]);
            return null;
        }
    }

    public static <T> T a(JsonNode jsonNode, Class<T> cls) {
        try {
            return a.convertValue(jsonNode, cls);
        } catch (IllegalArgumentException e) {
            Logger.e(e, "Couldn't parse payload", new Object[0]);
            return null;
        }
    }

    public static Message a(String str) {
        try {
            return (Message) a.readValue(str, Message.class);
        } catch (IOException e) {
            Logger.e(e, "Couldn't parse message", new Object[0]);
            return new Message(Type.UNKNOWN, null);
        }
    }

    public static String a(DiscoveredDevice discoveredDevice) {
        return a(Type.GET_INFO, (JacksonModel) discoveredDevice);
    }

    public static String a(String str, String str2, String str3, String str4) {
        UserData userData = new UserData();
        userData.userName = str;
        userData.blob = str2;
        userData.clientKey = str3;
        userData.tokenType = str4;
        return a(Type.ADD_USER, (JacksonModel) userData);
    }
}
