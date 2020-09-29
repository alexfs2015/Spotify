package defpackage;

import rx.subjects.PublishSubject;

/* renamed from: kuu reason: default package */
public final class kuu implements vua<PublishSubject<String>> {
    private static final kuu a = new kuu();

    public static kuu a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (PublishSubject) vuf.a(PublishSubject.e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
