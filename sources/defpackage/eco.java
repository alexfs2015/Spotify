package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import java.util.Map;

@cey
/* renamed from: eco reason: default package */
public final class eco extends ecq {
    public Map<Class<? extends Object>, Object> a;

    static {
        new eej();
    }

    public final ecs a(String str) {
        return d(str);
    }

    public final eee c(String str) {
        return eej.a(str);
    }

    public final boolean b(String str) {
        try {
            return bkx.class.isAssignableFrom(Class.forName(str, false, eco.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            sb.toString();
            cow.a(5);
            return false;
        }
    }

    private final <NetworkExtrasT extends apm, ServerParametersT extends MediationServerParameters> ecs d(String str) {
        try {
            Class cls = Class.forName(str, false, eco.class.getClassLoader());
            if (apj.class.isAssignableFrom(cls)) {
                apj apj = (apj) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new eds(apj, (apm) this.a.get(apj.getAdditionalParametersType()));
            } else if (bkn.class.isAssignableFrom(cls)) {
                return new edn((bkn) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                sb.toString();
                cow.a(5);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return e(str);
        }
    }

    private final ecs e(String str) {
        try {
            cow.a(3);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new edn(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new edn(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new edn(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new eds(customEventAdapter, (bkz) this.a.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.toString();
            cow.a(5);
        }
    }
}
