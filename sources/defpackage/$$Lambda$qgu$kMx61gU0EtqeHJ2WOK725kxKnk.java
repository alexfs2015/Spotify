package defpackage;

import io.reactivex.functions.Predicate;
import java.util.Map;

/* renamed from: -$$Lambda$qgu$kMx61gU0EtqeHJ2WOK72-5kxKnk reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qgu$kMx61gU0EtqeHJ2WOK725kxKnk implements Predicate {
    public static final /* synthetic */ $$Lambda$qgu$kMx61gU0EtqeHJ2WOK725kxKnk INSTANCE = new $$Lambda$qgu$kMx61gU0EtqeHJ2WOK725kxKnk();

    private /* synthetic */ $$Lambda$qgu$kMx61gU0EtqeHJ2WOK725kxKnk() {
    }

    public final boolean test(Object obj) {
        return ((Map) obj).containsKey("nl.request_id");
    }
}
