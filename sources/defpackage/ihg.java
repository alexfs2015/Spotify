package defpackage;

/* renamed from: ihg reason: default package */
public final class ihg implements wig<ihf> {
    private final wzi<ihc> a;
    private final wzi<ibr> b;
    private final wzi<iam> c;

    private ihg(wzi<ihc> wzi, wzi<ibr> wzi2, wzi<iam> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ihg a(wzi<ihc> wzi, wzi<ibr> wzi2, wzi<iam> wzi3) {
        return new ihg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ihf(this.a, this.b, this.c);
    }
}
