package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

/* renamed from: bpa reason: default package */
final class bpa implements eib {
    private final /* synthetic */ boo a;
    private final /* synthetic */ g b;

    bpa(g gVar, boo boo) {
        this.b = gVar;
        this.a = boo;
    }

    public final void a(long j) {
        try {
            this.b.a((c) this.b.a(new Status(2103)));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e);
        }
    }

    public final void a(long j, int i, Object obj) {
        try {
            this.b.a(new h(new Status(i), obj instanceof JSONObject ? (JSONObject) obj : null));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e);
        }
    }
}
