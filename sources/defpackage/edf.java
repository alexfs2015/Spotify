package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import java.util.Map;

@cfp
/* renamed from: edf reason: default package */
public final class edf extends edh {
    public Map<Class<? extends Object>, Object> a;

    static {
        new efa();
    }

    private final <NetworkExtrasT extends aqd, ServerParametersT extends MediationServerParameters> edj d(String str) {
        try {
            Class cls = Class.forName(str, false, edf.class.getClassLoader());
            if (aqa.class.isAssignableFrom(cls)) {
                aqa aqa = (aqa) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new eej(aqa, (aqd) this.a.get(aqa.getAdditionalParametersType()));
            } else if (ble.class.isAssignableFrom(cls)) {
                return new eee((ble) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                sb.toString();
                cpn.a(5);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return e(str);
        }
    }

    private final edj e(String str) {
        try {
            cpn.a(3);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new eee(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new eee(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new eee(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new eej(customEventAdapter, (blq) this.a.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.toString();
            cpn.a(5);
        }
    }

    public final edj a(String str) {
        return d(str);
    }

    public final boolean b(String str) {
        try {
            return blo.class.isAssignableFrom(Class.forName(str, false, edf.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            sb.toString();
            cpn.a(5);
            return false;
        }
    }

    public final eev c(String str) {
        return efa.a(str);
    }
}
