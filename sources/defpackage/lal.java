package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;

/* renamed from: lal reason: default package */
public final class lal implements spt {
    private final hvg a;
    private final wlc<gay> b;

    public lal(hvg hvg, wlc<gay> wlc) {
        this.a = hvg;
        this.b = wlc;
    }

    public final void a(sps sps) {
        sps.a(sqa.a(LinkType.AUTOLOGIN), "Handle auto login links", (spq) new $$Lambda$lal$BlyrTvG724F6GIhPhVWIhar0H5o(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(Intent intent, fpt fpt, SessionState sessionState) {
        return this.a.a().d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$lal$PFhhZW1RxE8xVEjtAnV9zbdeaE.INSTANCE).a(0, $$Lambda$KGap8GjNUz3fMs43WCPRlHRyENs.INSTANCE).e(new $$Lambda$lal$JHeiXu2PKCfuz0DIsnHAN31v7J8(this, intent)).a((SingleSource<T>) Single.b(new a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(Intent intent, hvf hvf) {
        return Completable.a((Action) new $$Lambda$lal$FaSIuHbwqp_usogd31jKc5qBXo(this, hvf, intent));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hvf hvf, Intent intent) {
        ((gay) this.b.get()).a(hvf.call(), intent.getData());
    }
}
