package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bbl reason: default package */
public final class bbl {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private final StringBuilder c = new StringBuilder();

    /* renamed from: bbl$a */
    static final class a {
        private static final String[] e = new String[0];
        public final String a;
        public final int b;
        public final String c;
        public final String[] d;

        private a(String str, int i, String str2, String[] strArr) {
            this.b = i;
            this.a = str;
            this.c = str2;
            this.d = strArr;
        }

        public static a a() {
            String str = "";
            return new a(str, 0, str, new String[0]);
        }

        public static a a(String str, int i) {
            String str2;
            String trim = str.trim();
            if (trim.isEmpty()) {
                return null;
            }
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] a2 = ben.a(trim, "\\.");
            return new a(a2[0], i, str2, a2.length > 1 ? (String[]) Arrays.copyOfRange(a2, 1, a2.length) : e);
        }
    }

    /* renamed from: bbl$b */
    static final class b implements Comparable<b> {
        public final bbj a;
        private int b;

        public b(int i, bbj bbj) {
            this.b = i;
            this.a = bbj;
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.b - ((b) obj).b;
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L_0x002a;
                case -1074341483: goto L_0x0020;
                case 100571: goto L_0x0016;
                case 109757538: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "start"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "middle"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x0055
            if (r0 == r4) goto L_0x0054
            if (r0 == r3) goto L_0x0054
            if (r0 == r2) goto L_0x0053
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid anchor value: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            defpackage.bdu.c(r0, r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        L_0x0053:
            return r3
        L_0x0054:
            return r4
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbl.a(java.lang.String):int");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(java.lang.String r10, defpackage.bbk.a r11) {
        /*
            java.lang.String r0 = "WebvttCueParser"
            java.util.regex.Pattern r1 = b
            java.util.regex.Matcher r10 = r1.matcher(r10)
        L_0x0008:
            boolean r1 = r10.find()
            if (r1 == 0) goto L_0x0143
            r1 = 1
            java.lang.String r2 = r10.group(r1)
            r3 = 2
            java.lang.String r4 = r10.group(r3)
            java.lang.String r5 = "line"
            boolean r5 = r5.equals(r2)     // Catch:{ NumberFormatException -> 0x012c }
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 44
            r8 = 0
            r9 = -1
            if (r5 == 0) goto L_0x005e
            int r2 = r4.indexOf(r7)     // Catch:{ NumberFormatException -> 0x012c }
            if (r2 == r9) goto L_0x003d
            int r3 = r2 + 1
            java.lang.String r3 = r4.substring(r3)     // Catch:{ NumberFormatException -> 0x012c }
            int r3 = a(r3)     // Catch:{ NumberFormatException -> 0x012c }
            r11.g = r3     // Catch:{ NumberFormatException -> 0x012c }
            java.lang.String r4 = r4.substring(r8, r2)     // Catch:{ NumberFormatException -> 0x012c }
            goto L_0x003f
        L_0x003d:
            r11.g = r6     // Catch:{ NumberFormatException -> 0x012c }
        L_0x003f:
            java.lang.String r2 = "%"
            boolean r2 = r4.endsWith(r2)     // Catch:{ NumberFormatException -> 0x012c }
            if (r2 == 0) goto L_0x0050
            float r1 = defpackage.bbn.b(r4)     // Catch:{ NumberFormatException -> 0x012c }
            r11.e = r1     // Catch:{ NumberFormatException -> 0x012c }
            r11.f = r8     // Catch:{ NumberFormatException -> 0x012c }
            goto L_0x0008
        L_0x0050:
            int r2 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x012c }
            if (r2 >= 0) goto L_0x0058
            int r2 = r2 + -1
        L_0x0058:
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x012c }
            r11.e = r2     // Catch:{ NumberFormatException -> 0x012c }
            r11.f = r1     // Catch:{ NumberFormatException -> 0x012c }
            goto L_0x0008
        L_0x005e:
            java.lang.String r5 = "align"
            boolean r5 = r5.equals(r2)     // Catch:{ NumberFormatException -> 0x012c }
            if (r5 == 0) goto L_0x00d8
            int r2 = r4.hashCode()     // Catch:{ NumberFormatException -> 0x012c }
            r5 = 5
            r6 = 4
            r7 = 3
            switch(r2) {
                case -1364013995: goto L_0x00a2;
                case -1074341483: goto L_0x0098;
                case 100571: goto L_0x008e;
                case 3317767: goto L_0x0084;
                case 108511772: goto L_0x007a;
                case 109757538: goto L_0x0071;
                default: goto L_0x0070;
            }     // Catch:{ NumberFormatException -> 0x012c }
        L_0x0070:
            goto L_0x00ac
        L_0x0071:
            java.lang.String r2 = "start"
            boolean r2 = r4.equals(r2)     // Catch:{ NumberFormatException -> 0x012c }
            if (r2 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x007a:
            java.lang.String r2 = "right"
            boolean r2 = r4.equals(r2)     // Catch:{ NumberFormatException -> 0x012c }
            if (r2 == 0) goto L_0x00ac
            r8 = 5
            goto L_0x00ad
        L_0x0084:
            java.lang.String r2 = "left"
            boolean r2 = r4.equals(r2)     // Catch:{ NumberFormatException -> 0x012c }
            if (r2 == 0) goto L_0x00ac
            r8 = 1
            goto L_0x00ad
        L_0x008e:
            java.lang.String r2 = "end"
            boolean r2 = r4.equals(r2)     // Catch:{ NumberFormatException -> 0x012c }
            if (r2 == 0) goto L_0x00ac
            r8 = 4
            goto L_0x00ad
        L_0x0098:
            java.lang.String r2 = "middle"
            boolean r2 = r4.equals(r2)     // Catch:{ NumberFormatException -> 0x012c }
            if (r2 == 0) goto L_0x00ac
            r8 = 3
            goto L_0x00ad
        L_0x00a2:
            java.lang.String r2 = "center"
            boolean r2 = r4.equals(r2)     // Catch:{ NumberFormatException -> 0x012c }
            if (r2 == 0) goto L_0x00ac
            r8 = 2
            goto L_0x00ad
        L_0x00ac:
            r8 = -1
        L_0x00ad:
            if (r8 == 0) goto L_0x00d2
            if (r8 == r1) goto L_0x00d2
            if (r8 == r3) goto L_0x00cf
            if (r8 == r7) goto L_0x00cf
            if (r8 == r6) goto L_0x00cc
            if (r8 == r5) goto L_0x00cc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x012c }
            java.lang.String r2 = "Invalid alignment value: "
            r1.<init>(r2)     // Catch:{ NumberFormatException -> 0x012c }
            r1.append(r4)     // Catch:{ NumberFormatException -> 0x012c }
            java.lang.String r1 = r1.toString()     // Catch:{ NumberFormatException -> 0x012c }
            defpackage.bdu.c(r0, r1)     // Catch:{ NumberFormatException -> 0x012c }
            r1 = 0
            goto L_0x00d4
        L_0x00cc:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NumberFormatException -> 0x012c }
            goto L_0x00d4
        L_0x00cf:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NumberFormatException -> 0x012c }
            goto L_0x00d4
        L_0x00d2:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NumberFormatException -> 0x012c }
        L_0x00d4:
            r11.d = r1     // Catch:{ NumberFormatException -> 0x012c }
            goto L_0x0008
        L_0x00d8:
            java.lang.String r1 = "position"
            boolean r1 = r1.equals(r2)     // Catch:{ NumberFormatException -> 0x012c }
            if (r1 == 0) goto L_0x0101
            int r1 = r4.indexOf(r7)     // Catch:{ NumberFormatException -> 0x012c }
            if (r1 == r9) goto L_0x00f7
            int r2 = r1 + 1
            java.lang.String r2 = r4.substring(r2)     // Catch:{ NumberFormatException -> 0x012c }
            int r2 = a(r2)     // Catch:{ NumberFormatException -> 0x012c }
            r11.i = r2     // Catch:{ NumberFormatException -> 0x012c }
            java.lang.String r4 = r4.substring(r8, r1)     // Catch:{ NumberFormatException -> 0x012c }
            goto L_0x00f9
        L_0x00f7:
            r11.i = r6     // Catch:{ NumberFormatException -> 0x012c }
        L_0x00f9:
            float r1 = defpackage.bbn.b(r4)     // Catch:{ NumberFormatException -> 0x012c }
            r11.h = r1     // Catch:{ NumberFormatException -> 0x012c }
            goto L_0x0008
        L_0x0101:
            java.lang.String r1 = "size"
            boolean r1 = r1.equals(r2)     // Catch:{ NumberFormatException -> 0x012c }
            if (r1 == 0) goto L_0x0111
            float r1 = defpackage.bbn.b(r4)     // Catch:{ NumberFormatException -> 0x012c }
            r11.j = r1     // Catch:{ NumberFormatException -> 0x012c }
            goto L_0x0008
        L_0x0111:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x012c }
            java.lang.String r3 = "Unknown cue setting "
            r1.<init>(r3)     // Catch:{ NumberFormatException -> 0x012c }
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x012c }
            java.lang.String r2 = ":"
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x012c }
            r1.append(r4)     // Catch:{ NumberFormatException -> 0x012c }
            java.lang.String r1 = r1.toString()     // Catch:{ NumberFormatException -> 0x012c }
            defpackage.bdu.c(r0, r1)     // Catch:{ NumberFormatException -> 0x012c }
            goto L_0x0008
        L_0x012c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping bad cue setting: "
            r1.<init>(r2)
            java.lang.String r2 = r10.group()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.bdu.c(r0, r1)
            goto L_0x0008
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbl.a(java.lang.String, bbk$a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r10, defpackage.bbl.a r11, android.text.SpannableStringBuilder r12, java.util.List<defpackage.bbj> r13, java.util.List<defpackage.bbl.b> r14) {
        /*
            int r0 = r11.b
            int r1 = r12.length()
            java.lang.String r2 = r11.a
            int r3 = r2.hashCode()
            r4 = 3
            r5 = -1
            r6 = 2
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L_0x0069
            r9 = 105(0x69, float:1.47E-43)
            if (r3 == r9) goto L_0x005f
            r9 = 3314158(0x3291ee, float:4.644125E-39)
            if (r3 == r9) goto L_0x0055
            r9 = 98
            if (r3 == r9) goto L_0x004b
            r9 = 99
            if (r3 == r9) goto L_0x0041
            r9 = 117(0x75, float:1.64E-43)
            if (r3 == r9) goto L_0x0037
            r9 = 118(0x76, float:1.65E-43)
            if (r3 == r9) goto L_0x002d
            goto L_0x0073
        L_0x002d:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            r2 = 5
            goto L_0x0074
        L_0x0037:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            r2 = 2
            goto L_0x0074
        L_0x0041:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            r2 = 3
            goto L_0x0074
        L_0x004b:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            r2 = 0
            goto L_0x0074
        L_0x0055:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            r2 = 4
            goto L_0x0074
        L_0x005f:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            r2 = 1
            goto L_0x0074
        L_0x0069:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            r2 = 6
            goto L_0x0074
        L_0x0073:
            r2 = -1
        L_0x0074:
            r3 = 33
            switch(r2) {
                case 0: goto L_0x008c;
                case 1: goto L_0x0083;
                case 2: goto L_0x007a;
                case 3: goto L_0x0094;
                case 4: goto L_0x0094;
                case 5: goto L_0x0094;
                case 6: goto L_0x0094;
                default: goto L_0x0079;
            }
        L_0x0079:
            return
        L_0x007a:
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            r12.setSpan(r2, r0, r1, r3)
            goto L_0x0094
        L_0x0083:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r6)
            r12.setSpan(r2, r0, r1, r3)
            goto L_0x0094
        L_0x008c:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r8)
            r12.setSpan(r2, r0, r1, r3)
        L_0x0094:
            r14.clear()
            a(r13, r10, r11, r14)
            int r10 = r14.size()
            r11 = 0
        L_0x009f:
            if (r11 >= r10) goto L_0x014c
            java.lang.Object r13 = r14.get(r11)
            bbl$b r13 = (defpackage.bbl.b) r13
            bbj r13 = r13.a
            if (r13 == 0) goto L_0x0148
            int r2 = r13.a()
            if (r2 == r5) goto L_0x00bd
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            int r9 = r13.a()
            r2.<init>(r9)
            r12.setSpan(r2, r0, r1, r3)
        L_0x00bd:
            int r2 = r13.j
            if (r2 != r8) goto L_0x00c3
            r2 = 1
            goto L_0x00c4
        L_0x00c3:
            r2 = 0
        L_0x00c4:
            if (r2 == 0) goto L_0x00ce
            android.text.style.StrikethroughSpan r2 = new android.text.style.StrikethroughSpan
            r2.<init>()
            r12.setSpan(r2, r0, r1, r3)
        L_0x00ce:
            int r2 = r13.k
            if (r2 != r8) goto L_0x00d4
            r2 = 1
            goto L_0x00d5
        L_0x00d4:
            r2 = 0
        L_0x00d5:
            if (r2 == 0) goto L_0x00df
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            r12.setSpan(r2, r0, r1, r3)
        L_0x00df:
            boolean r2 = r13.g
            if (r2 == 0) goto L_0x00fa
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            boolean r9 = r13.g
            if (r9 == 0) goto L_0x00f2
            int r9 = r13.f
            r2.<init>(r9)
            r12.setSpan(r2, r0, r1, r3)
            goto L_0x00fa
        L_0x00f2:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Font color not defined"
            r10.<init>(r11)
            throw r10
        L_0x00fa:
            boolean r2 = r13.i
            if (r2 == 0) goto L_0x0115
            android.text.style.BackgroundColorSpan r2 = new android.text.style.BackgroundColorSpan
            boolean r9 = r13.i
            if (r9 == 0) goto L_0x010d
            int r9 = r13.h
            r2.<init>(r9)
            r12.setSpan(r2, r0, r1, r3)
            goto L_0x0115
        L_0x010d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Background color not defined."
            r10.<init>(r11)
            throw r10
        L_0x0115:
            java.lang.String r2 = r13.e
            if (r2 == 0) goto L_0x0123
            android.text.style.TypefaceSpan r2 = new android.text.style.TypefaceSpan
            java.lang.String r9 = r13.e
            r2.<init>(r9)
            r12.setSpan(r2, r0, r1, r3)
        L_0x0123:
            int r13 = r13.n
            r2 = 0
            if (r13 == r8) goto L_0x013f
            if (r13 == r6) goto L_0x0136
            if (r13 == r4) goto L_0x012d
            goto L_0x0148
        L_0x012d:
            android.text.style.RelativeSizeSpan r13 = new android.text.style.RelativeSizeSpan
            r13.<init>(r2)
            r12.setSpan(r13, r0, r1, r3)
            goto L_0x0148
        L_0x0136:
            android.text.style.RelativeSizeSpan r13 = new android.text.style.RelativeSizeSpan
            r13.<init>(r2)
            r12.setSpan(r13, r0, r1, r3)
            goto L_0x0148
        L_0x013f:
            android.text.style.AbsoluteSizeSpan r13 = new android.text.style.AbsoluteSizeSpan
            int r2 = (int) r2
            r13.<init>(r2, r8)
            r12.setSpan(r13, r0, r1, r3)
        L_0x0148:
            int r11 = r11 + 1
            goto L_0x009f
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbl.a(java.lang.String, bbl$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(java.lang.String r16, java.lang.String r17, defpackage.bbk.a r18, java.util.List<defpackage.bbj> r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r19
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = 0
        L_0x0017:
            int r8 = r17.length()
            if (r7 >= r8) goto L_0x01c4
            char r8 = r1.charAt(r7)
            r9 = 62
            r10 = 60
            r11 = 38
            r13 = 2
            r14 = -1
            r15 = 1
            if (r8 == r11) goto L_0x0121
            if (r8 == r10) goto L_0x0035
            r3.append(r8)
            int r7 = r7 + 1
            goto L_0x011c
        L_0x0035:
            int r8 = r7 + 1
            int r10 = r17.length()
            if (r8 < r10) goto L_0x003f
            r7 = r8
            goto L_0x0017
        L_0x003f:
            char r10 = r1.charAt(r8)
            r11 = 47
            if (r10 != r11) goto L_0x0049
            r10 = 1
            goto L_0x004a
        L_0x0049:
            r10 = 0
        L_0x004a:
            int r8 = r1.indexOf(r9, r8)
            if (r8 != r14) goto L_0x0055
            int r8 = r17.length()
            goto L_0x0057
        L_0x0055:
            int r8 = r8 + 1
        L_0x0057:
            int r9 = r8 + -2
            char r14 = r1.charAt(r9)
            if (r14 != r11) goto L_0x0061
            r11 = 1
            goto L_0x0062
        L_0x0061:
            r11 = 0
        L_0x0062:
            if (r10 == 0) goto L_0x0066
            r14 = 2
            goto L_0x0067
        L_0x0066:
            r14 = 1
        L_0x0067:
            int r7 = r7 + r14
            if (r11 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            int r9 = r8 + -1
        L_0x006d:
            java.lang.String r7 = r1.substring(r7, r9)
            java.lang.String r9 = r7.trim()
            boolean r14 = r9.isEmpty()
            if (r14 == 0) goto L_0x007d
            r9 = 0
            goto L_0x0085
        L_0x007d:
            java.lang.String r14 = "[ \\.]"
            java.lang.String[] r9 = defpackage.ben.b(r9, r14)
            r9 = r9[r6]
        L_0x0085:
            if (r9 == 0) goto L_0x011f
            int r14 = r9.hashCode()
            r6 = 98
            r12 = 4
            if (r14 == r6) goto L_0x00d8
            r6 = 99
            if (r14 == r6) goto L_0x00ce
            r6 = 105(0x69, float:1.47E-43)
            if (r14 == r6) goto L_0x00c4
            r6 = 3314158(0x3291ee, float:4.644125E-39)
            if (r14 == r6) goto L_0x00ba
            r6 = 117(0x75, float:1.64E-43)
            if (r14 == r6) goto L_0x00b0
            r6 = 118(0x76, float:1.65E-43)
            if (r14 == r6) goto L_0x00a6
            goto L_0x00e2
        L_0x00a6:
            java.lang.String r6 = "v"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x00e2
            r6 = 5
            goto L_0x00e3
        L_0x00b0:
            java.lang.String r6 = "u"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x00e2
            r6 = 4
            goto L_0x00e3
        L_0x00ba:
            java.lang.String r6 = "lang"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x00e2
            r6 = 3
            goto L_0x00e3
        L_0x00c4:
            java.lang.String r6 = "i"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x00e2
            r6 = 2
            goto L_0x00e3
        L_0x00ce:
            java.lang.String r6 = "c"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x00e2
            r6 = 1
            goto L_0x00e3
        L_0x00d8:
            java.lang.String r6 = "b"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x00e2
            r6 = 0
            goto L_0x00e3
        L_0x00e2:
            r6 = -1
        L_0x00e3:
            if (r6 == 0) goto L_0x00f2
            if (r6 == r15) goto L_0x00f2
            if (r6 == r13) goto L_0x00f2
            r13 = 3
            if (r6 == r13) goto L_0x00f2
            if (r6 == r12) goto L_0x00f2
            r12 = 5
            if (r6 == r12) goto L_0x00f2
            r15 = 0
        L_0x00f2:
            if (r15 == 0) goto L_0x011f
            if (r10 == 0) goto L_0x010e
        L_0x00f6:
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x011f
            java.lang.Object r6 = r4.pop()
            bbl$a r6 = (defpackage.bbl.a) r6
            a(r0, r6, r3, r2, r5)
            java.lang.String r6 = r6.a
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x00f6
            goto L_0x011f
        L_0x010e:
            if (r11 != 0) goto L_0x011f
            int r6 = r3.length()
            bbl$a r6 = defpackage.bbl.a.a(r7, r6)
            r4.push(r6)
            goto L_0x011f
        L_0x011c:
            r6 = 0
            goto L_0x0017
        L_0x011f:
            r7 = r8
            goto L_0x011c
        L_0x0121:
            r6 = 59
            int r7 = r7 + 1
            int r6 = r1.indexOf(r6, r7)
            r12 = 32
            int r14 = r1.indexOf(r12, r7)
            r10 = -1
            if (r6 != r10) goto L_0x0134
            r6 = r14
            goto L_0x013b
        L_0x0134:
            if (r14 != r10) goto L_0x0137
            goto L_0x013b
        L_0x0137:
            int r6 = java.lang.Math.min(r6, r14)
        L_0x013b:
            if (r6 == r10) goto L_0x01bf
            java.lang.String r7 = r1.substring(r7, r6)
            int r8 = r7.hashCode()
            r10 = 3309(0xced, float:4.637E-42)
            if (r8 == r10) goto L_0x0176
            r10 = 3464(0xd88, float:4.854E-42)
            if (r8 == r10) goto L_0x016c
            r10 = 96708(0x179c4, float:1.35517E-40)
            if (r8 == r10) goto L_0x0162
            r10 = 3374865(0x337f11, float:4.729193E-39)
            if (r8 == r10) goto L_0x0158
            goto L_0x0180
        L_0x0158:
            java.lang.String r8 = "nbsp"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0180
            r8 = 2
            goto L_0x0181
        L_0x0162:
            java.lang.String r8 = "amp"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0180
            r8 = 3
            goto L_0x0181
        L_0x016c:
            java.lang.String r8 = "lt"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0180
            r8 = 0
            goto L_0x0181
        L_0x0176:
            java.lang.String r8 = "gt"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0180
            r8 = 1
            goto L_0x0181
        L_0x0180:
            r8 = -1
        L_0x0181:
            if (r8 == 0) goto L_0x01af
            if (r8 == r15) goto L_0x01ab
            if (r8 == r13) goto L_0x01a7
            r9 = 3
            if (r8 == r9) goto L_0x01a3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "ignoring unsupported entity: '&"
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = ";'"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "WebvttCueParser"
            defpackage.bdu.c(r8, r7)
            goto L_0x01b4
        L_0x01a3:
            r3.append(r11)
            goto L_0x01b4
        L_0x01a7:
            r3.append(r12)
            goto L_0x01b4
        L_0x01ab:
            r3.append(r9)
            goto L_0x01b4
        L_0x01af:
            r7 = 60
            r3.append(r7)
        L_0x01b4:
            if (r6 != r14) goto L_0x01bb
            java.lang.String r7 = " "
            r3.append(r7)
        L_0x01bb:
            int r7 = r6 + 1
            goto L_0x011c
        L_0x01bf:
            r3.append(r8)
            goto L_0x011c
        L_0x01c4:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x01d4
            java.lang.Object r1 = r4.pop()
            bbl$a r1 = (defpackage.bbl.a) r1
            a(r0, r1, r3, r2, r5)
            goto L_0x01c4
        L_0x01d4:
            bbl$a r1 = defpackage.bbl.a.a()
            a(r0, r1, r3, r2, r5)
            r0 = r18
            r0.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbl.a(java.lang.String, java.lang.String, bbk$a, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.util.List<defpackage.bbj> r10, java.lang.String r11, defpackage.bbl.a r12, java.util.List<defpackage.bbl.b> r13) {
        /*
            int r0 = r10.size()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x0079
            java.lang.Object r3 = r10.get(r2)
            bbj r3 = (defpackage.bbj) r3
            java.lang.String r4 = r12.a
            java.lang.String[] r5 = r12.d
            java.lang.String r6 = r12.c
            java.lang.String r7 = r3.a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x003c
            java.lang.String r7 = r3.b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x003c
            java.util.List<java.lang.String> r7 = r3.c
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x003c
            java.lang.String r7 = r3.d
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x003c
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x006b
            r4 = 1
            goto L_0x006c
        L_0x003c:
            java.lang.String r7 = r3.a
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = defpackage.bbj.a(r1, r7, r11, r8)
            java.lang.String r8 = r3.b
            r9 = 2
            int r4 = defpackage.bbj.a(r7, r8, r4, r9)
            java.lang.String r7 = r3.d
            r8 = 4
            int r4 = defpackage.bbj.a(r4, r7, r6, r8)
            r6 = -1
            if (r4 == r6) goto L_0x006b
            java.util.List r5 = java.util.Arrays.asList(r5)
            java.util.List<java.lang.String> r6 = r3.c
            boolean r5 = r5.containsAll(r6)
            if (r5 != 0) goto L_0x0062
            goto L_0x006b
        L_0x0062:
            java.util.List<java.lang.String> r5 = r3.c
            int r5 = r5.size()
            int r5 = r5 << r9
            int r4 = r4 + r5
            goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            if (r4 <= 0) goto L_0x0076
            bbl$b r5 = new bbl$b
            r5.<init>(r4, r3)
            r13.add(r5)
        L_0x0076:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0079:
            java.util.Collections.sort(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbl.a(java.util.List, java.lang.String, bbl$a, java.util.List):void");
    }

    private static boolean a(String str, Matcher matcher, bea bea, defpackage.bbk.a aVar, StringBuilder sb, List<bbj> list) {
        try {
            aVar.a = bbn.a(matcher.group(1));
            aVar.b = bbn.a(matcher.group(2));
            a(matcher.group(3), aVar);
            sb.setLength(0);
            while (true) {
                String r = bea.r();
                if (!TextUtils.isEmpty(r)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(r.trim());
                } else {
                    a(str, sb.toString(), aVar, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder("Skipping cue with bad header: ");
            sb2.append(matcher.group());
            bdu.c("WebvttCueParser", sb2.toString());
            return false;
        }
    }

    public final boolean a(bea bea, defpackage.bbk.a aVar, List<bbj> list) {
        String r = bea.r();
        if (r == null) {
            return false;
        }
        Matcher matcher = a.matcher(r);
        if (matcher.matches()) {
            return a(null, matcher, bea, aVar, this.c, list);
        }
        String r2 = bea.r();
        if (r2 == null) {
            return false;
        }
        Matcher matcher2 = a.matcher(r2);
        if (!matcher2.matches()) {
            return false;
        }
        return a(r.trim(), matcher2, bea, aVar, this.c, list);
    }
}
