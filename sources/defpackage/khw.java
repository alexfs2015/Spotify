package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.share.ConsumerShareResponse;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.share.ShareMessaging;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.share.ShareStories;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.functions.Cancellable;
import io.reactivex.functions.Function;

/* renamed from: khw reason: default package */
public final class khw {
    private final kgn a;
    private final Picasso b;
    private final khx c;
    private final Scheduler d;

    /* renamed from: khw$a */
    static class a implements wgx {
        private final SingleEmitter<Bitmap> a;

        public a(SingleEmitter<Bitmap> singleEmitter) {
            this.a = singleEmitter;
        }

        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            this.a.a(bitmap);
        }

        public final void a(Drawable drawable) {
            this.a.a(new Throwable("Share image download failed"));
        }

        public final void b(Drawable drawable) {
        }
    }

    public khw(kgn kgn, khx khx, Picasso picasso, Scheduler scheduler) {
        this.a = kgn;
        this.c = khx;
        this.b = picasso;
        this.d = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(ConsumerShareResponse consumerShareResponse) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$khw$ZEbCfAsC4oReiFh9EmxLuQ8PBAU<T>(this, consumerShareResponse.stories().imageUrl())).f(new $$Lambda$khw$TGl11qhET5t2W1S1hEFRYFzEmrw(this, consumerShareResponse));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ khu a(ConsumerShareResponse consumerShareResponse, Bitmap bitmap) {
        String previewImageUrl = consumerShareResponse.previewImageUrl();
        ShareMessaging messaging = consumerShareResponse.messaging();
        jev a2 = jev.a(messaging.shareUri()).a(khx.a(messaging.queryParameters())).c(messaging.freeText()).a();
        ShareStories stories = consumerShareResponse.stories();
        return new khr(previewImageUrl, a2, jex.a(stories.shareUri()).a(khx.a(stories.queryParameters())).a(bitmap).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, SingleEmitter singleEmitter) {
        a aVar = new a(singleEmitter);
        this.b.a(str).a((wgx) aVar);
        singleEmitter.a((Cancellable) new $$Lambda$khw$XlBqax9bo5dlnXMFqyy941NRDJg(this, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.b.d(aVar);
    }

    /* access modifiers changed from: 0000 */
    public final Single<khu> a() {
        return this.a.b().a(this.d).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$khw$gzj6WVCzDd05kmPj184aLE5LcFE<Object,Object>(this));
    }
}
