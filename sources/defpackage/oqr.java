package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: oqr reason: default package */
public final class oqr implements oqq {
    private final CompositeDisposable a = new CompositeDisposable();
    private final tcn b;
    private final ose c;
    private final oqu d;
    private final orf e;

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    public oqr(tcn tcn, ose ose, oqu oqu, orf orf) {
        this.b = tcn;
        this.c = ose;
        this.d = oqu;
        this.e = orf;
    }

    public final void a() {
        this.a.c();
    }

    public final void a(List<uzb> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, gbr<Integer> gbr) {
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
                uzb uzb = (uzb) list.get(i2);
                if (uzb.getUri().equals(str)) {
                    gbr.accept(Integer.valueOf(i2));
                    String d2 = uzb.d();
                    LinkType linkType = jst.a(str).b;
                    boolean z7 = linkType == LinkType.SHOW_EPISODE;
                    boolean z8 = linkType == LinkType.TRACK && z2;
                    boolean z9 = z7 && z3;
                    if (z8 || z9) {
                        this.d.a(str, i2);
                        this.a.a(this.e.b(d2).a((Action) $$Lambda$oqr$FPZAxgCA6cGR7GhIu9wuVJPsnU.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oqr$LoC6GLGDW4ax7PAgx42i3Jj5vC4.INSTANCE));
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
            this.a.a(this.e.b().a((Action) $$Lambda$oqr$CdkANynYKIzXUGqwULGEt4R1dlQ.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oqr$UGGoFHwd0bA6O4x9oPggGBPQ2Y.INSTANCE));
            this.c.a(false);
        }
    }
}
