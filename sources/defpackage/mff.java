package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: mff reason: default package */
public final class mff implements mfn {
    final gwp a;
    Parcelable b;
    private final gwr c;
    private final hbn d = hbn.a(this.a, this.c);
    private final gwm e;

    mff(gwp gwp, gwr gwr, gwm gwm, final a aVar) {
        this.a = gwp;
        this.c = gwr;
        this.e = gwm;
        aVar.a(new c() {
            public final void a(Bundle bundle) {
                bundle.putParcelable("hubsPresenterState", mff.this.a.a());
            }

            public final void aN_() {
                aVar.b(this);
            }

            public final void b(Bundle bundle) {
                if (bundle != null) {
                    bundle.setClassLoader(gwp.class.getClassLoader());
                    mff.this.b = bundle.getParcelable("hubsPresenterState");
                }
            }
        });
    }

    public final View a() {
        return this.c.e();
    }

    public final void a(hcs hcs) {
        this.a.a(hcs, false);
        if (!hbb.a(hcs)) {
            this.a.a(this.b);
            this.b = null;
        }
    }
}
