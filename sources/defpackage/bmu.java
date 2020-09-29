package defpackage;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: bmu reason: default package */
public final /* synthetic */ class bmu implements Comparator {
    public static final Comparator a = new bmu();

    private bmu() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).a.compareTo(((Scope) obj2).a);
    }
}
