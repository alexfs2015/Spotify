package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: mai reason: default package */
final class mai {
    final orn a;
    final ohq<ohg> b;
    final ohq<ItemListConfiguration> c;

    public mai(orn orn, ohq<ohg> ohq, ohq<ItemListConfiguration> ohq2) {
        this.a = orn;
        this.b = ohq;
        this.c = ohq2;
    }

    /* access modifiers changed from: 0000 */
    public AllSongsConfiguration a() {
        return this.a.a().h().f().a(Optional.b(Boolean.TRUE)).b(true).a();
    }
}
