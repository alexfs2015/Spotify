package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: sgt reason: default package */
public final class sgt {
    private final RxResolver a;

    public sgt(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    public sgs a(String str) {
        sgs sgs = new sgs(this.a, str);
        sgs.c("syncProgress");
        return sgs;
    }

    public final sgs a(String str, boolean z, boolean z2) {
        sgs a2 = a(str);
        a2.a = "resumePoint";
        if (z) {
            a2.d("continueListening");
        }
        if (z2) {
            a2.d("topics");
        }
        return a2;
    }
}
