package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState;
import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider;
import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.Album;
import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.OfflineState;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* renamed from: mzm reason: default package */
public final class mzm {
    final String a;
    final lar b;
    boolean c;
    Disposable d;
    private final lav e;
    private final AlbumOfflineStateProvider f;

    public mzm(String str, lar lar, lav lav, AlbumOfflineStateProvider albumOfflineStateProvider) {
        this.a = str;
        this.b = lar;
        this.e = lav;
        this.f = albumOfflineStateProvider;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(OfflineState offlineState) {
        if (offlineState.getAlbum().getOfflineState() instanceof a) {
            this.e.b(offlineState.getAlbum().getCollectionUri());
            Disposable disposable = this.d;
            if (disposable != null) {
                disposable.bd_();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.bd_();
        }
        Logger.e(th, "Failed to fetch album offline state when removing offline", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(OfflineState offlineState) {
        Album album = offlineState.getAlbum();
        if (new isy(album.getCollectionUri(), AlbumCollectionState.a(album.getNumTracksInCollection(), album.isCompleteInCollection()), album.getOfflineState(), album.getInferredOfflineState()).b()) {
            this.c = true;
            lar lar = this.b;
            String str = this.a;
            lar.a(str, str, false);
            return;
        }
        if (offlineState.getAlbum().getOfflineState() instanceof f) {
            this.e.a(offlineState.getAlbum().getCollectionUri());
            Disposable disposable = this.d;
            if (disposable != null) {
                disposable.bd_();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.bd_();
        }
        Logger.e(th, "Failed to fetch album offline state when marking for offline", new Object[0]);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(OfflineState offlineState) {
        return offlineState.getAlbum().getOfflineState() instanceof a;
    }

    public final void a() {
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.bd_();
        }
        this.d = wit.b(this.f.a(jva.a(this.a).f())).b((Predicate<? super T>) $$Lambda$mzm$7jtCAbPwzzPM3arcIxjOoZHdEg.INSTANCE).a((Consumer<? super T>) new $$Lambda$mzm$qzpRypcCKGJQ3bJenooslmVEJw<Object>(this), (Consumer<? super Throwable>) new $$Lambda$mzm$p1NFNBVouaabIzodziLnq9yc8Q<Object>(this));
    }

    public final void b() {
        this.b.a(this.a, false);
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.bd_();
        }
        this.d = wit.b(this.f.a(jva.a(this.a).f())).a((Consumer<? super T>) new $$Lambda$mzm$rXTRq5yVTTOcKNelA148iTmyBh0<Object>(this), (Consumer<? super Throwable>) new $$Lambda$mzm$KJWpz1FVxk6eBrD2h4sEqubdtBg<Object>(this));
    }
}
