package defpackage;

import java.util.Arrays;

/* renamed from: faq reason: default package */
public abstract class faq implements faz<Character> {

    /* renamed from: faq$a */
    static final class a extends j {
        static final a a = new a();

        public final boolean b(char c) {
            return true;
        }

        private a() {
            super("CharMatcher.any()");
        }

        public final int d(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        public final int a(CharSequence charSequence, int i) {
            int length = charSequence.length();
            fay.b(i, length, "index");
            if (i == length) {
                return -1;
            }
            return i;
        }

        public final boolean b(CharSequence charSequence) {
            fay.a(charSequence);
            return true;
        }

        public final boolean c(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public final String e(CharSequence charSequence) {
            fay.a(charSequence);
            return "";
        }

        public final String a(CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, '.');
            return new String(cArr);
        }

        public final faq a(faq faq) {
            fay.a(faq);
            return this;
        }

        public final faq f() {
            return m.a;
        }
    }

    /* renamed from: faq$b */
    static final class b extends faq {
        private final char[] a;

        @Deprecated
        public final /* synthetic */ boolean apply(Object obj) {
            return faq.super.apply((Character) obj);
        }

        public b(CharSequence charSequence) {
            this.a = charSequence.toString().toCharArray();
            Arrays.sort(this.a);
        }

        public final boolean b(char c) {
            return Arrays.binarySearch(this.a, c) >= 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.a) {
                sb.append(faq.c(c));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    /* renamed from: faq$c */
    static final class c extends j {
        static final c a = new c();

        public final boolean b(char c) {
            return c <= 127;
        }

        c() {
            super("CharMatcher.ascii()");
        }
    }

    /* renamed from: faq$d */
    static final class d extends o {
        static final d a = new d();

        private static char[] g() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i) + 9);
            }
            return cArr;
        }

        private d() {
            super("CharMatcher.digit()", "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray(), g());
        }
    }

    /* renamed from: faq$e */
    static abstract class e extends faq {
        e() {
        }

        @Deprecated
        public /* synthetic */ boolean apply(Object obj) {
            return faq.super.apply((Character) obj);
        }

        public faq f() {
            return new l(this);
        }
    }

    /* renamed from: faq$f */
    static final class f extends e {
        private final char a;

        f(char c) {
            this.a = c;
        }

        public final boolean b(char c) {
            return c == this.a;
        }

        public final String a(CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.a, '.');
        }

        public final faq a(faq faq) {
            return faq.b(this.a) ? faq : super.a(faq);
        }

        public final faq f() {
            return new h(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.is('");
            sb.append(faq.c(this.a));
            sb.append("')");
            return sb.toString();
        }
    }

    /* renamed from: faq$g */
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
            sb.append(faq.c(this.a));
            sb.append(faq.c(this.b));
            sb.append("\")");
            return sb.toString();
        }
    }

    /* renamed from: faq$h */
    static final class h extends e {
        private final char a;

        h(char c) {
            this.a = c;
        }

        public final boolean b(char c) {
            return c != this.a;
        }

        public final faq a(faq faq) {
            return faq.b(this.a) ? a.a : this;
        }

        public final faq f() {
            return a(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.isNot('");
            sb.append(faq.c(this.a));
            sb.append("')");
            return sb.toString();
        }
    }

    /* renamed from: faq$i */
    static final class i extends faq {
        static final i a = new i();

        public final String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }

        private i() {
        }

        @Deprecated
        public final /* synthetic */ boolean apply(Object obj) {
            return faq.super.apply((Character) obj);
        }

        public final boolean b(char c) {
            return Character.isLetterOrDigit(c);
        }
    }

    /* renamed from: faq$j */
    static abstract class j extends e {
        private final String a;

        j(String str) {
            this.a = (String) fay.a(str);
        }

        public final String toString() {
            return this.a;
        }
    }

    /* renamed from: faq$k */
    static class k extends faq {
        private faq a;

        @Deprecated
        public /* synthetic */ boolean apply(Object obj) {
            return faq.super.apply((Character) obj);
        }

        k(faq faq) {
            this.a = (faq) fay.a(faq);
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

        public final faq f() {
            return this.a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(".negate()");
            return sb.toString();
        }
    }

    /* renamed from: faq$l */
    static class l extends k {
        l(faq faq) {
            super(faq);
        }
    }

    /* renamed from: faq$m */
    static final class m extends j {
        static final m a = new m();

        public final boolean b(char c) {
            return false;
        }

        private m() {
            super("CharMatcher.none()");
        }

        public final int d(CharSequence charSequence) {
            fay.a(charSequence);
            return -1;
        }

        public final int a(CharSequence charSequence, int i) {
            fay.b(i, charSequence.length(), "index");
            return -1;
        }

        public final boolean b(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public final boolean c(CharSequence charSequence) {
            fay.a(charSequence);
            return true;
        }

        public final String e(CharSequence charSequence) {
            return charSequence.toString();
        }

        public final String a(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        public final faq a(faq faq) {
            return (faq) fay.a(faq);
        }

        public final faq f() {
            return a.a;
        }
    }

    /* renamed from: faq$n */
    static final class n extends faq {
        private faq a;
        private faq b;

        @Deprecated
        public final /* synthetic */ boolean apply(Object obj) {
            return faq.super.apply((Character) obj);
        }

        n(faq faq, faq faq2) {
            this.a = (faq) fay.a(faq);
            this.b = (faq) fay.a(faq2);
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

    /* renamed from: faq$o */
    static class o extends faq {
        private final String a;
        private final char[] b;
        private final char[] c;

        @Deprecated
        public /* synthetic */ boolean apply(Object obj) {
            return faq.super.apply((Character) obj);
        }

        o(String str, char[] cArr, char[] cArr2) {
            this.a = str;
            this.b = cArr;
            this.c = cArr2;
            fay.a(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                fay.a(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    fay.a(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        public final boolean b(char c2) {
            int binarySearch = Arrays.binarySearch(this.b, c2);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (binarySearch ^ -1) - 1;
            if (i < 0 || c2 > this.c[i]) {
                return false;
            }
            return true;
        }

        public String toString() {
            return this.a;
        }
    }

    /* renamed from: faq$p */
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

    public abstract boolean b(char c2);

    public static faq a() {
        return m.a;
    }

    public static faq b() {
        return p.a;
    }

    public static faq c() {
        return c.a;
    }

    @Deprecated
    public static faq d() {
        return d.a;
    }

    @Deprecated
    public static faq e() {
        return i.a;
    }

    public static faq a(char c2) {
        return new f(c2);
    }

    public static faq a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return m.a;
        }
        if (length == 1) {
            return a(charSequence.charAt(0));
        }
        if (length != 2) {
            return new b(charSequence);
        }
        return new g(charSequence.charAt(0), charSequence.charAt(1));
    }

    protected faq() {
    }

    public faq f() {
        return new k(this);
    }

    public faq a(faq faq) {
        return new n(this, faq);
    }

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

    public int a(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        fay.b(i2, length, "index");
        while (i2 < length) {
            if (b(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
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

    public final String f(CharSequence charSequence) {
        return f().e(charSequence);
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

    public String toString() {
        return super.toString();
    }

    static /* synthetic */ String c(char c2) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }
}
