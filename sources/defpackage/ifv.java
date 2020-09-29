package defpackage;

import com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType;
import java.util.EnumSet;

/* renamed from: ifv reason: default package */
public class ifv extends ift {
    private static final EnumSet<StateType> b = EnumSet.of(StateType.STREAMING_AD_IN_PROGRESS);
    private final ihc a;
    private boolean c;

    public ifv(ihc ihc) {
        this.a = ihc;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.a.d = true;
    }

    public final void a(ifo ifo) {
        if (b.contains(ifo.a)) {
            boolean c2 = c();
            if (StateType.STREAMING_AD_IN_PROGRESS == ifo.a) {
                this.c = ifo.b;
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

    /* access modifiers changed from: protected */
    public final void b() {
        this.a.d = false;
    }

    public final boolean c() {
        return !this.c;
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
}
