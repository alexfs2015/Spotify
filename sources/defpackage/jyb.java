package defpackage;

import com.google.common.base.Optional;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerError;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: jyb reason: default package */
public final class jyb {
    private static final Optional<String> b = Optional.b("premium");
    final SerialDisposable a = new SerialDisposable();
    private final jrt c;
    private final viy d;
    private final hgz e;

    public jyb(jrt jrt, viy viy, hgz hgz) {
        this.d = viy;
        this.e = hgz;
        this.c = jrt;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        return this.d.b().c((Function<? super T, ? extends R>) new $$Lambda$jyb$faaP9NOR4bb8H3xfWPgF_1Vzjw<Object,Object>(bool));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jrs a(Boolean bool, PlayerError playerError) {
        return new jrs(playerError, bool.booleanValue());
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "Failed to listen for playback errors.", new Object[0]);
    }

    /* access modifiers changed from: private */
    public void a(jrs jrs) {
        int i = jrs.a;
        String str = jrs.b;
        Logger.b("onPlaybackError(playbackError: %d, uri: %s);", Integer.valueOf(i), str);
        if (i == 14) {
            this.c.c.a().a(jrt.a, i).a(jrt.b, str).b();
        }
    }

    public final void a() {
        SerialDisposable serialDisposable = this.a;
        Observable b2 = wit.b(this.e.a(MoatAdEvent.EVENT_TYPE).e((xiy<? super T, ? extends R>) $$Lambda$aq41lIFDp7Cwi2mwNXWh1pDloKU.INSTANCE));
        Optional<String> optional = b;
        optional.getClass();
        serialDisposable.a(b2.c((Function<? super T, ? extends R>) new $$Lambda$SiUSHCGvbVttS2l2iSJlkhkikbA<Object,Object>(optional)).a(Functions.a()).h(new $$Lambda$jyb$UuDJ3DCxMS_VdzYNbaGwca5XveA(this)).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$jyb$EPDSW8aQoY1PG8_u2cWVoB_IEv8<Object>(this), (Consumer<? super Throwable>) new $$Lambda$jyb$fNdcjfgluRy1X3w2ZWCnKeWhlQ<Object>(this)));
    }
}
