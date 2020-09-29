package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: btt reason: default package */
public final class btt {
    final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());
    private final Map<eya<?>, Boolean> b = Collections.synchronizedMap(new WeakHashMap());

    private final void a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap(this.a);
        }
        synchronized (this.b) {
            hashMap2 = new HashMap(this.b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((eya) entry2.getKey()).b(new ApiException(status));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return !this.a.isEmpty() || !this.b.isEmpty();
    }

    public final void b() {
        a(false, btj.a);
    }

    public final void c() {
        a(true, bvu.a);
    }
}
