package defpackage;

import android.content.DialogInterface;
import com.spotify.music.R;

/* renamed from: tvj reason: default package */
public final class tvj implements tsv {
    private final tvw a;
    private final kxm b;
    private final tvl c;
    private final tvn d;
    private final spi e;

    public tvj(tvw tvw, kxm kxm, tvl tvl, tvn tvn, spi spi) {
        this.a = tvw;
        this.b = kxm;
        this.c = tvl;
        this.d = tvn;
        this.e = spi;
    }

    public final void onDownloadClick(uys uys, String str, int i) {
        uzf u = uys.u();
        if ((u instanceof a) || (u instanceof g)) {
            tvl tvl = this.c;
            tvl.a(tvl.a.getString(R.string.download_confirmation_title), tvl.a.getString(R.string.download_confirmation_body), tvl.a.getString(R.string.download_confirmation_positive_remove_text), tvl.a.getString(R.string.download_confirmation_negative_cancel_text), new $$Lambda$tvj$c_EinSUwrQpG_BuasRxPJ_QZYxM(this, uys, str, i), $$Lambda$tvj$mOxtpvizUv9PHa7LxKNoBCmBTd4.INSTANCE).a();
        } else if ((u instanceof h) || (u instanceof b) || (u instanceof d)) {
            a(uys, str, i);
        } else {
            if ((u instanceof f) || (u instanceof c) || (u instanceof e)) {
                if (this.d.a) {
                    this.b.a(uys.getUri());
                    this.a.d(uys.getUri(), str, i);
                    return;
                }
                tvl tvl2 = this.c;
                tvl2.a(tvl2.a.getString(R.string.download_over_cellular_title), tvl2.a.getString(R.string.download_over_cellular_body), tvl2.a.getString(R.string.download_over_cellular_positive_settings_text), tvl2.a.getString(R.string.download_over_cellular_negative_cancel_text), new $$Lambda$tvj$3BOQ9zI_uJEwyZm4U1vsn8Gd5Y(this), $$Lambda$tvj$kQ3LVVdZKW6N6V668kw2stYJaG0.INSTANCE).a();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uys uys, String str, int i, DialogInterface dialogInterface, int i2) {
        a(uys, str, i);
    }

    private void a(uys uys, String str, int i) {
        this.b.b(uys.getUri());
        this.a.e(uys.getUri(), str, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        this.e.a("spotify:internal:preferences");
    }
}
