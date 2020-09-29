package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.AsrResponse;
import com.spotify.voice.api.model.ErrorDomain;

/* renamed from: wcp reason: default package */
public final class wcp implements wco {
    private final ObjectMapper a;

    wcp(ObjectMapper objectMapper) {
        this.a = objectMapper;
    }

    private AsrResponse a(JsonNode jsonNode) {
        try {
            return (AsrResponse) this.a.convertValue(jsonNode, AsrResponse.class);
        } catch (IllegalArgumentException e) {
            throw new VoiceSessionException(ErrorDomain.CONNECTION, wel.c, e);
        }
    }

    public final /* synthetic */ Object call(Object obj) {
        weq weq;
        JsonNode jsonNode = (JsonNode) obj;
        if (jsonNode.has("transcript")) {
            AsrResponse a2 = a(jsonNode);
            if (!a2.isFinal()) {
                return weq.a(a2);
            }
            weq = weq.b(a2);
        } else {
            weq = weq.a(jsonNode);
        }
        return weq;
    }
}
