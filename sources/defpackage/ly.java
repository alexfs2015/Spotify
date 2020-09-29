package defpackage;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: ly reason: default package */
public abstract class ly {

    /* renamed from: ly$a */
    public interface a<D> {
        mb<D> a();

        void a(mb<D> mbVar, D d);
    }

    public abstract <D> mb<D> a(int i, Bundle bundle, a<D> aVar);

    public abstract void a();

    public abstract void a(int i);

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public static <T extends lh & lx> ly a(T t) {
        return new lz(t, ((lx) t).ar_());
    }
}
