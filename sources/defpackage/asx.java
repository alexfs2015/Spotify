package defpackage;

import defpackage.asw;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: asx reason: default package */
public interface asx<T extends asw> {

    /* renamed from: asx$a */
    public static final class a {
        public final byte[] a;
        private final String b;

        public a(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }
    }

    /* renamed from: asx$b */
    public interface b<T extends asw> {
        void a(byte[] bArr, int i);
    }

    /* renamed from: asx$c */
    public static final class c {
        public final byte[] a;
        public final String b;

        public c(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }
    }

    a a(byte[] bArr, List<defpackage.ast.a> list, int i, HashMap<String, String> hashMap);

    String a(String str);

    void a(b<? super T> bVar);

    void a(String str, String str2);

    void a(byte[] bArr);

    byte[] a();

    byte[] a(byte[] bArr, byte[] bArr2);

    c b();

    void b(byte[] bArr);

    void b(byte[] bArr, byte[] bArr2);

    Map<String, String> c(byte[] bArr);

    T d(byte[] bArr);
}
