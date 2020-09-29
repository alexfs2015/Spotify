package defpackage;

/* renamed from: pcn reason: default package */
public final class pcn implements wig<pcm> {
    private final wzi<b> a;

    private pcn(wzi<b> wzi) {
        this.a = wzi;
    }

    public static pcn a(wzi<b> wzi) {
        return new pcn(wzi);
    }

    public final /* synthetic */ Object get() {
        return new pcm((b) this.a.get());
    }
}
