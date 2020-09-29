package defpackage;

import io.reactivex.subjects.CompletableSubject;

/* renamed from: slt reason: default package */
public final class slt implements vua<CompletableSubject> {
    private static final slt a = new slt();

    public static slt a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (CompletableSubject) vuf.a(CompletableSubject.f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
