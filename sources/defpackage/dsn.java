package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;

@cey
/* renamed from: dsn reason: default package */
public final class dsn {
    final Object a = new Object();
    final ConditionVariable b = new ConditionVariable();
    volatile boolean c = false;
    SharedPreferences d = null;
    Context e;

    public final <T> T a(dsf<T> dsf) {
        if (this.b.block(5000)) {
            if (!this.c || this.d == null) {
                synchronized (this.a) {
                    if (this.c) {
                        if (this.d == null) {
                        }
                    }
                    T t = dsf.c;
                    return t;
                }
            }
            return cod.a(this.e, new dso(this, dsf));
        }
        throw new IllegalStateException("Flags.initialize() was not called!");
    }
}
