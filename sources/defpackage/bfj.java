package defpackage;

import android.content.Context;
import java.util.Map;

@cey
/* renamed from: bfj reason: default package */
public final class bfj implements bgl<Object> {
    private final Context a;

    public bfj(Context context) {
        this.a = context;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (bjl.B().a(this.a)) {
            bjl.B().a(this.a, (String) map.get("eventName"), (String) map.get("eventId"));
        }
    }
}
