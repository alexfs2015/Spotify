package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.R;
import java.util.Map;

/* renamed from: rjo reason: default package */
public final class rjo {
    private final Context a;

    /* renamed from: rjo$a */
    public interface a {
        void onArtistBan();
    }

    /* renamed from: rjo$b */
    public interface b {
        void onTrackBan();
    }

    public rjo(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jpe a(PlayerTrack playerTrack, String str, b bVar, a aVar, PlayerTrack playerTrack2) {
        String str2 = (String) playerTrack.metadata().get("title");
        Drawable a2 = fzz.a(this.a, SpotifyIconV2.BAN);
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        Map metadata = playerTrack.metadata();
        String str3 = "image_url";
        fuz fuz = new fuz(str2, (String) metadata.get("artist_name"), !TextUtils.isEmpty((CharSequence) metadata.get(str3)) ? Uri.parse((String) metadata.get(str3)) : Uri.EMPTY, SpotifyIconV2.TRACK, false);
        contextMenuViewModel.c = fuz;
        contextMenuViewModel.b(str);
        contextMenuViewModel.c.d = " ";
        contextMenuViewModel.a((int) R.id.context_menu_ban_track, (CharSequence) this.a.getString(R.string.feedback_context_menu_dislike_track), a2).a((fvc) new $$Lambda$rjo$3Cyd34F0LuqxBnJ2OevHZ5Y6k8E(bVar));
        contextMenuViewModel.a((int) R.id.context_menu_ban_artist, (CharSequence) this.a.getString(R.string.feedback_context_menu_dislike_artist), a2).a((fvc) new $$Lambda$rjo$UKMcuwIjnYGRCiSpNmNXt8_14bs(aVar));
        return jpe.a(contextMenuViewModel);
    }

    public final void a(PlayerTrack playerTrack, String str, sso sso, b bVar, a aVar) {
        Context context = this.a;
        $$Lambda$rjo$4HCYzkt2kcsw8IWW6Ghh2iYIOL0 r1 = new $$Lambda$rjo$4HCYzkt2kcsw8IWW6Ghh2iYIOL0(this, playerTrack, str, bVar, aVar);
        jok.a(context, r1, playerTrack, sso);
    }
}
