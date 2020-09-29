package defpackage;

import android.content.Intent;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$jvr$AAIyNkTBxzCFSfjUB4AsFIm0V1Y reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jvr$AAIyNkTBxzCFSfjUB4AsFIm0V1Y implements Predicate {
    public static final /* synthetic */ $$Lambda$jvr$AAIyNkTBxzCFSfjUB4AsFIm0V1Y INSTANCE = new $$Lambda$jvr$AAIyNkTBxzCFSfjUB4AsFIm0V1Y();

    private /* synthetic */ $$Lambda$jvr$AAIyNkTBxzCFSfjUB4AsFIm0V1Y() {
    }

    public final boolean test(Object obj) {
        return "android.net.conn.CONNECTIVITY_CHANGE".equals(((Intent) obj).getAction());
    }
}
