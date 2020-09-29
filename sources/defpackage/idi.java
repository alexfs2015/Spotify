package defpackage;

import com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType;
import java.util.EnumSet;

/* renamed from: idi reason: default package */
public class idi extends idg {
    private static final EnumSet<StateType> b = EnumSet.of(StateType.STREAMING_AD_IN_PROGRESS);
    private final iep a;
    private boolean c;

    public idi(iep iep) {
        this.a = iep;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.a.d = true;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.a.d = false;
    }

    public final boolean d() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final String e() {
        return getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    public final void f() {
        this.a.b.c();
    }

    public final void a(idb idb) {
        if (b.contains(idb.a)) {
            boolean c2 = c();
            if (StateType.STREAMING_AD_IN_PROGRESS == idb.a) {
                this.c = idb.b;
            }
            if (c() != c2) {
                if (c2) {
                    b();
                    return;
                }
                a();
            }
        }
    }

    public final boolean c() {
        return !this.c;
    }
}
