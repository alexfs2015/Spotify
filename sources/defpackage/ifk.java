package defpackage;

import com.spotify.mobile.android.spotlets.ads.rules.AdRules;

/* renamed from: ifk reason: default package */
public final class ifk implements wig<AdRules> {
    private final wzi<ifu> a;

    private ifk(wzi<ifu> wzi) {
        this.a = wzi;
    }

    public static ifk a(wzi<ifu> wzi) {
        return new ifk(wzi);
    }

    public final /* synthetic */ Object get() {
        return new AdRules((ifu) this.a.get());
    }
}
