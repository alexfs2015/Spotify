package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;

/* renamed from: uev reason: default package */
public final class uev implements ufm {
    private final izh a;
    private final Context b;
    private final uhz c;

    public uev(izh izh, Context context, uhz uhz) {
        this.a = izh;
        this.b = context;
        this.c = uhz;
    }

    public final void onEpisodeShareClick(vkv vkv, vkv[] vkvArr, String str, int i) {
        Covers b2 = vkv.b();
        String imageUri = b2 == null ? "" : b2.getImageUri(Size.LARGE);
        this.a.a(vkv.getUri(), imageUri, (String) null, vkv.a(), this.b.getString(R.string.share_episode_of_name, new Object[]{((Show) fbp.a(vkv.t())).a()}), (String) null, jqg.a);
        this.c.h(vkv.getUri(), str, i);
    }
}
