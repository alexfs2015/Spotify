package defpackage;

/* renamed from: kwx reason: default package */
public final class kwx implements wig<kww> {
    private final wzi<jtz> a;

    private kwx(wzi<jtz> wzi) {
        this.a = wzi;
    }

    public static kwx a(wzi<jtz> wzi) {
        return new kwx(wzi);
    }

    public final /* synthetic */ Object get() {
        return new kww((jtz) this.a.get());
    }
}
