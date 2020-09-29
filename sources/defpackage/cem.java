package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

@cfp
/* renamed from: cem reason: default package */
public final class cem {
    final Context a;
    final dio b;
    final clr c;
    final dtt d;
    final bjj e;
    OnGlobalLayoutListener f;
    OnScrollChangedListener g;
    private final Object h = new Object();
    private final DisplayMetrics i;
    private cos j;
    private int k = -1;
    private int l = -1;

    public cem(Context context, dio dio, clr clr, dtt dtt, bjj bjj) {
        this.a = context;
        this.b = dio;
        this.c = clr;
        this.d = dtt;
        this.e = bjj;
        this.j = new cos(200);
        bkc.e();
        this.i = cmu.a((WindowManager) context.getSystemService("window"));
    }

    static /* synthetic */ void a(cem cem, WeakReference weakReference, boolean z) {
        if (weakReference != null) {
            cti cti = (cti) weakReference.get();
            if (cti != null) {
                if (!z || cem.j.a()) {
                    int[] iArr = new int[2];
                    cti.o().getLocationOnScreen(iArr);
                    dqe.a();
                    boolean z2 = false;
                    int b2 = cpc.b(cem.i, iArr[0]);
                    dqe.a();
                    int b3 = cpc.b(cem.i, iArr[1]);
                    synchronized (cem.h) {
                        if (!(cem.k == b2 && cem.l == b3)) {
                            cem.k = b2;
                            cem.l = b3;
                            cup x = cti.x();
                            int i2 = cem.k;
                            int i3 = cem.l;
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
