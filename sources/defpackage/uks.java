package defpackage;

import android.media.AudioManager;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import rx.Emitter;
import rx.Emitter.BackpressureMode;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: uks reason: default package */
public final class uks {
    final Player a;
    public final ufq b;
    final uku c;
    final ulk d;
    private final gsu e;
    private final AudioManager f;
    private final RxResolver g;
    private final gsy h;

    /* renamed from: uks$2 reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a = new int[Intent.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent[] r0 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.WTF     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.PLAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.NO_INTENT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.SEARCH     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.SHOW     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.RESUME     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.STOP     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.NEXT     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.PREVIOUS     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.SHUFFLE_ON     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.SHUFFLE_OFF     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.REPEAT_ON     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009e }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.REPEAT_OFF     // Catch:{ NoSuchFieldError -> 0x009e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00aa }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.REPEAT_ONE     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b6 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.VOLUME_UP     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c2 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.VOLUME_DOWN     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.uks.AnonymousClass2.<clinit>():void");
        }
    }

    /* renamed from: uks$a */
    final class a implements ActionCallback {
        private final String a;
        private final String b;
        private final Intent c;

        a(String str, String str2, Intent intent) {
            this.a = str;
            this.b = str2;
            this.c = intent;
        }

        public final void onActionSuccess() {
            Logger.c("skip success, looking for %s", this.b);
            uku uku = uks.this.c;
            String str = this.a;
            String str2 = this.b;
            ulk ulk = uks.this.d;
            Intent intent = this.c;
            Logger.a("Starting to observe different contexts for %s", str2);
            uku.a(str, ulk, intent, (a) new a(str2) {
                private /* synthetic */ String a;

                {
                    this.a = r2;
                }

                public final boolean doFilter(PlayerState playerState) {
                    PlayerTrack track = playerState.track();
                    if (track == null) {
                        return false;
                    }
                    String str = this.a;
                    Logger.a("applying filter for %s, %s, result=%s", track.uri(), str, Boolean.valueOf(!str.equalsIgnoreCase(track.uri())));
                    if (!track.uri().equalsIgnoreCase(this.a)) {
                        return true;
                    }
                    return false;
                }
            });
        }

        public final void onActionForbidden(List<String> list) {
            Logger.d("Unable to change player %s", list);
            uks.this.d.a(this.a, this.c, null);
        }
    }

    public uks(Player player, gsu gsu, AudioManager audioManager, ufq ufq, RxResolver rxResolver, uku uku, ulk ulk, gsy gsy) {
        this.a = player;
        this.e = gsu;
        this.f = audioManager;
        this.b = ufq;
        this.g = rxResolver;
        this.c = uku;
        this.d = ulk;
        this.h = gsy;
    }

    public final wud<Boolean> a(String str, Intent intent, jst jst, PlayerContext playerContext) {
        Logger.b("NLU executing intent=%s, link=%s", intent, jst);
        int i = AnonymousClass2.a[intent.ordinal()];
        if (i == 2 || i == 3) {
            return b(str, intent, jst, null);
        }
        if (i != 10) {
            StringBuilder sb = new StringBuilder("Unexpected Intent ");
            sb.append(intent);
            return wud.a((Throwable) new IllegalArgumentException(sb.toString()));
        }
        this.a.setShufflingContext(true);
        return b(str, intent, jst, null);
    }

    private void a(boolean z) {
        if (z) {
            this.a.resume();
        }
    }

