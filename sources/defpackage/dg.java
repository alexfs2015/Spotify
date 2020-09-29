package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* renamed from: dg reason: default package */
public final class dg {
    final c a;
    final ComponentName b;
    private final Object c = new Object();
    private final d d;

    dg(d dVar, c cVar, ComponentName componentName) {
        this.d = dVar;
        this.a = cVar;
        this.b = componentName;
    }

    public final boolean a(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.d.a(this.a, uri, (Bundle) null, null);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
