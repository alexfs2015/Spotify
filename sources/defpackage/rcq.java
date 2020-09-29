package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.ubi.interactions.InteractionAction;

/* renamed from: rcq reason: default package */
public final class rcq {
    private final jsz a;
    private final FollowManager b;
    private final rcs c;

    rcq(jsz jsz, FollowManager followManager, rcs rcs) {
        this.a = jsz;
        this.b = followManager;
        this.c = rcs;
    }

    public final void a(fyt fyt, int i, sih sih, String str, boolean z) {
        fyt.a(i, z ? R.string.options_menu_stop_following : R.string.options_menu_follow, fzf.a(fyt.a(), SpotifyIconV2.FOLLOW)).a(new $$Lambda$rcq$IhRb1qIZR7C8aQC4kP2c4QSDoHg(this, z, sih, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, sih sih, String str) {
        boolean z2 = !z;
        rcs rcs = this.c;
        String sih2 = sih.toString();
        jjf jjf = rcs.a;
        bi biVar = r3;
        bi biVar2 = new bi(null, null, sih2, "options-menu", -1, str, "hit", z2 ? "follow" : "unfollow", (double) jrf.a.a(), (z2 ? InteractionAction.FOLLOW : InteractionAction.UNFOLLOW).mLogString);
        jjf.a(biVar);
        SpotifyIconV2 spotifyIconV2 = z2 ? SpotifyIconV2.CHECK : SpotifyIconV2.X;
        int i = z2 ? R.string.toast_following : R.string.toast_unfollowing;
        this.a.a(spotifyIconV2, i, 0);
        this.b.a(str, !z);
    }
}
