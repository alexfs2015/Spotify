package defpackage;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: bnl reason: default package */
public final /* synthetic */ class bnl implements Comparator {
    public static final Comparator a = new bnl();

    private bnl() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).a.compareTo(((Scope) obj2).a);
    }
}
