package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import java.util.Map;

/* renamed from: bvl reason: default package */
public final class bvl {
    final dp<bvj<?>, ConnectionResult> a = new dp<>();
    final exj<Map<bvj<?>, String>> b = new exj<>();
    private final dp<bvj<?>, String> c = new dp<>();
    private int d;
    private boolean e = false;

    public bvl(Iterable<? extends bsg<?>> iterable) {
        for (bsg bsg : iterable) {
            this.a.put(bsg.d, null);
        }
        this.d = this.a.keySet().size();
    }

    public final void a(bvj<?> bvj, ConnectionResult connectionResult, String str) {
        this.a.put(bvj, connectionResult);
        this.c.put(bvj, str);
        this.d--;
        if (!connectionResult.b()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (this.e) {
                this.b.a((Exception) new AvailabilityException(this.a));
                return;
            }
            this.b.a(this.c);
        }
    }
}
