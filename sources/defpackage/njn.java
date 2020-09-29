package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2MiscComponents;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import java.util.List;

/* renamed from: njn reason: default package */
final class njn {
    private final Resources a;

    public njn(Resources resources) {
        this.a = resources;
    }

    public static hcm a(boolean z, List<hcm> list) {
        String str = "";
        return hcx.builder().a((hck) HubsGlue2MiscComponents.CAROUSEL).b(list).d(nkh.a(z ? "home-downloaded-music" : "home-downloaded-episodes", 0, str, str)).a();
    }

    static String a(Covers covers) {
        return covers != null ? covers.getImageUri(Size.XLARGE) : "";
    }

    public final hcm a(int i) {
        String str = "";
        return hcx.builder().a(rrh.a).a(hcy.builder().a(fbo.b(this.a.getString(i))).a()).d(nkh.a(i == R.string.home_music_downloads ? "home-downloaded-music" : "home-downloaded-episodes", 0, str, str)).a();
    }
}
