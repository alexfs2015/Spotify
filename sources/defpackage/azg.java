package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: azg reason: default package */
public final class azg implements defpackage.bca.a<azf> {
    private static final Pattern A = a("DEFAULT");
    private static final Pattern B = a("FORCED");
    private static final Pattern C = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern D = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern E = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final Pattern a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern b = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern c = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern d = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern e = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern f = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern g = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern h = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern i = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern j = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern k = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern l = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern m = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern n = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern o = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern p = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern q = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern r = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern s = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern t = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern u = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern v = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern w = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern x = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern y = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern z = a("AUTOSELECT");
    private final azd F;

    /* renamed from: azg$a */
    static class a {
        private final BufferedReader a;
        private final Queue<String> b;
        private String c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.b = queue;
            this.a = bufferedReader;
        }

        public final boolean a() {
            if (this.c != null) {
                return true;
            }
            if (!this.b.isEmpty()) {
                this.c = (String) this.b.poll();
                return true;
            }
            do {
                String readLine = this.a.readLine();
                this.c = readLine;
                if (readLine == null) {
                    return false;
                }
                this.c = this.c.trim();
            } while (this.c.isEmpty());
            return true;
        }

        public final String b() {
            if (!a()) {
                return null;
            }
            String str = this.c;
            this.c = null;
            return str;
        }
    }

    public azg() {
        this(azd.a);
    }

    public azg(azd azd) {
        this.F = azd;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public azf a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (a(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                                if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    break;
                                } else if (trim.equals("#EXT-X-ENDLIST")) {
                                    break;
                                } else {
                                    arrayDeque.add(trim);
                                }
                            } else {
                                arrayDeque.add(trim);
                                azd a2 = a(new a(arrayDeque, bufferedReader), uri.toString());
                                bdw.a((Closeable) bufferedReader);
                                return a2;
                            }
                        }
                    } else {
                        bdw.a((Closeable) bufferedReader);
                        throw new ParserException("Failed to parse the playlist, could not identify any tags.");
                    }
                }
                arrayDeque.add(trim);
                return a(this.F, new a(arrayDeque, bufferedReader), uri.toString());
            }
            throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
        } finally {
            bdw.a((Closeable) bufferedReader);
        }
    }

    private static boolean a(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int a2 = a(bufferedReader, true, read);
        for (int i2 = 0; i2 < 7; i2++) {
            if (a2 != "#EXTM3U".charAt(i2)) {
                return false;
            }
            a2 = bufferedReader.read();
        }
        return bdw.a(a(bufferedReader, false, a2));
    }

    private static int a(BufferedReader bufferedReader, boolean z2, int i2) {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !bdw.a(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0200  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.azd a(defpackage.azg.a r32, java.lang.String r33) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 1
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x002c:
            boolean r12 = r32.a()
            r14 = 0
            if (r12 == 0) goto L_0x0115
            java.lang.String r12 = r32.b()
            java.lang.String r15 = "#EXT"
            boolean r15 = r12.startsWith(r15)
            if (r15 == 0) goto L_0x0042
            r4.add(r12)
        L_0x0042:
            java.lang.String r15 = "#EXT-X-DEFINE"
            boolean r15 = r12.startsWith(r15)
            if (r15 == 0) goto L_0x005a
            java.util.regex.Pattern r13 = w
            java.lang.String r13 = a(r12, r13, r11)
            java.util.regex.Pattern r14 = C
            java.lang.String r12 = a(r12, r14, r11)
            r11.put(r13, r12)
            goto L_0x002c
        L_0x005a:
            java.lang.String r15 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0064
            r10 = 1
            goto L_0x002c
        L_0x0064:
            java.lang.String r15 = "#EXT-X-MEDIA"
            boolean r15 = r12.startsWith(r15)
            if (r15 == 0) goto L_0x0070
            r2.add(r12)
            goto L_0x002c
        L_0x0070:
            java.lang.String r15 = "#EXT-X-STREAM-INF"
            boolean r15 = r12.startsWith(r15)
            if (r15 == 0) goto L_0x002c
            java.lang.String r15 = "CLOSED-CAPTIONS=NONE"
            boolean r15 = r12.contains(r15)
            r9 = r9 | r15
            java.util.regex.Pattern r15 = c
            int r15 = a(r12, r15)
            java.util.regex.Pattern r13 = a
            java.lang.String r13 = a(r12, r13, r14, r11)
            if (r13 == 0) goto L_0x0091
            int r15 = java.lang.Integer.parseInt(r13)
        L_0x0091:
            r21 = r15
            java.util.regex.Pattern r13 = d
            java.lang.String r13 = a(r12, r13, r14, r11)
            java.util.regex.Pattern r15 = e
            java.lang.String r15 = a(r12, r15, r14, r11)
            if (r15 == 0) goto L_0x00be
            java.lang.String r14 = "x"
            java.lang.String[] r14 = r15.split(r14)
            r15 = r14[r8]
            int r15 = java.lang.Integer.parseInt(r15)
            r14 = r14[r3]
            int r14 = java.lang.Integer.parseInt(r14)
            if (r15 <= 0) goto L_0x00b7
            if (r14 > 0) goto L_0x00b9
        L_0x00b7:
            r14 = -1
            r15 = -1
        L_0x00b9:
            r23 = r14
            r22 = r15
            goto L_0x00c2
        L_0x00be:
            r22 = -1
            r23 = -1
        L_0x00c2:
            java.util.regex.Pattern r15 = f
            r14 = 0
            java.lang.String r15 = a(r12, r15, r14, r11)
            if (r15 == 0) goto L_0x00d2
            float r15 = java.lang.Float.parseFloat(r15)
            r24 = r15
            goto L_0x00d4
        L_0x00d2:
            r24 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x00d4:
            java.util.regex.Pattern r15 = b
            java.lang.String r12 = a(r12, r15, r14, r11)
            if (r12 == 0) goto L_0x00e5
            if (r13 == 0) goto L_0x00e5
            java.lang.String r14 = defpackage.bdw.a(r13, r3)
            r1.put(r12, r14)
        L_0x00e5:
            java.lang.String r12 = r32.b()
            java.lang.String r12 = a(r12, r11)
            boolean r14 = r0.add(r12)
            if (r14 == 0) goto L_0x002c
            int r14 = r5.size()
            java.lang.String r16 = java.lang.Integer.toString(r14)
            r17 = 0
            r19 = 0
            r25 = 0
            r26 = 0
            java.lang.String r18 = "application/x-mpegURL"
            r20 = r13
            aqe r13 = defpackage.aqe.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            azd$a r14 = new azd$a
            r14.<init>(r12, r13)
            r5.add(r14)
            goto L_0x002c
        L_0x0115:
            r0 = 0
            r12 = 0
            r13 = 0
        L_0x0118:
            int r14 = r2.size()
            if (r0 >= r14) goto L_0x023b
            java.lang.Object r14 = r2.get(r0)
            java.lang.String r14 = (java.lang.String) r14
            java.util.regex.Pattern r15 = A
            boolean r15 = a(r14, r15, r8)
            java.util.regex.Pattern r3 = B
            boolean r3 = a(r14, r3, r8)
            if (r3 == 0) goto L_0x0134
            r15 = r15 | 2
        L_0x0134:
            java.util.regex.Pattern r3 = z
            boolean r3 = a(r14, r3, r8)
            if (r3 == 0) goto L_0x013e
            r15 = r15 | 4
        L_0x013e:
            r27 = r15
            java.util.regex.Pattern r3 = s
            r15 = 0
            java.lang.String r3 = a(r14, r3, r15, r11)
            java.util.regex.Pattern r8 = w
            java.lang.String r19 = a(r14, r8, r11)
            java.util.regex.Pattern r8 = v
            java.lang.String r28 = a(r14, r8, r15, r11)
            java.util.regex.Pattern r8 = x
            java.lang.String r8 = a(r14, r8, r15, r11)
            java.util.regex.Pattern r15 = u
            java.lang.String r15 = a(r14, r15, r11)
            r29 = r2
            int r2 = r15.hashCode()
            r30 = r10
            r10 = -959297733(0xffffffffc6d2473b, float:-26915.615)
            r31 = r12
            r12 = 2
            if (r2 == r10) goto L_0x018e
            r10 = -333210994(0xffffffffec239a8e, float:-7.911391E26)
            if (r2 == r10) goto L_0x0184
            r10 = 62628790(0x3bba3b6, float:1.1028458E-36)
            if (r2 == r10) goto L_0x017a
            goto L_0x0198
        L_0x017a:
            java.lang.String r2 = "AUDIO"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x0198
            r2 = 0
            goto L_0x0199
        L_0x0184:
            java.lang.String r2 = "CLOSED-CAPTIONS"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x0198
            r2 = 2
            goto L_0x0199
        L_0x018e:
            java.lang.String r2 = "SUBTITLES"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x0198
            r2 = 1
            goto L_0x0199
        L_0x0198:
            r2 = -1
        L_0x0199:
            if (r2 == 0) goto L_0x0200
            r10 = 1
            if (r2 == r10) goto L_0x01e5
            if (r2 == r12) goto L_0x01a2
            goto L_0x022f
        L_0x01a2:
            java.util.regex.Pattern r2 = y
            java.lang.String r2 = a(r14, r2, r11)
            java.lang.String r3 = "CC"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x01bb
            java.lang.String r2 = r2.substring(r12)
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r3 = "application/cea-608"
            goto L_0x01c6
        L_0x01bb:
            r3 = 7
            java.lang.String r2 = r2.substring(r3)
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r3 = "application/cea-708"
        L_0x01c6:
            r26 = r2
            r21 = r3
            if (r13 != 0) goto L_0x01d1
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x01d1:
            r20 = 0
            r22 = 0
            r23 = -1
            r18 = r19
            r24 = r27
            r25 = r28
            aqe r2 = defpackage.aqe.a(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r13.add(r2)
            goto L_0x022f
        L_0x01e5:
            r22 = 0
            r23 = -1
            java.lang.String r20 = "application/x-mpegURL"
            java.lang.String r21 = "text/vtt"
            r18 = r19
            r24 = r27
            r25 = r28
            aqe r2 = defpackage.aqe.a(r18, r19, r20, r21, r22, r23, r24, r25)
            azd$a r8 = new azd$a
            r8.<init>(r3, r2)
            r7.add(r8)
            goto L_0x022f
        L_0x0200:
            r10 = 1
            java.lang.Object r2 = r1.get(r8)
            r22 = r2
            java.lang.String r22 = (java.lang.String) r22
            if (r22 == 0) goto L_0x0212
            java.lang.String r14 = defpackage.bdg.f(r22)
            r21 = r14
            goto L_0x0214
        L_0x0212:
            r21 = 0
        L_0x0214:
            r23 = -1
            r24 = -1
            r25 = -1
            r26 = 0
            java.lang.String r20 = "application/x-mpegURL"
            r18 = r19
            aqe r12 = defpackage.aqe.a(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r3 != 0) goto L_0x0227
            goto L_0x0231
        L_0x0227:
            azd$a r2 = new azd$a
            r2.<init>(r3, r12)
            r6.add(r2)
        L_0x022f:
            r12 = r31
        L_0x0231:
            int r0 = r0 + 1
            r2 = r29
            r10 = r30
            r3 = 1
            r8 = 0
            goto L_0x0118
        L_0x023b:
            r30 = r10
            r31 = r12
            if (r9 == 0) goto L_0x0247
            java.util.List r0 = java.util.Collections.emptyList()
            r9 = r0
            goto L_0x0248
        L_0x0247:
            r9 = r13
        L_0x0248:
            azd r0 = new azd
            r2 = r0
            r3 = r33
            r8 = r31
            r10 = r30
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azg.a(azg$a, java.lang.String):azd");
    }

    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r33v0 */
    /* JADX WARNING: type inference failed for: r53v0 */
    /* JADX WARNING: type inference failed for: r54v0 */
    /* JADX WARNING: type inference failed for: r54v1 */
    /* JADX WARNING: type inference failed for: r53v1 */
    /* JADX WARNING: type inference failed for: r33v1 */
    /* JADX WARNING: type inference failed for: r14v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r54v2 */
    /* JADX WARNING: type inference failed for: r53v2 */
    /* JADX WARNING: type inference failed for: r33v2 */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r33v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r14v3 */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r42v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r40v0, types: [asc] */
    /* JADX WARNING: type inference failed for: r41v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r33v5 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v10, types: [asc] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r14v7, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r42v1 */
    /* JADX WARNING: type inference failed for: r42v2 */
    /* JADX WARNING: type inference failed for: r42v3 */
    /* JADX WARNING: type inference failed for: r14v8 */
    /* JADX WARNING: type inference failed for: r14v9 */
    /* JADX WARNING: type inference failed for: r14v10 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r54v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r33v6 */
    /* JADX WARNING: type inference failed for: r14v12 */
    /* JADX WARNING: type inference failed for: r53v3 */
    /* JADX WARNING: type inference failed for: r14v13, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r33v7 */
    /* JADX WARNING: type inference failed for: r14v14, types: [asc$a] */
    /* JADX WARNING: type inference failed for: r14v17, types: [asc$a] */
    /* JADX WARNING: type inference failed for: r53v4, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r54v4 */
    /* JADX WARNING: type inference failed for: r53v5 */
    /* JADX WARNING: type inference failed for: r33v8 */
    /* JADX WARNING: type inference failed for: r33v9 */
    /* JADX WARNING: type inference failed for: r53v6 */
    /* JADX WARNING: type inference failed for: r54v5 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r14v18 */
    /* JADX WARNING: type inference failed for: r54v6 */
    /* JADX WARNING: type inference failed for: r54v7 */
    /* JADX WARNING: type inference failed for: r54v8 */
    /* JADX WARNING: type inference failed for: r54v9 */
    /* JADX WARNING: type inference failed for: r54v10 */
    /* JADX WARNING: type inference failed for: r54v11 */
    /* JADX WARNING: type inference failed for: r54v12 */
    /* JADX WARNING: type inference failed for: r54v13 */
    /* JADX WARNING: type inference failed for: r54v14 */
    /* JADX WARNING: type inference failed for: r54v15 */
    /* JADX WARNING: type inference failed for: r54v16 */
    /* JADX WARNING: type inference failed for: r54v17 */
    /* JADX WARNING: type inference failed for: r54v18 */
    /* JADX WARNING: type inference failed for: r54v19 */
    /* JADX WARNING: type inference failed for: r53v7 */
    /* JADX WARNING: type inference failed for: r53v8 */
    /* JADX WARNING: type inference failed for: r53v9 */
    /* JADX WARNING: type inference failed for: r53v10 */
    /* JADX WARNING: type inference failed for: r53v11 */
    /* JADX WARNING: type inference failed for: r53v12 */
    /* JADX WARNING: type inference failed for: r53v13 */
    /* JADX WARNING: type inference failed for: r53v14 */
    /* JADX WARNING: type inference failed for: r53v15 */
    /* JADX WARNING: type inference failed for: r53v16 */
    /* JADX WARNING: type inference failed for: r53v17 */
    /* JADX WARNING: type inference failed for: r53v18 */
    /* JADX WARNING: type inference failed for: r53v19 */
    /* JADX WARNING: type inference failed for: r53v20 */
    /* JADX WARNING: type inference failed for: r33v10 */
    /* JADX WARNING: type inference failed for: r33v11 */
    /* JADX WARNING: type inference failed for: r33v12 */
    /* JADX WARNING: type inference failed for: r33v13 */
    /* JADX WARNING: type inference failed for: r14v19 */
    /* JADX WARNING: type inference failed for: r14v20 */
    /* JADX WARNING: type inference failed for: r14v21 */
    /* JADX WARNING: type inference failed for: r14v22 */
    /* JADX WARNING: type inference failed for: r14v23 */
    /* JADX WARNING: type inference failed for: r14v24 */
    /* JADX WARNING: type inference failed for: r14v25 */
    /* JADX WARNING: type inference failed for: r14v26 */
    /* JADX WARNING: type inference failed for: r14v27 */
    /* JADX WARNING: type inference failed for: r14v28 */
    /* JADX WARNING: type inference failed for: r14v29 */
    /* JADX WARNING: type inference failed for: r54v20 */
    /* JADX WARNING: type inference failed for: r53v21 */
    /* JADX WARNING: type inference failed for: r33v14 */
    /* JADX WARNING: type inference failed for: r14v30 */
    /* JADX WARNING: type inference failed for: r33v15 */
    /* JADX WARNING: type inference failed for: r14v31 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r12v21 */
    /* JADX WARNING: type inference failed for: r12v22 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r42v4 */
    /* JADX WARNING: type inference failed for: r14v32 */
    /* JADX WARNING: type inference failed for: r14v33 */
    /* JADX WARNING: type inference failed for: r14v34 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r54v21 */
    /* JADX WARNING: type inference failed for: r54v22 */
    /* JADX WARNING: type inference failed for: r33v16 */
    /* JADX WARNING: type inference failed for: r14v35 */
    /* JADX WARNING: type inference failed for: r53v22 */
    /* JADX WARNING: type inference failed for: r33v17 */
    /* JADX WARNING: type inference failed for: r14v36 */
    /* JADX WARNING: type inference failed for: r14v37 */
    /* JADX WARNING: type inference failed for: r53v23 */
    /* JADX WARNING: type inference failed for: r54v23 */
    /* JADX WARNING: type inference failed for: r53v24 */
    /* JADX WARNING: type inference failed for: r33v18 */
    /* JADX WARNING: type inference failed for: r33v19 */
    /* JADX WARNING: type inference failed for: r53v25 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r54v2
      assigns: []
      uses: []
      mth insns count: 442
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 39 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.aze a(defpackage.azd r60, defpackage.azg.a r61, java.lang.String r62) {
        /*
            r0 = r60
            boolean r1 = r0.p
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r7 = ""
            r12 = 1
            r13 = 0
            r14 = 0
            r26 = r1
            r16 = r4
            r24 = r16
            r34 = r7
            r5 = r14
            r28 = r5
            r33 = r28
            r53 = r33
            r54 = r53
            r55 = r54
            r1 = 0
            r4 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r23 = 1
            r27 = 0
            r29 = 0
            r31 = 0
            r47 = 0
            r48 = -1
            r50 = 0
            r51 = 0
            r56 = 0
        L_0x004f:
            boolean r35 = r61.a()
            if (r35 == 0) goto L_0x039c
            java.lang.String r8 = r61.b()
            java.lang.String r9 = "#EXT"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0064
            r6.add(r8)
        L_0x0064:
            java.lang.String r9 = "#EXT-X-PLAYLIST-TYPE"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0086
            java.util.regex.Pattern r9 = i
            java.lang.String r8 = a(r8, r9, r2)
            java.lang.String r9 = "VOD"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x007c
            r4 = 1
            goto L_0x004f
        L_0x007c:
            java.lang.String r9 = "EVENT"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x004f
            r4 = 2
            goto L_0x004f
        L_0x0086:
            java.lang.String r9 = "#EXT-X-START"
            boolean r9 = r8.startsWith(r9)
            r35 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r9 == 0) goto L_0x009f
            java.util.regex.Pattern r9 = m
            double r8 = b(r8, r9)
            double r8 = r8 * r35
            long r8 = (long) r8
            r16 = r8
            goto L_0x004f
        L_0x009f:
            java.lang.String r9 = "#EXT-X-MAP"
            boolean r9 = r8.startsWith(r9)
            java.lang.String r10 = "@"
            if (r9 == 0) goto L_0x00dd
            java.util.regex.Pattern r9 = s
            java.lang.String r36 = a(r8, r9, r2)
            java.util.regex.Pattern r9 = o
            java.lang.String r8 = a(r8, r9, r14, r2)
            if (r8 == 0) goto L_0x00ca
            java.lang.String[] r8 = r8.split(r10)
            r9 = r8[r13]
            long r48 = java.lang.Long.parseLong(r9)
            int r9 = r8.length
            if (r9 <= r12) goto L_0x00ca
            r8 = r8[r12]
            long r29 = java.lang.Long.parseLong(r8)
        L_0x00ca:
            r37 = r29
            r39 = r48
            aze$a r8 = new aze$a
            r35 = r8
            r35.<init>(r36, r37, r39)
            r55 = r8
            r29 = 0
            r48 = -1
            goto L_0x004f
        L_0x00dd:
            java.lang.String r9 = "#EXT-X-TARGETDURATION"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x00f3
            java.util.regex.Pattern r9 = g
            int r8 = a(r8, r9)
            long r8 = (long) r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r24 = r8 * r10
            goto L_0x004f
        L_0x00f3:
            java.lang.String r9 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x010d
            java.util.regex.Pattern r9 = j
            java.util.Map r10 = java.util.Collections.emptyMap()
            java.lang.String r8 = a(r8, r9, r10)
            long r31 = java.lang.Long.parseLong(r8)
            r21 = r31
            goto L_0x004f
        L_0x010d:
            java.lang.String r9 = "#EXT-X-VERSION"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x011d
            java.util.regex.Pattern r9 = h
            int r23 = a(r8, r9)
            goto L_0x004f
        L_0x011d:
            java.lang.String r9 = "#EXT-X-DEFINE"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0150
            java.util.regex.Pattern r9 = D
            java.lang.String r9 = a(r8, r9, r14, r2)
            if (r9 == 0) goto L_0x013b
            java.util.Map<java.lang.String, java.lang.String> r8 = r0.g
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x014a
            r2.put(r9, r8)
            goto L_0x014a
        L_0x013b:
            java.util.regex.Pattern r9 = w
            java.lang.String r9 = a(r8, r9, r2)
            java.util.regex.Pattern r10 = C
            java.lang.String r8 = a(r8, r10, r2)
            r2.put(r9, r8)
        L_0x014a:
            r0 = r14
            r13 = r15
        L_0x014c:
            r8 = -1
            goto L_0x0394
        L_0x0150:
            java.lang.String r9 = "#EXTINF"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x016b
            java.util.regex.Pattern r9 = k
            double r9 = b(r8, r9)
            double r9 = r9 * r35
            long r9 = (long) r9
            java.util.regex.Pattern r11 = l
            java.lang.String r34 = a(r8, r11, r7, r2)
            r56 = r9
            goto L_0x004f
        L_0x016b:
            java.lang.String r9 = "#EXT-X-KEY"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0250
            java.util.regex.Pattern r9 = p
            java.lang.String r9 = a(r8, r9, r2)
            java.util.regex.Pattern r10 = q
            java.lang.String r11 = "identity"
            java.lang.String r10 = a(r8, r10, r11, r2)
            java.lang.String r12 = "NONE"
            boolean r12 = r12.equals(r9)
            if (r12 == 0) goto L_0x0195
            r3.clear()
            r33 = r14
            r53 = r33
            r54 = r53
        L_0x0192:
            r12 = 1
            goto L_0x004f
        L_0x0195:
            java.util.regex.Pattern r12 = t
            java.lang.String r54 = a(r8, r12, r14, r2)
            boolean r11 = r11.equals(r10)
            if (r11 == 0) goto L_0x01b4
            java.lang.String r10 = "AES-128"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x01b0
            java.util.regex.Pattern r9 = s
            java.lang.String r53 = a(r8, r9, r2)
            goto L_0x0192
        L_0x01b0:
            r59 = r15
            goto L_0x0248
        L_0x01b4:
            if (r5 != 0) goto L_0x01cc
            java.lang.String r5 = "SAMPLE-AES-CENC"
            boolean r5 = r5.equals(r9)
            if (r5 != 0) goto L_0x01ca
            java.lang.String r5 = "SAMPLE-AES-CTR"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x01c7
            goto L_0x01ca
        L_0x01c7:
            java.lang.String r5 = "cbcs"
            goto L_0x01cc
        L_0x01ca:
            java.lang.String r5 = "cenc"
        L_0x01cc:
            java.lang.String r9 = "com.microsoft.playready"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x023b
            java.util.regex.Pattern r9 = r
            java.lang.String r11 = "1"
            java.lang.String r9 = a(r8, r9, r11, r2)
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x01e5
            r59 = r15
            goto L_0x0241
        L_0x01e5:
            java.util.regex.Pattern r9 = s
            java.lang.String r8 = a(r8, r9, r2)
            r9 = 44
            int r9 = r8.indexOf(r9)
            java.lang.String r8 = r8.substring(r9)
            byte[] r8 = android.util.Base64.decode(r8, r13)
            java.util.UUID r9 = defpackage.apv.e
            if (r8 == 0) goto L_0x01ff
            int r11 = r8.length
            goto L_0x0200
        L_0x01ff:
            r11 = 0
        L_0x0200:
            int r11 = r11 + 32
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r11)
            r12.putInt(r11)
            int r11 = defpackage.att.U
            r12.putInt(r11)
            r12.putInt(r13)
            r59 = r15
            long r14 = r9.getMostSignificantBits()
            r12.putLong(r14)
            long r14 = r9.getLeastSignificantBits()
            r12.putLong(r14)
            if (r8 == 0) goto L_0x022d
            int r9 = r8.length
            if (r9 == 0) goto L_0x022d
            int r9 = r8.length
            r12.putInt(r9)
            r12.put(r8)
        L_0x022d:
            byte[] r8 = r12.array()
            asc$a r14 = new asc$a
            java.util.UUID r9 = defpackage.apv.e
            java.lang.String r12 = "video/mp4"
            r14.<init>(r9, r12, r8)
            goto L_0x0241
        L_0x023b:
            r59 = r15
            asc$a r14 = a(r8, r10, r2)
        L_0x0241:
            if (r14 == 0) goto L_0x0248
            r3.put(r10, r14)
            r33 = 0
        L_0x0248:
            r15 = r59
            r12 = 1
            r14 = 0
            r53 = 0
            goto L_0x004f
        L_0x0250:
            r59 = r15
            java.lang.String r9 = "#EXT-X-BYTERANGE"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0279
            java.util.regex.Pattern r9 = n
            java.lang.String r8 = a(r8, r9, r2)
            java.lang.String[] r8 = r8.split(r10)
            r9 = r8[r13]
            long r48 = java.lang.Long.parseLong(r9)
            int r9 = r8.length
            r10 = 1
            if (r9 <= r10) goto L_0x0276
            r8 = r8[r10]
            long r8 = java.lang.Long.parseLong(r8)
            r29 = r8
        L_0x0276:
            r15 = r59
            goto L_0x0294
        L_0x0279:
            r10 = 1
            java.lang.String r9 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r9 = r8.startsWith(r9)
            r12 = 58
            if (r9 == 0) goto L_0x0298
            int r1 = r8.indexOf(r12)
            int r1 = r1 + r10
            java.lang.String r1 = r8.substring(r1)
            int r20 = java.lang.Integer.parseInt(r1)
            r15 = r59
            r1 = 1
        L_0x0294:
            r12 = 1
            r14 = 0
            goto L_0x004f
        L_0x0298:
            java.lang.String r9 = "#EXT-X-DISCONTINUITY"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x02a3
            int r50 = r50 + 1
            goto L_0x0276
        L_0x02a3:
            java.lang.String r9 = "#EXT-X-PROGRAM-DATE-TIME"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x02cb
            r9 = 0
            int r14 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x02c6
            int r9 = r8.indexOf(r12)
            r10 = 1
            int r9 = r9 + r10
            java.lang.String r8 = r8.substring(r9)
            long r8 = defpackage.bdw.f(r8)
            long r8 = defpackage.apv.b(r8)
            long r18 = r8 - r51
            goto L_0x0276
        L_0x02c6:
            r13 = r59
            r0 = 0
            goto L_0x014c
        L_0x02cb:
            r10 = 1
            java.lang.String r9 = "#EXT-X-GAP"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x02dc
            r15 = r59
            r12 = 1
            r14 = 0
            r47 = 1
            goto L_0x004f
        L_0x02dc:
            java.lang.String r9 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x02ec
            r15 = r59
            r12 = 1
            r14 = 0
            r26 = 1
            goto L_0x004f
        L_0x02ec:
            java.lang.String r9 = "#EXT-X-ENDLIST"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x02fc
            r15 = r59
            r12 = 1
            r14 = 0
            r27 = 1
            goto L_0x004f
        L_0x02fc:
            java.lang.String r9 = "#"
            boolean r9 = r8.startsWith(r9)
            if (r9 != 0) goto L_0x02c6
            if (r53 != 0) goto L_0x0309
            r42 = 0
            goto L_0x0314
        L_0x0309:
            if (r54 == 0) goto L_0x030e
            r42 = r54
            goto L_0x0314
        L_0x030e:
            java.lang.String r14 = java.lang.Long.toHexString(r31)
            r42 = r14
        L_0x0314:
            r14 = 1
            long r14 = r31 + r14
            r31 = -1
            int r9 = (r48 > r31 ? 1 : (r48 == r31 ? 0 : -1))
            if (r9 != 0) goto L_0x0320
            r29 = 0
        L_0x0320:
            if (r33 != 0) goto L_0x035b
            boolean r9 = r3.isEmpty()
            if (r9 != 0) goto L_0x035b
            java.util.Collection r9 = r3.values()
            asc$a[] r12 = new defpackage.asc.a[r13]
            java.lang.Object[] r9 = r9.toArray(r12)
            asc$a[] r9 = (defpackage.asc.a[]) r9
            asc r12 = new asc
            r12.<init>(r5, r9)
            if (r28 != 0) goto L_0x0359
            int r10 = r9.length
            asc$a[] r10 = new defpackage.asc.a[r10]
            r11 = 0
        L_0x033f:
            int r13 = r9.length
            if (r11 >= r13) goto L_0x0350
            r13 = r9[r11]
            r0 = 0
            asc$a r13 = r13.a(r0)
            r10[r11] = r13
            int r11 = r11 + 1
            r0 = r60
            goto L_0x033f
        L_0x0350:
            r0 = 0
            asc r9 = new asc
            r9.<init>(r5, r10)
            r28 = r9
            goto L_0x035e
        L_0x0359:
            r0 = 0
            goto L_0x035e
        L_0x035b:
            r0 = 0
            r12 = r33
        L_0x035e:
            aze$a r9 = new aze$a
            r31 = r9
            java.lang.String r32 = a(r8, r2)
            r33 = r55
            r35 = r56
            r37 = r50
            r38 = r51
            r40 = r12
            r41 = r53
            r43 = r29
            r45 = r48
            r31.<init>(r32, r33, r34, r35, r37, r38, r40, r41, r42, r43, r45, r47)
            r13 = r59
            r13.add(r9)
            long r51 = r51 + r56
            r8 = -1
            int r10 = (r48 > r8 ? 1 : (r48 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0388
            long r29 = r29 + r48
        L_0x0388:
            r47 = 0
            r56 = 0
            r34 = r7
            r48 = r8
            r33 = r12
            r31 = r14
        L_0x0394:
            r12 = 1
            r14 = r0
            r15 = r13
            r13 = 0
            r0 = r60
            goto L_0x004f
        L_0x039c:
            r13 = r15
            aze r0 = new aze
            r2 = 0
            int r5 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x03a8
            r58 = 1
            goto L_0x03aa
        L_0x03a8:
            r58 = 0
        L_0x03aa:
            r3 = r0
            r5 = r62
            r7 = r16
            r9 = r18
            r11 = r1
            r12 = r20
            r1 = r13
            r13 = r21
            r15 = r23
            r16 = r24
            r18 = r26
            r19 = r27
            r20 = r58
            r21 = r28
            r22 = r1
            r3.<init>(r4, r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azg.a(azd, azg$a, java.lang.String):aze");
    }

    private static defpackage.asc.a a(String str, String str2, Map<String, String> map) {
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String a2 = a(str, s, map);
            return new defpackage.asc.a(apv.d, "video/mp4", Base64.decode(a2.substring(a2.indexOf(44)), 0));
        } else if (!"com.widevine".equals(str2)) {
            return null;
        } else {
            try {
                return new defpackage.asc.a(apv.d, "hls", str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e2) {
                throw new ParserException((Throwable) e2);
            }
        }
    }

    private static int a(String str, Pattern pattern) {
        return Integer.parseInt(a(str, pattern, Collections.emptyMap()));
    }

    private static double b(String str, Pattern pattern) {
        return Double.parseDouble(a(str, pattern, Collections.emptyMap()));
    }

    private static String a(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        return (map.isEmpty() || str2 == null) ? str2 : a(str2, map);
    }

    private static String a(String str, Map<String, String> map) {
        Matcher matcher = E.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static boolean a(String str, Pattern pattern, boolean z2) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1).equals("YES");
        }
        return false;
    }

    private static Pattern a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("=(NO");
        sb.append("|YES");
        sb.append(")");
        return Pattern.compile(sb.toString());
    }

    private static String a(String str, Pattern pattern, Map<String, String> map) {
        String a2 = a(str, pattern, null, map);
        if (a2 != null) {
            return a2;
        }
        StringBuilder sb = new StringBuilder("Couldn't match ");
        sb.append(pattern.pattern());
        sb.append(" in ");
        sb.append(str);
        throw new ParserException(sb.toString());
    }
}
