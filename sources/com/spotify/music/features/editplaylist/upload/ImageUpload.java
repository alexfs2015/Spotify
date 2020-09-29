package com.spotify.music.features.editplaylist.upload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.io.FileInputStream;
import java.net.URL;
import java.net.URLConnection;

public final class ImageUpload {
    private final ObjectMapper a;
    private final a b = $$Lambda$14OWamO_4jXiFHwIT8l5jSgWq4.INSTANCE;
    private final c c = new c() {
        public final b buildUrl(String str) {
            return ImageUpload.this.a(str);
        }
    };

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class ImageUploadResponse implements JacksonModel {
        public String id;
        public String status;

        ImageUploadResponse() {
        }
    }

    interface a {
        FileInputStream buildFileInputStream(String str);
    }

    interface b {
        URLConnection a();

        String b();
    }

    interface c {
        b buildUrl(String str);
    }

    public ImageUpload(rnf rnf) {
        this.a = rnf.a().a(Include.NON_NULL).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b a(final String str) {
        return new b() {
            private URL a = new URL(str);

            public final URLConnection a() {
                return this.a.openConnection();
            }

            public final String b() {
                return this.a.getHost();
            }
        };
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r6v1, types: [com.spotify.music.features.editplaylist.upload.ImageUpload$ImageUploadResponse] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v7, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r14v26, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r6v19 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r6v23, types: [com.spotify.music.features.editplaylist.upload.ImageUpload$ImageUploadResponse] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r6v24 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r6v28 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r6v29 */
    /* JADX WARNING: type inference failed for: r6v30 */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016d, code lost:
        r11 = r3;
        r3 = r14;
        r14 = r11;
        r5 = r5;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0172, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0173, code lost:
        r8 = 0;
        r11 = r6;
        r6 = r14;
        r14 = r11;
        r5 = r5;
        r7 = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v2
      assigns: []
      uses: []
      mth insns count: 241
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
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01a5 A[SYNTHETIC, Splitter:B:119:0x01a5] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01b1 A[SYNTHETIC, Splitter:B:124:0x01b1] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01bd A[SYNTHETIC, Splitter:B:129:0x01bd] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01db A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01e5 A[SYNTHETIC, Splitter:B:143:0x01e5] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01f1 A[SYNTHETIC, Splitter:B:148:0x01f1] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01fd A[SYNTHETIC, Splitter:B:153:0x01fd] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016c A[ExcHandler: all (r3v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:44:0x00e0] */
    /* JADX WARNING: Unknown variable types count: 21 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "Unable to close reader"
            java.lang.String r1 = "Unable to close array"
            java.lang.String r2 = "Unable to close input stream"
            android.net.Uri r13 = android.net.Uri.parse(r13)
            java.lang.String r13 = r13.getPath()
            r3 = 0
            if (r13 != 0) goto L_0x0012
            return r3
        L_0x0012:
            r4 = 0
            com.spotify.music.features.editplaylist.upload.ImageUpload$a r5 = r12.b     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            java.io.FileInputStream r13 = r5.buildFileInputStream(r13)     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0189, all -> 0x0186 }
            r5.<init>()     // Catch:{ IOException -> 0x0189, all -> 0x0186 }
            defpackage.fdu.a(r13, r5)     // Catch:{ IOException -> 0x0183, all -> 0x017f }
            int r6 = r5.size()     // Catch:{ IOException -> 0x0183, all -> 0x017f }
            if (r6 != 0) goto L_0x003e
            if (r13 == 0) goto L_0x0033
            r13.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x0033
        L_0x002d:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r2, r14)
        L_0x0033:
            r5.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x003d
        L_0x0037:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r1, r14)
        L_0x003d:
            return r3
        L_0x003e:
            com.spotify.music.features.editplaylist.upload.ImageUpload$c r6 = r12.c     // Catch:{ IOException -> 0x0183, all -> 0x017f }
            java.lang.String r7 = "https://image-upload.spotify.com/v3/playlist"
            com.spotify.music.features.editplaylist.upload.ImageUpload$b r6 = r6.buildUrl(r7)     // Catch:{ IOException -> 0x0183, all -> 0x017f }
            java.net.URLConnection r7 = r6.a()     // Catch:{ IOException -> 0x0183, all -> 0x017f }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ IOException -> 0x0183, all -> 0x017f }
            r8 = 1
            r7.setDoOutput(r8)     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            java.lang.String r9 = "POST"
            r7.setRequestMethod(r9)     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            java.lang.String r9 = "Host"
            java.lang.String r6 = r6.b()     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            r7.setRequestProperty(r9, r6)     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            java.lang.String r6 = "Content-Type"
            java.lang.String r9 = "image/jpeg"
            r7.setRequestProperty(r6, r9)     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            java.lang.String r6 = "Authorization"
            java.lang.String r9 = "Bearer %s"
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            r10[r4] = r14     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            java.lang.String r14 = java.lang.String.format(r9, r10)     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            r7.setRequestProperty(r6, r14)     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            r14 = 5000(0x1388, float:7.006E-42)
            r7.setConnectTimeout(r14)     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            java.lang.String r14 = "Connection"
            java.lang.String r6 = "close"
            r7.setRequestProperty(r14, r6)     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            int r14 = r5.size()     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            r7.setFixedLengthStreamingMode(r14)     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            java.io.OutputStream r14 = r7.getOutputStream()     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            byte[] r6 = r5.toByteArray()     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            r14.write(r6)     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            r14.flush()     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            int r14 = r7.getResponseCode()     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r14 == r6) goto L_0x00d2
            int r14 = r7.getResponseCode()     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            r6 = 202(0xca, float:2.83E-43)
            if (r14 == r6) goto L_0x00d2
            java.lang.String r14 = "Response code not HTTP_OK or HTTP_ACCEPTED, was: %d"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            int r8 = r7.getResponseCode()     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            r6[r4] = r8     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            com.spotify.base.java.logging.Logger.e(r14, r6)     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            if (r7 == 0) goto L_0x00bb
            r7.disconnect()
        L_0x00bb:
            if (r13 == 0) goto L_0x00c7
            r13.close()     // Catch:{ IOException -> 0x00c1 }
            goto L_0x00c7
        L_0x00c1:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r2, r14)
        L_0x00c7:
            r5.close()     // Catch:{ IOException -> 0x00cb }
            goto L_0x00d1
        L_0x00cb:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r1, r14)
        L_0x00d1:
            return r3
        L_0x00d2:
            java.io.BufferedReader r14 = new java.io.BufferedReader     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            java.io.InputStream r8 = r7.getInputStream()     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            r6.<init>(r8)     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            r14.<init>(r6)     // Catch:{ IOException -> 0x017b, all -> 0x0178 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0172, all -> 0x016c }
            r8 = 32
            r6.<init>(r8)     // Catch:{ IOException -> 0x0172, all -> 0x016c }
        L_0x00e7:
            java.lang.String r8 = r14.readLine()     // Catch:{ IOException -> 0x0172, all -> 0x016c }
            if (r8 == 0) goto L_0x00f6
            r6.append(r8)     // Catch:{ IOException -> 0x0172, all -> 0x016c }
            r8 = 10
            r6.append(r8)     // Catch:{ IOException -> 0x0172, all -> 0x016c }
            goto L_0x00e7
        L_0x00f6:
            com.fasterxml.jackson.databind.ObjectMapper r8 = r12.a     // Catch:{ IOException -> 0x0172, all -> 0x016c }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x0172, all -> 0x016c }
            java.lang.Class<com.spotify.music.features.editplaylist.upload.ImageUpload$ImageUploadResponse> r9 = com.spotify.music.features.editplaylist.upload.ImageUpload.ImageUploadResponse.class
            java.lang.Object r6 = r8.readValue(r6, r9)     // Catch:{ IOException -> 0x0172, all -> 0x016c }
            com.spotify.music.features.editplaylist.upload.ImageUpload$ImageUploadResponse r6 = (com.spotify.music.features.editplaylist.upload.ImageUpload.ImageUploadResponse) r6     // Catch:{ IOException -> 0x0172, all -> 0x016c }
            if (r6 == 0) goto L_0x0139
            java.lang.String r8 = "ok"
            java.lang.String r9 = r6.status     // Catch:{ IOException -> 0x0166, all -> 0x016c }
            boolean r8 = r8.equals(r9)     // Catch:{ IOException -> 0x0166, all -> 0x016c }
            if (r8 != 0) goto L_0x0111
            goto L_0x0139
        L_0x0111:
            if (r7 == 0) goto L_0x0116
            r7.disconnect()
        L_0x0116:
            if (r13 == 0) goto L_0x0122
            r13.close()     // Catch:{ IOException -> 0x011c }
            goto L_0x0122
        L_0x011c:
            r13 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r2, r7)
        L_0x0122:
            r5.close()     // Catch:{ IOException -> 0x0126 }
            goto L_0x012c
        L_0x0126:
            r13 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r1, r2)
        L_0x012c:
            r14.close()     // Catch:{ IOException -> 0x0131 }
            goto L_0x01c8
        L_0x0131:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r0, r14)
            goto L_0x01c8
        L_0x0139:
            java.lang.String r8 = "Failed to parse image response, or an error occurred"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0166, all -> 0x016c }
            com.spotify.base.java.logging.Logger.e(r8, r9)     // Catch:{ IOException -> 0x0166, all -> 0x016c }
            if (r7 == 0) goto L_0x0145
            r7.disconnect()
        L_0x0145:
            if (r13 == 0) goto L_0x0151
            r13.close()     // Catch:{ IOException -> 0x014b }
            goto L_0x0151
        L_0x014b:
            r13 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r2, r6)
        L_0x0151:
            r5.close()     // Catch:{ IOException -> 0x0155 }
            goto L_0x015b
        L_0x0155:
            r13 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r1, r2)
        L_0x015b:
            r14.close()     // Catch:{ IOException -> 0x015f }
            goto L_0x0165
        L_0x015f:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r0, r14)
        L_0x0165:
            return r3
        L_0x0166:
            r8 = move-exception
            r11 = r6
            r6 = r14
            r14 = r8
            r8 = r11
            goto L_0x0197
        L_0x016c:
            r3 = move-exception
            r11 = r3
            r3 = r14
            r14 = r11
            goto L_0x01de
        L_0x0172:
            r6 = move-exception
            r8 = r3
            r11 = r6
            r6 = r14
            r14 = r11
            goto L_0x0197
        L_0x0178:
            r14 = move-exception
            goto L_0x01de
        L_0x017b:
            r14 = move-exception
            r6 = r3
            r8 = r6
            goto L_0x0197
        L_0x017f:
            r14 = move-exception
            r7 = r3
            goto L_0x01de
        L_0x0183:
            r14 = move-exception
            r6 = r3
            goto L_0x0195
        L_0x0186:
            r14 = move-exception
            r5 = r3
            goto L_0x018f
        L_0x0189:
            r14 = move-exception
            r5 = r3
            goto L_0x0194
        L_0x018c:
            r14 = move-exception
            r13 = r3
            r5 = r13
        L_0x018f:
            r7 = r5
            goto L_0x01de
        L_0x0191:
            r14 = move-exception
            r13 = r3
            r5 = r13
        L_0x0194:
            r6 = r5
        L_0x0195:
            r7 = r6
            r8 = r7
        L_0x0197:
            java.lang.String r9 = ""
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x01dc }
            com.spotify.base.java.logging.Logger.e(r14, r9, r10)     // Catch:{ all -> 0x01dc }
            if (r7 == 0) goto L_0x01a3
            r7.disconnect()
        L_0x01a3:
            if (r13 == 0) goto L_0x01af
            r13.close()     // Catch:{ IOException -> 0x01a9 }
            goto L_0x01af
        L_0x01a9:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r2, r14)
        L_0x01af:
            if (r5 == 0) goto L_0x01bb
            r5.close()     // Catch:{ IOException -> 0x01b5 }
            goto L_0x01bb
        L_0x01b5:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r1, r14)
        L_0x01bb:
            if (r6 == 0) goto L_0x01c7
            r6.close()     // Catch:{ IOException -> 0x01c1 }
            goto L_0x01c7
        L_0x01c1:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r0, r14)
        L_0x01c7:
            r6 = r8
        L_0x01c8:
            if (r6 == 0) goto L_0x01db
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "spotify:userimage:"
            r13.<init>(r14)
            java.lang.String r14 = r6.id
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            return r13
        L_0x01db:
            return r3
        L_0x01dc:
            r14 = move-exception
            r3 = r6
        L_0x01de:
            if (r7 == 0) goto L_0x01e3
            r7.disconnect()
        L_0x01e3:
            if (r13 == 0) goto L_0x01ef
            r13.close()     // Catch:{ IOException -> 0x01e9 }
            goto L_0x01ef
        L_0x01e9:
            r13 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r2, r6)
        L_0x01ef:
            if (r5 == 0) goto L_0x01fb
            r5.close()     // Catch:{ IOException -> 0x01f5 }
            goto L_0x01fb
        L_0x01f5:
            r13 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r1, r2)
        L_0x01fb:
            if (r3 == 0) goto L_0x0207
            r3.close()     // Catch:{ IOException -> 0x0201 }
            goto L_0x0207
        L_0x0201:
            r13 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r13, r0, r1)
        L_0x0207:
            goto L_0x0209
        L_0x0208:
            throw r14
        L_0x0209:
            goto L_0x0208
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.editplaylist.upload.ImageUpload.a(java.lang.String, java.lang.String):java.lang.String");
    }
}
