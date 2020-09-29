package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: rib reason: default package */
public final class rib implements rhy {
    private final gdf a;
    private Observable<SongsMetadataFromTracks> b;
    private final jwo c;

    public rib(gdf gdf, jwo jwo) {
        this.a = gdf;
        this.c = jwo;
    }

    /* access modifiers changed from: private */
    public static SongsMetadataFromTracks a(gdl gdl) {
        return SongsMetadataFromTracks.builder().a(gdl.b()).a(false).a(gdl.a()).a();
    }

    /* access modifiers changed from: private */
    public static a a(boolean z) {
        C0033a d = a.d();
        if (!z) {
            d.a(Optional.b(Boolean.TRUE));
        }
        return d.a();
    }

    public final Observable<SongsMetadataFromTracks> a() {
        if (this.b == null) {
            Observable c2 = this.c.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$rib$pIE3M_mvv6H2KaCnEMzLDnm0w.INSTANCE);
            gdf gdf = this.a;
            gdf.getClass();
            this.b = c2.h(new $$Lambda$rH60isDgfSF2Sp8uUUxPSdz4TmM(gdf)).c((Function<? super T, ? extends R>) $$Lambda$rib$_JqcgWCQnn6mXawc4fEbAUA4ZWI.INSTANCE);
        }
        return this.b;
    }
}
