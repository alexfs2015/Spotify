package defpackage;

/* renamed from: pfk reason: default package */
public final class pfk implements vua<String> {
    private final wlc<fpt> a;

    private pfk(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static pfk a(wlc<fpt> wlc) {
        return new pfk(wlc);
    }

    public final /* synthetic */ Object get() {
        String str = (String) ((fpt) this.a.get()).a(pgq.g);
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }
}
