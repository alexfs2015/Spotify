package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: iaj reason: default package */
public final class iaj implements lbq {
    private final iba a;
    private String b = "";

    public iaj(iba iba) {
        this.a = iba;
    }

    public final void onCurrentFragmentChanged(Fragment fragment, String str) {
        if (!this.b.equals(str)) {
            this.a.a();
            this.b = str;
        }
    }
}
