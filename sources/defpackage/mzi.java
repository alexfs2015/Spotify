package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: mzi reason: default package */
public final class mzi {
    public Disposable a;
    private final String b;
    private final hhc c;
    private final AlbumOfflineStateProvider d;

    public mzi(hhc hhc, String str, AlbumOfflineStateProvider albumOfflineStateProvider) {
        this.b = str;
        this.c = hhc;
        this.d = albumOfflineStateProvider;
    }

    public final void a(a aVar) {
        Observable a2 = wit.b(this.d.a(jva.a(this.b).f())).c((Function<? super T, ? extends R>) $$Lambda$mzi$QCarzrs2xWFjCqdMx1oHpcij6c.INSTANCE).a(Functions.a()).a(this.c.c());
        aVar.getClass();
        this.a = a2.a((Consumer<? super T>) new $$Lambda$l_yxAv85JY6_4XFXKT5Le6JFH0<Object>(aVar), (Consumer<? super Throwable>) $$Lambda$mzi$R49xAPBBe2V_9j5YaShGBJFQ5h0.INSTANCE);
    }
}
