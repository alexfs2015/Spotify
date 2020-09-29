package defpackage;

import com.spotify.messages.VoiceAdLog;
import com.spotify.messages.VoiceAdLog.b;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.video.model.PlayerError;
import io.reactivex.Flowable;
import io.reactivex.ObservableTransformer;
import java.util.Iterator;
import java.util.Set;

/* renamed from: kri reason: default package */
public final class kri {
    public static ObservableTransformer<f, krc> a(Flowable<PlayerState> flowable, jtz jtz, iiw iiw, gfk<fli> gfk) {
        return new $$Lambda$kri$bmVjcidUPVpOZaLD_7rihbNsRA(flowable, jtz, iiw, gfk);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(f fVar, jtz jtz, iiw iiw, gfk gfk, PlayerState playerState) {
        rzt rzt;
        String str = fVar.a;
        kre kre = fVar.b;
        long currentPlaybackPosition = playerState.currentPlaybackPosition();
        Set<rzt> set = iiw.a;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                rzt = null;
                break;
            }
            rzt = (rzt) it.next();
            if ("bluetooth".equalsIgnoreCase(rzt.d)) {
                break;
            }
        }
        if (rzt == null && !set.isEmpty()) {
            rzt = (rzt) set.iterator().next();
        }
        String str2 = "lineitem_id";
        String str3 = "creative_id";
        b a = VoiceAdLog.k().a(str).a(jtz.a()).b("").b("ad_id", kre.a()).b(str2, kre.b()).b(str3, kre.c()).b(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY, kre.d()).a((double) currentPlaybackPosition);
        if (rzt != null) {
            String str4 = "device_model";
            String str5 = "accessory_type";
            String str6 = "transport_type";
            String str7 = "company";
            a.a("device_name", rzt.c).a(str4, rzt.g).a(str5, rzt.e).a(str6, rzt.d).a(str7, rzt.f);
        }
        gfk.a(a.g());
    }
}
