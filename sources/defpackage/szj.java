package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: szj reason: default package */
public final class szj implements szg {
    private final szg a;
    private final wzi<Boolean> b;

    public szj(szg szg, wzi<Boolean> wzi) {
        this.a = szg;
        this.b = wzi;
    }

    public final void a(sza sza, Fragment fragment, szb szb, syx syx) {
        if (((Boolean) this.b.get()).booleanValue()) {
            this.a.a(sza, fragment, szb, syx);
        }
    }
}
