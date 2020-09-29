package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.ubi.interactions.InteractionAction;

/* renamed from: rlo reason: default package */
public final class rlo {
    private final jvf a;
    private final FollowManager b;
    private final rlq c;

    rlo(jvf jvf, FollowManager followManager, rlq rlq) {
        this.a = jvf;
        this.b = followManager;
        this.c = rlq;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, sso sso, String str) {
        boolean z2 = !z;
        rlq rlq = this.c;
        String sso2 = sso.toString();
        jlr jlr = rlq.a;
        bh bhVar = r3;
        bh bhVar2 = new bh(null, null, sso2, "options-menu", -1, str, "hit", z2 ? "follow" : "unfollow", (double) jtp.a.a(), (z2 ? InteractionAction.FOLLOW : InteractionAction.UNFOLLOW).mLogString);
        jlr.a(bhVar);
        SpotifyIconV2 spotifyIconV2 = z2 ? SpotifyIconV2.CHECK : SpotifyIconV2.X;
        int i = z2 ? R.string.toast_following : R.string.toast_unfollowing;
        this.a.a(spotifyIconV2, i, 0);
        this.b.a(str, !z);
    }

    public final void a(fzn fzn, int i, sso sso, String str, boolean z) {
        fzn.a(i, z ? R.string.options_menu_stop_following : R.string.options_menu_follow, fzz.a(fzn.a(), SpotifyIconV2.FOLLOW)).a(new $$Lambda$rlo$DvnxqKpv7eSAlfFu5jOU8GGyRVA(this, z, sso, str));
    }
}
