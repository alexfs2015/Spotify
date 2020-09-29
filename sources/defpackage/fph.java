package defpackage;

import android.content.Intent;
import defpackage.fph;

/* renamed from: fph reason: default package */
public abstract class fph<T extends fph> extends fpj<T> {
    public final T a(Intent intent) {
        if (intent != null) {
            c("event");
            return (fph) a("intent", intent.toUri(1));
        }
        throw new IllegalArgumentException("Intent is null");
    }

    public final T b(String str) {
        c("intent");
        c("intentType");
        return (fph) a("event", str);
    }
}
