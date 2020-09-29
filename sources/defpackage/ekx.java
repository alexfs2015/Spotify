package defpackage;

import android.os.Binder;

/* renamed from: ekx reason: default package */
public final /* synthetic */ class ekx {
    public static <V> V a(eky<V> eky) {
        long clearCallingIdentity;
        try {
            return eky.a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = eky.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
