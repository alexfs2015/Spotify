package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;

/* renamed from: ulk reason: default package */
public final class ulk {
    public final jjf a;
    private final String b;

    public ulk(jjf jjf, String str) {
        this.a = jjf;
        this.b = str;
    }

    public final void a(String str, Intent intent, PlayerState playerState) {
        byte[] bArr = null;
        String playbackId = (playerState == null || playerState.playbackId() == null) ? null : playerState.playbackId();
        Logger.a("Logging Voice Action %s %s %s %s", str, intent.name(), this.b, playbackId);
        jjf jjf = this.a;
        String name = intent.name();
        String str2 = this.b;
        if (playbackId != null) {
            bArr = juq.a(playbackId);
        }
        bp bpVar = new bp(str, name, str2, bArr, playerState != null && playerState.isPlaying(), playerState != null);
        jjf.a(bpVar);
    }

    public final void a(String str, String str2, String str3, boolean z) {
        Logger.d("Logging error:: server message=%s, uid=%s, state=%s, errorType=%s, errorText=%s", str3, str, str2, str2, str3);
        jjf jjf = this.a;
        ak akVar = new ak(str, str2, str3, this.b, z);
        jjf.a(akVar);
    }

    public final void a(String str, String str2, String str3, String str4, int i, InteractionIntent interactionIntent, InteractionType interactionType) {
        String str5;
        String str6;
        InteractionIntent interactionIntent2 = interactionIntent;
        InteractionType interactionType2 = interactionType;
        jjf jjf = this.a;
        String a2 = udt.bg.a();
        if (interactionType2 != null) {
            str5 = interactionType2.mInteractionType;
        } else {
            str5 = null;
        }
        if (interactionIntent2 != null) {
            str6 = interactionIntent2.mInteractionIntent;
        } else {
            str6 = null;
        }
        bh bhVar = r4;
        bh bhVar2 = new bh(str, a2, str2, str4, 0, str3, str5, str6, (double) jrf.a.a());
        jjf.a(bhVar);
    }

    public final void a(String str, String str2, String str3, String str4, int i, String str5) {
        jjf jjf = this.a;
        bf bfVar = new bf(str, udt.bg.a(), str2, str4, 0, str3, str5, null, (double) jrf.a.a());
        jjf.a(bfVar);
    }
}
