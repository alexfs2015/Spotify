package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import io.reactivex.subjects.PublishSubject;

/* renamed from: ibw reason: default package */
public final class ibw implements vsr {
    public final PublishSubject<ibm> a = PublishSubject.a();
    public final vti<Picasso> b;
    public boolean c;
    public Ad d;
    private final ibr e;

    public final void b(Drawable drawable) {
    }

    public ibw(vti<Picasso> vti, ibr ibr) {
        this.b = vti;
        this.e = ibr;
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        fay.a(!bitmap.isRecycled());
        if (!this.c) {
            Ad ad = this.d;
            if (ad != null) {
                this.a.onNext(new e(ibc.a(ad.id(), ad.extractMetadata("artistUri"), ad.extractMetadata("artistName"), ad.extractMetadata("albumUri"), ad.extractMetadata("albumImageUri"), ad.extractMetadata("albumName"), ad.extractMetadata("tag"), ad.extractMetadata("lineitem_id"), ad.extractMetadata("disclosure"))));
            }
        }
        fay.a(!bitmap.isRecycled());
    }

    public final void a(Drawable drawable) {
        this.a.onNext(new d("failed to pre fetch album image"));
    }
}
