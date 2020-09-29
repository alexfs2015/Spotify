package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: sms reason: default package */
public final class sms {
    public static ObservableTransformer<sml, smm> a(smt smt, smv smv, smq smq, smr smr, smu smu, smp smp) {
        smv.getClass();
        smu.getClass();
        return klb.a().a(b.class, (Action) new $$Lambda$sms$x_Glr8613Sqdpy_5PGtPTN0sNHY(smp)).a(e.class, (Consumer<G>) new $$Lambda$sms$zgVhCHAZhlembEe_nWQ_V9jtq_M<G>(smt, smv, smq, smr)).a(g.class, (Action) new $$Lambda$Wvt_8hGIIOYQEj3CDwpwDAi3AHo(smv)).a(c.class, (Consumer<G>) new $$Lambda$sms$2Zd8HaYbpc3GBhptD3zTBV4yCmo<G>(smq)).a(d.class, (Consumer<G>) new $$Lambda$sms$9sobIJJBk5XC2HjfI4JAy8WH4o4<G>(smr)).a(f.class, (Action) new $$Lambda$0G4ifdRIszle9va1gGD4VvNnJM(smu)).a(a.class, (Consumer<G>) new $$Lambda$sms$KmTXFcibWqg8gWCgM_LtafLWT0<G>(smu, smp)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(smu smu, smp smp, a aVar) {
        smu.onUiHidden();
        smp.goToLogin(true);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(smt smt, smv smv, smq smq, smr smr, e eVar) {
        fpt fpt = eVar.a;
        SessionState sessionState = eVar.b;
        smt.startLoggedInSession(fpt, sessionState);
        smv.onUiVisible();
        smq.onFlagsChanged(fpt);
        smr.onSessionStateChanged(sessionState);
    }
}
