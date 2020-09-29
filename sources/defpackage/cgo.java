package defpackage;

import java.lang.ref.WeakReference;

@cfp
/* renamed from: cgo reason: default package */
public final class cgo extends cgx {
    private final WeakReference<cgd> a;

    public cgo(cgd cgd) {
        this.a = new WeakReference<>(cgd);
    }

    public final void a(cgp cgp) {
        cgd cgd = (cgd) this.a.get();
        if (cgd != null) {
            cgd.a(cgp);
        }
    }
}
