package defpackage;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: md reason: default package */
public abstract class md {

    /* renamed from: md$a */
    public interface a<D> {
        mg<D> a();

        void a(mg<D> mgVar, D d);
    }

    public static <T extends lm & mc> md a(T t) {
        return new me(t, ((mc) t).aq_());
    }

    public abstract <D> mg<D> a(int i, Bundle bundle, a<D> aVar);

    public abstract void a();

    public abstract void a(int i);

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
