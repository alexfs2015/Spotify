package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;

/* renamed from: oro reason: default package */
public final class oro implements orn {
    private final ohq<ogz> a;
    private final ohq<ohf> b;
    private final ohq<ohl> c;
    private final ohq<ohd> d;
    private final ohq<PlaylistDataSourceConfiguration> e;
    private final ohq<ohb> f;
    private final ohq<AllSongsConfiguration> g;

    public oro(ohq<ogz> ohq, ohq<ohf> ohq2, ohq<ohl> ohq3, ohq<ohd> ohq4, ohq<PlaylistDataSourceConfiguration> ohq5, ohq<ohb> ohq6, ohq<AllSongsConfiguration> ohq7) {
        this.a = ohq;
        this.b = ohq2;
        this.c = ohq3;
        this.d = ohq4;
        this.e = ohq5;
        this.f = ohq6;
        this.g = ohq7;
    }

    public final orm a() {
        return orm.k().a(oha.c().a()).a((ogz) this.a.a()).a((ohd) this.d.a()).a((PlaylistDataSourceConfiguration) this.e.a()).a((ohf) this.b.a()).a((ohl) this.c.a()).a((ohb) this.f.a()).a((AllSongsConfiguration) this.g.a()).a((gjf) PageIdentifiers.PLAYLIST).a();
    }
}
