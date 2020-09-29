package defpackage;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hgr reason: default package */
final class hgr implements Function<Response, Optional<Map<String, String>>> {
    private final ObjectMapper a;

    public hgr(ObjectMapper objectMapper) {
        this.a = objectMapper;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Optional<Map<String, String>> apply(Response response) {
        if (response == null) {
            return Optional.e();
        }
        if (response.getStatus() < 200 || response.getStatus() >= 300) {
            return Optional.e();
        }
        if (response.getBody().length == 0) {
            return Optional.b(ImmutableMap.f());
        }
        try {
            return Optional.b(ImmutableMap.a((Map) this.a.readValue(response.getBody(), (TypeReference) new TypeReference<HashMap<String, String>>() {
            })));
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder("fatal: Could not parse product state to Map in RxProductState with response ");
            sb.append(response);
            throw new AssertionError(sb.toString());
        }
    }
}
