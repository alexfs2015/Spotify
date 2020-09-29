package defpackage;

import com.spotify.common.uri.SpotifyUriParserException;

/* renamed from: gdq reason: default package */
public final class gdq {
    private static final String[] e = {"http://spotify.com/", "https://spotify.com/", "http://open.spotify.com/", "https://open.spotify.com/"};
    private byte[] a;
    private byte[] b;
    private int c;
    private String d;

    public gdq(String str) {
        this.d = str;
        this.a = new byte[str.length()];
        this.b = new byte[str.length()];
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~') {
                StringBuilder sb = new StringBuilder("Spotify uri contained non-ASCII characters at position ");
                sb.append(i);
                sb.append(": ");
                sb.append(str);
                throw new SpotifyUriParserException(sb.toString());
            } else if (charAt != ' ') {
                this.a[i] = (byte) charAt;
                i++;
            } else {
                throw new SpotifyUriParserException("Spotify uri contained space.");
            }
        }
        this.c = 0;
    }

    private static int a(byte b2) {
        if (b2 >= 48 && b2 <= 57) {
            return b2 - 48;
        }
        byte b3 = 65;
        if (b2 < 65 || b2 > 70) {
            b3 = 97;
            if (b2 < 97 || b2 > 102) {
                return -1;
            }
        }
        return (b2 - b3) + 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        throw new com.spotify.common.uri.SpotifyUriParserException(r0.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(boolean r7) {
        /*
            r6 = this;
            int r0 = r6.c
            byte[] r1 = r6.a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00a2
            r0 = 0
            r1 = 0
        L_0x0009:
            int r2 = r6.c
            byte[] r3 = r6.a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x0094
            int r4 = r2 + 1
            r6.c = r4
            byte r2 = r3[r2]
            r4 = 65
            if (r2 >= r4) goto L_0x008b
            r4 = 43
            if (r2 != r4) goto L_0x0021
            r2 = 32
            goto L_0x008b
        L_0x0021:
            r4 = 37
            if (r2 != r4) goto L_0x0081
            int r2 = r6.c
            int r4 = r2 + 2
            int r5 = r3.length
            if (r4 > r5) goto L_0x0068
            int r4 = r2 + 1
            r6.c = r4
            byte r2 = r3[r2]
            int r2 = a(r2)
            byte[] r3 = r6.a
            int r4 = r6.c
            int r5 = r4 + 1
            r6.c = r5
            byte r3 = r3[r4]
            int r3 = a(r3)
            if (r2 < 0) goto L_0x004d
            if (r3 < 0) goto L_0x004d
            int r2 = r2 << 4
            int r2 = r2 + r3
            byte r2 = (byte) r2
            goto L_0x008b
        L_0x004d:
            byte[] r7 = r6.a
            int r7 = r7.length
            r6.c = r7
            com.spotify.common.uri.SpotifyUriParserException r7 = new com.spotify.common.uri.SpotifyUriParserException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bad hex character in Spotify uri: "
            r0.<init>(r1)
            java.lang.String r1 = r6.d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0068:
            int r7 = r3.length
            r6.c = r7
            com.spotify.common.uri.SpotifyUriParserException r7 = new com.spotify.common.uri.SpotifyUriParserException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Badly encoded character in Spotify uri: "
            r0.<init>(r1)
            java.lang.String r1 = r6.d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0081:
            if (r7 == 0) goto L_0x008b
            r3 = 58
            if (r2 == r3) goto L_0x0094
            r3 = 47
            if (r2 == r3) goto L_0x0094
        L_0x008b:
            byte[] r3 = r6.b
            int r4 = r1 + 1
            r3[r1] = r2
            r1 = r4
            goto L_0x0009
        L_0x0094:
            java.lang.String r7 = new java.lang.String
            byte[] r2 = r6.b
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r7.<init>(r2, r0, r1, r3)
            return r7
        L_0x00a2:
            com.spotify.common.uri.SpotifyUriParserException r7 = new com.spotify.common.uri.SpotifyUriParserException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "End of Spotify uri reached unexpectedly: "
            r0.<init>(r1)
            java.lang.String r1 = r6.d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            goto L_0x00b9
        L_0x00b8:
            throw r7
        L_0x00b9:
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdq.a(boolean):java.lang.String");
    }

    public final String a() {
        return a(true);
    }

    public final String b() {
        return a(false);
    }

    public final boolean c() {
        return this.c == this.a.length;
    }

    public final void d() {
        if (this.c == 0) {
            String[] strArr = e;
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (this.d.startsWith(str)) {
                    this.c = str.length();
                    return;
                }
            }
            if (this.d.startsWith("spotify:")) {
                this.c = 8;
                if (this.c + 1 < this.d.length() && this.d.charAt(this.c) == '/' && this.d.charAt(this.c + 1) == '/') {
                    this.c += 2;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Spotify uri doesn't start with a proper prefix: ");
            sb.append(this.d);
            throw new SpotifyUriParserException(sb.toString());
        }
        throw new RuntimeException("skipSpotifyPrefix must be the first call to SpotifyUriParser");
    }

    public final String e() {
        int i = this.c;
        if (i <= this.a.length) {
            String a2 = a(false);
            this.c = i;
            return a2;
        }
        StringBuilder sb = new StringBuilder("End of Spotify uri reached unexpectedly: ");
        sb.append(this.d);
        throw new SpotifyUriParserException(sb.toString());
    }
}
