package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: rmh reason: default package */
public final class rmh {
    String a;
    a b;
    private final jrs c;
    private final rlp d;
    private final hvl e;
    private String f;
    private final rli g;
    private boolean h;
    private Disposable i = Disposables.b();

    /* renamed from: rmh$a */
    interface a {
        void a();
    }

    public rmh(jrs jrs, rlp rlp, hvl hvl, rli rli, boolean z) {
        this.c = jrs;
        this.d = rlp;
        this.e = hvl;
        this.g = rli;
        this.h = z;
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
            this.d.a(str, new $$Lambda$rmh$jL6mgRtTYQKQdScN9IT0xpbxo4(this));
        }
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

    public final void b() {
        c();
        this.i = this.e.a.a((Predicate<? super T>) $$Lambda$rmh$S_ftkI_5SwoloMO3mqJM1enuz4.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$DtEvfn0Icv19eGJW_fHdFkt5y4.INSTANCE).a(Functions.a()).c((Consumer<? super T>) new $$Lambda$I8LiAb6vfv0SvnZjSoMxRc0o_cs<Object>(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(SessionState sessionState) {
        return sessionState.loggedIn() && !sessionState.loggingOut();
    }

    public final void c() {
        this.i.bf_();
    }
}
