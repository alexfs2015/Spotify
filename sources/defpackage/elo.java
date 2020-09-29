package defpackage;

import android.os.Binder;

/* renamed from: elo reason: default package */
public final /* synthetic */ class elo {
    public static <V> V a(elp<V> elp) {
        long clearCallingIdentity;
        try {
            return elp.a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = elp.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
