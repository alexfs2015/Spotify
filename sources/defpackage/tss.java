package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;

/* renamed from: tss reason: default package */
public final class tss implements ttj {
    private final iww a;
    private final Context b;
    private final tvw c;

    public tss(iww iww, Context context, tvw tvw) {
        this.a = iww;
        this.b = context;
        this.c = tvw;
    }

    public final void onEpisodeShareClick(uys uys, uys[] uysArr, String str, int i) {
        String str2;
        Covers b2 = uys.b();
        if (b2 == null) {
            str2 = "";
        } else {
            str2 = b2.getImageUri(Size.LARGE);
        }
        String str3 = str2;
        String uri = uys.getUri();
        String a2 = uys.a();
        String a3 = ((Show) fay.a(uys.t())).a();
        this.a.a(uri, str3, (String) null, a2, this.b.getString(R.string.share_episode_of_name, new Object[]{a3}), (String) null, jnu.a);
        this.c.h(uys.getUri(), str, i);
    }
}
