package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.voice.VoiceSessionException;
import com.spotify.voice.model.AsrResponse;
import com.spotify.voice.model.ErrorDomain;

/* renamed from: vpo reason: default package */
public final class vpo implements vpn {
    private final ObjectMapper a;

    public final /* synthetic */ Object call(Object obj) {
        vri vri;
        JsonNode jsonNode = (JsonNode) obj;
        if (jsonNode.has("transcript")) {
            AsrResponse a2 = a(jsonNode);
            if (!a2.isFinal()) {
                return vri.a(a2);
            }
            vri = vri.b(a2);
        } else {
            vri = vri.a(jsonNode);
        }
        return vri;
    }

    vpo(ObjectMapper objectMapper) {
        this.a = objectMapper;
    }

    private AsrResponse a(JsonNode jsonNode) {
        try {
            return (AsrResponse) this.a.convertValue(jsonNode, AsrResponse.class);
        } catch (IllegalArgumentException e) {
            throw new VoiceSessionException(ErrorDomain.CONNECTION, vrd.c, e);
        }
    }
}
