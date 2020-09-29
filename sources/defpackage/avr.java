package defpackage;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* renamed from: avr reason: default package */
public interface avr {

    /* renamed from: avr$a */
    public static final class a {
        public final String a;
        public final byte[] b;
        private int c;

        public a(String str, int i, byte[] bArr) {
            this.a = str;
            this.c = i;
            this.b = bArr;
        }
    }

    /* renamed from: avr$b */
    public static final class b {
        public final int a;
        public final String b;
        public final List<a> c;
        public final byte[] d;

        public b(int i, String str, List<a> list, byte[] bArr) {
            List<a> list2;
            this.a = i;
            this.b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.c = list2;
            this.d = bArr;
        }
    }

    /* renamed from: avr$c */
    public interface c {
        SparseArray<avr> a();

        avr a(int i, b bVar);
    }

    /* renamed from: avr$d */
    public static final class d {
        private final String a;
        private final int b;
        private final int c;
        private int d;
        private String e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("/");
                str = sb.toString();
            } else {
                str = "";
            }
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
        }

        public final void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(this.d);
            this.e = sb.toString();
        }

        public final int b() {
            d();
            return this.d;
        }

        public final String c() {
            d();
            return this.e;
        }

        private void d() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    void a();

    void a(bdj bdj, boolean z);

    void a(bdt bdt, asv asv, d dVar);
}
