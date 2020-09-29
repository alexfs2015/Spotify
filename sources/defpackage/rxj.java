package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: rxj reason: default package */
public final class rxj {
    private final RxResolver a;

    public rxj(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    public final rxi a(String str, boolean z, boolean z2) {
        rxi a2 = a(str);
        a2.a = "resumePoint";
        if (z) {
            a2.d("continueListening");
        }
        if (z2) {
            a2.d("topics");
        }
        return a2;
    }

    public rxi a(String str) {
        rxi rxi = new rxi(this.a, str);
        rxi.c("syncProgress");
        return rxi;
    }
}
