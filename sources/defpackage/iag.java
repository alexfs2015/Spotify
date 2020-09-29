package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import java.util.HashMap;
import java.util.Map;

/* renamed from: iag reason: default package */
public final class iag {
    private final gch<ObjectMapper> a;

    public iag(gch<ObjectMapper> gch) {
        this.a = gch;
    }

    public final Request a(String str, String str2, Map<String, ?> map) {
        byte[] bArr = Request.EMPTY_BODY;
        if (map != null) {
            try {
                bArr = ((ObjectMapper) this.a.a()).writeValueAsBytes(map);
            } catch (JsonProcessingException unused) {
                Logger.e("Invalid request body for %s", str2);
            }
        }
        return new Request(str, str2, new HashMap(), bArr);
    }
}
