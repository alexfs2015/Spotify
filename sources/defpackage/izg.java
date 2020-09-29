package defpackage;

import com.spotify.remoteconfig.AndroidLibsShareProperties;

/* renamed from: izg reason: default package */
public final class izg implements wig<izf> {
    private final wzi<jon> a;
    private final wzi<AndroidLibsShareProperties> b;
    private final wzi<jbr> c;

    private izg(wzi<jon> wzi, wzi<AndroidLibsShareProperties> wzi2, wzi<jbr> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static izg a(wzi<jon> wzi, wzi<AndroidLibsShareProperties> wzi2, wzi<jbr> wzi3) {
        return new izg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new izf((jon) this.a.get(), (AndroidLibsShareProperties) this.b.get(), (jbr) this.c.get());
    }
}
