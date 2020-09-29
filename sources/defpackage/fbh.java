package defpackage;

import java.util.Arrays;

/* renamed from: fbh reason: default package */
public abstract class fbh implements fbq<Character> {

    /* renamed from: fbh$a */
    static final class a extends j {
        static final a a = new a();

        private a() {
            super("CharMatcher.any()");
        }

        public final int a(CharSequence charSequence, int i) {
            int length = charSequence.length();
            fbp.b(i, length, "index");
            if (i == length) {
                return -1;
            }
            return i;
        }

        public final fbh a(fbh fbh) {
            fbp.a(fbh);
            return this;
        }

        public final String a(CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, '.');
            return new String(cArr);
        }

        public final boolean b(char c) {
            return true;
        }

        public final boolean b(CharSequence charSequence) {
            fbp.a(charSequence);
            return true;
        }

        public final boolean c(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public final int d(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        public final String e(CharSequence charSequence) {
            fbp.a(charSequence);
            return "";
        }

        public final fbh f() {
            return m.a;
        }
    }

    /* renamed from: fbh$b */
    static final class b extends fbh {
        private final char[] a;

        public b(CharSequence charSequence) {
            this.a = charSequence.toString().toCharArray();
            Arrays.sort(this.a);
        }

        @Deprecated
        public final /* synthetic */ boolean apply(Object obj) {
            return fbh.super.apply((Character) obj);
        }

        public final boolean b(char c) {
            return Arrays.binarySearch(this.a, c) >= 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.a) {
                sb.append(fbh.c(c));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    /* renamed from: fbh$c */
    static final class c extends j {
        static final c a = new c();

        c() {
            super("CharMatcher.ascii()");
        }

        public final boolean b(char c) {
            return c <= 127;
        }
    }

    /* renamed from: fbh$d */
    static final class d extends o {
        static final d a = new d();

        private d() {
            super("CharMatcher.digit()", "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray(), g());
        }

        private static char[] g() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i) + 9);
            }
            return cArr;
        }
    }

    /* renamed from: fbh$e */
    static abstract class e extends fbh {
        e() {
        }

        @Deprecated
        public /* synthetic */ boolean apply(Object obj) {
            return fbh.super.apply((Character) obj);
        }

        public fbh f() {
            return new l(this);
        }
    }

    /* renamed from: fbh$f */
    static final class f extends e {
        private final char a;

        f(char c) {
            this.a = c;
        }

        public final fbh a(fbh fbh) {
            return fbh.b(this.a) ? fbh : super.a(fbh);
        }

        public final String a(CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.a, '.');
        }

        public final boolean b(char c) {
            return c == this.a;
        }

