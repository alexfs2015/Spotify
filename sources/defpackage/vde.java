package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: vde reason: default package */
public final class vde implements vua<FirebaseInstanceId> {
    private static final vde a = new vde();

    public static vde a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (FirebaseInstanceId) vuf.a(FirebaseInstanceId.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
