package defpackage;

import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$DLaIXId7uXSJX4CV4ZviE-edazo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DLaIXId7uXSJX4CV4ZviEedazo implements Function {
    private final /* synthetic */ Predicate f$0;

    public /* synthetic */ $$Lambda$DLaIXId7uXSJX4CV4ZviEedazo(Predicate predicate) {
        this.f$0 = predicate;
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f$0.test((qum) obj));
    }
}
