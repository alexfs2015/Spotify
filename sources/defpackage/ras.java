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

/* renamed from: ras reason: default package */
public final class ras {
    private final Context a;

    /* renamed from: ras$a */
    public interface a {
        void onArtistBan();
    }

    /* renamed from: ras$b */
    public interface b {
        void onTrackBan();
    }

    public ras(Context context) {
        this.a = context;
    }

    public final void a(PlayerTrack playerTrack, String str, sih sih, b bVar, a aVar) {
        Context context = this.a;
        $$Lambda$ras$2UOkS3a4VOrjUPpzjfwZ_Fp3Ig r1 = new $$Lambda$ras$2UOkS3a4VOrjUPpzjfwZ_Fp3Ig(this, playerTrack, str, bVar, aVar);
        jly.a(context, r1, playerTrack, sih);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jms a(PlayerTrack playerTrack, String str, b bVar, a aVar, PlayerTrack playerTrack2) {
        String str2 = (String) playerTrack.metadata().get("title");
        Drawable a2 = fzf.a(this.a, SpotifyIconV2.BAN);
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        Map metadata = playerTrack.metadata();
        String str3 = "image_url";
        fuf fuf = new fuf(str2, (String) metadata.get("artist_name"), !TextUtils.isEmpty((CharSequence) metadata.get(str3)) ? Uri.parse((String) metadata.get(str3)) : Uri.EMPTY, SpotifyIconV2.TRACK, false);
        contextMenuViewModel.c = fuf;
        contextMenuViewModel.b(str);
        contextMenuViewModel.c.d = " ";
        contextMenuViewModel.a((int) R.id.context_menu_ban_track, (CharSequence) this.a.getString(R.string.feedback_context_menu_dislike_track), a2).a((fui) new $$Lambda$ras$LKNQn81pIUgeaAWL8fIjGLYKTbc(bVar));
        contextMenuViewModel.a((int) R.id.context_menu_ban_artist, (CharSequence) this.a.getString(R.string.feedback_context_menu_dislike_artist), a2).a((fui) new $$Lambda$ras$5qVW3Cv6W8uZErGsiVBtdE7kMaU(aVar));
        return jms.a(contextMenuViewModel);
    }
}
