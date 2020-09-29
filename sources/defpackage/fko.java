package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;

/* renamed from: fko reason: default package */
public interface fko extends fkp {

    /* renamed from: fko$a */
    public interface a extends fkp, Cloneable {
        a a(fko fko);

        a b(fkc fkc, fke fke);

        fko e();

        fko g();
    }

    ByteString a();

    void a(CodedOutputStream codedOutputStream);

    byte[] b();

    a h();

    int j();
}
