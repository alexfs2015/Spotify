package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bnv reason: default package */
public final class bnv {
    public static final ehw a = new ehw("CastContext", 0);
    private static bnv f;
    public final bqc b;
    public final boe c;
    public final bpw d;
    public final bnw e;
    private final Context g;
    private final bob h;
    private final bnz i;
    private eir j = new eir(nd.a(this.g));
    private eik k;
    private final List<bog> l;

    public static bnv a(Context context) {
        bwx.b("Must be called from the main thread.");
        if (f == null) {
            boa b2 = b(context.getApplicationContext());
            f = new bnv(context, b2.getCastOptions(context.getApplicationContext()), b2.getAdditionalSessionProviders(context.getApplicationContext()));
        }
        return f;
    }

    public static bnv a() {
        bwx.b("Must be called from the main thread.");
        return f;
    }

    private static boa b(Context context) {
        try {
            Bundle bundle = cab.a(context).a(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                a.b("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (boa) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e2) {
            throw new IllegalStateException("Failed to initialize CastContext.", e2);
        }
    }

    private bnv(Context context, bnw bnw, List<bog> list) {
        bqj bqj;
        bpw bpw;
        bqp bqp;
        boe boe;
        String str = "Unable to call %s on %s.";
        this.g = context.getApplicationContext();
        this.e = bnw;
        this.l = list;
        bob bob = null;
        if (!TextUtils.isEmpty(this.e.a)) {
            this.k = new eik(this.g, this.e, this.j);
        } else {
            this.k = null;
        }
        this.b = eif.a(this.g, bnw, (eio) this.j, e());
        try {
            bqj = this.b.c();
        } catch (RemoteException e2) {
            a.a(e2, str, "getDiscoveryManagerImpl", bqc.class.getSimpleName());
            bqj = null;
        }
        if (bqj == null) {
            bpw = null;
        } else {
            bpw = new bpw(bqj);
        }
        this.d = bpw;
        try {
            bqp = this.b.b();
        } catch (RemoteException e3) {
            a.a(e3, str, "getSessionManagerImpl", bqc.class.getSimpleName());
            bqp = null;
        }
        if (bqp == null) {
            boe = null;
        } else {
            boe = new boe(bqp, this.g);
        }
        this.c = boe;
        this.i = new bnz(this.c);
        boe boe2 = this.c;
        if (boe2 != null) {
            bob = new bob(this.e, boe2, new egx(this.g));
        }
        this.h = bob;
    }

    private final Map<String, IBinder> e() {
        HashMap hashMap = new HashMap();
        eik eik = this.k;
        if (eik != null) {
            hashMap.put(eik.b, this.k.c);
        }
        List<bog> list = this.l;
        if (list != null) {
            for (bog bog : list) {
                bwx.a(bog, (Object) "Additional SessionProvider must not be null.");
                String a2 = bwx.a(bog.b, (Object) "Category for SessionProvider must not be null or empty string.");
                bwx.b(!hashMap.containsKey(a2), String.format("SessionProvider for category %s already added", new Object[]{a2}));
                hashMap.put(a2, bog.c);
            }
        }
        return hashMap;
    }

    public final boe b() {
        bwx.b("Must be called from the main thread.");
        return this.c;
    }

    public final boolean c() {
        bwx.b("Must be called from the main thread.");
        try {
            return this.b.a();
        } catch (RemoteException e2) {
            a.a(e2, "Unable to call %s on %s.", "isApplicationVisible", bqc.class.getSimpleName());
            return false;
        }
    }

    public final boolean d() {
        bwx.b("Must be called from the main thread.");
        try {
            return this.b.d();
        } catch (RemoteException e2) {
            a.a(e2, "Unable to call %s on %s.", "hasActivityInRecents", bqc.class.getSimpleName());
            return false;
        }
    }
}
