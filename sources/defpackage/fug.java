package defpackage;

import android.graphics.drawable.Drawable;
import com.google.common.base.Optional;

/* renamed from: fug reason: default package */
public abstract class fug {

    /* renamed from: fug$a */
    public static class a extends fug {
        public final fug a(fui fui) {
            return this;
        }

        public final fug a(boolean z) {
            return this;
        }

        public final boolean a() {
            return false;
        }

        public final fug b(boolean z) {
            return this;
        }

        public final CharSequence b() {
            return "";
        }

        public final fug c(boolean z) {
            return this;
        }

        public final fug d(boolean z) {
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

        public final Optional<Drawable> c() {
            return Optional.e();
        }
    }

    /* renamed from: fug$b */
    public static class b extends fug {
        private final int a;
        private final Optional<Drawable> b;
        private final CharSequence c;
        private fui d;
        private boolean e = true;
        private boolean f;
        private boolean g = true;
        private boolean h;

        public final boolean i() {
            return false;
        }

        public b(int i, CharSequence charSequence, Drawable drawable) {
            this.a = i;
            this.c = charSequence;
            this.b = Optional.b(drawable);
        }

        public b(int i, CharSequence charSequence) {
            this.a = i;
            this.c = charSequence;
            this.b = Optional.e();
        }

        public final Optional<Drawable> c() {
            return this.b;
        }

        public final boolean d() {
            return this.e;
        }

        public final boolean e() {
            return this.h;
        }

        public final boolean f() {
            return this.g;
        }

        public final boolean a() {
            return this.f;
        }

        public final CharSequence b() {
            return this.c;
        }

        public final void g() {
            fui fui = this.d;
            if (fui != null) {
                fui.onMenuItemClick(this);
            }
        }

        public final fug a(boolean z) {
            this.e = z;
            return this;
        }

        public final fug b(boolean z) {
            this.f = true;
            return this;
        }

        public final fug c(boolean z) {
            this.h = z;
            return this;
        }

        public final fug d(boolean z) {
            this.g = z;
            return this;
        }

        public final fug a(fui fui) {
            this.d = fui;
            return this;
        }

        public final int h() {
            return this.a;
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

        public final int hashCode() {
            int i = this.a * 31;
            CharSequence charSequence = this.c;
            return (((i + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        }
    }

    public abstract fug a(fui fui);

    public abstract fug a(boolean z);

    public abstract boolean a();

    public abstract fug b(boolean z);

    public abstract CharSequence b();

    public abstract Optional<Drawable> c();

    public abstract fug c(boolean z);

    public abstract fug d(boolean z);

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g();

    public abstract int h();

    public abstract boolean i();
}
