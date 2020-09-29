package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: mbc reason: default package */
public final class mbc implements mbk {
    final gup a;
    Parcelable b;
    private final gur c;
    private final gyu d = gyu.a(this.a, this.c);
    private final gum e;

    mbc(gup gup, gur gur, gum gum, final a aVar) {
        this.a = gup;
        this.c = gur;
        this.e = gum;
        aVar.a(new c() {
            public final void a(Bundle bundle) {
                bundle.putParcelable("hubsPresenterState", mbc.this.a.a());
            }

            public final void b(Bundle bundle) {
                if (bundle != null) {
                    bundle.setClassLoader(gup.class.getClassLoader());
                    mbc.this.b = bundle.getParcelable("hubsPresenterState");
                }
            }

            public final void aP_() {
                aVar.b(this);
            }
        });
    }

    public final View a() {
        return this.c.e();
    }

    public final void a(gzz gzz) {
        this.a.a(gzz, false);
        if (!gyi.a(gzz)) {
            this.a.a(this.b);
            this.b = null;
        }
    }
}
