package defpackage;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@cey
/* renamed from: csi reason: default package */
public final class csi extends csc {
    private static final Set<String> b = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat c = new DecimalFormat("#,###");
    private File d;
    private boolean e;

    private final File a(File file) {
        return new File(this.d, String.valueOf(file.getName()).concat(".done"));
    }

    public final void a() {
        this.e = true;
    }

    public csi(crq crq) {
        super(crq);
        File cacheDir = this.a.getCacheDir();
        if (cacheDir == null) {
            cow.a(5);
            return;
        }
        this.d = new File(cacheDir, "admobVideoStreams");
        if (!this.d.isDirectory() && !this.d.mkdirs()) {
            String str = "Could not create preload cache directory at ";
            String valueOf = String.valueOf(this.d.getAbsolutePath());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cow.a(5);
            this.d = null;
        } else if (!this.d.setReadable(true, false) || !this.d.setExecutable(true, false)) {
            String str2 = "Could not set cache file permissions at ";
            String valueOf2 = String.valueOf(this.d.getAbsolutePath());
            if (valueOf2.length() != 0) {
                str2.concat(valueOf2);
            } else {
                new String(str2);
            }
            cow.a(5);
            this.d = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f0, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r1 = r5.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01fb, code lost:
        if (r1 < 400) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01fd, code lost:
        r16 = "badUrl";
        r0 = "HTTP request failed. Code: ";
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x020d, code lost:
        if (r2.length() == 0) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x020f, code lost:
        r2 = r0.concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0215, code lost:
        r2 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r28).length() + 32);
        r4.append("HTTP status code ");
        r4.append(r1);
        r4.append(" at ");
        r4.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0242, code lost:
        throw new java.io.IOException(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0243, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0246, code lost:
        r5 = r2;
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r14 = r5.getContentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x024d, code lost:
        if (r14 >= 0) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x024f, code lost:
        r0 = "Stream cache aborted, missing content-length header at ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r1 = java.lang.String.valueOf(r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0259, code lost:
        if (r1.length() == 0) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x025b, code lost:
        r0.concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x025f, code lost:
        new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0264, code lost:
        defpackage.cow.a(5);
        r7.a(r8, r12.getAbsolutePath(), "contentLengthMissing", null);
        b.remove(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0275, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r1 = c.format((long) r14);
        r6 = ((java.lang.Integer) defpackage.dpn.f().a(defpackage.dsp.o)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x028d, code lost:
        if (r14 <= r6) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r28).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r8);
        r2.toString();
        defpackage.cow.a(5);
        r0 = "File too big for full file cache. Size: ";
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c7, code lost:
        if (r1.length() == 0) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02c9, code lost:
        r0 = r0.concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02ce, code lost:
        r0 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02d4, code lost:
        r7.a(r8, r12.getAbsolutePath(), "sizeExceeded", r0);
        b.remove(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02e2, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r28).length());
        r3.append("Caching ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r8);
        r3.toString();
        defpackage.cow.a(3);
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r3 = r4.getChannel();
        r2 = java.nio.ByteBuffer.allocate(1048576);
        r17 = defpackage.bjl.l();
        r18 = r17.a();
        r1 = new defpackage.cob(((java.lang.Long) defpackage.dpn.f().a(defpackage.dsp.r)).longValue());
        r10 = ((java.lang.Long) defpackage.dpn.f().a(defpackage.dsp.q)).longValue();
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0355, code lost:
        r20 = r5.read(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0359, code lost:
        if (r20 < 0) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x035b, code lost:
        r9 = r9 + r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x035d, code lost:
        if (r9 <= r6) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x035f, code lost:
        r16 = "sizeExceeded";
        r0 = "File too big for full file cache. Size: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x036f, code lost:
        if (r1.length() == 0) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0371, code lost:
        r9 = r0.concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x037c, code lost:
        r9 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0384, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0385, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0388, code lost:
        r2 = r7;
        r5 = r9;
        r3 = r15;
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x038e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0391, code lost:
        r9 = r4;
        r2 = r7;
        r3 = r15;
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        r2.flip();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x039f, code lost:
        if (r3.write(r2) > 0) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03a1, code lost:
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03b0, code lost:
        if ((r17.a() - r18) > (1000 * r10)) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03b4, code lost:
        if (r7.e != false) goto L_0x0406;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03ba, code lost:
        if (r1.a() == false) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03bc, code lost:
        r13 = r12.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03c0, code lost:
        r21 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        r15 = defpackage.col.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03c6, code lost:
        r22 = r1;
        r1 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r4 = r13;
        r13 = r5;
        r26 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r1 = new defpackage.csd(r27, r28, r4, r9, r14);
        r15.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03e0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03e2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03e3, code lost:
        r25 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03e7, code lost:
        r22 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r13 = r5;
        r26 = r6;
        r21 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03f4, code lost:
        r7 = r27;
        r5 = r13;
        r15 = r21;
        r1 = r22;
        r2 = r23;
        r3 = r24;
        r4 = r25;
        r6 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0406, code lost:
        r25 = r4;
        r21 = r15;
        r16 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0413, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0414, code lost:
        r25 = r4;
        r21 = r15;
        r16 = "downloadTimeout";
        r0 = java.lang.Long.toString(r10);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
        r9 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0445, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0446, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0449, code lost:
        r2 = r27;
        r5 = r9;
        r4 = r16;
        r3 = r21;
        r9 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0454, code lost:
        r7 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0459, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x045c, code lost:
        r25 = r4;
        r2 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0462, code lost:
        r25 = r4;
        r21 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        r25.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x046e, code lost:
        if (defpackage.clu.a(3) == false) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        r1 = c.format((long) r9);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r28).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r8);
        r3.toString();
        defpackage.cow.a(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04a7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04a9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04aa, code lost:
        r2 = r27;
        r4 = r16;
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04ba, code lost:
        if (r0.isFile() == false) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:?, code lost:
        r0.createNewFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04cb, code lost:
        r2 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        r2.a(r8, r12.getAbsolutePath(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04d2, code lost:
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        b.remove(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04d8, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04d9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04dd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04e1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04e4, code lost:
        r2 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04e6, code lost:
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04e9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04ec, code lost:
        r25 = r4;
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04ef, code lost:
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04f0, code lost:
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04f2, code lost:
        r9 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04f4, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04f6, code lost:
        r2 = r7;
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04ff, code lost:
        throw new java.io.IOException("Invalid protocol.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0500, code lost:
        r2 = r7;
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0509, code lost:
        throw new java.io.IOException("Too many redirects (20)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x050a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x050e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0511, code lost:
        r2 = r7;
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0513, code lost:
        r4 = r16;
        r5 = null;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0519, code lost:
        if ((r0 instanceof java.lang.RuntimeException) != false) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x051b, code lost:
        defpackage.bjl.i().a(r0, "VideoStreamFullFileCache.preload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x052b, code lost:
        if (r2.e == false) goto L_0x0551;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x052d, code lost:
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r28).length() + 26);
        r6.append("Preload aborted for URL \"");
        r6.append(r8);
        r6.append("\"");
        r6.toString();
        defpackage.cow.a(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0551, code lost:
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r28).length() + 25);
        r6.append("Preload failed for URL \"");
        r6.append(r8);
        r6.append("\"");
        r6.toString();
        defpackage.cow.a(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0580, code lost:
        r0 = "Could not delete partial cache file at ";
        r6 = java.lang.String.valueOf(r12.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x058e, code lost:
        if (r6.length() == 0) goto L_0x0594;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0590, code lost:
        r0.concat(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0594, code lost:
        new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0599, code lost:
        defpackage.cow.a(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x059d, code lost:
        r2.a(r8, r12.getAbsolutePath(), r4, r5);
        b.remove(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05aa, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05af, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012e, code lost:
        r16 = com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage.SEVERITY_ERROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        defpackage.bjl.q();
        r1 = ((java.lang.Integer) defpackage.dpn.f().a(defpackage.dsp.s)).intValue();
        r3 = new java.net.URL(r8);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014a, code lost:
        r2 = r2 + r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014d, code lost:
        if (r2 > 20) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014f, code lost:
        r5 = r3.openConnection();
        r5.setConnectTimeout(r1);
        r5.setReadTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015b, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x04f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015d, code lost:
        r5 = (java.net.HttpURLConnection) r5;
        r6 = new defpackage.cop();
        r6.a(r5, (byte[]) null);
        r5.setInstanceFollowRedirects(false);
        r14 = r5.getResponseCode();
        r6.a(r5, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0173, code lost:
        if ((r14 / 100) != 3) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r4 = r5.getHeaderField("Location");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017b, code lost:
        if (r4 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017d, code lost:
        r6 = new java.net.URL(r3, r4);
        r3 = r6.getProtocol();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0186, code lost:
        if (r3 == null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018e, code lost:
        if (r3.equals("http") != false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0196, code lost:
        if (r3.equals("https") != false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0198, code lost:
        r1 = "Unsupported scheme: ";
        r2 = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a4, code lost:
        if (r2.length() == 0) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a6, code lost:
        r1 = r1.concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ab, code lost:
        r1 = new java.lang.String(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b4, code lost:
        throw new java.io.IOException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b5, code lost:
        r3 = "Redirecting to ";
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bf, code lost:
        if (r4.length() == 0) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c1, code lost:
        r3.concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c5, code lost:
        new java.lang.String(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ca, code lost:
        defpackage.cow.a(3);
        r5.disconnect();
        r3 = r6;
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01db, code lost:
        throw new java.io.IOException("Protocol is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e3, code lost:
        throw new java.io.IOException("Missing Location header in redirect");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e7, code lost:
        r2 = r7;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e9, code lost:
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ea, code lost:
        r4 = r16;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:209:0x04c7 */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04a7 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r21 r25 
      PHI: (r21v3 java.lang.Object) = (r21v0 java.lang.Object), (r21v0 java.lang.Object), (r21v0 java.lang.Object), (r21v0 java.lang.Object), (r21v0 java.lang.Object), (r21v0 java.lang.Object), (r21v8 java.lang.Object), (r21v8 java.lang.Object) binds: [B:207:0x04c4, B:208:?, B:205:0x04bc, B:206:?, B:196:0x0470, B:197:?, B:170:0x03c2, B:173:0x03d9] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r25v8 java.io.FileOutputStream) = (r25v5 java.io.FileOutputStream), (r25v5 java.io.FileOutputStream), (r25v5 java.io.FileOutputStream), (r25v5 java.io.FileOutputStream), (r25v5 java.io.FileOutputStream), (r25v5 java.io.FileOutputStream), (r25v15 java.io.FileOutputStream), (r25v12 java.io.FileOutputStream) binds: [B:207:0x04c4, B:208:?, B:205:0x04bc, B:206:?, B:196:0x0470, B:197:?, B:173:0x03d9, B:170:0x03c2] A[DONT_GENERATE, DONT_INLINE], Splitter:B:173:0x03d9] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0594  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r28) {
        /*
            r27 = this;
            r7 = r27
            r8 = r28
            java.io.File r0 = r7.d
            r9 = 0
            r10 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "noCacheDir"
            r7.a(r8, r9, r0, r9)
            return r10
        L_0x0010:
            java.io.File r0 = r7.d
            if (r0 != 0) goto L_0x0016
            r3 = 0
            goto L_0x0032
        L_0x0016:
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x001d:
            if (r2 >= r1) goto L_0x0032
            r4 = r0[r2]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = ".done"
            boolean r4 = r4.endsWith(r5)
            if (r4 != 0) goto L_0x002f
            int r3 = r3 + 1
        L_0x002f:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x0032:
            dsf<java.lang.Integer> r0 = defpackage.dsp.n
            dsn r1 = defpackage.dpn.f()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r11 = 5
            if (r3 <= r0) goto L_0x0095
            java.io.File r0 = r7.d
            if (r0 != 0) goto L_0x004b
        L_0x0049:
            r0 = 0
            goto L_0x008a
        L_0x004b:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.io.File[] r0 = r0.listFiles()
            int r3 = r0.length
            r4 = r1
            r2 = r9
            r1 = 0
        L_0x0058:
            if (r1 >= r3) goto L_0x0075
            r6 = r0[r1]
            java.lang.String r12 = r6.getName()
            java.lang.String r13 = ".done"
            boolean r12 = r12.endsWith(r13)
            if (r12 != 0) goto L_0x0072
            long r12 = r6.lastModified()
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x0072
            r2 = r6
            r4 = r12
        L_0x0072:
            int r1 = r1 + 1
            goto L_0x0058
        L_0x0075:
            if (r2 == 0) goto L_0x0049
            boolean r0 = r2.delete()
            java.io.File r1 = r7.a(r2)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L_0x008a
            boolean r1 = r1.delete()
            r0 = r0 & r1
        L_0x008a:
            if (r0 != 0) goto L_0x0010
            defpackage.cow.a(r11)
            java.lang.String r0 = "expireFailed"
            r7.a(r8, r9, r0, r9)
            return r10
        L_0x0095:
            defpackage.dpn.a()
            java.lang.String r0 = defpackage.col.a(r28)
            java.io.File r12 = new java.io.File
            java.io.File r1 = r7.d
            r12.<init>(r1, r0)
            java.io.File r0 = r7.a(r12)
            boolean r1 = r12.isFile()
            r13 = 3
            r14 = 1
            if (r1 == 0) goto L_0x00da
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L_0x00da
            long r0 = r12.length()
            int r1 = (int) r0
            java.lang.String r0 = "Stream cache hit at "
            java.lang.String r2 = java.lang.String.valueOf(r28)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00ca
            r0.concat(r2)
            goto L_0x00cf
        L_0x00ca:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
        L_0x00cf:
            defpackage.cow.a(r13)
            java.lang.String r0 = r12.getAbsolutePath()
            r7.a(r8, r0, r1)
            return r14
        L_0x00da:
            java.io.File r1 = r7.d
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r28)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00f4
            java.lang.String r1 = r1.concat(r2)
            r15 = r1
            goto L_0x00fa
        L_0x00f4:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r15 = r2
        L_0x00fa:
            java.util.Set<java.lang.String> r1 = b
            monitor-enter(r1)
            java.util.Set<java.lang.String> r2 = b     // Catch:{ all -> 0x05ab }
            boolean r2 = r2.contains(r15)     // Catch:{ all -> 0x05ab }
            if (r2 == 0) goto L_0x0128
            java.lang.String r0 = "Stream cache already in progress at "
            java.lang.String r2 = java.lang.String.valueOf(r28)     // Catch:{ all -> 0x05ab }
            int r3 = r2.length()     // Catch:{ all -> 0x05ab }
            if (r3 == 0) goto L_0x0115
            r0.concat(r2)     // Catch:{ all -> 0x05ab }
            goto L_0x011a
        L_0x0115:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x05ab }
            r2.<init>(r0)     // Catch:{ all -> 0x05ab }
        L_0x011a:
            defpackage.cow.a(r11)     // Catch:{ all -> 0x05ab }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ all -> 0x05ab }
            java.lang.String r2 = "inProgress"
            r7.a(r8, r0, r2, r9)     // Catch:{ all -> 0x05ab }
            monitor-exit(r1)     // Catch:{ all -> 0x05ab }
            return r10
        L_0x0128:
            java.util.Set<java.lang.String> r2 = b     // Catch:{ all -> 0x05ab }
            r2.add(r15)     // Catch:{ all -> 0x05ab }
            monitor-exit(r1)     // Catch:{ all -> 0x05ab }
            java.lang.String r16 = "error"
            defpackage.bjl.q()     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            dsf<java.lang.Integer> r1 = defpackage.dsp.s     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            dsn r2 = defpackage.dpn.f()     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            int r1 = r1.intValue()     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            r2.<init>(r8)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            r3 = r2
            r2 = 0
        L_0x014a:
            int r2 = r2 + r14
            r4 = 20
            if (r2 > r4) goto L_0x0500
            java.net.URLConnection r5 = r3.openConnection()     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            r5.setConnectTimeout(r1)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            r5.setReadTimeout(r1)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            boolean r6 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            if (r6 == 0) goto L_0x04f6
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            cop r6 = new cop     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            r6.<init>()     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            r6.a(r5, r9)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            r5.setInstanceFollowRedirects(r10)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            int r14 = r5.getResponseCode()     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            r6.a(r5, r14)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            int r14 = r14 / 100
            if (r14 != r13) goto L_0x01ee
            java.lang.String r4 = "Location"
            java.lang.String r4 = r5.getHeaderField(r4)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            if (r4 == 0) goto L_0x01dc
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r6.<init>(r3, r4)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            java.lang.String r3 = r6.getProtocol()     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            if (r3 == 0) goto L_0x01d4
            java.lang.String r14 = "http"
            boolean r14 = r3.equals(r14)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            if (r14 != 0) goto L_0x01b5
            java.lang.String r14 = "https"
            boolean r14 = r3.equals(r14)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            if (r14 != 0) goto L_0x01b5
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            java.lang.String r1 = "Unsupported scheme: "
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            int r3 = r2.length()     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            if (r3 == 0) goto L_0x01ab
            java.lang.String r1 = r1.concat(r2)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            goto L_0x01b1
        L_0x01ab:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r1 = r2
        L_0x01b1:
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            throw r0     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
        L_0x01b5:
            java.lang.String r3 = "Redirecting to "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            int r14 = r4.length()     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            if (r14 == 0) goto L_0x01c5
            r3.concat(r4)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            goto L_0x01ca
        L_0x01c5:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
        L_0x01ca:
            defpackage.cow.a(r13)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r5.disconnect()     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r3 = r6
            r14 = 1
            goto L_0x014a
        L_0x01d4:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            java.lang.String r1 = "Protocol is null"
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            throw r0     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
        L_0x01dc:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            java.lang.String r1 = "Missing Location header in redirect"
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            throw r0     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
        L_0x01e4:
            r0 = move-exception
            goto L_0x01e7
        L_0x01e6:
            r0 = move-exception
        L_0x01e7:
            r2 = r7
            r5 = r9
        L_0x01e9:
            r3 = r15
        L_0x01ea:
            r4 = r16
            goto L_0x0517
        L_0x01ee:
            boolean r1 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            if (r1 == 0) goto L_0x0249
            r1 = r5
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            int r1 = r1.getResponseCode()     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r2 = 400(0x190, float:5.6E-43)
            if (r1 < r2) goto L_0x0249
            java.lang.String r16 = "badUrl"
            java.lang.String r0 = "HTTP request failed. Code: "
            java.lang.String r2 = java.lang.Integer.toString(r1)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            int r3 = r2.length()     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            if (r3 == 0) goto L_0x0215
            java.lang.String r0 = r0.concat(r2)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r2 = r0
            goto L_0x021a
        L_0x0215:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
        L_0x021a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0245, RuntimeException -> 0x0243 }
            java.lang.String r3 = java.lang.String.valueOf(r28)     // Catch:{ IOException -> 0x0245, RuntimeException -> 0x0243 }
            int r3 = r3.length()     // Catch:{ IOException -> 0x0245, RuntimeException -> 0x0243 }
            int r3 = r3 + 32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0245, RuntimeException -> 0x0243 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0245, RuntimeException -> 0x0243 }
            java.lang.String r3 = "HTTP status code "
            r4.append(r3)     // Catch:{ IOException -> 0x0245, RuntimeException -> 0x0243 }
            r4.append(r1)     // Catch:{ IOException -> 0x0245, RuntimeException -> 0x0243 }
            java.lang.String r1 = " at "
            r4.append(r1)     // Catch:{ IOException -> 0x0245, RuntimeException -> 0x0243 }
            r4.append(r8)     // Catch:{ IOException -> 0x0245, RuntimeException -> 0x0243 }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x0245, RuntimeException -> 0x0243 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0245, RuntimeException -> 0x0243 }
            throw r0     // Catch:{ IOException -> 0x0245, RuntimeException -> 0x0243 }
        L_0x0243:
            r0 = move-exception
            goto L_0x0246
        L_0x0245:
            r0 = move-exception
        L_0x0246:
            r5 = r2
            r2 = r7
            goto L_0x01e9
        L_0x0249:
            int r14 = r5.getContentLength()     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            if (r14 >= 0) goto L_0x0276
            java.lang.String r0 = "Stream cache aborted, missing content-length header at "
            java.lang.String r1 = java.lang.String.valueOf(r28)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            int r2 = r1.length()     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            if (r2 == 0) goto L_0x025f
            r0.concat(r1)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            goto L_0x0264
        L_0x025f:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
        L_0x0264:
            defpackage.cow.a(r11)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            java.lang.String r1 = "contentLengthMissing"
            r7.a(r8, r0, r1, r9)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            java.util.Set<java.lang.String> r0 = b     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r0.remove(r15)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            return r10
        L_0x0276:
            java.text.DecimalFormat r1 = c     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            long r2 = (long) r14     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            dsf<java.lang.Integer> r2 = defpackage.dsp.o     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            dsn r3 = defpackage.dpn.f()     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            java.lang.Object r2 = r3.a(r2)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            int r6 = r2.intValue()     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            if (r14 <= r6) goto L_0x02e3
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            int r0 = r0 + 33
            java.lang.String r2 = java.lang.String.valueOf(r28)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            java.lang.String r0 = "Content length "
            r2.append(r0)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r2.append(r1)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            java.lang.String r0 = " exceeds limit at "
            r2.append(r0)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r2.append(r8)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r2.toString()     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            defpackage.cow.a(r11)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            int r2 = r1.length()     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            if (r2 == 0) goto L_0x02ce
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            goto L_0x02d4
        L_0x02ce:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r0 = r1
        L_0x02d4:
            java.lang.String r1 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            java.lang.String r2 = "sizeExceeded"
            r7.a(r8, r1, r2, r0)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            java.util.Set<java.lang.String> r0 = b     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            r0.remove(r15)     // Catch:{ IOException -> 0x01e6, RuntimeException -> 0x01e4 }
            return r10
        L_0x02e3:
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            int r2 = r2.length()     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            int r2 = r2 + r4
            java.lang.String r3 = java.lang.String.valueOf(r28)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            int r3 = r3.length()     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            java.lang.String r2 = "Caching "
            r3.append(r2)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            r3.append(r1)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            java.lang.String r1 = " bytes from "
            r3.append(r1)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            r3.append(r8)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            r3.toString()     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            defpackage.cow.a(r13)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            java.io.InputStream r1 = r5.getInputStream()     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            java.nio.channels.ReadableByteChannel r5 = java.nio.channels.Channels.newChannel(r1)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            r4.<init>(r12)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x050e }
            java.nio.channels.FileChannel r3 = r4.getChannel()     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            r1 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            bzg r17 = defpackage.bjl.l()     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            long r18 = r17.a()     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            dsf<java.lang.Long> r1 = defpackage.dsp.r     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            dsn r9 = defpackage.dpn.f()     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            java.lang.Object r1 = r9.a(r1)     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            long r10 = r1.longValue()     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            cob r1 = new cob     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            r1.<init>(r10)     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            dsf<java.lang.Long> r10 = defpackage.dsp.q     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            dsn r11 = defpackage.dpn.f()     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            java.lang.Object r10 = r11.a(r10)     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            long r10 = r10.longValue()     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            r9 = 0
        L_0x0355:
            int r20 = r5.read(r2)     // Catch:{ IOException -> 0x04eb, RuntimeException -> 0x04e9 }
            if (r20 < 0) goto L_0x0462
            int r9 = r9 + r20
            if (r9 <= r6) goto L_0x0398
            java.lang.String r16 = "sizeExceeded"
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r1 = java.lang.Integer.toString(r9)     // Catch:{ IOException -> 0x0390, RuntimeException -> 0x038e }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0390, RuntimeException -> 0x038e }
            int r2 = r1.length()     // Catch:{ IOException -> 0x0390, RuntimeException -> 0x038e }
            if (r2 == 0) goto L_0x0377
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException -> 0x0390, RuntimeException -> 0x038e }
            r9 = r0
            goto L_0x037d
        L_0x0377:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0390, RuntimeException -> 0x038e }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0390, RuntimeException -> 0x038e }
            r9 = r1
        L_0x037d:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0387, RuntimeException -> 0x0385 }
            java.lang.String r1 = "stream cache file size limit exceeded"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0387, RuntimeException -> 0x0385 }
            throw r0     // Catch:{ IOException -> 0x0387, RuntimeException -> 0x0385 }
        L_0x0385:
            r0 = move-exception
            goto L_0x0388
        L_0x0387:
            r0 = move-exception
        L_0x0388:
            r2 = r7
            r5 = r9
            r3 = r15
            r9 = r4
            goto L_0x01ea
        L_0x038e:
            r0 = move-exception
            goto L_0x0391
        L_0x0390:
            r0 = move-exception
        L_0x0391:
            r9 = r4
            r2 = r7
            r3 = r15
            r4 = r16
            goto L_0x04f4
        L_0x0398:
            r2.flip()     // Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
        L_0x039b:
            int r20 = r3.write(r2)     // Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
            if (r20 > 0) goto L_0x0454
            r2.clear()     // Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
            long r20 = r17.a()     // Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
            long r20 = r20 - r18
            r22 = 1000(0x3e8, double:4.94E-321)
            long r22 = r22 * r10
            int r24 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r24 > 0) goto L_0x0414
            boolean r13 = r7.e     // Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
            if (r13 != 0) goto L_0x0406
            boolean r13 = r1.a()     // Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
            if (r13 == 0) goto L_0x03e7
            java.lang.String r13 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
            r21 = r15
            android.os.Handler r15 = defpackage.col.a     // Catch:{ IOException -> 0x03e2, RuntimeException -> 0x03e0 }
            csd r7 = new csd     // Catch:{ IOException -> 0x03e2, RuntimeException -> 0x03e0 }
            r22 = r1
            r1 = r7
            r23 = r2
            r2 = r27
            r24 = r3
            r3 = r28
            r25 = r4
            r4 = r13
            r13 = r5
            r5 = r9
            r26 = r6
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            r15.post(r7)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            goto L_0x03f4
        L_0x03e0:
            r0 = move-exception
            goto L_0x03e3
        L_0x03e2:
            r0 = move-exception
        L_0x03e3:
            r25 = r4
            goto L_0x04aa
        L_0x03e7:
            r22 = r1
            r23 = r2
            r24 = r3
            r25 = r4
            r13 = r5
            r26 = r6
            r21 = r15
        L_0x03f4:
            r7 = r27
            r5 = r13
            r15 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r6 = r26
            r13 = 3
            goto L_0x0355
        L_0x0406:
            r25 = r4
            r21 = r15
            java.lang.String r16 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            java.lang.String r1 = "abort requested"
            r0.<init>(r1)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            throw r0     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
        L_0x0414:
            r25 = r4
            r21 = r15
            java.lang.String r16 = "downloadTimeout"
            java.lang.String r0 = java.lang.Long.toString(r10)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            int r1 = r1.length()     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            int r1 = r1 + 29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            java.lang.String r1 = "Timeout exceeded. Limit: "
            r2.append(r1)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            r2.append(r0)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            java.lang.String r0 = " sec"
            r2.append(r0)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            java.lang.String r9 = r2.toString()     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0448, RuntimeException -> 0x0446 }
            java.lang.String r1 = "stream cache time limit exceeded"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0448, RuntimeException -> 0x0446 }
            throw r0     // Catch:{ IOException -> 0x0448, RuntimeException -> 0x0446 }
        L_0x0446:
            r0 = move-exception
            goto L_0x0449
        L_0x0448:
            r0 = move-exception
        L_0x0449:
            r2 = r27
            r5 = r9
            r4 = r16
            r3 = r21
            r9 = r25
            goto L_0x0517
        L_0x0454:
            r13 = 3
            r7 = r27
            goto L_0x039b
        L_0x0459:
            r0 = move-exception
            goto L_0x045c
        L_0x045b:
            r0 = move-exception
        L_0x045c:
            r25 = r4
            r2 = r27
            goto L_0x04ef
        L_0x0462:
            r25 = r4
            r21 = r15
            r25.close()     // Catch:{ IOException -> 0x04e3, RuntimeException -> 0x04e1 }
            r1 = 3
            boolean r2 = defpackage.clu.a(r1)     // Catch:{ IOException -> 0x04e3, RuntimeException -> 0x04e1 }
            if (r2 == 0) goto L_0x04b1
            java.text.DecimalFormat r1 = c     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            long r2 = (long) r9     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            int r2 = r2 + 22
            java.lang.String r3 = java.lang.String.valueOf(r28)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            int r3 = r3.length()     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            java.lang.String r2 = "Preloaded "
            r3.append(r2)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            r3.append(r1)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            java.lang.String r1 = " bytes from "
            r3.append(r1)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            r3.append(r8)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            r3.toString()     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            r1 = 3
            defpackage.cow.a(r1)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            goto L_0x04b1
        L_0x04a7:
            r0 = move-exception
            goto L_0x04aa
        L_0x04a9:
            r0 = move-exception
        L_0x04aa:
            r2 = r27
            r4 = r16
            r3 = r21
            goto L_0x04f2
        L_0x04b1:
            r1 = 1
            r2 = 0
            r12.setReadable(r1, r2)     // Catch:{ IOException -> 0x04e3, RuntimeException -> 0x04e1 }
            boolean r2 = r0.isFile()     // Catch:{ IOException -> 0x04e3, RuntimeException -> 0x04e1 }
            if (r2 == 0) goto L_0x04c4
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            r0.setLastModified(r2)     // Catch:{ IOException -> 0x04a9, RuntimeException -> 0x04a7 }
            goto L_0x04c7
        L_0x04c4:
            r0.createNewFile()     // Catch:{ IOException -> 0x04c7, RuntimeException -> 0x04a7 }
        L_0x04c7:
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x04e3, RuntimeException -> 0x04e1 }
            r2 = r27
            r2.a(r8, r0, r9)     // Catch:{ IOException -> 0x04df, RuntimeException -> 0x04dd }
            java.util.Set<java.lang.String> r0 = b     // Catch:{ IOException -> 0x04df, RuntimeException -> 0x04dd }
            r3 = r21
            r0.remove(r3)     // Catch:{ IOException -> 0x04db, RuntimeException -> 0x04d9 }
            r0 = 1
            return r0
        L_0x04d9:
            r0 = move-exception
            goto L_0x04f0
        L_0x04db:
            r0 = move-exception
            goto L_0x04f0
        L_0x04dd:
            r0 = move-exception
            goto L_0x04e6
        L_0x04df:
            r0 = move-exception
            goto L_0x04e6
        L_0x04e1:
            r0 = move-exception
            goto L_0x04e4
        L_0x04e3:
            r0 = move-exception
        L_0x04e4:
            r2 = r27
        L_0x04e6:
            r3 = r21
            goto L_0x04f0
        L_0x04e9:
            r0 = move-exception
            goto L_0x04ec
        L_0x04eb:
            r0 = move-exception
        L_0x04ec:
            r25 = r4
            r2 = r7
        L_0x04ef:
            r3 = r15
        L_0x04f0:
            r4 = r16
        L_0x04f2:
            r9 = r25
        L_0x04f4:
            r5 = 0
            goto L_0x0517
        L_0x04f6:
            r2 = r7
            r3 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x050c, RuntimeException -> 0x050a }
            java.lang.String r4 = "Invalid protocol."
            r0.<init>(r4)     // Catch:{ IOException -> 0x050c, RuntimeException -> 0x050a }
            throw r0     // Catch:{ IOException -> 0x050c, RuntimeException -> 0x050a }
        L_0x0500:
            r2 = r7
            r3 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x050c, RuntimeException -> 0x050a }
            java.lang.String r4 = "Too many redirects (20)"
            r0.<init>(r4)     // Catch:{ IOException -> 0x050c, RuntimeException -> 0x050a }
            throw r0     // Catch:{ IOException -> 0x050c, RuntimeException -> 0x050a }
        L_0x050a:
            r0 = move-exception
            goto L_0x0513
        L_0x050c:
            r0 = move-exception
            goto L_0x0513
        L_0x050e:
            r0 = move-exception
            goto L_0x0511
        L_0x0510:
            r0 = move-exception
        L_0x0511:
            r2 = r7
            r3 = r15
        L_0x0513:
            r4 = r16
            r5 = 0
            r9 = 0
        L_0x0517:
            boolean r6 = r0 instanceof java.lang.RuntimeException
            if (r6 == 0) goto L_0x0524
            cle r6 = defpackage.bjl.i()
            java.lang.String r7 = "VideoStreamFullFileCache.preload"
            r6.a(r0, r7)
        L_0x0524:
            r9.close()     // Catch:{ IOException | NullPointerException -> 0x0528 }
            goto L_0x0529
        L_0x0528:
        L_0x0529:
            boolean r0 = r2.e
            if (r0 == 0) goto L_0x0551
            java.lang.String r0 = java.lang.String.valueOf(r28)
            int r0 = r0.length()
            int r0 = r0 + 26
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            java.lang.String r0 = "Preload aborted for URL \""
            r6.append(r0)
            r6.append(r8)
            java.lang.String r0 = "\""
            r6.append(r0)
            r6.toString()
            r0 = 4
            defpackage.cow.a(r0)
            goto L_0x0574
        L_0x0551:
            java.lang.String r0 = java.lang.String.valueOf(r28)
            int r0 = r0.length()
            int r0 = r0 + 25
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            java.lang.String r0 = "Preload failed for URL \""
            r6.append(r0)
            r6.append(r8)
            java.lang.String r0 = "\""
            r6.append(r0)
            r6.toString()
            r6 = 5
            defpackage.cow.a(r6)
        L_0x0574:
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x059d
            boolean r0 = r12.delete()
            if (r0 != 0) goto L_0x059d
            java.lang.String r0 = "Could not delete partial cache file at "
            java.lang.String r6 = r12.getAbsolutePath()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r7 = r6.length()
            if (r7 == 0) goto L_0x0594
            r0.concat(r6)
            goto L_0x0599
        L_0x0594:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
        L_0x0599:
            r6 = 5
            defpackage.cow.a(r6)
        L_0x059d:
            java.lang.String r0 = r12.getAbsolutePath()
            r2.a(r8, r0, r4, r5)
            java.util.Set<java.lang.String> r0 = b
            r0.remove(r3)
            r1 = 0
            return r1
        L_0x05ab:
            r0 = move-exception
            r2 = r7
        L_0x05ad:
            monitor-exit(r1)     // Catch:{ all -> 0x05af }
            throw r0
        L_0x05af:
            r0 = move-exception
            goto L_0x05ad
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csi.a(java.lang.String):boolean");
    }
}
