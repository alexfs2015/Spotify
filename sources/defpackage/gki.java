package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;

/* renamed from: gki reason: default package */
public final class gki {
    public final CompositeDisposable a = new CompositeDisposable();
    public gkk b;
    public String c;
    private final gkn d;
    private final Scheduler e;

    gki(gkn gkn, Scheduler scheduler) {
        this.d = gkn;
        this.e = scheduler;
    }

    public final void a(gkk gkk, String str, List<gkq> list) {
        Single single;
        this.b = gkk;
        this.c = str;
        if (list == null || list.isEmpty()) {
            single = this.d.b();
        } else {
            single = Single.b(list);
        }
        this.a.a(single.a(this.e).a((Consumer<? super T>) new $$Lambda$gki$9bgZ4PSgjTI_U2tB1gpi611vWRM<Object>(this), (Consumer<? super Throwable>) new $$Lambda$gki$j_ukTrG0ROMmVbTyMRnjFfWWYXQ<Object>(this)));
    }

    public final void a() {
        gkk gkk = this.b;
        if (gkk != null) {
            gkk.a(0, null);
        }
    }

    public final void a(gkq gkq) {
        gkk gkk = this.b;
        if (gkk != null) {
            gkk.a(-1, gkq);
        }
    }

    /* access modifiers changed from: private */
    public void a(List<gkq> list) {
        int i;
        gkk gkk = this.b;
        if (gkk != null) {
            gkk.a(list);
            String str = this.c;
            if (str != null) {
                i = 0;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((gkq) it.next()).a().equals(str)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i = -1;
            if (i >= 0) {
                this.b.a(i);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Assertion.a("Failed to deserialize calling codes. This shouldn't happen.", th);
        a();
    }
}
