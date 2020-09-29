package defpackage;

import com.spotify.messages.VoiceAdLog;
import com.spotify.messages.VoiceAdLog.b;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.video.model.PlayerError;
import io.reactivex.Flowable;
import io.reactivex.ObservableTransformer;
import java.util.Iterator;
import java.util.Set;

/* renamed from: knz reason: default package */
public final class knz {
    public static ObservableTransformer<f, knt> a(Flowable<PlayerState> flowable, jrp jrp, igj igj, gdz<fko> gdz) {
        return new $$Lambda$knz$0ZzMx1FY6WNTCIc6z_pgNh0C6Zk(flowable, jrp, igj, gdz);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(f fVar, jrp jrp, igj igj, gdz gdz, PlayerState playerState) {
        rqi rqi;
        String str = fVar.a;
        knv knv = fVar.b;
        long currentPlaybackPosition = playerState.currentPlaybackPosition();
        Set<rqi> set = igj.a;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                rqi = null;
                break;
            }
            rqi = (rqi) it.next();
            if ("bluetooth".equalsIgnoreCase(rqi.d)) {
                break;
            }
        }
        if (rqi == null && !set.isEmpty()) {
            rqi = (rqi) set.iterator().next();
        }
        String str2 = "lineitem_id";
        String str3 = "creative_id";
        b a = VoiceAdLog.k().a(str).a(jrp.a()).b("").b("ad_id", knv.a()).b(str2, knv.b()).b(str3, knv.c()).b(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY, knv.d()).a((double) currentPlaybackPosition);
        if (rqi != null) {
            String str4 = "device_model";
            String str5 = "accessory_type";
            String str6 = "transport_type";
            String str7 = "company";
            a.a("device_name", rqi.c).a(str4, rqi.g).a(str5, rqi.e).a(str6, rqi.d).a(str7, rqi.f);
        }
        gdz.a(a.g());
    }
}
