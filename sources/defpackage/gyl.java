package defpackage;

import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: gyl reason: default package */
public final class gyl implements a {
    private final Flowable<PlayerState> a;
    private final Scheduler b;
    private final Set<gus> c = new HashSet();
    private Disposable d = Disposables.b();
    private PlayerState e;

    /* renamed from: gyl$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.util.LinkType[] r0 = com.spotify.mobile.android.util.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.TRACK     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gyl.AnonymousClass1.<clinit>():void");
        }
    }

    public gyl(Flowable<PlayerState> flowable, Scheduler scheduler) {
        this.a = flowable;
        this.b = scheduler;
    }

    @Deprecated
    public final boolean a(gzt gzt) {
        String str;
        PlayerState playerState = this.e;
        gzy target = gzt.target();
        if (target != null) {
            str = target.uri();
        } else {
            gzp gzp = (gzp) gzt.events().get("click");
            str = gzp != null ? gzp.data().string("uri") : null;
        }
        if (playerState == null || str == null) {
            return false;
        }
        int i = AnonymousClass1.a[jst.a(str).b.ordinal()];
        if (i == 1 || i == 2) {
            return TextUtils.equals(str, a(playerState));
        }
        return TextUtils.equals(b(playerState), str);
    }

    @Deprecated
    public final void a() {
        if (this.d.b()) {
            this.d = this.a.a((Function<? super T, K>) $$Lambda$gyl$8C1_6TwOpZ6JDot7ajYapG1LWL0.INSTANCE).a(this.b).c((Consumer<? super T>) new $$Lambda$gyl$Vq5UK9pGiJgZqGpDddVKC6cqAS4<Object>(this));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String d(PlayerState playerState) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(playerState));
        sb.append(b(playerState));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(PlayerState playerState) {
        this.e = playerState;
        for (gus a2 : this.c) {
            a2.a();
        }
    }

    private static String a(PlayerState playerState) {
        if (playerState != null) {
            PlayerTrack track = playerState.track();
            if (track != null) {
                return track.uri();
            }
        }
        return null;
    }

    private static String b(PlayerState playerState) {
        if (playerState != null) {
            return playerState.contextUri();
        }
        return null;
    }

    @Deprecated
    public final void a(gus gus) {
        this.c.add(fay.a(gus));
    }

    @Deprecated
    private void b(gus gus) {
        this.c.remove(fay.a(gus));
    }

    @Deprecated
    public final void b() {
        this.d.bf_();
    }

    @Deprecated
    public final void a(gup gup) {
        a(gup.a);
        a(gup.c);
        a(gup.b);
    }

    @Deprecated
    public final void b(gup gup) {
        b(gup.a);
        b(gup.c);
        b(gup.b);
    }
}
