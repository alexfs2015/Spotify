package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.metadata.proto.Metadata.Album;
import com.spotify.metadata.proto.Metadata.Disc;
import com.spotify.metadata.proto.Metadata.Track;
import io.reactivex.SingleSource;

/* renamed from: iss reason: default package */
public final class iss {
    private final grw a;

    public iss(grw grw) {
        this.a = grw;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ImmutableList a(Album album) {
        a g = ImmutableList.g();
        for (Disc disc : album.f) {
            for (Track track : disc.d) {
                String h = jva.c(jtv.a(track.d.d())).h();
                if (h != null) {
                    g.c(h);
                }
            }
        }
        return g.a();
    }

    public final xii<ImmutableList<String>> a(String str) {
        return xim.a(wit.a((SingleSource<T>) this.a.a(str).f($$Lambda$iss$84WfIlbIEj82vlKoFXbPxI9BCU.INSTANCE)));
    }
}
