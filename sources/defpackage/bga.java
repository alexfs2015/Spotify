package defpackage;

import android.content.Context;
import java.util.Map;

@cfp
/* renamed from: bga reason: default package */
public final class bga implements bhc<Object> {
    private final Context a;

    public bga(Context context) {
        this.a = context;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (bkc.B().a(this.a)) {
            bkc.B().a(this.a, (String) map.get("eventName"), (String) map.get("eventId"));
        }
    }
}
