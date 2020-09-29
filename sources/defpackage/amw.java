package defpackage;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: amw reason: default package */
public final class amw {
    public Fragment a;
    public android.app.Fragment b;

    public amw(Fragment fragment) {
        anl.a((Object) fragment, "fragment");
        this.a = fragment;
    }

    public final Activity a() {
        Fragment fragment = this.a;
        return fragment != null ? fragment.p() : this.b.getActivity();
    }

    public final void a(Intent intent, int i) {
        Fragment fragment = this.a;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i);
        } else {
            this.b.startActivityForResult(intent, i);
        }
    }
}
