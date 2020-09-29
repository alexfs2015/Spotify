package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import io.reactivex.subjects.PublishSubject;

/* renamed from: iei reason: default package */
public final class iei implements wgx {
    public final PublishSubject<idy> a = PublishSubject.a();
    public final who<Picasso> b;
    public boolean c;
    public Ad d;
    private final ied e;

    public iei(who<Picasso> who, ied ied) {
        this.b = who;
        this.e = ied;
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        fbp.a(!bitmap.isRecycled());
        if (!this.c) {
            Ad ad = this.d;
            if (ad != null) {
                this.a.onNext(new e(ido.a(ad.id(), ad.extractMetadata("artistUri"), ad.extractMetadata("artistName"), ad.extractMetadata("albumUri"), ad.extractMetadata("albumImageUri"), ad.extractMetadata("albumName"), ad.extractMetadata("tag"), ad.extractMetadata("lineitem_id"), ad.extractMetadata("disclosure"))));
            }
        }
        fbp.a(!bitmap.isRecycled());
    }

    public final void a(Drawable drawable) {
        this.a.onNext(new d("failed to pre fetch album image"));
    }

    public final void b(Drawable drawable) {
    }
}
