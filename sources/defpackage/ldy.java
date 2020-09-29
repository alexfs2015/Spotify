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

/* renamed from: ldy reason: default package */
public final class ldy implements taa {
    private final hxs a;
    private final wzi<gbv> b;

    public ldy(hxs hxs, wzi<gbv> wzi) {
        this.a = hxs;
        this.b = wzi;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(Intent intent, hxr hxr) {
        return Completable.a((Action) new $$Lambda$ldy$Xc7VVEFINOtzaruTZIHcA7GvVJw(this, hxr, intent));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(Intent intent, fqn fqn, SessionState sessionState) {
        return this.a.a().d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$ldy$lRZwYX9bUXvk1LvoBEV2jnWygKk.INSTANCE).a(0, $$Lambda$GqHhtZVJrkxzmqHYZTNeEQWC1c.INSTANCE).e(new $$Lambda$ldy$xmKWok47p9hnRgyNFqtKaSFpJSU(this, intent)).a((SingleSource<T>) Single.b(new a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hxr hxr, Intent intent) {
        ((gbv) this.b.get()).a(hxr.call(), intent.getData());
    }

    public final void a(szz szz) {
        szz.a(tah.a(LinkType.AUTOLOGIN), "Handle auto login links", (szx) new $$Lambda$ldy$arQz014BKYURsmOzPEBHohBaEg(this));
    }
}
