package defpackage;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nt reason: default package */
public final class nt {
    public final b a;
    public final a b = new a();
    public final List<View> c = new ArrayList();

    /* renamed from: nt$a */
    public static class a {
        private long a = 0;
        private a b;

        a() {
        }

        public final void a(int i) {
            if (i >= 64) {
                b();
                this.b.a(i - 64);
                return;
            }
            this.a |= 1 << i;
        }

        private void b() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public final void b(int i) {
            if (i >= 64) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.b(i - 64);
                }
            } else {
                this.a &= (1 << i) ^ -1;
            }
        }

        public final boolean c(int i) {
            a aVar = this;
            while (i >= 64) {
                aVar.b();
                aVar = aVar.b;
                i -= 64;
            }
            return (aVar.a & (1 << i)) != 0;
        }

        public final void a() {
            a aVar = this;
            do {
                aVar.a = 0;
                aVar = aVar.b;
            } while (aVar != null);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, boolean z) {
            boolean z2 = z;
            a aVar = this;
            while (i < 64) {
                boolean z3 = (aVar.a & Long.MIN_VALUE) != 0;
                long j = (1 << i) - 1;
                long j2 = aVar.a;
                aVar.a = ((j2 & (j ^ -1)) << 1) | (j2 & j);
                if (z2) {
                    aVar.a(i);
                } else {
                    aVar.b(i);
                }
                if (z3 || aVar.b != null) {
                    aVar.b();
                    aVar = aVar.b;
                    z2 = z3;
                    i = 0;
                } else {
                    return;
                }
            }
            aVar.b();
            aVar.b.a(i - 64, z2);
        }

        public final boolean d(int i) {
            a aVar = this;
            while (i >= 64) {
                aVar.b();
                aVar = aVar.b;
                i -= 64;
            }
            long j = 1 << i;
            boolean z = (aVar.a & j) != 0;
            aVar.a &= j ^ -1;
            long j2 = j - 1;
            long j3 = aVar.a;
            aVar.a = Long.rotateRight(j3 & (j2 ^ -1), 1) | (j3 & j2);
            a aVar2 = aVar.b;
            if (aVar2 != null) {
                if (aVar2.c(0)) {
                    aVar.a(63);
                }
                aVar.b.d(0);
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        public final int e(int i) {
            a aVar = this.b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(this.a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.a & ((1 << i) - 1));
            } else {
                return aVar.e(i - 64) + Long.bitCount(this.a);
            }
        }

        public final String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.a));
            return sb.toString();
        }
    }

    /* renamed from: nt$b */
    public interface b {
        int a();

        int a(View view);

        void a(int i);

        void a(View view, int i);

        void a(View view, int i, LayoutParams layoutParams);

        View b(int i);

        u b(View view);

        void b();

        void c(int i);

        void c(View view);

        void d(View view);
    }

    public nt(b bVar) {
        this.a = bVar;
    }

    public void a(View view) {
        this.c.add(view);
        this.a.c(view);
    }

    public boolean b(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.d(view);
        return true;
    }

    public final void a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.a.a();
        } else {
            i2 = e(i);
        }
        this.b.a(i2, z);
        if (z) {
            a(view);
        }
        this.a.a(view, i2);
    }

    private int e(int i) {
        if (i < 0) {
            return -1;
        }
        int a2 = this.a.a();
        int i2 = i;
        while (i2 < a2) {
            int e = i - (i2 - this.b.e(i2));
            if (e == 0) {
                while (this.b.c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    public final void a(int i) {
        int e = e(i);
        View b2 = this.a.b(e);
        if (b2 != null) {
            if (this.b.d(e)) {
                b(b2);
            }
            this.a.a(e);
        }
    }

    public final View b(int i) {
        return this.a.b(e(i));
    }

    public final void a(View view, int i, LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.a.a();
        } else {
            i2 = e(i);
        }
        this.b.a(i2, z);
        if (z) {
            a(view);
        }
        this.a.a(view, i2, layoutParams);
    }

    public final int a() {
        return this.a.a() - this.c.size();
    }

    public final int b() {
        return this.a.a();
    }

    public final View c(int i) {
        return this.a.b(i);
    }

    public final void d(int i) {
        int e = e(i);
        this.b.d(e);
        this.a.c(e);
    }

    public final int c(View view) {
        int a2 = this.a.a(view);
        if (a2 != -1 && !this.b.c(a2)) {
            return a2 - this.b.e(a2);
        }
        return -1;
    }

    public final boolean d(View view) {
        return this.c.contains(view);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.toString());
        sb.append(", hidden list:");
        sb.append(this.c.size());
        return sb.toString();
    }
}
