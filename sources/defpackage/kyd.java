package defpackage;

import rx.subjects.PublishSubject;

/* renamed from: kyd reason: default package */
public final class kyd implements wig<PublishSubject<String>> {
    private static final kyd a = new kyd();

    public static kyd a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (PublishSubject) wil.a(PublishSubject.e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
