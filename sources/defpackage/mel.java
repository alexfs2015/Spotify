package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: mel reason: default package */
final class mel {
    final oyt a;
    final oou<ook> b;
    final oou<ItemListConfiguration> c;

    public mel(oyt oyt, oou<ook> oou, oou<ItemListConfiguration> oou2) {
        this.a = oyt;
        this.b = oou;
        this.c = oou2;
    }

    /* access modifiers changed from: 0000 */
    public AllSongsConfiguration a() {
        return this.a.a().h().f().a(Optional.b(Boolean.TRUE)).b(true).a();
    }
}
