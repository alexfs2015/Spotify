package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: rvn reason: default package */
public final class rvn {
    String a;
    a b;
    private final juc c;
    private final ruv d;
    private final hxx e;
    private String f;
    private final ruo g;
    private boolean h;
    private Disposable i = Disposables.b();

    /* renamed from: rvn$a */
    interface a {
        void a();
    }

    public rvn(juc juc, ruv ruv, hxx hxx, ruo ruo, boolean z) {
        this.c = juc;
        this.d = ruv;
        this.e = hxx;
        this.g = ruo;
        this.h = z;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(SessionState sessionState) {
        return sessionState.loggedIn() && !sessionState.loggingOut();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        Logger.c("Partner ID \"%s\" retrieved for Crashlytics", str);
        this.a = str;
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final String a() {
        if (this.h) {
            String str = this.f;
            if (str != null) {
                return str;
            }
        }
        try {
            return this.a == null ? this.c.b() : this.a;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("Error getting installation ID, ");
            sb.append(e2.getMessage());
            return sb.toString();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str) {
        this.f = str;
        if (str != null && this.g.a) {
            this.d.a(str, new $$Lambda$rvn$2Yf6r3FcaujeN3agU_rptZAlo5c(this));
        }
    }

    public final void b() {
        c();
        this.i = this.e.a.a((Predicate<? super T>) $$Lambda$rvn$mBOrprDSDq24wI1gTfCBZco4hYo.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$DtEvfn0Icv19eGJW_fHdFkt5y4.INSTANCE).a(Functions.a()).c((Consumer<? super T>) new $$Lambda$ER_QEVlQqIs56Ha35J__7wLh1s<Object>(this));
    }

    public final void c() {
        this.i.bd_();
    }
}
