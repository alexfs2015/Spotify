package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fgl reason: default package */
public interface fgl {
    <T> void a(Class<T> cls, fgj<? super T> fgj);

    <T> void a(Class<T> cls, Executor executor, fgj<? super T> fgj);
}
