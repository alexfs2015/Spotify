package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: he reason: default package */
public final class he {
    static final hg a = hh.c;
    static final he b = new he(false, 2, a);
    static final he c = new he(true, 2, a);
    private static final String d = Character.toString(8206);
    private static final String e = Character.toString(8207);
    private final boolean f;
    private final int g;
    private final hg h;

    /* renamed from: he$a */
    public static final class a {
        boolean a = he.a(Locale.getDefault());
        int b = 2;
        hg c = he.a;
    }

    /* renamed from: he$b */
    static class b {
        private static final byte[] a = new byte[1792];
        private final CharSequence b;
        private final boolean c = false;
        private final int d;
        private int e;
        private char f;

        static {
            for (int i = 0; i < 1792; i++) {
                a[i] = Character.getDirectionality(i);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.b = charSequence;
            this.d = charSequence.length();
        }

        private static byte a(char c2) {
            return c2 < 1792 ? a[c2] : Character.getDirectionality(c2);
        }

        private byte c() {
            this.f = this.b.charAt(this.e);
            if (Character.isHighSurrogate(this.f)) {
                int codePointAt = Character.codePointAt(this.b, this.e);
                this.e += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.e++;
            byte a2 = a(this.f);
            if (this.c) {
                char c2 = this.f;
                if (c2 == '<') {
                    a2 = e();
                } else if (c2 == '&') {
                    a2 = g();
                }
            }
            return a2;
        }

        private byte d() {
            this.f = this.b.charAt(this.e - 1);
            if (Character.isLowSurrogate(this.f)) {
                int codePointBefore = Character.codePointBefore(this.b, this.e);
                this.e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.e--;
            byte a2 = a(this.f);
            if (this.c) {
                char c2 = this.f;
                if (c2 == '>') {
                    a2 = f();
                } else if (c2 == ';') {
                    a2 = h();
                }
            }
            return a2;
        }

        private byte e() {
            char charAt;
            int i = this.e;
            while (true) {
                int i2 = this.e;
                if (i2 < this.d) {
                    CharSequence charSequence = this.b;
                    this.e = i2 + 1;
                    this.f = charSequence.charAt(i2);
                    char c2 = this.f;
                    if (c2 == '>') {
                        return 12;
                    }
                    if (c2 == '\"' || c2 == '\'') {
                        char c3 = this.f;
                        do {
                            int i3 = this.e;
                            if (i3 >= this.d) {
                                break;
                            }
                            CharSequence charSequence2 = this.b;
                            this.e = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f = charAt;
                        } while (charAt != c3);
                    }
                } else {
                    this.e = i;
                    this.f = '<';
                    return 13;
                }
            }
        }

        private byte f() {
            char charAt;
            int i = this.e;
            while (true) {
                int i2 = this.e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.b;
                int i3 = i2 - 1;
                this.e = i3;
                this.f = charSequence.charAt(i3);
                char c2 = this.f;
                if (c2 != '<') {
                    if (c2 == '>') {
                        break;
                    } else if (c2 == '\"' || c2 == '\'') {
                        char c3 = this.f;
                        do {
                            int i4 = this.e;
                            if (i4 <= 0) {
                                break;
                            }
                            CharSequence charSequence2 = this.b;
                            int i5 = i4 - 1;
                            this.e = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f = charAt;
                        } while (charAt != c3);
                    }
                } else {
                    return 12;
                }
            }
            this.e = i;
            this.f = '>';
            return 13;
        }

        private byte g() {
            char charAt;
            do {
                int i = this.e;
                if (i >= this.d) {
                    break;
                }
                CharSequence charSequence = this.b;
                this.e = i + 1;
                charAt = charSequence.charAt(i);
                this.f = charAt;
            } while (charAt != ';');
            return 12;
        }

        private byte h() {
            char c2;
            int i = this.e;
            do {
                int i2 = this.e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.b;
                int i3 = i2 - 1;
                this.e = i3;
                this.f = charSequence.charAt(i3);
                c2 = this.f;
                if (c2 == '&') {
                    return 12;
                }
            } while (c2 != ';');
            this.e = i;
            this.f = ';';
            return 13;
        }

        /* access modifiers changed from: 0000 */
        public final int a() {
            this.e = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.e < this.d && i == 0) {
                byte c2 = c();
                if (c2 != 0) {
                    if (c2 == 1 || c2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (c2 != 9) {
                        switch (c2) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.e > 0) {
                switch (d()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r2 = r2 - 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int b() {
            /*
                r7 = this;
                int r0 = r7.d
                r7.e = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.e
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.d()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r1 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r2 = r2 + 1
                goto L_0x0007
            L_0x0025:
                if (r1 != r2) goto L_0x002b
                return r5
            L_0x0028:
                if (r1 != r2) goto L_0x002b
                return r4
            L_0x002b:
                int r2 = r2 + -1
                goto L_0x0007
            L_0x002e:
                if (r2 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r1 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r2 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r1 != 0) goto L_0x0007
            L_0x0039:
                r1 = r2
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.he.b.b():int");
        }
    }

    he(boolean z, int i, hg hgVar) {
        this.f = z;
        this.g = i;
        this.h = hgVar;
    }

    public static he a() {
        he heVar;
        a aVar = new a();
        if (aVar.b != 2 || aVar.c != a) {
            heVar = new he(aVar.a, aVar.b, aVar.c);
        } else if (!aVar.a) {
            return b;
        } else {
            heVar = c;
        }
        return heVar;
    }

    static boolean a(Locale locale) {
        return hi.a(locale) == 1;
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).b();
    }

    private static int c(CharSequence charSequence) {
        return new b(charSequence, false).a();
    }

    public final CharSequence a(CharSequence charSequence) {
        hg hgVar = this.h;
        if (charSequence == null) {
            return null;
        }
        boolean a2 = hgVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if ((this.g & 2) != 0) {
            boolean a3 = (a2 ? hh.b : hh.a).a(charSequence, 0, charSequence.length());
            String str2 = (this.f || (!a3 && c(charSequence) != 1)) ? (!this.f || (a3 && c(charSequence) != -1)) ? str : e : d;
            spannableStringBuilder.append(str2);
        }
        if (a2 != this.f) {
            spannableStringBuilder.append(a2 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean a4 = (a2 ? hh.b : hh.a).a(charSequence, 0, charSequence.length());
        if (!this.f && (a4 || b(charSequence) == 1)) {
            str = d;
        } else if (this.f && (!a4 || b(charSequence) == -1)) {
            str = e;
        }
        spannableStringBuilder.append(str);
        return spannableStringBuilder;
    }
}
