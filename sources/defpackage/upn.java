package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: upn reason: default package */
public final class upn<T> {
    private final upm<T> a;

    public upn(upm<T> upm) {
        this.a = upm;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional b(b bVar, String str) {
        return this.a.a(bVar, str);
    }

    public final wud<Optional<T>> a(b<Object, JSONObject> bVar, String str) {
        return wud.a((Callable<? extends T>) new $$Lambda$upn$o7VemTG5awHRt55HM6l5pTqdyLE<Object>(this, bVar, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, long j, Object obj) {
        upm<T> upm = this.a;
        try {
            String writeValueAsString = upm.b.writeValueAsString(obj);
            upk upk = upm.a;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("wrapped_value", writeValueAsString);
                jSONObject.put("timestamp_ms", upk.b.a());
                jSONObject.put("ttl", j);
                jSONObject.put("id", str);
                upk.a.a().a(bVar, jSONObject).b();
            } catch (JSONException unused) {
                Logger.b("Unable to write value for key: %s", bVar.a);
            }
        } catch (JsonProcessingException unused2) {
            Logger.b("Could not write object as string for key: %s", bVar);
        }
    }

    public final wun<T> a(b<Object, JSONObject> bVar, String str, long j) {
        $$Lambda$upn$oIwCkrJO1sG6j_mJRrDBgs90qw r0 = new $$Lambda$upn$oIwCkrJO1sG6j_mJRrDBgs90qw(this, bVar, str, j);
        return r0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(b bVar) {
        upk upk = this.a.a;
        if (upk.a.e(bVar)) {
            upk.a.a().a(bVar).b();
        }
    }

    public final wum a(b<Object, JSONObject> bVar) {
        return new $$Lambda$upn$kBkCR_2auuZycg0nK30jSgl6DI(this, bVar);
    }
}