        public final fbh f() {
            return new h(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.is('");
            sb.append(fbh.c(this.a));
            sb.append("')");
            return sb.toString();
        }
    }

    /* renamed from: fbh$g */
    static final class g extends e {
        private final char a;
        private final char b;

        g(char c, char c2) {
            this.a = c;
            this.b = c2;
        }

        public final boolean b(char c) {
            return c == this.a || c == this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            sb.append(fbh.c(this.a));
            sb.append(fbh.c(this.b));
            sb.append("\")");
            return sb.toString();
        }
    }

    /* renamed from: fbh$h */
    static final class h extends e {
        private final char a;

        h(char c) {
            this.a = c;
        }

        public final fbh a(fbh fbh) {
            return fbh.b(this.a) ? a.a : this;
        }

        public final boolean b(char c) {
            return c != this.a;
        }

        public final fbh f() {
            return a(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.isNot('");
            sb.append(fbh.c(this.a));
            sb.append("')");
            return sb.toString();
        }
    }

    /* renamed from: fbh$i */
    static final class i extends fbh {
        static final i a = new i();

        private i() {
        }

        @Deprecated
        public final /* synthetic */ boolean apply(Object obj) {
            return fbh.super.apply((Character) obj);
        }

        public final boolean b(char c) {
            return Character.isLetterOrDigit(c);
        }

        public final String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* renamed from: fbh$j */
    static abstract class j extends e {
        private final String a;

        j(String str) {
            this.a = (String) fbp.a(str);
        }

        public final String toString() {
            return this.a;
        }
    }

    /* renamed from: fbh$k */
    static class k extends fbh {
        private fbh a;

        k(fbh fbh) {
            this.a = (fbh) fbp.a(fbh);
        }

        @Deprecated
        public /* synthetic */ boolean apply(Object obj) {
            return fbh.super.apply((Character) obj);
        }

        public final boolean b(char c) {
            return !this.a.b(c);
        }

        public final boolean b(CharSequence charSequence) {
            return this.a.c(charSequence);
        }

        public final boolean c(CharSequence charSequence) {
            return this.a.b(charSequence);
        }

        public final fbh f() {
            return this.a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(".negate()");
            return sb.toString();
        }
    }

    /* renamed from: fbh$l */
    static class l extends k {
        l(fbh fbh) {
            super(fbh);
        }
    }

    /* renamed from: fbh$m */
    static final class m extends j {
        static final m a = new m();

        private m() {
            super("CharMatcher.none()");
        }

        public final int a(CharSequence charSequence, int i) {
            fbp.b(i, charSequence.length(), "index");
            return -1;
        }

        public final fbh a(fbh fbh) {
            return (fbh) fbp.a(fbh);
        }

        public final String a(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        public final boolean b(char c) {
            return false;
        }

        public final boolean b(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public final boolean c(CharSequence charSequence) {
            fbp.a(charSequence);
            return true;
        }

        public final int d(CharSequence charSequence) {
            fbp.a(charSequence);
            return -1;
        }

        public final String e(CharSequence charSequence) {
            return charSequence.toString();
        }

        public final fbh f() {
            return a.a;
        }
    }

    /* renamed from: fbh$n */
    static final class n extends fbh {
        private fbh a;
        private fbh b;

        n(fbh fbh, fbh fbh2) {
            this.a = (fbh) fbp.a(fbh);
            this.b = (fbh) fbp.a(fbh2);
        }

        @Deprecated
        public final /* synthetic */ boolean apply(Object obj) {
            return fbh.super.apply((Character) obj);
        }

        public final boolean b(char c) {
            return this.a.b(c) || this.b.b(c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.or(");
            sb.append(this.a);
            sb.append(", ");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: fbh$o */
    static class o extends fbh {
        private final String a;
        private final char[] b;
        private final char[] c;

        o(String str, char[] cArr, char[] cArr2) {
            this.a = str;
            this.b = cArr;
            this.c = cArr2;
            fbp.a(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                fbp.a(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    fbp.a(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        @Deprecated
        public /* synthetic */ boolean apply(Object obj) {
            return fbh.super.apply((Character) obj);
        }

        public final boolean b(char c2) {
            int binarySearch = Arrays.binarySearch(this.b, c2);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (binarySearch ^ -1) - 1;
            return i >= 0 && c2 <= this.c[i];
        }

        public String toString() {
            return this.a;
        }
    }

    /* renamed from: fbh$p */
    static final class p extends j {
        static final p a = new p();
        private static int b = Integer.numberOfLeadingZeros(31);

        p() {
            super("CharMatcher.whitespace()");
        }

        public final boolean b(char c) {
            return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c) >>> b) == c;
        }
    }

    protected fbh() {
    }

    public static fbh a() {
        return m.a;
    }

    public static fbh a(char c2) {
        return new f(c2);
    }

    public static fbh a(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new b(charSequence) : new g(charSequence.charAt(0), charSequence.charAt(1)) : a(charSequence.charAt(0)) : m.a;
    }

    public static fbh b() {
        return p.a;
    }

    public static fbh c() {
        return c.a;
    }

    static /* synthetic */ String c(char c2) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static fbh d() {
        return d.a;
    }

    @Deprecated
    public static fbh e() {
        return i.a;
    }

    public int a(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        fbp.b(i2, length, "index");
        while (i2 < length) {
            if (b(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public fbh a(fbh fbh) {
        return new n(this, fbh);
    }

    public String a(CharSequence charSequence, char c2) {
        String charSequence2 = charSequence.toString();
        int d2 = d(charSequence2);
        if (d2 == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[d2] = '.';
        while (true) {
            d2++;
            if (d2 >= charArray.length) {
                return new String(charArray);
            }
            if (b(charArray[d2])) {
                charArray[d2] = '.';
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public final boolean apply(Character ch) {
        return b(ch.charValue());
    }

    public abstract boolean b(char c2);

    public boolean b(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!b(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean c(CharSequence charSequence) {
        return d(charSequence) == -1;
    }

    public int d(CharSequence charSequence) {
        return a(charSequence, 0);
    }

    public String e(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int d2 = d(charSequence2);
        if (d2 == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i2 = 1;
        while (true) {
            d2++;
            if (d2 == charArray.length) {
                return new String(charArray, 0, d2 - i2);
            }
            if (!b(charArray[d2])) {
                charArray[d2 - i2] = charArray[d2];
            } else {
                i2++;
            }
        }
    }

    public fbh f() {
        return new k(this);
    }

    public final String f(CharSequence charSequence) {
        return f().e(charSequence);
    }

    public String toString() {
        return super.toString();
    }
}
