package defpackage;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: uxq reason: default package */
public final class uxq {
    uxr a;
    final xok b = new xok();
    final rly c;
    final Intent d;
    final a e;
    final sxw f;
    final fqn g;
    final Bundle h;
    final uwo i;
    final uwe j;
    final uyd k;
    private final Player l;
    private final Flowable<PlayerState> m;
    private final uvv n;
    private final uwu o;
    private final xil p;
    private final xil q;
    private String r;

    /* renamed from: uxq$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Intent.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0086 */
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
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.RESUME     // Catch:{ NoSuchFieldError -> 0x0014 }
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
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.SHUFFLE_OFF     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.SHUFFLE_ON     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.STOP     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.NEXT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.PREVIOUS     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.REPEAT_ON     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.REPEAT_OFF     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.REPEAT_ONE     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.VOLUME_UP     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.VOLUME_DOWN     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.uxq.AnonymousClass1.<clinit>():void");
        }
    }

    public uxq(Player player, rly rly, Bundle bundle, fqn fqn, sxw sxw, uwo uwo, Flowable<PlayerState> flowable, uvv uvv, uwe uwe, xil xil, xil xil2, uwu uwu, uyd uyd) {
        this.l = player;
        this.c = rly;
        this.d = (Intent) fbp.a((Intent) bundle.getSerializable("voice_nlu_intent"));
        this.e = (a) bundle.getParcelable("voice_nlu_result");
        this.f = sxw;
        this.g = fqn;
        this.h = bundle;
        this.i = uwo;
        this.m = flowable;
        this.n = uvv;
        this.p = xil;
        this.q = xil2;
        this.j = uwe;
        this.o = uwu;
        this.k = uyd;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer a(Iterator it, Long l2) {
        return (Integer) it.next();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        this.a.a(this.n.a(playerState), this.n.b(playerState));
        PlayerTrack track = playerState.track();
        if (track != null) {
            if (PlayerTrackUtil.isAd(track)) {
                this.f.a();
                return;
            }
            Map metadata = track.metadata();
            String str = (String) metadata.get("artist_name");
            String str2 = (String) metadata.get("title");
            String str3 = (String) metadata.get("image_large_url");
            this.a.b(str, str2);
            if (!fbo.a(str3) && !str3.equals(this.r)) {
                this.r = str3;
                this.a.b(this.r);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        this.a.d(num.intValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (str != null) {
            this.a.c(str);
            return;
        }
        Logger.e("No suggestion found.", new Object[0]);
        d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(PlayerState playerState) {
        InteractionIntent interactionIntent;
        if (playerState.isPaused()) {
            interactionIntent = InteractionIntent.PLAY;
            this.l.resume();
            this.a.a(SpotifyIconV2.PLAY, R.string.voice_confirmation_play_content_description, false);
        } else {
            interactionIntent = InteractionIntent.PAUSE;
            this.l.pause();
            this.a.a(SpotifyIconV2.PAUSE, R.string.voice_confirmation_pause_content_description, false);
        }
        this.i.a(this.k.a, ViewUris.bV.toString(), ViewUris.bU.toString(), null, 0, interactionIntent, InteractionType.TAP);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        Logger.e("Error received: %s", th.getMessage());
        d();
    }

    private void d() {
        this.b.a(xii.a(0, 30, TimeUnit.SECONDS, this.p).e((xiy<? super T, ? extends R>) new $$Lambda$uxq$tOzjmY5VaW2u55Etw25EGKQHhc<Object,Object>(ImmutableList.a(Integer.valueOf(R.string.voice_vav_rotating_suggestion_1), Integer.valueOf(R.string.voice_vav_rotating_suggestion_2), Integer.valueOf(R.string.voice_vav_rotating_suggestion_3), Integer.valueOf(R.string.voice_vav_rotating_suggestion_4)).iterator())).a(this.q).a((xis<? super T>) new $$Lambda$uxq$lFVa5XWPN5v7wceLoyWTSC_UQFY<Object>(this), (xis<Throwable>) $$Lambda$uxq$VBkQcazpejbjuJFHJ8aPqvA2l18.INSTANCE));
    }

    public final void a() {
        this.b.a(wit.a((xfk<T>) this.m).c().a((xis<? super T>) new $$Lambda$uxq$tOBtXJsB28Wsf_fjHNxoRmwT8<Object>(this), (xis<Throwable>) $$Lambda$uxq$8FR3nQMomMOnNCKdV22_QWeJHNA.INSTANCE));
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.b.a(this.o.a().a(wit.a(AndroidSchedulers.a())).a((xis<? super T>) new $$Lambda$uxq$SlCJB_L5zT6H61XlIU38J_SC7Y<Object>(this), (xis<Throwable>) new $$Lambda$uxq$ibpjUL1uFCwuWYetR8YppVfNp3U<Throwable>(this)));
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.b.a(wit.a((xfk<T>) this.m).b(this.p).a(this.q).a((xis<? super T>) new $$Lambda$uxq$iUs3SFhILcaeLQtuuEX2rAPNvFo<Object>(this), (xis<Throwable>) $$Lambda$uxq$OtExlhLNAUA3B0U6rTg_Ucvgk.INSTANCE));
    }
}
