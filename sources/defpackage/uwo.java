package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;

/* renamed from: uwo reason: default package */
public final class uwo {
    public final jlr a;
    private final String b;

    public uwo(jlr jlr, String str) {
        this.a = jlr;
        this.b = str;
    }

    public final void a(String str, Intent intent, PlayerState playerState) {
        byte[] bArr = null;
        String playbackId = (playerState == null || playerState.playbackId() == null) ? null : playerState.playbackId();
        Logger.a("Logging Voice Action %s %s %s %s", str, intent.name(), this.b, playbackId);
        jlr jlr = this.a;
        String name = intent.name();
        String str2 = this.b;
        if (playbackId != null) {
            bArr = jwy.a(playbackId);
        }
        bn bnVar = new bn(str, name, str2, bArr, playerState != null && playerState.isPlaying(), playerState != null);
        jlr.a(bnVar);
    }

    public final void a(String str, String str2, String str3, String str4, int i, InteractionIntent interactionIntent, InteractionType interactionType) {
        InteractionIntent interactionIntent2 = interactionIntent;
        InteractionType interactionType2 = interactionType;
        jlr jlr = this.a;
        String a2 = uqo.bg.a();
        String str5 = interactionType2 != null ? interactionType2.mInteractionType : null;
        String str6 = interactionIntent2 != null ? interactionIntent2.mInteractionIntent : null;
        bg bgVar = r4;
        bg bgVar2 = new bg(str, a2, str2, str4, 0, str3, str5, str6, (double) jtp.a.a());
        jlr.a(bgVar);
    }

    public final void a(String str, String str2, String str3, String str4, int i, String str5) {
        jlr jlr = this.a;
        be beVar = new be(str, uqo.bg.a(), str2, str4, 0, str3, str5, null, (double) jtp.a.a());
        jlr.a(beVar);
    }

    public final void a(String str, String str2, String str3, boolean z) {
        Logger.d("Logging error:: server message=%s, uid=%s, state=%s, errorType=%s, errorText=%s", str3, str, str2, str2, str3);
        jlr jlr = this.a;
        aj ajVar = new aj(str, str2, str3, this.b, z);
        jlr.a(ajVar);
    }
}
