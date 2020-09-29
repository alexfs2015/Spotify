package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.metadata.proto.Metadata.Album;
import com.spotify.metadata.proto.Metadata.Disc;
import com.spotify.metadata.proto.Metadata.Track;
import io.reactivex.SingleSource;

/* renamed from: iqf reason: default package */
public final class iqf {
    private final gpx a;

    public iqf(gpx gpx) {
        this.a = gpx;
    }

    public final wud<ImmutableList<String>> a(String str) {
        return wuh.a(vun.a((SingleSource<T>) this.a.a(str).f($$Lambda$iqf$HE4esO3BKCABnAJkDnAgJX6aYqA.INSTANCE)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ImmutableList a(Album album) {
        a g = ImmutableList.g();
        for (Disc disc : album.f) {
            for (Track track : disc.d) {
                String h = jst.c(jrl.a(track.d.d())).h();
                if (h != null) {
                    g.c(h);
                }
            }
        }
        return g.a();
    }
}
