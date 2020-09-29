package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.R;
import com.spotify.music.features.homemix.models.HomeMixPlanType;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: nrw reason: default package */
public final class nrw {
    static final int a = nrs.class.hashCode();
    static final int b = nrx.class.hashCode();
    final vhx c;
    final Context d;
    public final nru e;
    public nrs f = new nrs(this.d);
    public nrx g;
    nrk h;
    nrk i;
    private final ToastieManager j;

    /* renamed from: nrw$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Style.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.features.homemix.models.HomeMixTuning$Style[] r0 = com.spotify.music.features.homemix.models.HomeMixTuning.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.homemix.models.HomeMixTuning$Style r1 = com.spotify.music.features.homemix.models.HomeMixTuning.Style.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.homemix.models.HomeMixTuning$Style r1 = com.spotify.music.features.homemix.models.HomeMixTuning.Style.CHILL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.homemix.models.HomeMixTuning$Style r1 = com.spotify.music.features.homemix.models.HomeMixTuning.Style.UPBEAT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nrw.AnonymousClass1.<clinit>():void");
        }
    }

    public nrw(Context context, nru nru, ToastieManager toastieManager, vhx vhx, ViewGroup viewGroup) {
        this.c = vhx;
        this.d = context;
        this.e = nru;
        this.j = toastieManager;
        this.f.setOnClickListener(new $$Lambda$nrw$rfL1_TKF7f0tJ98043ODlDIqjcA(this));
        viewGroup.addView(this.f);
        this.g = new nrx(this.d);
        this.g.setOnClickListener(new $$Lambda$nrw$uYiA3_PMPKFb7uzezt6bk1Z5M0I(this));
        viewGroup.addView(this.g);
        Context context2 = this.d;
        this.h = nrk.a(context2, this.f, context2.getString(R.string.home_mix_chill_style_suggestion, new Object[]{HomeMixPlanType.OTHER.a(this.d)}));
        Context context3 = this.d;
        this.i = nrk.a(context3, this.g, context3.getString(R.string.home_mix_upbeat_style_suggestion, new Object[]{HomeMixPlanType.OTHER.a(this.d)}));
        this.c.a((a<H>) new jog<H>(this.h), a);
        this.c.a((a<H>) new jog<H>(this.i), b);
        this.c.a(b);
        this.c.a(a);
        this.e.b = this;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.e.a(view, Style.UPBEAT, (View) this.f);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.e.a(view, Style.CHILL, (View) this.g);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        this.j.a(uzy.a(this.d.getString(i2), 3000).c(R.color.white).b(R.color.textBlack).a());
    }

    public final void a(boolean z) {
        int i2 = 0;
        this.f.setVisibility(z ? 0 : 8);
        nrx nrx = this.g;
        if (!z) {
            i2 = 8;
        }
        nrx.setVisibility(i2);
    }
}
