package defpackage;

import android.content.Intent;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$jtj$fMoZ9J1IBWK6vbuOv0qd4_DwkGU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jtj$fMoZ9J1IBWK6vbuOv0qd4_DwkGU implements Predicate {
    public static final /* synthetic */ $$Lambda$jtj$fMoZ9J1IBWK6vbuOv0qd4_DwkGU INSTANCE = new $$Lambda$jtj$fMoZ9J1IBWK6vbuOv0qd4_DwkGU();

    private /* synthetic */ $$Lambda$jtj$fMoZ9J1IBWK6vbuOv0qd4_DwkGU() {
    }

    public final boolean test(Object obj) {
        return "android.net.conn.CONNECTIVITY_CHANGE".equals(((Intent) obj).getAction());
    }
}
