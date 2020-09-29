package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2MiscComponents;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import java.util.List;

/* renamed from: ndy reason: default package */
final class ndy {
    private final Resources a;

    public ndy(Resources resources) {
        this.a = resources;
    }

    static String a(Covers covers) {
        return covers != null ? covers.getImageUri(Size.XLARGE) : "";
    }

    public static gzt a(boolean z, List<gzt> list) {
        String str = "";
        return hae.builder().a((gzr) HubsGlue2MiscComponents.CAROUSEL).b(list).d(nes.a(z ? "home-downloaded-music" : "home-downloaded-episodes", 0, str, str)).a();
    }

    public final gzt a(int i) {
        String str = "";
        return hae.builder().a(rif.a).a(haf.builder().a(fax.b(this.a.getString(i))).a()).d(nes.a(i == R.string.home_music_downloads ? "home-downloaded-music" : "home-downloaded-episodes", 0, str, str)).a();
    }
}
