package defpackage;

/* renamed from: idj reason: default package */
public final class idj implements vua<idi> {
    private final wlc<iep> a;

    private idj(wlc<iep> wlc) {
        this.a = wlc;
    }

    public static idj a(wlc<iep> wlc) {
        return new idj(wlc);
    }

    public final /* synthetic */ Object get() {
        return new idi((iep) this.a.get());
    }
}
