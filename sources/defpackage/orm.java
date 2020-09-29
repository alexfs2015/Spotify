package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;

/* renamed from: orm reason: default package */
public abstract class orm {
    public static final orm a = new a().a(oha.a).a(ogz.a).a(ohf.a).a(ohl.a).a(ohd.a).a(PlaylistDataSourceConfiguration.a).a(ohb.a).a(AllSongsConfiguration.a).a((gjf) PageIdentifiers.UNKNOWN).a();

    /* renamed from: orm$a */
    public interface a {
        a a(AllSongsConfiguration allSongsConfiguration);

        a a(PlaylistDataSourceConfiguration playlistDataSourceConfiguration);

        a a(gjf gjf);

        a a(ogz ogz);

        a a(oha oha);

        a a(ohb ohb);

        a a(ohd ohd);

        a a(ohf ohf);

        a a(ohl ohl);

        orm a();
    }

    public abstract oha a();

    public abstract ogz b();

    public abstract ohf c();

    public abstract ohl d();

    public abstract ohd e();

    public abstract PlaylistDataSourceConfiguration f();

    public abstract ohb g();

    public abstract AllSongsConfiguration h();

    public abstract gjf i();

    public abstract a j();

    public static a k() {
        return new a();
    }
}
