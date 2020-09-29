package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;

/* renamed from: oys reason: default package */
public abstract class oys {
    public static final oys a = new a().a(ooe.a).a(ood.a).a(ooj.a).a(oop.a).a(ooh.a).a(PlaylistDataSourceConfiguration.a).a(oof.a).a(AllSongsConfiguration.a).a((gkq) PageIdentifiers.UNKNOWN).a();

    /* renamed from: oys$a */
    public interface a {
        a a(AllSongsConfiguration allSongsConfiguration);

        a a(PlaylistDataSourceConfiguration playlistDataSourceConfiguration);

        a a(gkq gkq);

        a a(ood ood);

        a a(ooe ooe);

        a a(oof oof);

        a a(ooh ooh);

        a a(ooj ooj);

        a a(oop oop);

        oys a();
    }

    public static a k() {
        return new a();
    }

    public abstract ooe a();

    public abstract ood b();

    public abstract ooj c();

    public abstract oop d();

    public abstract ooh e();

    public abstract PlaylistDataSourceConfiguration f();

    public abstract oof g();

    public abstract AllSongsConfiguration h();

    public abstract gkq i();

    public abstract a j();
}
