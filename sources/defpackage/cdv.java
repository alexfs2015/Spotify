package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

@cey
/* renamed from: cdv reason: default package */
public final class cdv {
    final Context a;
    final dhx b;
    final cla c;
    final dtc d;
    final bis e;
    OnGlobalLayoutListener f;
    OnScrollChangedListener g;
    private final Object h = new Object();
    private final DisplayMetrics i;
    private cob j;
    private int k = -1;
    private int l = -1;

    public cdv(Context context, dhx dhx, cla cla, dtc dtc, bis bis) {
        this.a = context;
        this.b = dhx;
        this.c = cla;
        this.d = dtc;
        this.e = bis;
        this.j = new cob(200);
        bjl.e();
        this.i = cmd.a((WindowManager) context.getSystemService("window"));
    }

    static /* synthetic */ void a(cdv cdv, WeakReference weakReference, boolean z) {
        if (weakReference != null) {
            csr csr = (csr) weakReference.get();
            if (csr != null) {
                if (!z || cdv.j.a()) {
                    int[] iArr = new int[2];
                    csr.o().getLocationOnScreen(iArr);
                    dpn.a();
                    boolean z2 = false;
                    int b2 = col.b(cdv.i, iArr[0]);
                    dpn.a();
                    int b3 = col.b(cdv.i, iArr[1]);
                    synchronized (cdv.h) {
                        if (!(cdv.k == b2 && cdv.l == b3)) {
                            cdv.k = b2;
                            cdv.l = b3;
                            cty x = csr.x();
                            int i2 = cdv.k;
                            int i3 = cdv.l;
                            if (!z) {
                                z2 = true;
                            }
                            x.a(i2, i3, z2);
                        }
                    }
                }
            }
        }
    }
}
