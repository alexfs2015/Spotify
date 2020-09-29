package defpackage;

import com.spotify.music.activesessionbanner.ActiveSessionBannerLogger;

/* renamed from: kpp reason: default package */
public final class kpp implements wig<ActiveSessionBannerLogger> {
    private final wzi<jlr> a;
    private final wzi<jtz> b;

    public static ActiveSessionBannerLogger a(jlr jlr, jtz jtz) {
        return new ActiveSessionBannerLogger(jlr, jtz);
    }

    public final /* synthetic */ Object get() {
        return new ActiveSessionBannerLogger((jlr) this.a.get(), (jtz) this.b.get());
    }
}