    private int b(boolean z) {
        int streamMaxVolume = this.f.getStreamMaxVolume(3) / 5;
        int streamVolume = this.f.getStreamVolume(3);
        int i = z ? streamVolume + streamMaxVolume : streamVolume - streamMaxVolume;
        Logger.b("Adjusting volume with factor %s to %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(i));
        return i;
    }

    private wud<Boolean> b(String str, Intent intent, jst jst, PlayerContext playerContext) {
        wum wum = playerContext != null ? new $$Lambda$uks$5FfEJPb23TppUu7I59GEzUIR1aI(this, playerContext) : jsu.a(jst) ? new $$Lambda$uks$2CppVsH7qtvvdSrGEP_vCOA4fVQ(this, jst) : jsu.b(jst) ? new $$Lambda$wLCjOjNI_c1sC8FJBW1DRzY_4c(this) : null;
        return a(str, jst, wum, intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(PlayerContext playerContext) {
        Builder suppressions = new Builder().suppressions("mft/apply_restrictions/toggling_shuffle");
        Boolean bool = Boolean.FALSE;
        this.a.play(playerContext, suppressions.playerOptionsOverride(bool, bool, Boolean.FALSE).build());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(jst jst) {
        this.b.a(new String[]{jst.q()}, ViewUris.bV, false, true, -1, udt.aI, rju.B, null);
    }

    private wud<Boolean> a(String str, jst jst, wum wum, Intent intent) {
        wud wud;
        String str2 = (String) fay.a(jst.q());
        this.c.a(str, str2, this.d, intent);
        if (wum != null) {
            wud = wub.a(wum).b((wud<T>) ScalarSynchronousObservable.d(Boolean.TRUE));
        } else {
            Optional a2 = a(jst);
            if (a2.b()) {
                wud = ((gst) a2.c()).resolve().d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$uks$N2lcxo7AIMUoxs9tdl9OHvN4<Object,Object>(this));
            } else {
                Logger.e("Could not resolve uri: %s", str2);
                return wud.a((Throwable) new IllegalArgumentException(String.format(Locale.getDefault(), "No resolver for uri %s", new Object[]{str2})));
            }
        }
        return wud.a(vun.a(AndroidSchedulers.a()));
    }

    public final Optional<gst> a(jst jst) {
        String str = (String) fay.a(jst.q());
        if (LinkType.SHOW_SHOW == jst.b) {
            return Optional.b(new gsx(str, new rxi(this.g, str), this.h));
        }
        return this.e.a(str);
    }

    public final void a() {
        new ioo(this.g, "@").a(new Builder().build(), new PlayOrigin(udt.bg.toString(), "", ViewUris.bV.toString(), null), Collections.emptyMap());
    }

    /* access modifiers changed from: private */
    public wud<Boolean> a(final PlayerContext playerContext) {
        return wud.a((wun<Emitter<T>>) new wun<Emitter<Boolean>>() {
            public final /* synthetic */ void call(Object obj) {
                final Emitter emitter = (Emitter) obj;
                uks.this.a.play(playerContext, null, new ActionCallback() {
                    public final void onActionSuccess() {
                        emitter.onNext(Boolean.TRUE);
                        emitter.onCompleted();
                    }

                    public final void onActionForbidden(List<String> list) {
                        emitter.onNext(Boolean.FALSE);
                        emitter.onCompleted();
                    }
                });
            }
        }, BackpressureMode.BUFFER);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6, com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent r7, boolean r8) {
        /*
            r5 = this;
            com.spotify.mobile.android.cosmos.player.v2.Player r0 = r5.a
            com.spotify.mobile.android.cosmos.player.v2.PlayerState r0 = r0.getLastPlayerState()
            if (r0 == 0) goto L_0x0013
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = r0.track()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.uri()
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            int[] r1 = defpackage.uks.AnonymousClass2.a
            int r2 = r7.ordinal()
            r1 = r1[r2]
            r2 = 2
            if (r1 == r2) goto L_0x00b2
            r2 = 3
            if (r1 == r2) goto L_0x00ae
            r3 = 1
            r4 = 0
            switch(r1) {
                case 6: goto L_0x00b2;
                case 7: goto L_0x00a8;
                case 8: goto L_0x009a;
                case 9: goto L_0x008c;
                case 10: goto L_0x0083;
                case 11: goto L_0x007a;
                case 12: goto L_0x006c;
                case 13: goto L_0x005e;
                case 14: goto L_0x0055;
                case 15: goto L_0x0048;
                case 16: goto L_0x003b;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r7
            java.lang.String r7 = "Unable to process intent %s"
            java.lang.String r7 = java.lang.String.format(r8, r7, r0)
            r6.<init>(r7)
            throw r6
        L_0x003b:
            android.media.AudioManager r6 = r5.f
            int r7 = r5.b(r4)
            r6.setStreamVolume(r2, r7, r4)
            r5.a(r8)
            return
        L_0x0048:
            android.media.AudioManager r6 = r5.f
            int r7 = r5.b(r3)
            r6.setStreamVolume(r2, r7, r4)
            r5.a(r8)
            return
        L_0x0055:
            com.spotify.mobile.android.cosmos.player.v2.Player r6 = r5.a
            r6.setRepeatingTrack(r3)
            r5.a(r8)
            return
        L_0x005e:
            com.spotify.mobile.android.cosmos.player.v2.Player r6 = r5.a
            r6.setRepeatingContext(r4)
            com.spotify.mobile.android.cosmos.player.v2.Player r6 = r5.a
            r6.setRepeatingTrack(r4)
            r5.a(r8)
            return
        L_0x006c:
            com.spotify.mobile.android.cosmos.player.v2.Player r6 = r5.a
            r6.setRepeatingContext(r3)
            com.spotify.mobile.android.cosmos.player.v2.Player r6 = r5.a
            r6.setRepeatingTrack(r4)
            r5.a(r8)
            return
        L_0x007a:
            com.spotify.mobile.android.cosmos.player.v2.Player r6 = r5.a
            r6.setShufflingContext(r4)
            r5.a(r8)
            return
        L_0x0083:
            com.spotify.mobile.android.cosmos.player.v2.Player r6 = r5.a
            r6.setShufflingContext(r3)
            r5.a(r8)
            return
        L_0x008c:
            com.spotify.mobile.android.cosmos.player.v2.Player r1 = r5.a
            uks$a r2 = new uks$a
            r2.<init>(r6, r0, r7)
            r1.skipToPreviousTrackAndDisableSeeking(r2)
            r5.a(r8)
            return
        L_0x009a:
            com.spotify.mobile.android.cosmos.player.v2.Player r1 = r5.a
            uks$a r2 = new uks$a
            r2.<init>(r6, r0, r7)
            r1.skipToNextTrack(r2)
            r5.a(r8)
            return
        L_0x00a8:
            com.spotify.mobile.android.cosmos.player.v2.Player r6 = r5.a
            r6.pause()
            return
        L_0x00ae:
            r5.a(r8)
            return
        L_0x00b2:
            com.spotify.mobile.android.cosmos.player.v2.Player r6 = r5.a
            r6.resume()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uks.a(java.lang.String, com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent, boolean):void");
    }
}
