package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: rhz reason: default package */
public final class rhz implements rhy {
    private final irb a;
    private final jwo b;
    private Observable<SongsMetadataFromTracks> c;

    public rhz(irb irb, jwo jwo) {
        this.a = irb;
        this.b = jwo;
        irb irb2 = this.a;
        Integer valueOf = Integer.valueOf(0);
        irb2.a(valueOf, valueOf);
    }

    /* access modifiers changed from: private */
    public static SongsMetadataFromTracks a(iri iri) {
        return SongsMetadataFromTracks.builder().a(iri.isLoading()).a(iri.a()).a(iri.getUnrangedLength()).a();
    }

    /* access modifiers changed from: private */
    public Observable<iri> a(boolean z) {
        irb irb = this.a;
        irb.g = !z;
        return irb.b();
    }

    public final Observable<SongsMetadataFromTracks> a() {
        if (this.c == null) {
            this.c = this.b.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).a(Functions.a()).h(new $$Lambda$rhz$6A05wuFHGwrgnqQM2I36vnFc(this)).c((Function<? super T, ? extends R>) $$Lambda$rhz$UeMu4MWqZLYOyRDrPEfHd2GkHf4.INSTANCE);
        }
        return this.c;
    }
}
