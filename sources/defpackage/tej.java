package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: tej reason: default package */
public final class tej implements a, tge {
    private static final Pattern j = Pattern.compile(".*?play\\s", 2);
    public final Player a;
    public tfx b;
    public tfb c;
    public tgb d;
    public tfs e;
    public Disposable f = Disposables.b();
    public PlayerContext g;
    public final RxResolver h;
    public DrivingVoiceState i = DrivingVoiceState.LISTENING;
    private final vos k;
    private final Scheduler l;
    private final tgk m;
    private boolean n;
    private final teh o;

    /* renamed from: tej$1 reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[DrivingVoiceState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState[] r0 = com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState r1 = com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState r1 = com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tej.AnonymousClass1.<clinit>():void");
        }
    }

    public tej(Player player, vos vos, Scheduler scheduler, tgk tgk, teh teh, RxResolver rxResolver) {
        this.a = player;
        this.k = vos;
        this.l = scheduler;
        this.m = tgk;
        this.o = teh;
        this.h = rxResolver;
    }

    public final void a() {
        if (this.o.a()) {
            this.i = DrivingVoiceState.LISTENING;
            this.c.a(true);
            PlayerState lastPlayerState = this.a.getLastPlayerState();
            this.n = lastPlayerState != null && !lastPlayerState.isPaused();
            this.a.pause();
            this.b.aT_();
            this.f.bf_();
            Flowable a2 = this.k.a().e(8, TimeUnit.SECONDS, this.l).a(this.l);
            tgj a3 = this.m.a(this, 1);
            a2.b((wrg<? super T>) a3);
            this.f = a3;
            return;
        }
        tgb tgb = this.d;
        if (tgb != null) {
            tgb.af();
        }
    }

    public final void a(tgf tgf) {
        ArrayList arrayList;
        this.i = DrivingVoiceState.SUCCESS;
        e();
        String str = tgf.b;
        String[] split = j.split(str);
        if (split.length > 1) {
            str = split[1];
        }
        String format = String.format("Play: %s", new Object[]{str});
        tfx tfx = this.b;
        List<a> list = tgf.a;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (a aVar : list) {
                arrayList.add(new a().a(aVar.a()).b(aVar.b()).d(aVar.d()).c(aVar.c()).a());
            }
        } else {
            arrayList = null;
        }
        tfx.a(arrayList, format);
        if (tgf.a()) {
            String d2 = ((a) tgf.a.get(0)).d();
            StringBuilder sb = new StringBuilder("context://");
            sb.append(d2);
            this.g = PlayerContext.createFromContextUrl(d2, sb.toString());
        }
    }

    public final void b() {
        this.i = DrivingVoiceState.ERROR;
        e();
        this.b.b();
    }

    public final void a(float f2) {
        tfs tfs = this.e;
        if (tfs != null) {
            tfs.a(f2);
        }
    }

    public final void c() {
        a();
    }

    public void d() {
        if (this.n) {
            this.a.resume();
        }
    }

    private void e() {
        this.c.a(false);
    }
}
