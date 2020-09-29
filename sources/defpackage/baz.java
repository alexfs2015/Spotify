package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: baz reason: default package */
public final class baz extends baa {
    private static final Pattern c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern g = Pattern.compile("^(\\d+) (\\d+)$");
    private static final b h = new b(30.0f, 1, 1);
    private static final a i = new a(32, 15);
    private final XmlPullParserFactory j;

    /* renamed from: baz$a */
    static final class a {
        final int a;
        private int b;

        a(int i, int i2) {
            this.b = i;
            this.a = i2;
        }
    }

    /* renamed from: baz$b */
    static final class b {
        final float a;
        final int b;
        final int c;

        b(float f, int i, int i2) {
            this.a = f;
            this.b = i;
            this.c = i2;
        }
    }

    public baz() {
        super("TtmlDecoder");
        try {
            this.j = XmlPullParserFactory.newInstance();
            this.j.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long a(java.lang.String r14, defpackage.baz.b r15) {
        /*
            java.util.regex.Pattern r0 = c
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0088
            java.lang.String r14 = r0.group(r8)
            long r8 = java.lang.Long.parseLong(r14)
            r10 = 3600(0xe10, double:1.7786E-320)
            long r8 = r8 * r10
            double r8 = (double) r8
            java.lang.String r14 = r0.group(r7)
            long r10 = java.lang.Long.parseLong(r14)
            r12 = 60
            long r10 = r10 * r12
            double r10 = (double) r10
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r10)
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r6)
            long r6 = java.lang.Long.parseLong(r14)
            double r6 = (double) r6
            java.lang.Double.isNaN(r6)
            double r8 = r8 + r6
            java.lang.String r14 = r0.group(r5)
            r5 = 0
            if (r14 == 0) goto L_0x0051
            double r10 = java.lang.Double.parseDouble(r14)
            goto L_0x0052
        L_0x0051:
            r10 = r5
        L_0x0052:
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r4)
            if (r14 == 0) goto L_0x0063
            long r10 = java.lang.Long.parseLong(r14)
            float r14 = (float) r10
            float r1 = r15.a
            float r14 = r14 / r1
            double r10 = (double) r14
            goto L_0x0064
        L_0x0063:
            r10 = r5
        L_0x0064:
            double r8 = r8 + r10
            r14 = 6
            java.lang.String r14 = r0.group(r14)
            if (r14 == 0) goto L_0x0083
            long r0 = java.lang.Long.parseLong(r14)
            double r0 = (double) r0
            int r14 = r15.b
            double r4 = (double) r14
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r4)
            double r0 = r0 / r4
            float r14 = r15.a
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            double r5 = r0 / r14
        L_0x0083:
            double r8 = r8 + r5
            double r8 = r8 * r2
            long r14 = (long) r8
            return r14
        L_0x0088:
            java.util.regex.Pattern r0 = d
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x012b
            java.lang.String r14 = r0.group(r8)
            double r9 = java.lang.Double.parseDouble(r14)
            java.lang.String r14 = r0.group(r7)
            r0 = -1
            int r1 = r14.hashCode()
            r11 = 102(0x66, float:1.43E-43)
            if (r1 == r11) goto L_0x00f0
            r11 = 104(0x68, float:1.46E-43)
            if (r1 == r11) goto L_0x00e6
            r11 = 109(0x6d, float:1.53E-43)
            if (r1 == r11) goto L_0x00dc
            r11 = 3494(0xda6, float:4.896E-42)
            if (r1 == r11) goto L_0x00d2
            r11 = 115(0x73, float:1.61E-43)
            if (r1 == r11) goto L_0x00c8
            r11 = 116(0x74, float:1.63E-43)
            if (r1 == r11) goto L_0x00be
            goto L_0x00fa
        L_0x00be:
            java.lang.String r1 = "t"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00fa
            r14 = 5
            goto L_0x00fb
        L_0x00c8:
            java.lang.String r1 = "s"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00fa
            r14 = 2
            goto L_0x00fb
        L_0x00d2:
            java.lang.String r1 = "ms"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00fa
            r14 = 3
            goto L_0x00fb
        L_0x00dc:
            java.lang.String r1 = "m"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00fa
            r14 = 1
            goto L_0x00fb
        L_0x00e6:
            java.lang.String r1 = "h"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00fa
            r14 = 0
            goto L_0x00fb
        L_0x00f0:
            java.lang.String r1 = "f"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00fa
            r14 = 4
            goto L_0x00fb
        L_0x00fa:
            r14 = -1
        L_0x00fb:
            if (r14 == 0) goto L_0x0120
            if (r14 == r8) goto L_0x011d
            if (r14 == r7) goto L_0x0127
            if (r14 == r6) goto L_0x0116
            if (r14 == r5) goto L_0x010f
            if (r14 == r4) goto L_0x0108
            goto L_0x0127
        L_0x0108:
            int r14 = r15.c
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            goto L_0x011b
        L_0x010f:
            float r14 = r15.a
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            goto L_0x011b
        L_0x0116:
            r14 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x011b:
            double r9 = r9 / r14
            goto L_0x0127
        L_0x011d:
            r14 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0125
        L_0x0120:
            r14 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0125:
            double r9 = r9 * r14
        L_0x0127:
            double r9 = r9 * r2
            long r14 = (long) r9
            return r14
        L_0x012b:
            com.google.android.exoplayer2.text.SubtitleDecoderException r15 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Malformed time expression: "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baz.a(java.lang.String, baz$b):long");
    }

    private static a a(XmlPullParser xmlPullParser, a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = g.matcher(attributeValue);
        String str = "Ignoring malformed cell resolution: ";
        String str2 = "TtmlDecoder";
        if (!matcher.matches()) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(attributeValue);
            bdu.c(str2, sb.toString());
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1));
            int parseInt2 = Integer.parseInt(matcher.group(2));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            StringBuilder sb2 = new StringBuilder("Invalid cell resolution ");
            sb2.append(parseInt);
            sb2.append(" ");
            sb2.append(parseInt2);
            throw new SubtitleDecoderException(sb2.toString());
        } catch (NumberFormatException unused) {
            StringBuilder sb3 = new StringBuilder(str);
            sb3.append(attributeValue);
            bdu.c(str2, sb3.toString());
            return aVar;
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.bba a(org.xmlpull.v1.XmlPullParser r20, defpackage.bba r21, java.util.Map<java.lang.String, defpackage.bbb> r22, defpackage.baz.b r23) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            int r3 = r20.getAttributeCount()
            r4 = 0
            r5 = r19
            bbc r13 = r5.a(r0, r4)
            java.lang.String r9 = ""
            r17 = r4
            r16 = r9
            r4 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0027:
            if (r4 >= r3) goto L_0x00af
            java.lang.String r6 = r0.getAttributeName(r4)
            java.lang.String r7 = r0.getAttributeValue(r4)
            int r18 = r6.hashCode()
            switch(r18) {
                case -934795532: goto L_0x0061;
                case 99841: goto L_0x0057;
                case 100571: goto L_0x004d;
                case 93616297: goto L_0x0043;
                case 109780401: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x006b
        L_0x0039:
            java.lang.String r8 = "style"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x006b
            r6 = 3
            goto L_0x006c
        L_0x0043:
            java.lang.String r8 = "begin"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x006b
            r6 = 0
            goto L_0x006c
        L_0x004d:
            java.lang.String r8 = "end"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x006b
            r6 = 1
            goto L_0x006c
        L_0x0057:
            java.lang.String r8 = "dur"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x006b
            r6 = 2
            goto L_0x006c
        L_0x0061:
            java.lang.String r8 = "region"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x006b
            r6 = 4
            goto L_0x006c
        L_0x006b:
            r6 = -1
        L_0x006c:
            if (r6 == 0) goto L_0x00a4
            r8 = 1
            if (r6 == r8) goto L_0x009c
            r8 = 2
            if (r6 == r8) goto L_0x0094
            r8 = 3
            if (r6 == r8) goto L_0x0088
            r8 = 4
            if (r6 == r8) goto L_0x007d
            r6 = r22
            goto L_0x00ab
        L_0x007d:
            r6 = r22
            boolean r8 = r6.containsKey(r7)
            if (r8 == 0) goto L_0x00ab
            r16 = r7
            goto L_0x00ab
        L_0x0088:
            r6 = r22
            java.lang.String[] r7 = a(r7)
            int r8 = r7.length
            if (r8 <= 0) goto L_0x00ab
            r17 = r7
            goto L_0x00ab
        L_0x0094:
            r6 = r22
            long r7 = a(r7, r2)
            r14 = r7
            goto L_0x00ab
        L_0x009c:
            r6 = r22
            long r7 = a(r7, r2)
            r11 = r7
            goto L_0x00ab
        L_0x00a4:
            r6 = r22
            long r7 = a(r7, r2)
            r9 = r7
        L_0x00ab:
            int r4 = r4 + 1
            goto L_0x0027
        L_0x00af:
            if (r1 == 0) goto L_0x00cb
            long r2 = r1.a
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x00d0
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x00c3
            long r2 = r1.a
            long r9 = r9 + r2
        L_0x00c3:
            int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x00d0
            long r2 = r1.a
            long r11 = r11 + r2
            goto L_0x00d0
        L_0x00cb:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00d0:
            int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x00e6
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x00db
            long r14 = r14 + r9
            r11 = r14
            goto L_0x00e6
        L_0x00db:
            if (r1 == 0) goto L_0x00e6
            long r2 = r1.b
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x00e6
            long r1 = r1.b
            r11 = r1
        L_0x00e6:
            java.lang.String r7 = r20.getName()
            bba r0 = new bba
            r8 = 0
            r6 = r0
            r14 = r17
            r15 = r16
            r6.<init>(r7, r8, r9, r11, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baz.a(org.xmlpull.v1.XmlPullParser, bba, java.util.Map, baz$b):bba");
    }

    private static bbc a(bbc bbc) {
        return bbc == null ? new bbc() : bbc;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.bbc a(org.xmlpull.v1.XmlPullParser r17, defpackage.bbc r18) {
        /*
            r16 = this;
            r0 = r17
            int r1 = r17.getAttributeCount()
            r2 = 0
            r4 = r18
            r3 = 0
        L_0x000a:
            if (r3 >= r1) goto L_0x02b8
            java.lang.String r5 = r0.getAttributeValue(r3)
            java.lang.String r6 = r0.getAttributeName(r3)
            int r7 = r6.hashCode()
            r8 = 4
            r9 = -1
            r10 = 3
            r11 = 2
            r12 = 1
            switch(r7) {
                case -1550943582: goto L_0x0072;
                case -1224696685: goto L_0x0068;
                case -1065511464: goto L_0x005e;
                case -879295043: goto L_0x0053;
                case -734428249: goto L_0x0049;
                case 3355: goto L_0x003f;
                case 94842723: goto L_0x0035;
                case 365601008: goto L_0x002b;
                case 1287124693: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x007c
        L_0x0021:
            java.lang.String r7 = "backgroundColor"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x007c
            r6 = 1
            goto L_0x007d
        L_0x002b:
            java.lang.String r7 = "fontSize"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x007c
            r6 = 4
            goto L_0x007d
        L_0x0035:
            java.lang.String r7 = "color"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x007c
            r6 = 2
            goto L_0x007d
        L_0x003f:
            java.lang.String r7 = "id"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007d
        L_0x0049:
            java.lang.String r7 = "fontWeight"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x007c
            r6 = 5
            goto L_0x007d
        L_0x0053:
            java.lang.String r7 = "textDecoration"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x007c
            r6 = 8
            goto L_0x007d
        L_0x005e:
            java.lang.String r7 = "textAlign"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x007c
            r6 = 7
            goto L_0x007d
        L_0x0068:
            java.lang.String r7 = "fontFamily"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x007c
            r6 = 3
            goto L_0x007d
        L_0x0072:
            java.lang.String r7 = "fontStyle"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x007c
            r6 = 6
            goto L_0x007d
        L_0x007c:
            r6 = -1
        L_0x007d:
            java.lang.String r7 = "TtmlDecoder"
            switch(r6) {
                case 0: goto L_0x02a2;
                case 1: goto L_0x0284;
                case 2: goto L_0x0266;
                case 3: goto L_0x025c;
                case 4: goto L_0x0186;
                case 5: goto L_0x0175;
                case 6: goto L_0x0164;
                case 7: goto L_0x00e9;
                case 8: goto L_0x0084;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x02b4
        L_0x0084:
            java.lang.String r5 = defpackage.ben.d(r5)
            int r6 = r5.hashCode()
            switch(r6) {
                case -1461280213: goto L_0x00ae;
                case -1026963764: goto L_0x00a4;
                case 913457136: goto L_0x009a;
                case 1679736913: goto L_0x0090;
                default: goto L_0x008f;
            }
        L_0x008f:
            goto L_0x00b7
        L_0x0090:
            java.lang.String r6 = "linethrough"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00b7
            r9 = 0
            goto L_0x00b7
        L_0x009a:
            java.lang.String r6 = "nolinethrough"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00b7
            r9 = 1
            goto L_0x00b7
        L_0x00a4:
            java.lang.String r6 = "underline"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00b7
            r9 = 2
            goto L_0x00b7
        L_0x00ae:
            java.lang.String r6 = "nounderline"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00b7
            r9 = 3
        L_0x00b7:
            if (r9 == 0) goto L_0x00df
            if (r9 == r12) goto L_0x00d5
            if (r9 == r11) goto L_0x00cb
            if (r9 == r10) goto L_0x00c1
            goto L_0x02b4
        L_0x00c1:
            bbc r4 = a(r4)
            bbc r4 = r4.b(r2)
            goto L_0x02b4
        L_0x00cb:
            bbc r4 = a(r4)
            bbc r4 = r4.b(r12)
            goto L_0x02b4
        L_0x00d5:
            bbc r4 = a(r4)
            bbc r4 = r4.a(r2)
            goto L_0x02b4
        L_0x00df:
            bbc r4 = a(r4)
            bbc r4 = r4.a(r12)
            goto L_0x02b4
        L_0x00e9:
            java.lang.String r5 = defpackage.ben.d(r5)
            int r6 = r5.hashCode()
            switch(r6) {
                case -1364013995: goto L_0x011d;
                case 100571: goto L_0x0113;
                case 3317767: goto L_0x0109;
                case 108511772: goto L_0x00ff;
                case 109757538: goto L_0x00f5;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            goto L_0x0126
        L_0x00f5:
            java.lang.String r6 = "start"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0126
            r9 = 1
            goto L_0x0126
        L_0x00ff:
            java.lang.String r6 = "right"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0126
            r9 = 2
            goto L_0x0126
        L_0x0109:
            java.lang.String r6 = "left"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0126
            r9 = 0
            goto L_0x0126
        L_0x0113:
            java.lang.String r6 = "end"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0126
            r9 = 3
            goto L_0x0126
        L_0x011d:
            java.lang.String r6 = "center"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0126
            r9 = 4
        L_0x0126:
            if (r9 == 0) goto L_0x015a
            if (r9 == r12) goto L_0x0150
            if (r9 == r11) goto L_0x0146
            if (r9 == r10) goto L_0x013c
            if (r9 == r8) goto L_0x0132
            goto L_0x02b4
        L_0x0132:
            bbc r4 = a(r4)
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            r4.m = r5
            goto L_0x02b4
        L_0x013c:
            bbc r4 = a(r4)
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r4.m = r5
            goto L_0x02b4
        L_0x0146:
            bbc r4 = a(r4)
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r4.m = r5
            goto L_0x02b4
        L_0x0150:
            bbc r4 = a(r4)
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            r4.m = r5
            goto L_0x02b4
        L_0x015a:
            bbc r4 = a(r4)
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            r4.m = r5
            goto L_0x02b4
        L_0x0164:
            bbc r4 = a(r4)
            java.lang.String r6 = "italic"
            boolean r5 = r6.equalsIgnoreCase(r5)
            defpackage.bdl.b(r12)
            r4.i = r5
            goto L_0x02b4
        L_0x0175:
            bbc r4 = a(r4)
            java.lang.String r6 = "bold"
            boolean r5 = r6.equalsIgnoreCase(r5)
            defpackage.bdl.b(r12)
            r4.h = r5
            goto L_0x02b4
        L_0x0186:
            bbc r4 = a(r4)     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.lang.String r6 = "\\s+"
            java.lang.String[] r6 = defpackage.ben.a(r5, r6)     // Catch:{ SubtitleDecoderException -> 0x024a }
            int r8 = r6.length     // Catch:{ SubtitleDecoderException -> 0x024a }
            if (r8 != r12) goto L_0x019a
            java.util.regex.Pattern r6 = e     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.util.regex.Matcher r6 = r6.matcher(r5)     // Catch:{ SubtitleDecoderException -> 0x024a }
            goto L_0x01aa
        L_0x019a:
            int r8 = r6.length     // Catch:{ SubtitleDecoderException -> 0x024a }
            if (r8 != r11) goto L_0x0230
            java.util.regex.Pattern r8 = e     // Catch:{ SubtitleDecoderException -> 0x024a }
            r6 = r6[r12]     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.util.regex.Matcher r6 = r8.matcher(r6)     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.lang.String r8 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."
            defpackage.bdu.c(r7, r8)     // Catch:{ SubtitleDecoderException -> 0x024a }
        L_0x01aa:
            boolean r8 = r6.matches()     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.lang.String r13 = "'."
            if (r8 == 0) goto L_0x0219
            java.lang.String r8 = r6.group(r10)     // Catch:{ SubtitleDecoderException -> 0x024a }
            int r14 = r8.hashCode()     // Catch:{ SubtitleDecoderException -> 0x024a }
            r15 = 37
            if (r14 == r15) goto L_0x01db
            r15 = 3240(0xca8, float:4.54E-42)
            if (r14 == r15) goto L_0x01d1
            r15 = 3592(0xe08, float:5.033E-42)
            if (r14 == r15) goto L_0x01c7
            goto L_0x01e4
        L_0x01c7:
            java.lang.String r14 = "px"
            boolean r14 = r8.equals(r14)     // Catch:{ SubtitleDecoderException -> 0x024a }
            if (r14 == 0) goto L_0x01e4
            r9 = 0
            goto L_0x01e4
        L_0x01d1:
            java.lang.String r14 = "em"
            boolean r14 = r8.equals(r14)     // Catch:{ SubtitleDecoderException -> 0x024a }
            if (r14 == 0) goto L_0x01e4
            r9 = 1
            goto L_0x01e4
        L_0x01db:
            java.lang.String r14 = "%"
            boolean r14 = r8.equals(r14)     // Catch:{ SubtitleDecoderException -> 0x024a }
            if (r14 == 0) goto L_0x01e4
            r9 = 2
        L_0x01e4:
            if (r9 == 0) goto L_0x0207
            if (r9 == r12) goto L_0x0204
            if (r9 != r11) goto L_0x01ed
            r4.j = r10     // Catch:{ SubtitleDecoderException -> 0x024a }
            goto L_0x0209
        L_0x01ed:
            com.google.android.exoplayer2.text.SubtitleDecoderException r6 = new com.google.android.exoplayer2.text.SubtitleDecoderException     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.lang.String r10 = "Invalid unit for fontSize: '"
            r9.<init>(r10)     // Catch:{ SubtitleDecoderException -> 0x024a }
            r9.append(r8)     // Catch:{ SubtitleDecoderException -> 0x024a }
            r9.append(r13)     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.lang.String r8 = r9.toString()     // Catch:{ SubtitleDecoderException -> 0x024a }
            r6.<init>(r8)     // Catch:{ SubtitleDecoderException -> 0x024a }
            throw r6     // Catch:{ SubtitleDecoderException -> 0x024a }
        L_0x0204:
            r4.j = r11     // Catch:{ SubtitleDecoderException -> 0x024a }
            goto L_0x0209
        L_0x0207:
            r4.j = r12     // Catch:{ SubtitleDecoderException -> 0x024a }
        L_0x0209:
            java.lang.String r6 = r6.group(r12)     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ SubtitleDecoderException -> 0x024a }
            float r6 = r6.floatValue()     // Catch:{ SubtitleDecoderException -> 0x024a }
            r4.k = r6     // Catch:{ SubtitleDecoderException -> 0x024a }
            goto L_0x02b4
        L_0x0219:
            com.google.android.exoplayer2.text.SubtitleDecoderException r6 = new com.google.android.exoplayer2.text.SubtitleDecoderException     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.lang.String r9 = "Invalid expression for fontSize: '"
            r8.<init>(r9)     // Catch:{ SubtitleDecoderException -> 0x024a }
            r8.append(r5)     // Catch:{ SubtitleDecoderException -> 0x024a }
            r8.append(r13)     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.lang.String r8 = r8.toString()     // Catch:{ SubtitleDecoderException -> 0x024a }
            r6.<init>(r8)     // Catch:{ SubtitleDecoderException -> 0x024a }
            throw r6     // Catch:{ SubtitleDecoderException -> 0x024a }
        L_0x0230:
            com.google.android.exoplayer2.text.SubtitleDecoderException r8 = new com.google.android.exoplayer2.text.SubtitleDecoderException     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.lang.String r10 = "Invalid number of entries for fontSize: "
            r9.<init>(r10)     // Catch:{ SubtitleDecoderException -> 0x024a }
            int r6 = r6.length     // Catch:{ SubtitleDecoderException -> 0x024a }
            r9.append(r6)     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.lang.String r6 = "."
            r9.append(r6)     // Catch:{ SubtitleDecoderException -> 0x024a }
            java.lang.String r6 = r9.toString()     // Catch:{ SubtitleDecoderException -> 0x024a }
            r8.<init>(r6)     // Catch:{ SubtitleDecoderException -> 0x024a }
            throw r8     // Catch:{ SubtitleDecoderException -> 0x024a }
        L_0x024a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed parsing fontSize value: "
            r6.<init>(r8)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            defpackage.bdu.c(r7, r5)
            goto L_0x02b4
        L_0x025c:
            bbc r4 = a(r4)
            defpackage.bdl.b(r12)
            r4.a = r5
            goto L_0x02b4
        L_0x0266:
            bbc r4 = a(r4)
            int r6 = defpackage.bdp.a(r5)     // Catch:{ IllegalArgumentException -> 0x0272 }
            r4.a(r6)     // Catch:{ IllegalArgumentException -> 0x0272 }
            goto L_0x02b4
        L_0x0272:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed parsing color value: "
            r6.<init>(r8)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            defpackage.bdu.c(r7, r5)
            goto L_0x02b4
        L_0x0284:
            bbc r4 = a(r4)
            int r6 = defpackage.bdp.a(r5)     // Catch:{ IllegalArgumentException -> 0x0290 }
            r4.b(r6)     // Catch:{ IllegalArgumentException -> 0x0290 }
            goto L_0x02b4
        L_0x0290:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed parsing background value: "
            r6.<init>(r8)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            defpackage.bdu.c(r7, r5)
            goto L_0x02b4
        L_0x02a2:
            java.lang.String r6 = r17.getName()
            java.lang.String r7 = "style"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x02b4
            bbc r4 = a(r4)
            r4.l = r5
        L_0x02b4:
            int r3 = r3 + 1
            goto L_0x000a
        L_0x02b8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baz.a(org.xmlpull.v1.XmlPullParser, bbc):bbc");
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0155 A[SYNTHETIC, Splitter:B:69:0x0155] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016b A[Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.bbd a(byte[] r30, int r31) {
        /*
            r29 = this;
            r1 = r29
            java.lang.String r2 = "\n"
            java.lang.String r3 = "http://www.w3.org/ns/ttml#parameter"
            org.xmlpull.v1.XmlPullParserFactory r0 = r1.j     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            org.xmlpull.v1.XmlPullParser r4 = r0.newPullParser()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.lang.String r0 = ""
            bbb r7 = new bbb     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r8 = 0
            r7.<init>(r8)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r6.put(r0, r7)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r7 = 0
            r9 = r30
            r10 = r31
            r0.<init>(r9, r7, r10)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r4.setInput(r0, r8)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.util.ArrayDeque r9 = new java.util.ArrayDeque     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            int r0 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            baz$b r10 = h     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            baz$a r11 = i     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r12 = r11
            r11 = r10
            r10 = 0
        L_0x003e:
            r13 = 1
            if (r0 == r13) goto L_0x0205
            java.lang.Object r14 = r9.peek()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            bba r14 = (defpackage.bba) r14     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r15 = 2
            if (r10 != 0) goto L_0x01e7
            java.lang.String r13 = r4.getName()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.lang.String r7 = " "
            r17 = r11
            java.lang.String r11 = "tt"
            if (r0 != r15) goto L_0x018d
            boolean r0 = r11.equals(r13)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 == 0) goto L_0x00d1
            r0 = 30
            java.lang.String r12 = "frameRate"
            java.lang.String r12 = r4.getAttributeValue(r3, r12)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r12 == 0) goto L_0x006a
            int r0 = java.lang.Integer.parseInt(r12)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
        L_0x006a:
            java.lang.String r12 = "frameRateMultiplier"
            java.lang.String r12 = r4.getAttributeValue(r3, r12)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r12 == 0) goto L_0x0094
            java.lang.String[] r7 = defpackage.ben.a(r12, r7)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            int r12 = r7.length     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r12 != r15) goto L_0x008c
            r16 = 0
            r12 = r7[r16]     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            float r12 = (float) r12     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r15 = 1
            r7 = r7[r15]     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            float r7 = (float) r7     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            float r12 = r12 / r7
            goto L_0x0099
        L_0x008c:
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = new com.google.android.exoplayer2.text.SubtitleDecoderException     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.lang.String r2 = "frameRateMultiplier doesn't have 2 parts"
            r0.<init>(r2)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            throw r0     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
        L_0x0094:
            r15 = 1
            r16 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
        L_0x0099:
            baz$b r7 = h     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            int r7 = r7.b     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.lang.String r15 = "subFrameRate"
            java.lang.String r15 = r4.getAttributeValue(r3, r15)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r15 == 0) goto L_0x00a9
            int r7 = java.lang.Integer.parseInt(r15)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
        L_0x00a9:
            baz$b r15 = h     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            int r15 = r15.c     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r17 = r15
            java.lang.String r15 = "tickRate"
            java.lang.String r15 = r4.getAttributeValue(r3, r15)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r15 == 0) goto L_0x00be
            int r15 = java.lang.Integer.parseInt(r15)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r18 = r3
            goto L_0x00c2
        L_0x00be:
            r18 = r3
            r15 = r17
        L_0x00c2:
            baz$b r3 = new baz$b     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            float r0 = (float) r0     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            float r0 = r0 * r12
            r3.<init>(r0, r7, r15)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            baz$a r0 = i     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            baz$a r12 = a(r4, r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            goto L_0x00d7
        L_0x00d1:
            r18 = r3
            r16 = 0
            r3 = r17
        L_0x00d7:
            boolean r0 = r13.equals(r11)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.lang.String r7 = "head"
            if (r0 != 0) goto L_0x0150
            boolean r0 = r13.equals(r7)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "body"
            boolean r0 = r13.equals(r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "div"
            boolean r0 = r13.equals(r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "p"
            boolean r0 = r13.equals(r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "span"
            boolean r0 = r13.equals(r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "br"
            boolean r0 = r13.equals(r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "style"
            boolean r0 = r13.equals(r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "styling"
            boolean r0 = r13.equals(r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "layout"
            boolean r0 = r13.equals(r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "region"
            boolean r0 = r13.equals(r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "metadata"
            boolean r0 = r13.equals(r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "smpte:image"
            boolean r0 = r13.equals(r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "smpte:data"
            boolean r0 = r13.equals(r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "smpte:information"
            boolean r0 = r13.equals(r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r0 = 0
            goto L_0x0151
        L_0x0150:
            r0 = 1
        L_0x0151:
            java.lang.String r11 = "TtmlDecoder"
            if (r0 != 0) goto L_0x016b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.lang.String r7 = "Ignoring unsupported tag: "
            r0.<init>(r7)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.lang.String r7 = r4.getName()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r0.append(r7)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.lang.String r0 = r0.toString()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            defpackage.bdu.b(r11, r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            goto L_0x018a
        L_0x016b:
            boolean r0 = r7.equals(r13)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 == 0) goto L_0x0175
            r1.a(r4, r5, r6, r12)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            goto L_0x0181
        L_0x0175:
            bba r0 = r1.a(r4, r14, r6, r3)     // Catch:{ SubtitleDecoderException -> 0x0184 }
            r9.push(r0)     // Catch:{ SubtitleDecoderException -> 0x0184 }
            if (r14 == 0) goto L_0x0181
            r14.a(r0)     // Catch:{ SubtitleDecoderException -> 0x0184 }
        L_0x0181:
            r11 = r3
            goto L_0x01f9
        L_0x0184:
            r0 = move-exception
            java.lang.String r7 = "Suppressing parser error"
            defpackage.bdu.a(r11, r7, r0)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
        L_0x018a:
            int r10 = r10 + 1
            goto L_0x0181
        L_0x018d:
            r18 = r3
            r16 = 0
            r3 = 4
            if (r0 != r3) goto L_0x01cb
            java.lang.String r0 = r4.getText()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            bba r3 = new bba     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r20 = 0
            java.lang.String r11 = "\r\n"
            java.lang.String r0 = r0.replaceAll(r11, r2)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.lang.String r11 = " *\n *"
            java.lang.String r0 = r0.replaceAll(r11, r2)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.lang.String r0 = r0.replaceAll(r2, r7)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.lang.String r11 = "[ \t\\x0B\f\r]+"
            java.lang.String r21 = r0.replaceAll(r11, r7)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r26 = 0
            r27 = 0
            java.lang.String r28 = ""
            r19 = r3
            r19.<init>(r20, r21, r22, r24, r26, r27, r28)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r14.a(r3)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            goto L_0x01f7
        L_0x01cb:
            r3 = 3
            if (r0 != r3) goto L_0x01f7
            java.lang.String r0 = r4.getName()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            boolean r0 = r0.equals(r11)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            if (r0 == 0) goto L_0x01e3
            bbd r8 = new bbd     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            java.lang.Object r0 = r9.peek()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            bba r0 = (defpackage.bba) r0     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r8.<init>(r0, r5, r6)     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
        L_0x01e3:
            r9.pop()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            goto L_0x01f7
        L_0x01e7:
            r18 = r3
            r17 = r11
            r16 = 0
            if (r0 != r15) goto L_0x01f2
            int r10 = r10 + 1
            goto L_0x01f7
        L_0x01f2:
            r3 = 3
            if (r0 != r3) goto L_0x01f7
            int r10 = r10 + -1
        L_0x01f7:
            r11 = r17
        L_0x01f9:
            r4.next()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            int r0 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x020f, IOException -> 0x0206 }
            r3 = r18
            r7 = 0
            goto L_0x003e
        L_0x0205:
            return r8
        L_0x0206:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unexpected error when reading input."
            r2.<init>(r3, r0)
            throw r2
        L_0x020f:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r2 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r3 = "Unable to decode source"
            r2.<init>(r3, r0)
            goto L_0x0219
        L_0x0218:
            throw r2
        L_0x0219:
            goto L_0x0218
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baz.a(byte[], int):bbd");
    }

    private Map<String, bbc> a(XmlPullParser xmlPullParser, Map<String, bbc> map, Map<String, bbb> map2, a aVar) {
        boolean z;
        do {
            xmlPullParser.next();
            String str = "style";
            z = false;
            if (beo.a(xmlPullParser, str)) {
                String b2 = beo.b(xmlPullParser, str);
                bbc a2 = a(xmlPullParser, new bbc());
                if (b2 != null) {
                    for (String str2 : a(b2)) {
                        a2.a((bbc) map.get(str2), true);
                    }
                }
                if (a2.l != null) {
                    map.put(a2.l, a2);
                }
            } else if (beo.a(xmlPullParser, "region")) {
                bbb b3 = b(xmlPullParser, aVar);
                if (b3 != null) {
                    map2.put(b3.a, b3);
                }
            }
            if ((xmlPullParser.getEventType() == 3) && xmlPullParser.getName().equals("head")) {
                z = true;
                continue;
            }
        } while (!z);
        return map;
    }

    private static String[] a(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : ben.a(trim, "\\s+");
    }

    private static bbb b(XmlPullParser xmlPullParser, a aVar) {
        String b2 = beo.b(xmlPullParser, "id");
        if (b2 == null) {
            return null;
        }
        String b3 = beo.b(xmlPullParser, "origin");
        String str = "TtmlDecoder";
        if (b3 != null) {
            Matcher matcher = f.matcher(b3);
            if (matcher.matches()) {
                try {
                    float parseFloat = Float.parseFloat(matcher.group(1)) / 100.0f;
                    int i2 = 2;
                    float parseFloat2 = Float.parseFloat(matcher.group(2)) / 100.0f;
                    String b4 = beo.b(xmlPullParser, "extent");
                    if (b4 != null) {
                        Matcher matcher2 = f.matcher(b4);
                        if (matcher2.matches()) {
                            try {
                                float parseFloat3 = Float.parseFloat(matcher2.group(1)) / 100.0f;
                                float parseFloat4 = Float.parseFloat(matcher2.group(2)) / 100.0f;
                                String b5 = beo.b(xmlPullParser, "displayAlign");
                                if (b5 != null) {
                                    String d2 = ben.d(b5);
                                    char c2 = 65535;
                                    int hashCode = d2.hashCode();
                                    if (hashCode != -1364013995) {
                                        if (hashCode == 92734940 && d2.equals("after")) {
                                            c2 = 1;
                                        }
                                    } else if (d2.equals("center")) {
                                        c2 = 0;
                                    }
                                    if (c2 == 0) {
                                        parseFloat2 += parseFloat4 / 2.0f;
                                        i2 = 1;
                                    } else if (c2 == 1) {
                                        parseFloat2 += parseFloat4;
                                    }
                                    bbb bbb = new bbb(b2, parseFloat, parseFloat2, 0, i2, parseFloat3, 1, 1.0f / ((float) aVar.a));
                                    return bbb;
                                }
                                i2 = 0;
                                bbb bbb2 = new bbb(b2, parseFloat, parseFloat2, 0, i2, parseFloat3, 1, 1.0f / ((float) aVar.a));
                                return bbb2;
                            } catch (NumberFormatException unused) {
                                StringBuilder sb = new StringBuilder("Ignoring region with malformed extent: ");
                                sb.append(b3);
                                bdu.c(str, sb.toString());
                                return null;
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Ignoring region with unsupported extent: ");
                            sb2.append(b3);
                            bdu.c(str, sb2.toString());
                            return null;
                        }
                    } else {
                        bdu.c(str, "Ignoring region without an extent");
                        return null;
                    }
                } catch (NumberFormatException unused2) {
                    StringBuilder sb3 = new StringBuilder("Ignoring region with malformed origin: ");
                    sb3.append(b3);
                    bdu.c(str, sb3.toString());
                    return null;
                }
            } else {
                StringBuilder sb4 = new StringBuilder("Ignoring region with unsupported origin: ");
                sb4.append(b3);
                bdu.c(str, sb4.toString());
                return null;
            }
        } else {
            bdu.c(str, "Ignoring region without an origin");
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ bac a(byte[] bArr, int i2, boolean z) {
        return a(bArr, i2);
    }
}
