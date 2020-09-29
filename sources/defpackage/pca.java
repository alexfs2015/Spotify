package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.music.R;

/* renamed from: pca reason: default package */
public final class pca implements pbz {
    private final vti<a> a;
    private final rxw b;
    private LottieAnimationView c;
    private Context d;

    public pca(vti<a> vti, rxw rxw) {
        this.a = vti;
        this.b = rxw;
    }

    public final void a(LottieAnimationView lottieAnimationView) {
        this.c = (LottieAnimationView) fay.a(lottieAnimationView);
        this.d = lottieAnimationView.getContext();
    }

    public final void a(paj paj) {
        rya rya;
        Object tag = this.c.getTag();
        if (tag instanceof rya) {
            rya = (rya) tag;
        } else {
            rya = this.b.a();
        }
        this.c.setTag(rya);
        String b2 = paj.b();
        paj.g().a((gcs<f>) new $$Lambda$pca$WZtNXflJLzY4A28COyeBnemG_HY<f>(this, rya, b2), (gcs<h>) new $$Lambda$pca$bpmczvwZfIJBnxGFN6ihv_L0OU<h>(this, rya, b2), (gcs<b>) new $$Lambda$pca$TqcQzSXIKKixwZOlMbXETV5T8sY<b>(this, rya, b2), (gcs<a>) new $$Lambda$pca$MaWWhfnzoiTwMnmtwzAz1Sw6tyM<a>(this, rya, b2), (gcs<c>) new $$Lambda$pca$BmsAKNjRV6mh6HfrLovTIFmV6q0<c>(this, rya, b2), (gcs<e>) new $$Lambda$pca$8RS4RszUWnIpxyTEcMJST5S1LU<e>(this, rya, b2), (gcs<d>) new $$Lambda$pca$q1Rh2AQWrX1xQvkuGxV7J59sIV4<d>(this, rya, b2), (gcs<g>) new $$Lambda$pca$_sSvi6qIOfpgvn5OtJtnCQ9BnkQ<g>(this, rya, b2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, f fVar) {
        rya.a(str, new ryg(), this.c);
        this.c.setContentDescription(this.d.getString(R.string.content_description_download));
        b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, h hVar) {
        rya.a(str, new ryi(), this.c);
        this.c.setContentDescription(this.d.getString(R.string.content_description_downloaded));
        c(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, b bVar) {
        rya.a(str, new ryh(bVar.a), this.c);
        this.c.setContentDescription(this.d.getString(R.string.content_description_downloaded));
        c(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, a aVar) {
        rya.a(str, new ryd(), this.c);
        this.c.setContentDescription(this.d.getString(R.string.content_description_downloaded));
        this.c.setOnClickListener(new $$Lambda$pca$q6r6HwlAWWVydoQhAKZqMts_Tss(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, c cVar) {
        rya.a(str, new rye(), this.c);
        this.c.setContentDescription(this.d.getString(R.string.content_description_download));
        b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, e eVar) {
        rya.a(str, new ryg(), this.c);
        this.c.setContentDescription(this.d.getString(R.string.content_description_download));
        b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, d dVar) {
        rya.a(str, new ryg(), this.c);
        this.c.setContentDescription(this.d.getString(R.string.content_description_download));
        b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rya rya, String str, g gVar) {
        rya.a(str, new ryg(), this.c);
        this.c.setContentDescription(this.d.getString(R.string.content_description_download));
        b(str);
    }

    public final void a(String str) {
        pbr.a(this.d, (OnClickListener) new $$Lambda$pca$J7T2XUgriixc7hBJbZ64GSKHc(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, DialogInterface dialogInterface, int i) {
        ((a) this.a.get()).c(str);
    }

    private void b(String str) {
        this.c.setOnClickListener(new $$Lambda$pca$6clsWHwP9lwzIlY9GmCsgoTVIWg(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, View view) {
        ((a) this.a.get()).a(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, View view) {
        ((a) this.a.get()).b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, View view) {
        ((a) this.a.get()).c(str);
    }

    private void c(String str) {
        this.c.setOnClickListener(new $$Lambda$pca$3ZK5EvpRKtrw2e2UEtpu_H7WLk(this, str));
    }
}
