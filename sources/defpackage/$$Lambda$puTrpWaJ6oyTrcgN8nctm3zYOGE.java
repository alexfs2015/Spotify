package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$puTrpWaJ6oyTrcgN8nctm3zYOGE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$puTrpWaJ6oyTrcgN8nctm3zYOGE implements Predicate {
    public static final /* synthetic */ $$Lambda$puTrpWaJ6oyTrcgN8nctm3zYOGE INSTANCE = new $$Lambda$puTrpWaJ6oyTrcgN8nctm3zYOGE();

    private /* synthetic */ $$Lambda$puTrpWaJ6oyTrcgN8nctm3zYOGE() {
    }

    public final boolean test(Object obj) {
        return ((SessionState) obj).loggedIn();
    }
}
