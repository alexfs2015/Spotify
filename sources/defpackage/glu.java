package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;

/* renamed from: glu reason: default package */
public final class glu {
    public final CompositeDisposable a = new CompositeDisposable();
    public glw b;
    public String c;
    private final glz d;
    private final Scheduler e;

    glu(glz glz, Scheduler scheduler) {
        this.d = glz;
        this.e = scheduler;
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Assertion.a("Failed to deserialize calling codes. This shouldn't happen.", th);
        a();
    }

    /* access modifiers changed from: private */
    public void a(List<gmc> list) {
        int i;
        glw glw = this.b;
        if (glw != null) {
            glw.a(list);
            String str = this.c;
            if (str != null) {
                i = 0;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((gmc) it.next()).a().equals(str)) {
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

    public final void a() {
        glw glw = this.b;
        if (glw != null) {
            glw.a(0, null);
        }
    }

    public final void a(glw glw, String str, List<gmc> list) {
        this.b = glw;
        this.c = str;
        this.a.a(((list == null || list.isEmpty()) ? this.d.b() : Single.b(list)).a(this.e).a((Consumer<? super T>) new $$Lambda$glu$WyDlsW36Jn1tY_ZuT8elDrCgMhE<Object>(this), (Consumer<? super Throwable>) new $$Lambda$glu$hdwycmSfsxo6SfiQrZAEMVTWwpc<Object>(this)));
    }

    public final void a(gmc gmc) {
        glw glw = this.b;
        if (glw != null) {
            glw.a(-1, gmc);
        }
    }
}
