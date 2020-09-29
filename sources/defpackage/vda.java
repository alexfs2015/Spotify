package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.nowplaying.core.repeat.RepeatState;

/* renamed from: vda reason: default package */
public final class vda {

    /* renamed from: vda$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[RepeatState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.nowplaying.core.repeat.RepeatState[] r0 = com.spotify.nowplaying.core.repeat.RepeatState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.nowplaying.core.repeat.RepeatState r1 = com.spotify.nowplaying.core.repeat.RepeatState.NONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.nowplaying.core.repeat.RepeatState r1 = com.spotify.nowplaying.core.repeat.RepeatState.CONTEXT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.nowplaying.core.repeat.RepeatState r1 = com.spotify.nowplaying.core.repeat.RepeatState.TRACK     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vda.AnonymousClass1.<clinit>():void");
        }
    }

    public static RepeatState a(PlayerState playerState) {
        PlayerOptions options = playerState.options();
        return options.repeatingTrack() ? RepeatState.TRACK : options.repeatingContext() ? RepeatState.CONTEXT : a(RepeatState.NONE, playerState.restrictions()) == RepeatState.NONE ? RepeatState.DISABLED : RepeatState.NONE;
    }

    public static RepeatState a(RepeatState repeatState, PlayerRestrictions playerRestrictions) {
        while (true) {
            int i = AnonymousClass1.a[repeatState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return RepeatState.NONE;
                }
                if (playerRestrictions.disallowTogglingRepeatTrackReasons().isEmpty()) {
                    return RepeatState.TRACK;
                }
                repeatState = RepeatState.TRACK;
            } else if (playerRestrictions.disallowTogglingRepeatContextReasons().isEmpty()) {
                return RepeatState.CONTEXT;
            } else {
                repeatState = RepeatState.CONTEXT;
            }
        }
    }
}
