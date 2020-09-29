package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import java.util.Locale;

/* renamed from: uwq reason: default package */
public final class uwq {
    private final ObjectMapper a;

    uwq(rnf rnf) {
        this.a = uwp.a(rnf);
    }

    /* access modifiers changed from: 0000 */
    public final uwi a(Response response) {
        if (response.getStatus() == 200) {
            return new b();
        }
        if (response.getStatus() == 403) {
            String str = (String) response.getHeaders().get("forbidden-reasons");
            if (str == null) {
                str = "";
            }
            return uwi.a(str);
        }
        return uwi.a(String.format(Locale.US, "Unknown error for %s with status code %d!", new Object[]{response.getUri(), Integer.valueOf(response.getStatus())}));
    }
}
