package defpackage;

import android.content.DialogInterface;
import com.spotify.music.R;

/* renamed from: uhm reason: default package */
public final class uhm implements uey {
    private final uhz a;
    private final lav b;
    private final uho c;
    private final uhq d;
    private final szp e;

    public uhm(uhz uhz, lav lav, uho uho, uhq uhq, szp szp) {
        this.a = uhz;
        this.b = lav;
        this.c = uho;
        this.d = uhq;
        this.e = szp;
    }

    private void a(vkv vkv, String str, int i) {
        if (this.d.a) {
            this.b.a(vkv.getUri());
            this.a.d(vkv.getUri(), str, i);
            return;
        }
        uho uho = this.c;
        uho.a(uho.a.getString(R.string.download_over_cellular_title), uho.a.getString(R.string.download_over_cellular_body), uho.a.getString(R.string.download_over_cellular_positive_settings_text), uho.a.getString(R.string.download_over_cellular_negative_cancel_text), new $$Lambda$uhm$rW4zJn2yoRjscRgiN8bezO2BAws(this), $$Lambda$uhm$Lpan5fT2lWeDubaJjwy1jI266Q.INSTANCE).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, String str, int i, DialogInterface dialogInterface, int i2) {
        c(vkv, str, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, String str, int i, a aVar) {
        b(vkv, str, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, String str, int i, b bVar) {
        c(vkv, str, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, String str, int i, c cVar) {
        a(vkv, str, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, String str, int i, d dVar) {
        c(vkv, str, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, String str, int i, e eVar) {
        a(vkv, str, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, String str, int i, f fVar) {
        a(vkv, str, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, String str, int i, g gVar) {
        b(vkv, str, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, String str, int i, h hVar) {
        c(vkv, str, i);
    }

    private void b(vkv vkv, String str, int i) {
        uho uho = this.c;
        uho.a(uho.a.getString(R.string.download_confirmation_title), uho.a.getString(R.string.download_confirmation_body), uho.a.getString(R.string.download_confirmation_positive_remove_text), uho.a.getString(R.string.download_confirmation_negative_cancel_text), new $$Lambda$uhm$S_eZ28QxwSZ8W03P0x9MCulDm20(this, vkv, str, i), $$Lambda$uhm$jOgvDgE7DY8_eQCI9xsNmRabnOk.INSTANCE).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        this.e.a("spotify:internal:preferences");
    }

    private void c(vkv vkv, String str, int i) {
        this.b.b(vkv.getUri());
        this.a.e(vkv.getUri(), str, i);
    }

    public final void onDownloadClick(vkv vkv, String str, int i) {
        vkv.u().a((ged<f>) new $$Lambda$uhm$puc6S8YpuvuSlcLzMtDiqIv5jps<f>(this, vkv, str, i), (ged<h>) new $$Lambda$uhm$o6ZPcxer6boUyMIggAjetaHwPsM<h>(this, vkv, str, i), (ged<b>) new $$Lambda$uhm$pLBmOr3vc_Ksn8mo0RyABjKNquI<b>(this, vkv, str, i), (ged<a>) new $$Lambda$uhm$335papQLEg3PDwIhzK5u4dRRJ6I<a>(this, vkv, str, i), (ged<c>) new $$Lambda$uhm$x6BgCtCnRH294bMwfnW0PUKnZc<c>(this, vkv, str, i), (ged<e>) new $$Lambda$uhm$2IDjETr5O29YfqGFeY208k6TmJo<e>(this, vkv, str, i), (ged<d>) new $$Lambda$uhm$6R_P4kn_oZl1HlfDe5vIMvGiZo<d>(this, vkv, str, i), (ged<g>) new $$Lambda$uhm$UigVSnWMUhj5s_AU6GqgIu5IHI8<g>(this, vkv, str, i));
    }
}
