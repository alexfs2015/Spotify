package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;

/* renamed from: fli reason: default package */
public interface fli extends flj {

    /* renamed from: fli$a */
    public interface a extends flj, Cloneable {
        a a(fli fli);

        a b(fkw fkw, fky fky);

        fli e();

        fli g();
    }

    ByteString a();

    void a(CodedOutputStream codedOutputStream);

    byte[] b();

    fll<? extends fli> c();

    a h();

    int j();
}
