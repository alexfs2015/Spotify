package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;

/* renamed from: tvx reason: default package */
public final class tvx {
    private final Context a;
    private final rxw b;

    public tvx(Context context, rxw rxw) {
        this.a = context;
        this.b = rxw;
    }

    public final void a(tqs tqs, boolean z) {
        if (z) {
            tqs.a((Drawable) tqu.e(this.a));
            tqs.b(this.a.getString(R.string.content_description_pause_button));
            return;
        }
        tqs.a((Drawable) tqu.d(this.a));
        tqs.b(this.a.getString(R.string.content_description_play_button));
    }

    public static void b(tqs tqs, boolean z) {
        tqs.m().setEnabled(z);
    }

    public static void a(tqs tqs, OnClickListener onClickListener) {
        tqs.m().setOnClickListener(onClickListener);
    }

    public final void a(String str, tqs tqs, uzf uzf) {
        rya rya;
        tqs.h(false);
        tqs.f(false);
        LottieAnimationView m = tqs.m();
        m.setVisibility(0);
        Object tag = m.getTag();
        if (tag instanceof rya) {
            rya = (rya) tag;
        } else {
            rya = this.b.a();
        }
        m.setTag(rya);
        uzf.a((gcs<f>) new $$Lambda$tvx$BpKiqzgTarnaHXKqVGdSeqZlLE<f>(this, rya, str, m), (gcs<h>) new $$Lambda$tvx$WyCN2_ymQwjw6vBQlVTSdHfeTtg<h>(this, rya, str, m), (gcs<b>) new $$Lambda$tvx$l1W6dFXhQ67uUCvcu1d31o99ARM<b>(this, rya, str, m), (gcs<a>) new $$Lambda$tvx$a6ryby_O85k7SqPVhEKqRkTaebk<a>(this, rya, str, m), (gcs<c>) new $$Lambda$tvx$tqeaayPdVqxByBWpD3byIokfTY<c>(this, rya, str, m), (gcs<e>) new $$Lambda$tvx$VoLtBSTIuNpdXHGrn2WniybRKxQ<e>(this, rya, str, m), (gcs<d>) new $$Lambda$tvx$Umb4JZkFTBkqonqJDTGZG6Ov9vc<d>(this, rya, str, m), (gcs<g>) new $$Lambda$tvx$vHr3FPvsdooYCZ87Q7GLsD7DdbI<g>(this, rya, str, m));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, LottieAnimationView lottieAnimationView, f fVar) {
        rya.a(str, new ryg(), lottieAnimationView);
        lottieAnimationView.setContentDescription(this.a.getString(R.string.content_description_download));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, LottieAnimationView lottieAnimationView, h hVar) {
        rya.a(str, new ryi(), lottieAnimationView);
        lottieAnimationView.setContentDescription(this.a.getString(R.string.content_description_downloaded));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, LottieAnimationView lottieAnimationView, b bVar) {
        rya.a(str, new ryh(bVar.a), lottieAnimationView);
        lottieAnimationView.setContentDescription(this.a.getString(R.string.content_description_downloaded));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, LottieAnimationView lottieAnimationView, a aVar) {
        rya.a(str, new ryd(), lottieAnimationView);
        lottieAnimationView.setContentDescription(this.a.getString(R.string.content_description_downloaded));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, LottieAnimationView lottieAnimationView, c cVar) {
        rya.a(str, new rye(), lottieAnimationView);
        lottieAnimationView.setContentDescription(this.a.getString(R.string.content_description_download));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, LottieAnimationView lottieAnimationView, e eVar) {
        rya.a(str, new ryg(), lottieAnimationView);
        lottieAnimationView.setContentDescription(this.a.getString(R.string.content_description_download));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, LottieAnimationView lottieAnimationView, d dVar) {
        rya.a(str, new ryi(), lottieAnimationView);
        lottieAnimationView.setContentDescription(this.a.getString(R.string.content_description_downloaded));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, LottieAnimationView lottieAnimationView, g gVar) {
        rya.a(str, new ryd(), lottieAnimationView);
        lottieAnimationView.setContentDescription(this.a.getString(R.string.content_description_downloaded));
    }

    public static void a(tqp tqp, int i, int i2, boolean z) {
        if (z && i == 0) {
            tqp.a(1);
            tqp.b(1);
            tqp.g();
        } else if (i <= 0 || i2 <= 0) {
            tqp.h();
        } else {
            tqp.a(i2);
            tqp.b(i);
            tqp.g();
        }
    }

    public final void a(tqp tqp, uys uys) {
        boolean o = uys.o();
        int m = uys.m();
        int intValue = ((Integer) jtc.a(uys.n(), Integer.valueOf(m))).intValue();
        if (intValue > m) {
            intValue = m;
        }
        a(tqp, m - intValue, m, o);
    }

    public static void a(tqp tqp, uys uys, boolean z) {
        Size size = Size.NORMAL;
        Show t = uys.t();
        tqp.a((z || t == null) ? uys.getImageUri(size) : t.getImageUri(size));
    }

    public static void a(tqs tqs, uys uys) {
        if (TextUtils.isEmpty(uys.d())) {
            tqs.l();
            return;
        }
        tqs.d(twn.a(uys.d()));
        tqs.k();
    }

    public static void b(tqp tqp, uys uys) {
        if (uys.i()) {
            tqp.i();
        } else {
            tqp.j();
        }
    }

    public final void a(tqs tqs, uzf uzf) {
        boolean z = uzf instanceof b;
        boolean z2 = uzf instanceof h;
        boolean z3 = uzf instanceof a;
        if (z || z2 || z3) {
            if (z) {
                tqs.f(true);
            } else if (z2) {
                tqs.f(true);
            } else {
                tqs.f(false);
            }
            tqs.f(this.a.getString(R.string.content_description_downloaded));
            tqs.c(tqu.a(this.a));
            return;
        }
        tqs.f(false);
        tqs.f(this.a.getString(R.string.content_description_download));
        tqs.c(tqu.b(this.a));
    }
}
