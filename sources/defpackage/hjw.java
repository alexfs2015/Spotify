package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.common.base.Function;
import com.spotify.base.java.logging.Logger;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hjw reason: default package */
public class hjw {
    private final Context a;
    private final boolean b;
    private final a c = new a();
    private final AtomicInteger d = new AtomicInteger();

    /* renamed from: hjw$a */
    public static class a {
        private final Map<String, Integer> a = new ConcurrentHashMap();

        public final synchronized int a(String str, int i) {
            Integer valueOf;
            Integer valueOf2 = Integer.valueOf(0);
            if (this.a.containsKey(str)) {
                valueOf2 = (Integer) this.a.remove(str);
            }
            valueOf = Integer.valueOf(valueOf2.intValue() + i);
            if (valueOf.intValue() > 0) {
                this.a.put(str, valueOf);
            }
            return valueOf.intValue();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(512);
            sb.append("{ ");
            for (Entry entry : this.a.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 0) {
                    sb.append((String) entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    sb.append(' ');
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public hjw(Context context, boolean z) {
        this.a = jtr.a(context);
        this.b = z;
    }

    private RuntimeException a(Intent intent) {
        try {
            return new RuntimeException(String.format(Locale.US, "Failed binding to the service. Intent: %s\nRegistered services: %s", new Object[]{intent, fbl.a(", ").a(fcp.a((E[]) this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 4).services).a((Function<? super E, T>) $$Lambda$hjw$ivOFP85lgKbtVRv9IAWysSrpEw.INSTANCE).iterator())}));
        } catch (NameNotFoundException e) {
            throw new AssertionError(e);
        }
    }

    private String a() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("# of active connections = ");
        sb.append(this.d);
        if (this.d.get() > 0) {
            sb.append(", refs = ");
            sb.append(this.c);
        }
        return sb.toString();
    }

    private void a(ServiceConnection serviceConnection, String str, int i, int i2) {
        if (this.b) {
            Logger.c("[%s] Bind | # of active connections %d, # of all connections %d", b(serviceConnection, str), Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    private static String b(ServiceConnection serviceConnection, String str) {
        String simpleName = serviceConnection.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(':');
        sb.append(simpleName);
        sb.append(':');
        sb.append(serviceConnection.hashCode());
        return sb.toString();
    }

    private void c(ServiceConnection serviceConnection, String str) {
        if (this.b) {
            Logger.c("[%s] Unbind | %s", b(serviceConnection, str), a());
        }
    }

    public final void a(Intent intent, ServiceConnection serviceConnection, String str) {
        if (this.a.bindService(intent, serviceConnection, 65)) {
            a(serviceConnection, str, this.c.a(b(serviceConnection, str), 1), this.d.incrementAndGet());
            return;
        }
        throw a(intent);
    }

    public final void a(ServiceConnection serviceConnection, String str) {
        this.c.a(b(serviceConnection, str), -1);
        this.d.decrementAndGet();
        c(serviceConnection, str);
        this.a.unbindService(serviceConnection);
    }
}
