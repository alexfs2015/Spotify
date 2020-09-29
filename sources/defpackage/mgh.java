package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: mgh reason: default package */
public class mgh implements mgs {
    private final List<mgs> a;

    mgh(List<mgs> list) {
        this.a = list;
    }

    public final boolean a(Uri uri) {
        for (mgs a2 : this.a) {
            if (a2.a(uri)) {
                return true;
            }
        }
        return false;
    }
}
