package defpackage;

import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;

/* renamed from: orp reason: default package */
public final class orp implements vua<oro> {
    private final wlc<ohq<ogz>> a;
    private final wlc<ohq<ohf>> b;
    private final wlc<ohq<ohl>> c;
    private final wlc<ohq<ohd>> d;
    private final wlc<ohq<PlaylistDataSourceConfiguration>> e;
    private final wlc<ohq<ohb>> f;
    private final wlc<ohq<AllSongsConfiguration>> g;

    private orp(wlc<ohq<ogz>> wlc, wlc<ohq<ohf>> wlc2, wlc<ohq<ohl>> wlc3, wlc<ohq<ohd>> wlc4, wlc<ohq<PlaylistDataSourceConfiguration>> wlc5, wlc<ohq<ohb>> wlc6, wlc<ohq<AllSongsConfiguration>> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static orp a(wlc<ohq<ogz>> wlc, wlc<ohq<ohf>> wlc2, wlc<ohq<ohl>> wlc3, wlc<ohq<ohd>> wlc4, wlc<ohq<PlaylistDataSourceConfiguration>> wlc5, wlc<ohq<ohb>> wlc6, wlc<ohq<AllSongsConfiguration>> wlc7) {
        orp orp = new orp(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return orp;
    }

    public final /* synthetic */ Object get() {
        oro oro = new oro((ohq) this.a.get(), (ohq) this.b.get(), (ohq) this.c.get(), (ohq) this.d.get(), (ohq) this.e.get(), (ohq) this.f.get(), (ohq) this.g.get());
        return oro;
    }
}
