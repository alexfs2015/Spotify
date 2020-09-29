package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;

@cfp
/* renamed from: dte reason: default package */
public final class dte {
    final Object a = new Object();
    final ConditionVariable b = new ConditionVariable();
    volatile boolean c = false;
    SharedPreferences d = null;
    Context e;

    public final <T> T a(dsw<T> dsw) {
        if (this.b.block(5000)) {
            if (!this.c || this.d == null) {
                synchronized (this.a) {
                    if (this.c) {
                        if (this.d == null) {
                        }
                    }
                    T t = dsw.c;
                    return t;
                }
            }
            return cou.a(this.e, new dtf(this, dsw));
        }
        throw new IllegalStateException("Flags.initialize() was not called!");
    }
}
