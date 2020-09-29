package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: tot reason: default package */
public final class tot implements a, tqw {
    private static final Pattern k = Pattern.compile(".*?play\\s", 2);
    public final wzi<Player> a;
    public tqo b;
    public tpl c;
    public tqr d;
    public tqj e;
    public Disposable f = Disposables.b();
    public boolean g;
    public PlayerContext h;
    public final RxResolver i;
    public DrivingVoiceState j = DrivingVoiceState.LISTENING;
    private final wca l;
    private final Scheduler m;
    private final trc n;
    private final tor o;

    /* renamed from: tot$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tot.AnonymousClass1.<clinit>():void");
        }
    }

    public tot(wzi<Player> wzi, wca wca, Scheduler scheduler, trc trc, tor tor, RxResolver rxResolver) {
        this.a = wzi;
        this.l = wca;
        this.m = scheduler;
        this.n = trc;
        this.o = tor;
        this.i = rxResolver;
    }

    public final void a() {
        if (this.o.a()) {
            this.j = DrivingVoiceState.LISTENING;
            ((Player) this.a.get()).pause();
            this.b.aR_();
            this.f.bd_();
            Flowable a2 = this.l.a().e(8, TimeUnit.SECONDS, this.m).a(this.m);
            trb a3 = this.n.a(this, 1);
            a2.b((xfl<? super T>) a3);
            this.f = a3;
            return;
        }
        tqr tqr = this.d;
        if (tqr != null) {
            tqr.c();
        }
    }

    public final void a(float f2) {
        tqj tqj = this.e;
        if (tqj != null) {
            tqj.a(f2);
        }
    }

    public final void a(tqx tqx) {
        ArrayList arrayList;
        f();
        this.j = DrivingVoiceState.SUCCESS;
        String str = tqx.b;
        String[] split = k.split(str);
        if (split.length > 1) {
            str = split[1];
        }
        String format = String.format("Play: %s", new Object[]{str});
        tqo tqo = this.b;
        List<a> list = tqx.a;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (a aVar : list) {
                arrayList.add(new a().a(aVar.a()).b(aVar.b()).d(aVar.d()).c(aVar.c()).a());
            }
        } else {
            arrayList = null;
        }
        tqo.a(arrayList, format);
        if (tqx.a()) {
            String d2 = ((a) tqx.a.get(0)).d();
            StringBuilder sb = new StringBuilder("context://");
            sb.append(d2);
            this.h = PlayerContext.createFromContextUrl(d2, sb.toString());
        }
    }

    public final void b() {
        f();
        this.j = DrivingVoiceState.ERROR;
        this.b.b();
    }

    public final void c() {
        this.c.a(false);
        this.j = DrivingVoiceState.ERROR;
        this.b.c();
    }

    public final void d() {
        a();
    }

    public void e() {
        if (this.g) {
            ((Player) this.a.get()).resume();
        }
    }

    public void f() {
        this.c.a(true);
    }
}
