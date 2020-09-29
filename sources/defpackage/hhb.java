package defpackage;

import com.spotify.cosmos.android.FireAndForgetResolver;

/* renamed from: hhb reason: default package */
public final class hhb implements wig<hha> {
    private final wzi<FireAndForgetResolver> a;

    private hhb(wzi<FireAndForgetResolver> wzi) {
        this.a = wzi;
    }

    public static hhb a(wzi<FireAndForgetResolver> wzi) {
        return new hhb(wzi);
    }

    public final /* synthetic */ Object get() {
        return new hha((FireAndForgetResolver) this.a.get());
    }
}
