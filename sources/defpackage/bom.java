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

/* renamed from: bom reason: default package */
public final class bom {
    public static final ein a = new ein("CastContext", 0);
    private static bom f;
    public final bqt b;
    public final bov c;
    public final bqn d;
    public final bon e;
    private final Context g;
    private final bos h;
    private final boq i;
    private eji j = new eji(ni.a(this.g));
    private ejb k;
    private final List<box> l;

    private bom(Context context, bon bon, List<box> list) {
        bra bra;
        brg brg;
        String str = "Unable to call %s on %s.";
        this.g = context.getApplicationContext();
        this.e = bon;
        this.l = list;
        bos bos = null;
        if (!TextUtils.isEmpty(this.e.a)) {
            this.k = new ejb(this.g, this.e, this.j);
        } else {
            this.k = null;
        }
        this.b = eiw.a(this.g, bon, (ejf) this.j, e());
        try {
            bra = this.b.c();
        } catch (RemoteException e2) {
            a.a(e2, str, "getDiscoveryManagerImpl", bqt.class.getSimpleName());
            bra = null;
        }
        this.d = bra == null ? null : new bqn(bra);
        try {
            brg = this.b.b();
        } catch (RemoteException e3) {
            a.a(e3, str, "getSessionManagerImpl", bqt.class.getSimpleName());
            brg = null;
        }
        this.c = brg == null ? null : new bov(brg, this.g);
        this.i = new boq(this.c);
        bov bov = this.c;
        if (bov != null) {
            bos = new bos(this.e, bov, new eho(this.g));
        }
        this.h = bos;
    }

    public static bom a() {
        bxo.b("Must be called from the main thread.");
        return f;
    }

    public static bom a(Context context) {
        bxo.b("Must be called from the main thread.");
        if (f == null) {
            bor b2 = b(context.getApplicationContext());
            f = new bom(context, b2.getCastOptions(context.getApplicationContext()), b2.getAdditionalSessionProviders(context.getApplicationContext()));
        }
        return f;
    }

    private static bor b(Context context) {
        try {
            Bundle bundle = cas.a(context).a(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                a.b("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (bor) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e2) {
            throw new IllegalStateException("Failed to initialize CastContext.", e2);
        }
    }

    private final Map<String, IBinder> e() {
        HashMap hashMap = new HashMap();
        ejb ejb = this.k;
        if (ejb != null) {
            hashMap.put(ejb.b, this.k.c);
        }
        List<box> list = this.l;
        if (list != null) {
            for (box box : list) {
                bxo.a(box, (Object) "Additional SessionProvider must not be null.");
                String a2 = bxo.a(box.b, (Object) "Category for SessionProvider must not be null or empty string.");
                bxo.b(!hashMap.containsKey(a2), String.format("SessionProvider for category %s already added", new Object[]{a2}));
                hashMap.put(a2, box.c);
            }
        }
        return hashMap;
    }

    public final bov b() {
        bxo.b("Must be called from the main thread.");
        return this.c;
    }

    public final boolean c() {
        bxo.b("Must be called from the main thread.");
        try {
            return this.b.a();
        } catch (RemoteException e2) {
            a.a(e2, "Unable to call %s on %s.", "isApplicationVisible", bqt.class.getSimpleName());
            return false;
        }
    }

    public final boolean d() {
        bxo.b("Must be called from the main thread.");
        try {
            return this.b.d();
        } catch (RemoteException e2) {
            a.a(e2, "Unable to call %s on %s.", "hasActivityInRecents", bqt.class.getSimpleName());
            return false;
        }
    }
}
