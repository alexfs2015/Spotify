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

/* renamed from: jvt reason: default package */
public final class jvt {
    private static final Optional<String> b = Optional.b("premium");
    final SerialDisposable a = new SerialDisposable();
    private final jph c;
    private final uww d;
    private final hed e;

    public jvt(jph jph, uww uww, hed hed) {
        this.d = uww;
        this.e = hed;
        this.c = jph;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        return this.d.a().c((Function<? super T, ? extends R>) new $$Lambda$jvt$59nDNuI3V8Q1HJAxF22tHtR_gs<Object,Object>(bool));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jpg a(Boolean bool, PlayerError playerError) {
        return new jpg(playerError, bool.booleanValue());
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "Failed to listen for playback errors.", new Object[0]);
    }

    public final void a() {
        SerialDisposable serialDisposable = this.a;
        Observable b2 = vun.b(this.e.a(MoatAdEvent.EVENT_TYPE).f($$Lambda$aCKf3hOvaO2phPFK29rd7bVLuPY.INSTANCE));
        Optional<String> optional = b;
        optional.getClass();
        serialDisposable.a(b2.c((Function<? super T, ? extends R>) new $$Lambda$SiUSHCGvbVttS2l2iSJlkhkikbA<Object,Object>(optional)).a(Functions.a()).h(new $$Lambda$jvt$LGYubo6ytEEt4Btk6LRzr6NobRk(this)).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$jvt$UniPpakixzUa6NqQDgxI9Y4km4<Object>(this), (Consumer<? super Throwable>) new $$Lambda$jvt$f9bsB4E56hWNgI4zBKUWRK9wi3s<Object>(this)));
    }

    /* access modifiers changed from: private */
    public void a(jpg jpg) {
        int i = jpg.a;
        String str = jpg.b;
        Logger.b("onPlaybackError(playbackError: %d, uri: %s);", Integer.valueOf(i), str);
        if (i == 14) {
            this.c.c.a().a(jph.a, i).a(jph.b, str).b();
        }
    }
}
