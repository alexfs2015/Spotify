package defpackage;

import com.google.android.gms.internal.measurement.zzve;
import defpackage.enc;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: enl reason: default package */
abstract class enl<T extends enc> {
    private static final Logger a = Logger.getLogger(zzve.class.getName());
    private static String b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    enl() {
    }

    static <T extends enc> T a(Class<T> cls) {
        String str;
        Class<enl> cls2 = enl.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(enc.class)) {
            str = b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (enc) cls.cast(((enl) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((enc) cls.cast(((enl) it.next()).a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String str2 = "Unable to load ";
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (enc) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (enc) cls.getMethod("combine", new Class[]{Collection.class}).invoke(null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a();
}
