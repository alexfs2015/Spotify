package defpackage;

import android.content.res.Resources;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.nowplaying.drivingmode.loggers.DrivingPivotInteractionLoggerImpl;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;

/* renamed from: lgg reason: default package */
public interface lgg {

    /* renamed from: lgg$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static HeaderPolicy a() {
            String str = "name";
            String str2 = "username";
            ImmutableMap b = ImmutableMap.g().b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b();
            String str3 = "ownedBySelf";
            String str4 = "formatListAttributes";
            String str5 = "formatListType";
            String str6 = "link";
            String str7 = "containsTracks";
            String str8 = "containsEpisodes";
            String str9 = "containsAudioEpisodes";
            String str10 = "isOnDemandInFree";
            return HeaderPolicy.builder().a(ImmutableMap.g().b("offline", Boolean.TRUE).b(str3, Boolean.TRUE).b(str, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b(str7, Boolean.TRUE).b(str8, Boolean.TRUE).b(str9, Boolean.TRUE).b(str10, Boolean.TRUE).b()).b(b).c(ImmutableMap.g().b(str2, Boolean.TRUE).b()).a();
        }

        public static tnq a(InteractionLogger interactionLogger, wzi<PlayerState> wzi, String str) {
            return new DrivingPivotInteractionLoggerImpl(interactionLogger, wzi, str);
        }

        public static toh a(fqn fqn) {
            return new toh(jus.c(fqn), jus.b(fqn));
        }

        public static tol a(tmo tmo, Resources resources, boolean z, toh toh, vje vje, HeaderPolicy headerPolicy, sgk sgk, boolean z2) {
            tol tol = new tol(tmo, resources, z, toh, vje, headerPolicy, sgk, z2);
            return tol;
        }
    }
}
