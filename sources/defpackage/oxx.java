package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: oxx reason: default package */
public final class oxx implements oxw {
    private final CompositeDisposable a = new CompositeDisposable();
    private final tmu b;
    private final ozk c;
    private final oya d;
    private final oyl e;

    public oxx(tmu tmu, ozk ozk, oya oya, oyl oyl) {
        this.b = tmu;
        this.c = ozk;
        this.d = oya;
        this.e = oyl;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    public final void a() {
        this.a.c();
    }

    public final void a(List<vle> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, gcp<Integer> gcp) {
        if (!this.c.c() || !z || list.isEmpty()) {
            if (!z) {
                this.c.a(false);
            }
            return;
        }
        Optional ah = this.c.ah();
        boolean z6 = true;
        if (ah.b()) {
            String str = (String) ah.c();
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                vle vle = (vle) list.get(i2);
                if (vle.getUri().equals(str)) {
                    gcp.accept(Integer.valueOf(i2));
                    String d2 = vle.d();
                    LinkType linkType = jva.a(str).b;
                    boolean z7 = linkType == LinkType.SHOW_EPISODE;
                    boolean z8 = linkType == LinkType.TRACK && z2;
                    boolean z9 = z7 && z3;
                    if (z8 || z9) {
                        this.d.a(str, i2);
                        this.a.a(this.e.b(d2).a((Action) $$Lambda$oxx$eSulF2FPPEmofosWqPDK92gbPzE.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oxx$k8EaUTullLVM9KeqK2jpFfZctI.INSTANCE));
                        if ((z7 && z5) || (!z7 && z4)) {
                            this.b.a();
                        }
                    }
                    this.c.a(true);
                } else {
                    i2++;
                }
            }
        }
        z6 = false;
        if (!z6 || !ah.b()) {
            this.d.a();
            this.a.a(this.e.b().a((Action) $$Lambda$oxx$_Y8eJGkGug2ueiCa3vXxjI0uQ4.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oxx$FD8y5plsNv0xKoro6x9pv2KNdzU.INSTANCE));
            this.c.a(false);
        }
    }
}
