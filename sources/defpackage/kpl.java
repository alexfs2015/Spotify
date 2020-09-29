package defpackage;

import com.spotify.music.internal.util.process.ProcessType;

/* renamed from: kpl reason: default package */
public final class kpl implements wig<kpk> {
    private final wzi<gnb> a;
    private final wzi<sfz> b;
    private final wzi<ProcessType> c;

    private kpl(wzi<gnb> wzi, wzi<sfz> wzi2, wzi<ProcessType> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static kpl a(wzi<gnb> wzi, wzi<sfz> wzi2, wzi<ProcessType> wzi3) {
        return new kpl(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new kpk((gnb) this.a.get(), (sfz) this.b.get(), (ProcessType) this.c.get());
    }
}
