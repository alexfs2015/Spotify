package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vas reason: default package */
public final class vas<T> {
    private final var<T> a;

    public vas(var<T> var) {
        this.a = var;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, long j, Object obj) {
        var<T> var = this.a;
        try {
            String writeValueAsString = var.b.writeValueAsString(obj);
            vap vap = var.a;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("wrapped_value", writeValueAsString);
                jSONObject.put("timestamp_ms", vap.b.a());
                jSONObject.put("ttl", j);
                jSONObject.put("id", str);
                vap.a.a().a(bVar, jSONObject).b();
            } catch (JSONException unused) {
                Logger.b("Unable to write value for key: %s", bVar.a);
            }
        } catch (JsonProcessingException unused2) {
            Logger.b("Could not write object as string for key: %s", bVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional b(b bVar, String str) {
        return this.a.a(bVar, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(b bVar) {
        vap vap = this.a.a;
        if (vap.a.e(bVar)) {
            vap.a.a().a(bVar).b();
        }
    }

    public final xii<Optional<T>> a(b<Object, JSONObject> bVar, String str) {
        return xii.a((Callable<? extends T>) new $$Lambda$vas$dyCDqtBiOsQIOJ7A9me0gT36k<Object>(this, bVar, str));
    }

    public final xir a(b<Object, JSONObject> bVar) {
        return new $$Lambda$vas$49RjQ6UINESw11qMAg2jQdn8NY(this, bVar);
    }

    public final xis<T> a(b<Object, JSONObject> bVar, String str, long j) {
        $$Lambda$vas$ts_yTUiWM25CXkVdNXENWLrFLc r0 = new $$Lambda$vas$ts_yTUiWM25CXkVdNXENWLrFLc(this, bVar, str, j);
        return r0;
    }
}
