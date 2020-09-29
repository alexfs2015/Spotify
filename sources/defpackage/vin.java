package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import java.util.Locale;

/* renamed from: vin reason: default package */
public final class vin {
    private final ObjectMapper a;

    vin(rwl rwl) {
        this.a = vim.a(rwl);
    }

    /* access modifiers changed from: 0000 */
    public final vhy a(Response response) {
        if (response.getStatus() == 200) {
            return new b();
        }
        String str = "";
        if (response.getStatus() == 403) {
            String str2 = (String) response.getHeaders().get("forbidden-reasons");
            if (str2 == null) {
                str2 = str;
            }
            return vhy.a(str2);
        } else if (response.getStatus() == 400) {
            String str3 = (String) response.getHeaders().get("error-description");
            if (str3 == null) {
                str3 = str;
            }
            return vhy.a(str3);
        } else {
            return vhy.a(String.format(Locale.US, "Unknown error for %s with status code %d!", new Object[]{response.getUri(), Integer.valueOf(response.getStatus())}));
        }
    }
}
