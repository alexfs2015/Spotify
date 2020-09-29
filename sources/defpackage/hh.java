package defpackage;

import java.util.Locale;

/* renamed from: hh reason: default package */
public final class hh {
    public static final hg a = new e(null, false);
    public static final hg b = new e(null, true);
    public static final hg c = new e(b.a, false);
    public static final hg d = new e(b.a, true);

    /* renamed from: hh$a */
    static class a implements c {
        static final a a = new a(true);
        private final boolean b = true;

        public final int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a2 = hh.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                        i++;
                    } else if (!this.b) {
                        return 1;
                    }
                } else if (this.b) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.b ? 1 : 0;
            }
            return 2;
        }

        private a(boolean z) {
        }
    }

    /* renamed from: hh$b */
    static class b implements c {
        static final b a = new b();

        public final int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = hh.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }

        private b() {
        }
    }

    /* renamed from: hh$c */
    interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: hh$d */
    static abstract class d implements hg {
        private final c a;

        /* access modifiers changed from: protected */
        public abstract boolean a();

        d(c cVar) {
            this.a = cVar;
        }

        public final boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
                throw new IllegalArgumentException();
            }
            c cVar = this.a;
            if (cVar == null) {
                return a();
            }
            int a2 = cVar.a(charSequence, 0, i2);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return a();
            }
            return false;
        }
    }

    /* renamed from: hh$e */
    static class e extends d {
        private final boolean a;

        e(c cVar, boolean z) {
            super(cVar);
            this.a = z;
        }

        /* access modifiers changed from: protected */
        public final boolean a() {
            return this.a;
        }
    }

    /* renamed from: hh$f */
    static class f extends d {
        static final f a = new f();

        f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        public final boolean a() {
            return hi.a(Locale.getDefault()) == 1;
        }
    }

    static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i) {
        if (i != 0) {
            if (!(i == 1 || i == 2)) {
                switch (i) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        break;
                    default:
                        return 2;
                }
            }
            return 0;
        }
        return 1;
    }

    static {
        new e(a.a, false);
        f fVar = f.a;
    }
}
