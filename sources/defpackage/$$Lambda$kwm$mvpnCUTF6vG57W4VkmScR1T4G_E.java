package defpackage;

import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$kwm$mvpnCUTF6vG57W4VkmScR1T4G_E reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kwm$mvpnCUTF6vG57W4VkmScR1T4G_E implements Predicate {
    private final /* synthetic */ kws f$0;

    public /* synthetic */ $$Lambda$kwm$mvpnCUTF6vG57W4VkmScR1T4G_E(kws kws) {
        this.f$0 = kws;
    }

    public final boolean test(Object obj) {
        return ((kws) obj).h().containsAll(this.f$0.h());
    }
}
