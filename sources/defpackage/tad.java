package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.SectionId;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.UserIntent;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.nowplaying.core.repeat.RepeatState;

/* renamed from: tad reason: default package */
public final class tad implements urz, usa, usb, usc, usd, use, usf, usg, usk, usn, usq, usv, uta, utd, ute, utf, utj, utk, uto, utp {
    private final InteractionLogger a;
    private final wlc<PlayerState> b;
    private final String c;

    /* renamed from: tad$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[RepeatState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
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
                com.spotify.nowplaying.core.repeat.RepeatState r1 = com.spotify.nowplaying.core.repeat.RepeatState.DISABLED     // Catch:{ NoSuchFieldError -> 0x001f }
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
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.nowplaying.core.repeat.RepeatState r1 = com.spotify.nowplaying.core.repeat.RepeatState.CONTEXT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tad.AnonymousClass1.<clinit>():void");
        }
    }

    public tad(InteractionLogger interactionLogger, wlc<PlayerState> wlc, String str) {
        this.a = (InteractionLogger) fay.a(interactionLogger);
        this.b = (wlc) fay.a(wlc);
        this.c = (String) fay.a(str);
    }

    public final void c() {
        a(null, SectionId.PREVIOUS_BUTTON, UserIntent.SKIP_TO_PREVIOUS, InteractionType.HIT);
    }

    public final void d() {
        a(p(), SectionId.NEXT_BUTTON, UserIntent.SKIP_TO_NEXT, InteractionType.HIT);
    }

    public final void g() {
        a(p(), SectionId.CAROUSEL, UserIntent.SKIP_TO_NEXT, InteractionType.SWIPE_LEFT);
    }

    public final void j() {
        a(null, SectionId.QUEUE_BUTTON, UserIntent.OPEN_QUEUE, InteractionType.HIT);
    }

    public final void a(String str) {
        a(str, SectionId.HEADER_CONTEXT_TITLE, UserIntent.OPEN_PLAY_CONTEXT_PAGE, InteractionType.HIT);
    }

    public final void b(String str) {
        a(str, SectionId.TRACK_TITLE, UserIntent.OPEN_ALBUM, InteractionType.HIT);
    }

    public final void c(String str) {
        a(str, SectionId.ARTIST_NAME, UserIntent.OPEN_ARTIST, InteractionType.HIT);
    }

    public final void l() {
        a(null, SectionId.CLOSE_BUTTON, UserIntent.CLOSE, InteractionType.HIT);
    }

    public final void m() {
        a(null, SectionId.CONNECT_BUTTON, UserIntent.OPEN_CONNECT, InteractionType.HIT);
    }

    public void a(String str, SectionId sectionId, UserIntent userIntent, InteractionType interactionType) {
        a(str, sectionId, userIntent, interactionType, null);
    }

    private void a(String str, SectionId sectionId, UserIntent userIntent, InteractionType interactionType, InteractionAction interactionAction) {
        a(str, sectionId, userIntent, interactionType, true, interactionAction);
    }

    private void a(String str, SectionId sectionId, UserIntent userIntent, InteractionType interactionType, boolean z, InteractionAction interactionAction) {
        String str2;
        InteractionLogger interactionLogger = this.a;
        String q = q();
        if (z) {
            str2 = d(sectionId.toString());
        } else {
            str2 = sectionId.toString();
        }
        interactionLogger.a(q, str, str2, 0, interactionType, userIntent.toString(), interactionAction);
    }

    private String d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(str);
        return sb.toString();
    }

    public PlayerState o() {
        return (PlayerState) this.b.get();
    }

    private String p() {
        PlayerState o = o();
        if (o == null) {
            return null;
        }
        PlayerTrack[] future = o.future();
        if (future.length > 0) {
            return future[0].uri();
        }
        return null;
    }

    private String q() {
        PlayerState o = o();
        if (o == null) {
            return null;
        }
        return o.playbackId();
    }

    private static UserIntent c(RepeatState repeatState) {
        int i = AnonymousClass1.a[repeatState.ordinal()];
        if (i == 1 || i == 2) {
            return UserIntent.REPEAT_DISABLED;
        }
        if (i == 3) {
            return UserIntent.REPEAT_ONE_TRACK;
        }
        if (i == 4) {
            return UserIntent.REPEAT_CONTEXT;
        }
        StringBuilder sb = new StringBuilder("Unsupported RepeatState ");
        sb.append(repeatState);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a() {
        a(PlayerStateUtil.getTrackUri(o()), SectionId.PLAY_BUTTON, UserIntent.PLAY, InteractionType.HIT);
    }

    public final void b() {
        a(PlayerStateUtil.getTrackUri(o()), SectionId.PLAY_BUTTON, UserIntent.PAUSE, InteractionType.HIT);
    }

    public final void a(boolean z) {
        a(PlayerStateUtil.getTrackUri(o()), SectionId.HEART_BUTTON, z ? UserIntent.REMOVE_FEEDBACK : UserIntent.ADD_FEEDBACK, InteractionType.HIT, z ? InteractionAction.UNLIKE : InteractionAction.LIKE);
    }

    public final void b(boolean z) {
        a(PlayerStateUtil.getTrackUri(o()), SectionId.BAN_BUTTON, z ? UserIntent.REMOVE_FEEDBACK : UserIntent.ADD_FEEDBACK, InteractionType.HIT);
    }

    public final void e() {
        a(PlayerStateUtil.getTrackUri(o()), SectionId.SEEK_BACKWARD_BUTTON, UserIntent.SEEK, InteractionType.HIT);
    }

    public final void f() {
        a(PlayerStateUtil.getTrackUri(o()), SectionId.SEEK_FORWARD_BUTTON, UserIntent.SEEK, InteractionType.HIT);
    }

    public final void h() {
        String str;
        PlayerState o = o();
        if (o != null) {
            PlayerTrack[] reverse = o.reverse();
            if (reverse.length > 0) {
                str = reverse[reverse.length - 1].uri();
                a(str, SectionId.CAROUSEL, UserIntent.SKIP_TO_PREVIOUS, InteractionType.SWIPE_RIGHT);
            }
        }
        str = null;
        a(str, SectionId.CAROUSEL, UserIntent.SKIP_TO_PREVIOUS, InteractionType.SWIPE_RIGHT);
    }

    public final void c(boolean z) {
        a(PlayerStateUtil.getTrackUri(o()), SectionId.SHUFFLE_BUTTON, z ? UserIntent.SHUFFLE_DISABLED : UserIntent.SHUFFLE_ENABLED, InteractionType.HIT);
    }

    public final void a(RepeatState repeatState) {
        a(PlayerStateUtil.getTrackUri(o()), SectionId.REPEAT_BUTTON, c(repeatState), InteractionType.HIT);
    }

    public final void i() {
        a(PlayerStateUtil.getTrackUri(o()), SectionId.SEEK_BAR, UserIntent.SEEK, InteractionType.DRAG);
    }

    public final void k() {
        a(PlayerStateUtil.getTrackUri(o()), SectionId.CONTEXT_MENU_BUTTON, UserIntent.OPEN_CONTEXT_MENU, InteractionType.HIT);
    }

    public final void d(boolean z) {
        a(PlayerStateUtil.getTrackUri(o()), SectionId.CONTEXT_MENU, z ? UserIntent.SHUFFLE_DISABLED : UserIntent.SHUFFLE_ENABLED, InteractionType.HIT, false, null);
    }

    public final void b(RepeatState repeatState) {
        a(PlayerStateUtil.getTrackUri(o()), SectionId.CONTEXT_MENU, c(repeatState), InteractionType.HIT, false, null);
    }

    public final void n() {
        a(PlayerStateUtil.getTrackUri(o()), SectionId.SHARE_BUTTON, UserIntent.SHARE, InteractionType.HIT);
    }
}
