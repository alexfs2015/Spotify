package defpackage;

import io.reactivex.functions.Predicate;
import java.util.Map;

/* renamed from: -$$Lambda$qpi$Z-zByKIb-R9o1odv8Y1cMkhXsJ0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qpi$ZzByKIbR9o1odv8Y1cMkhXsJ0 implements Predicate {
    public static final /* synthetic */ $$Lambda$qpi$ZzByKIbR9o1odv8Y1cMkhXsJ0 INSTANCE = new $$Lambda$qpi$ZzByKIbR9o1odv8Y1cMkhXsJ0();

    private /* synthetic */ $$Lambda$qpi$ZzByKIbR9o1odv8Y1cMkhXsJ0() {
    }

    public final boolean test(Object obj) {
        return ((Map) obj).containsKey("nl.request_id");
    }
}
