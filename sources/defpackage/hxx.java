package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: hxx reason: default package */
public final class hxx implements kyh {
    private final hyo a;
    private String b = "";

    public hxx(hyo hyo) {
        this.a = hyo;
    }

    public final void onCurrentFragmentChanged(Fragment fragment, String str) {
        if (!this.b.equals(str)) {
            this.a.a();
            this.b = str;
        }
    }
}
