package defpackage;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: ami reason: default package */
public final class ami {
    public Fragment a;
    public android.app.Fragment b;

    public ami(Fragment fragment) {
        amx.a((Object) fragment, "fragment");
        this.a = fragment;
    }

    public final void a(Intent intent, int i) {
        Fragment fragment = this.a;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i);
        } else {
            this.b.startActivityForResult(intent, i);
        }
    }

    public final Activity a() {
        Fragment fragment = this.a;
        if (fragment != null) {
            return fragment.p();
        }
        return this.b.getActivity();
    }
}
