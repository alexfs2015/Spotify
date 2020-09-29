package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: bvu reason: default package */
public final class bvu {
    public static final Status a = new Status(8, "The connection to Google Play services was lost");
    static final BasePendingResult<?>[] b = new BasePendingResult[0];
    final Set<BasePendingResult<?>> c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final bvw d = new bvv(this);
    private final Map<c<?>, f> e;

    public bvu(Map<c<?>, f> map) {
        this.e = map;
    }

    public final void a() {
        BasePendingResult[] basePendingResultArr;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.c.toArray(b)) {
            basePendingResult.a((bvw) null);
            basePendingResult.d();
            if (basePendingResult.f()) {
                this.c.remove(basePendingResult);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(BasePendingResult<? extends btc> basePendingResult) {
        this.c.add(basePendingResult);
        basePendingResult.a(this.d);
    }
}
