package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: muh reason: default package */
public final class muh {
    public Disposable a;
    private final String b;
    private final heg c;
    private final AlbumOfflineStateProvider d;

    public muh(heg heg, String str, AlbumOfflineStateProvider albumOfflineStateProvider) {
        this.b = str;
        this.c = heg;
        this.d = albumOfflineStateProvider;
    }

    public final void a(a aVar) {
        Observable a2 = vun.b(this.d.a(jst.a(this.b).f())).c((Function<? super T, ? extends R>) $$Lambda$muh$u64Bt9XI6EEGKEFySqqwgt4Aphg.INSTANCE).a(Functions.a()).a(this.c.c());
        aVar.getClass();
        this.a = a2.a((Consumer<? super T>) new $$Lambda$h85ESwpjv_me82WLC7QqkORCUXk<Object>(aVar), (Consumer<? super Throwable>) $$Lambda$muh$1ZP_xbiYe79wIQR9r400mold0nU.INSTANCE);
    }
}
