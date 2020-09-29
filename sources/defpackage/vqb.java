package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: vqb reason: default package */
public final class vqb implements wig<FirebaseInstanceId> {
    private static final vqb a = new vqb();

    public static vqb a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (FirebaseInstanceId) wil.a(FirebaseInstanceId.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
