package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState;
import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider;
import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.Album;
import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.OfflineState;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* renamed from: mul reason: default package */
public final class mul {
    final String a;
    final kxi b;
    boolean c;
    Disposable d;
    private final kxm e;
    private final AlbumOfflineStateProvider f;

    public mul(String str, kxi kxi, kxm kxm, AlbumOfflineStateProvider albumOfflineStateProvider) {
        this.a = str;
        this.b = kxi;
        this.e = kxm;
        this.f = albumOfflineStateProvider;
    }

    public final void a() {
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.bf_();
        }
        this.d = vun.b(this.f.a(jst.a(this.a).f())).c((Predicate<? super T>) $$Lambda$mul$DmG6r6I7ZQA3ybLDXBeqIwZQ1U.INSTANCE).a((Consumer<? super T>) new $$Lambda$mul$dlTfoGWVHiO_BvMAyhLgpDBAk<Object>(this), (Consumer<? super Throwable>) new $$Lambda$mul$VpDA0az6HgKcwcE_J7VOT21PruI<Object>(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(OfflineState offlineState) {
        return offlineState.getAlbum().getOfflineState() instanceof a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.bf_();
        }
        Logger.e(th, "Failed to fetch album offline state when marking for offline", new Object[0]);
    }

    public final void b() {
        this.b.a(this.a, false);
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.bf_();
        }
        this.d = vun.b(this.f.a(jst.a(this.a).f())).a((Consumer<? super T>) new $$Lambda$mul$FmC1Afi5lrchJ6ngFVUw5Prl9E<Object>(this), (Consumer<? super Throwable>) new $$Lambda$mul$G43LNkFJfwIs8mketpglS9SLMr4<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(OfflineState offlineState) {
        if (offlineState.getAlbum().getOfflineState() instanceof a) {
            this.e.b(offlineState.getAlbum().getCollectionUri());
            Disposable disposable = this.d;
            if (disposable != null) {
                disposable.bf_();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.bf_();
        }
        Logger.e(th, "Failed to fetch album offline state when removing offline", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(OfflineState offlineState) {
        Album album = offlineState.getAlbum();
        if (new iql(album.getCollectionUri(), AlbumCollectionState.a(album.getNumTracksInCollection(), album.isCompleteInCollection()), album.getOfflineState(), album.getInferredOfflineState()).b()) {
            this.c = true;
            kxi kxi = this.b;
            String str = this.a;
            kxi.a(str, str, false);
            return;
        }
        if (offlineState.getAlbum().getOfflineState() instanceof f) {
            this.e.a(offlineState.getAlbum().getCollectionUri());
            Disposable disposable = this.d;
            if (disposable != null) {
                disposable.bf_();
            }
        }
    }
}
