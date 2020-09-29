package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ffr reason: default package */
public interface ffr {
    <T> void a(Class<T> cls, ffp<? super T> ffp);

    <T> void a(Class<T> cls, Executor executor, ffp<? super T> ffp);
}
