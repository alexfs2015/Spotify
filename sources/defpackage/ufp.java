package defpackage;

import com.spotify.cosmos.router.Request;
import java.util.Collections;
import java.util.Locale;

/* renamed from: ufp reason: default package */
public final class ufp extends Request {
    public ufp(String str, String str2) {
        super(Request.POST, "hm://login-trial/start_trial", Collections.emptyMap(), String.format(Locale.ENGLISH, "{\"trial\":\"7d-opt-in\", \"device_id\":\"%s\", \"country\":\"%s\"}", new Object[]{gbk.a(str, "androidId can't be empty"), gbk.a(str2, "countryCode can't be empty")}).getBytes(far.c));
    }
}