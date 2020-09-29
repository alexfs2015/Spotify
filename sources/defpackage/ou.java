package defpackage;

import android.view.View;
import com.comscore.streaming.ContentType;

/* renamed from: ou reason: default package */
public final class ou {
    private b a;
    private a b = new a();

    /* renamed from: ou$a */
    static class a {
        int a = 0;
        private int b;
        private int c;
        private int d;
        private int e;

        a() {
        }

        private static int a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i) {
            this.a = i | this.a;
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, int i2, int i3, int i4) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        /* access modifiers changed from: 0000 */
        public final boolean a() {
            int i = this.a;
            if ((i & 7) != 0 && (i & a(this.d, this.b)) == 0) {
                return false;
            }
            int i2 = this.a;
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) != 0 && (i2 & (a(this.d, this.c) << 4)) == 0) {
                return false;
            }
            int i3 = this.a;
            if ((i3 & 1792) != 0 && (i3 & (a(this.e, this.b) << 8)) == 0) {
                return false;
            }
            int i4 = this.a;
            return (i4 & 28672) == 0 || (i4 & (a(this.e, this.c) << 12)) != 0;
        }
    }

    /* renamed from: ou$b */
    public interface b {
        int a();

        int a(View view);

        View a(int i);

        int b();

        int b(View view);
    }

    public ou(b bVar) {
        this.a = bVar;
    }

    public final View a(int i, int i2, int i3, int i4) {
        int a2 = this.a.a();
        int b2 = this.a.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a3 = this.a.a(i);
            this.b.a(a2, b2, this.a.a(a3), this.a.b(a3));
            if (i3 != 0) {
                a aVar = this.b;
                aVar.a = 0;
                aVar.a(i3);
                if (this.b.a()) {
                    return a3;
                }
            }
            if (i4 != 0) {
                a aVar2 = this.b;
                aVar2.a = 0;
                aVar2.a(i4);
                if (this.b.a()) {
                    view = a3;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean a(View view, int i) {
        this.b.a(this.a.a(), this.a.b(), this.a.a(view), this.a.b(view));
        a aVar = this.b;
        aVar.a = 0;
        aVar.a(24579);
        return this.b.a();
    }
}
