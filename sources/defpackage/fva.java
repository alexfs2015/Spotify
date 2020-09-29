package defpackage;

import android.graphics.drawable.Drawable;
import com.google.common.base.Optional;

/* renamed from: fva reason: default package */
public abstract class fva {

    /* renamed from: fva$a */
    public static class a extends fva {
        public final fva a(fvc fvc) {
            return this;
        }

        public final fva a(boolean z) {
            return this;
        }

        public final boolean a() {
            return false;
        }

        public final fva b(boolean z) {
            return this;
        }

        public final CharSequence b() {
            return "";
        }

        public final Optional<Drawable> c() {
            return Optional.e();
        }

        public final fva c(boolean z) {
            return this;
        }

        public final fva d(boolean z) {
            return this;
        }

        public final boolean d() {
            return false;
        }

        public final boolean e() {
            return false;
        }

        public final boolean f() {
            return false;
        }

        public final void g() {
        }

        public final int h() {
            return -1;
        }

        public final boolean i() {
            return true;
        }
    }

    /* renamed from: fva$b */
    public static class b extends fva {
        private final int a;
        private final Optional<Drawable> b;
        private final CharSequence c;
        private fvc d;
        private boolean e = true;
        private boolean f;
        private boolean g = true;
        private boolean h;

        public b(int i, CharSequence charSequence) {
            this.a = i;
            this.c = charSequence;
            this.b = Optional.e();
        }

        public b(int i, CharSequence charSequence, Drawable drawable) {
            this.a = i;
            this.c = charSequence;
            this.b = Optional.b(drawable);
        }

        public final fva a(fvc fvc) {
            this.d = fvc;
            return this;
        }

        public final fva a(boolean z) {
            this.e = z;
            return this;
        }

        public final boolean a() {
            return this.f;
        }

        public final fva b(boolean z) {
            this.f = true;
            return this;
        }

        public final CharSequence b() {
            return this.c;
        }

        public final Optional<Drawable> c() {
            return this.b;
        }

        public final fva c(boolean z) {
            this.h = z;
            return this;
        }

        public final fva d(boolean z) {
            this.g = z;
            return this;
        }

        public final boolean d() {
            return this.e;
        }

        public final boolean e() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a || this.e != bVar.e) {
                return false;
            }
            CharSequence charSequence = this.c;
            CharSequence charSequence2 = bVar.c;
            return charSequence == null ? charSequence2 == null : charSequence.equals(charSequence2);
        }

        public final boolean f() {
            return this.g;
        }

        public final void g() {
            fvc fvc = this.d;
            if (fvc != null) {
                fvc.onMenuItemClick(this);
            }
        }

        public final int h() {
            return this.a;
        }

        public final int hashCode() {
            int i = this.a * 31;
            CharSequence charSequence = this.c;
            return (((i + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        }

        public final boolean i() {
            return false;
        }
    }

    public abstract fva a(fvc fvc);

    public abstract fva a(boolean z);

    public abstract boolean a();

    public abstract fva b(boolean z);

    public abstract CharSequence b();

    public abstract Optional<Drawable> c();

    public abstract fva c(boolean z);

    public abstract fva d(boolean z);

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g();

    public abstract int h();

    public abstract boolean i();
}
