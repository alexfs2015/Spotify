package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import java.util.Map;

/* renamed from: bwc reason: default package */
public final class bwc {
    final dp<bwa<?>, ConnectionResult> a = new dp<>();
    final eya<Map<bwa<?>, String>> b = new eya<>();
    private final dp<bwa<?>, String> c = new dp<>();
    private int d;
    private boolean e = false;

    public bwc(Iterable<? extends bsx<?>> iterable) {
        for (bsx bsx : iterable) {
            this.a.put(bsx.d, null);
        }
        this.d = this.a.keySet().size();
    }

    public final void a(bwa<?> bwa, ConnectionResult connectionResult, String str) {
        this.a.put(bwa, connectionResult);
        this.c.put(bwa, str);
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
