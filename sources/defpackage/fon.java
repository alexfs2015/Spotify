package defpackage;

import android.content.Intent;
import defpackage.fon;

/* renamed from: fon reason: default package */
public abstract class fon<T extends fon> extends fop<T> {
    public final T a(Intent intent) {
        if (intent != null) {
            c("event");
            return (fon) a("intent", intent.toUri(1));
        }
        throw new IllegalArgumentException("Intent is null");
    }

    public final T b(String str) {
        c("intent");
        c("intentType");
        return (fon) a("event", str);
    }
}
