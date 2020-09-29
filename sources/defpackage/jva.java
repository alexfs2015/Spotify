package defpackage;

import android.content.UriMatcher;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.mobile.android.util.LinkType;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: jva reason: default package */
public final class jva {
    private static final UriMatcher d = jwl.a();
    private static final Pattern e = Pattern.compile("user:([^:]+)");
    private static final Map<String, jva> f = gcm.a();
    public final Uri a;
    public final LinkType b;
    public final String c;
    private final String g;

    private jva(String str) {
        String str2 = null;
        if (str == null) {
            this.a = Uri.EMPTY;
            this.b = LinkType.DUMMY;
            this.c = null;
            this.g = null;
            return;
        }
        String str3 = "spotify://";
        if (str.startsWith(str3)) {
            this.c = str3;
        } else {
            String str4 = "spotify:";
            if (str.startsWith(str4)) {
                this.c = str4;
            } else {
                String str5 = "http://open.spotify.com/";
                if (str.startsWith(str5)) {
                    this.c = str5;
                } else {
                    String str6 = "https://open.spotify.com/";
                    if (str.startsWith(str6)) {
                        this.c = str6;
                    } else {
                        String str7 = "https://r.spotify.com/";
                        if (str.startsWith(str7)) {
                            int indexOf = str.indexOf("/app_android/");
                            if (indexOf > 0) {
                                str2 = str.substring(indexOf + 13).replaceFirst("([^/?]+).*", "$1");
                                str = str.substring(0, indexOf);
                            }
                            this.c = str7;
                        } else {
                            this.c = null;
                        }
                    }
                }
            }
        }
        this.g = str2;
        String str8 = this.c;
        if (str8 == null) {
            this.a = Uri.EMPTY;
            this.b = LinkType.DUMMY;
            return;
        }
        String replaceAll = jwk.d.matcher(str.substring(str8.length())).replaceAll("/");
        this.a = (Uri) jvi.a(Uri.parse(replaceAll), Uri.EMPTY);
        String str9 = jwk.e.split(replaceAll, 0)[0];
        int match = d.match((Uri) jvi.a(Uri.parse(str9), Uri.EMPTY));
        if (match == -1 || !a(str9, match)) {
            this.b = LinkType.DUMMY;
        } else {
            this.b = LinkType.a(match);
        }
    }

    private String a(int i, int i2, int i3) {
        String a2 = a(i);
        if (TextUtils.isEmpty(a2) || (!a2.equals("episode") && !a2.equals(TrackData.TYPE_TRACK))) {
            return null;
        }
        return a(i2, i3);
    }

    public static jva a(String str) {
        jva jva = (jva) f.get(str);
        if (jva != null) {
            return jva;
        }
        jva jva2 = new jva(str);
        f.put(str, jva2);
        return jva2;
    }

    public static jva a(String str, String str2) {
        boolean z = true;
        fbp.a(((String) fbp.a(str)).length() == 22);
        if (((String) fbp.a(str2)).length() != 22) {
            z = false;
        }
        fbp.a(z);
        StringBuilder sb = new StringBuilder("spotify:album:");
        sb.append(str);
        sb.append(":play:");
        sb.append(str2);
        return a(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x014a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r10, int r11) {
        /*
            r9 = this;
            java.util.regex.Pattern r0 = defpackage.jwk.f
            r1 = 0
            java.lang.String[] r10 = r0.split(r10, r1)
            r10 = r10[r1]
            java.lang.String r0 = "/"
            java.lang.String[] r10 = r10.split(r0)
            com.spotify.mobile.android.util.LinkType r11 = com.spotify.mobile.android.util.LinkType.a(r11)
            jwk r11 = defpackage.jwl.a(r11)
            java.util.List<java.lang.String> r11 = r11.a
            java.util.Iterator r11 = r11.iterator()
        L_0x001d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x014b
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "spotify:"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x0037
            r2 = 8
            java.lang.String r0 = r0.substring(r2)
        L_0x0037:
            java.lang.String r2 = ":"
            java.lang.String[] r0 = r0.split(r2)
            int r2 = r0.length
            int r3 = r10.length
            r4 = 1
            if (r2 != r3) goto L_0x0147
            com.google.common.collect.ImmutableList$a r2 = com.google.common.collect.ImmutableList.g()
            int r3 = r0.length
            r5 = 0
        L_0x0048:
            if (r5 >= r3) goto L_0x010d
            r6 = r0[r5]
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x005d
            java.lang.String r6 = ""
            jth r6 = defpackage.jth.c(r6)
            r2.c(r6)
            goto L_0x0109
        L_0x005d:
            char r7 = r6.charAt(r1)
            r8 = 123(0x7b, float:1.72E-43)
            if (r7 != r8) goto L_0x0074
            java.lang.String r7 = "as Base62}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x0074
            jtg r6 = defpackage.jtg.a
            r2.c(r6)
            goto L_0x0109
        L_0x0074:
            char r7 = r6.charAt(r1)
            if (r7 != r8) goto L_0x0089
            java.lang.String r7 = "as Hex64}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x0089
            jtj r6 = defpackage.jtj.a
            r2.c(r6)
            goto L_0x0109
        L_0x0089:
            char r7 = r6.charAt(r1)
            if (r7 != r8) goto L_0x009e
            java.lang.String r7 = "as text}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x009e
            jtl r6 = defpackage.jtl.a
            r2.c(r6)
            goto L_0x0109
        L_0x009e:
            char r7 = r6.charAt(r1)
            if (r7 != r8) goto L_0x00b2
            java.lang.String r7 = "as Username}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x00b2
            jto r6 = defpackage.jto.a
            r2.c(r6)
            goto L_0x0109
        L_0x00b2:
            char r7 = r6.charAt(r1)
            if (r7 != r8) goto L_0x00c6
            java.lang.String r7 = "as GidID}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x00c6
            jti r6 = defpackage.jti.a
            r2.c(r6)
            goto L_0x0109
        L_0x00c6:
            char r7 = r6.charAt(r1)
            if (r7 != r8) goto L_0x00da
            java.lang.String r7 = "as Query}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x00da
            jtk r6 = defpackage.jtk.a
            r2.c(r6)
            goto L_0x0109
        L_0x00da:
            char r7 = r6.charAt(r1)
            if (r7 != r8) goto L_0x00ee
            java.lang.String r7 = "as URL}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x00ee
            jtn r6 = defpackage.jtn.a
            r2.c(r6)
            goto L_0x0109
        L_0x00ee:
            char r7 = r6.charAt(r1)
            if (r7 != r8) goto L_0x0102
            java.lang.String r7 = "}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x0102
            jtm r6 = defpackage.jtm.b
            r2.c(r6)
            goto L_0x0109
        L_0x0102:
            jth r6 = defpackage.jth.c(r6)
            r2.c(r6)
        L_0x0109:
            int r5 = r5 + 1
            goto L_0x0048
        L_0x010d:
            com.google.common.collect.ImmutableList r0 = r2.a()
            r2 = 0
        L_0x0112:
            int r3 = r10.length
            if (r2 >= r3) goto L_0x0128
            java.lang.Object r3 = r0.get(r2)
            jtm r3 = (defpackage.jtm) r3
            r5 = r10[r2]
            boolean r3 = r3.a(r5)
            if (r3 != 0) goto L_0x0125
            r2 = 0
            goto L_0x0129
        L_0x0125:
            int r2 = r2 + 1
            goto L_0x0112
        L_0x0128:
            r2 = 1
        L_0x0129:
            if (r2 == 0) goto L_0x0147
            r2 = 0
        L_0x012c:
            int r3 = r10.length
            if (r2 >= r3) goto L_0x0142
            java.lang.Object r3 = r0.get(r2)
            jtm r3 = (defpackage.jtm) r3
            r5 = r10[r2]
            boolean r3 = r3.b(r5)
            if (r3 != 0) goto L_0x013f
            r0 = 0
            goto L_0x0143
        L_0x013f:
            int r2 = r2 + 1
            goto L_0x012c
        L_0x0142:
            r0 = 1
        L_0x0143:
            if (r0 == 0) goto L_0x0147
            r0 = 1
            goto L_0x0148
        L_0x0147:
            r0 = 0
        L_0x0148:
            if (r0 == 0) goto L_0x001d
            return r4
        L_0x014b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jva.a(java.lang.String, int):boolean");
    }

    public static boolean a(String str, LinkType linkType) {
        return a(str).b == linkType;
    }

    public static boolean a(String str, LinkType... linkTypeArr) {
        jva a2 = a(str);
        for (LinkType linkType : linkTypeArr) {
            if (a2.b == linkType) {
                return true;
            }
        }
        return false;
    }

    private String b(int i) {
        String a2 = a(i);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("spotify:track:");
        sb.append(Uri.encode(a2));
        return sb.toString();
    }

    private String b(int i, int i2) {
        String a2 = a(i);
        if (!TextUtils.isEmpty(a2)) {
            if (a2.equals("episode")) {
                return c(i2);
            }
            if (a2.equals(TrackData.TYPE_TRACK)) {
                return b(i2);
            }
        }
        return null;
    }

    private String b(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("spotify:");
        List pathSegments = this.a.getPathSegments();
        for (int i2 = 0; i2 < pathSegments.size(); i2++) {
            if (sb.charAt(sb.length() - 1) != ':') {
                sb.append(':');
            }
            if (i2 == i) {
                sb.append(Uri.encode(str));
            }
            sb.append(Uri.encode((String) pathSegments.get(i2)));
        }
        if (i >= pathSegments.size()) {
            sb.append(':');
            sb.append(Uri.encode(str));
        }
        return sb.toString();
    }

    public static jva b(String str) {
        StringBuilder sb = new StringBuilder("spotify:user:");
        sb.append(Uri.encode(str));
        return a(sb.toString());
    }

    private String c(int i) {
        String a2 = a(i);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("spotify:episode:");
        sb.append(Uri.encode(a2));
        return sb.toString();
    }

    public static jva c(String str) {
        fbp.a(((String) fbp.a(str)).length() == 22);
        StringBuilder sb = new StringBuilder("spotify:track:");
        sb.append(str);
        return a(sb.toString());
    }

    public static jva d(String str) {
        fbp.a(((String) fbp.a(str)).length() == 22);
        StringBuilder sb = new StringBuilder("spotify:artist:");
        sb.append(str);
        return a(sb.toString());
    }

    public static jva e(String str) {
        fbp.a(((String) fbp.a(str)).length() == 22);
        StringBuilder sb = new StringBuilder("spotify:album:");
        sb.append(str);
        return a(sb.toString());
    }

    public static jva f(String str) {
        StringBuilder sb = new StringBuilder("spotify:playlist:");
        sb.append(str);
        return a(sb.toString());
    }

    public static jva g(String str) {
        StringBuilder sb = new StringBuilder("spotify:user:");
        sb.append(Uri.encode(str));
        sb.append(':');
        sb.append("collection");
        return a(sb.toString());
    }

    public static boolean h(String str) {
        return a(str).b != LinkType.DUMMY;
    }

    public final int a() {
        return this.a.getPathSegments().size();
    }

    public final String a(int i) {
        if (d.match(this.a) == -1 || i < 0 || i >= this.a.getPathSegments().size()) {
            return null;
        }
        return gck.b(this.a.getEncodedPath().split("/")[i], fbi.c);
    }

    public final String a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("spotify:");
        List pathSegments = this.a.getPathSegments();
        for (int i3 = 0; i3 < pathSegments.size(); i3++) {
            if (i3 < i || i3 > i2) {
                if (sb.charAt(sb.length() - 1) != ':') {
                    sb.append(':');
                }
                sb.append(Uri.encode((String) pathSegments.get(i3)));
            }
        }
        return sb.toString();
    }

    public final String a(int i, String str) {
        if (d.match(this.a) == -1 || i < 0 || i >= this.a.getPathSegments().size()) {
            return null;
        }
        String[] split = this.a.getEncodedPath().split("/");
        String[] strArr = (String[]) Arrays.copyOfRange(split, i, split.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = gck.b(strArr[i2], fbi.c);
        }
        return TextUtils.join(str, strArr);
    }

    public final String b() {
        return this.a.getLastPathSegment();
    }

    public final String c() {
        Matcher matcher = e.matcher(h());
        if (matcher.find()) {
            return Uri.decode(matcher.group(1));
        }
        return null;
    }

    public final boolean d() {
        return !fbo.a(this.a.getQueryParameter("context"));
    }

    public final jva e() {
        String str;
        String queryParameter = this.a.getQueryParameter("context");
        String lastPathSegment = this.a.getLastPathSegment();
        List pathSegments = this.a.getPathSegments();
        if (!pathSegments.isEmpty()) {
            str = (String) pathSegments.get(0);
            if (!str.equals("episode") && !str.equals(TrackData.TYPE_TRACK)) {
                str = null;
            }
        } else {
            str = "";
        }
        if (queryParameter == null) {
            return null;
        }
        String replaceAll = jwk.g.matcher(queryParameter).replaceAll(":");
        StringBuilder sb = new StringBuilder();
        sb.append(replaceAll);
        sb.append(':');
        sb.append("play:");
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(':');
            sb2.append(lastPathSegment);
            lastPathSegment = sb2.toString();
        }
        sb.append(lastPathSegment);
        return a(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jva)) {
            return false;
        }
        jva jva = (jva) obj;
        return fbn.a(this.a, jva.a) && fbn.a(this.g, jva.g);
    }

    public final String f() {
        String str = "URI is does not contain an ID";
        switch (this.b) {
            case ALBUM:
            case COLLECTION_ALBUM:
            case HOME_DRILLDOWN:
            case ARTIST:
            case COLLECTION_ARTIST:
            case PROFILE_PLAYLIST:
            case PLAYLIST_V2:
            case CHARTS_SUBPAGE:
            case CHARTS_SPECIFIC:
            case SHOW_SHOW:
            case SHOW_EPISODE:
            case AD:
            case TRACK:
            case TRACK_AUTOPLAY:
                return this.a.getLastPathSegment();
            case ALBUM_AUTOPLAY:
            case ARTIST_AUTOPLAY:
            case ARTIST_RELEASES:
                if (this.a.getPathSegments().size() > 0) {
                    return (String) this.a.getPathSegments().get(1);
                }
                throw new UnsupportedOperationException(str);
            case CONCERT_ENTITY:
                return this.a.getLastPathSegment();
            default:
                throw new UnsupportedOperationException(str);
        }
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("https://open.spotify.com/");
        sb.append(this.a);
        return sb.toString();
    }

    public final String h() {
        if (Uri.EMPTY.equals(this.a)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("spotify:");
        sb.append(this.a.getEncodedPath().replace('/', ':'));
        return sb.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.g});
    }

    public final String i() {
        if (Uri.EMPTY.equals(this.a)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("spotify://");
        sb.append(this.a.getEncodedPath());
        return sb.toString();
    }

    public final String i(String str) {
        int i = AnonymousClass1.a[this.b.ordinal()];
        String str2 = "collection:";
        String str3 = "spotify:user:";
        if (i != 1) {
            if (i == 4) {
                StringBuilder sb = new StringBuilder(str3);
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                sb.append("artist:");
                sb.append(f());
                return sb.toString();
            } else if (i != 15) {
                return h();
            }
        }
        StringBuilder sb2 = new StringBuilder(str3);
        sb2.append(str);
        sb2.append(':');
        sb2.append(str2);
        sb2.append("album:");
        sb2.append(f());
        return sb2.toString();
    }

    public final String j() {
        if (Uri.EMPTY.equals(this.a)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("https://open.spotify.com/");
        sb.append(this.a.getEncodedPath());
        return sb.toString();
    }

    public final String k() {
        if (this.b == LinkType.COLLECTION_PLAYLIST_FOLDER) {
            return a(3);
        }
        throw new UnsupportedOperationException("URI is not a folder");
    }

    public final boolean l() {
        return !TextUtils.isEmpty(this.g);
    }

    public final boolean m() {
        return !TextUtils.isEmpty(this.a.getQueryParameter("utm_campaign")) || !TextUtils.isEmpty(this.a.getQueryParameter("utm_source")) || !TextUtils.isEmpty(this.a.getQueryParameter("utm_medium"));
    }

    public final boolean n() {
        int i = AnonymousClass1.a[this.b.ordinal()];
        switch (i) {
            case 14:
            case 15:
            case 16:
                break;
            default:
                switch (i) {
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        break;
                    default:
                        return false;
                }
        }
        return true;
    }

    public final String o() {
        int i = AnonymousClass1.a[this.b.ordinal()];
        if (i == 15) {
            String b2 = b(3, 4);
            return !TextUtils.isEmpty(b2) ? b2 : b(3);
        } else if (i != 16) {
            switch (i) {
                case 27:
                    String b3 = b(5, 6);
                    return !TextUtils.isEmpty(b3) ? b3 : b(5);
                case 28:
                    String b4 = b(3, 4);
                    return !TextUtils.isEmpty(b4) ? b4 : b(3);
                case 29:
                    return c(5);
                case 30:
                    return b(9);
                default:
                    return null;
            }
        } else {
            String b5 = b(3, 4);
            return !TextUtils.isEmpty(b5) ? b5 : b(3);
        }
    }

    public final String p() {
        int i = AnonymousClass1.a[this.b.ordinal()];
        String str = "play";
        return i != 1 ? i != 4 ? i != 11 ? i != 13 ? i != 6 ? i != 7 ? h() : b(2, str) : b(4, str) : b(2, str) : b(2, str) : b(2, str) : b(2, str);
    }

    public final String q() {
        int i = AnonymousClass1.a[this.b.ordinal()];
        switch (i) {
            case 14:
                return a(2, 2);
            case 15:
                String a2 = a(3, 2, 4);
                return !TextUtils.isEmpty(a2) ? a2 : a(2, 3);
            case 16:
                String a3 = a(3, 2, 4);
                return !TextUtils.isEmpty(a3) ? a3 : a(2, 3);
            default:
                switch (i) {
                    case 27:
                        String a4 = a(5, 4, 6);
                        return !TextUtils.isEmpty(a4) ? a4 : a(4, 5);
                    case 28:
                        String a5 = a(3, 2, 4);
                        return !TextUtils.isEmpty(a5) ? a5 : a(2, 3);
                    case 29:
                        return a(2, 2);
                    case 30:
                        return a(7, 9);
                    case 31:
                        return a(7, 9);
                    default:
                        return h();
                }
        }
    }

    public final String r() {
        int i = AnonymousClass1.a[this.b.ordinal()];
        if (i == 2) {
            StringBuilder sb = new StringBuilder("spotify:album:");
            sb.append(f());
            return sb.toString();
        } else if (i != 5) {
            return h();
        } else {
            StringBuilder sb2 = new StringBuilder("spotify:artist:");
            sb2.append(f());
            return sb2.toString();
        }
    }

    public final String s() {
        if (Uri.EMPTY.equals(this.a)) {
            return null;
        }
        return this.a.getFragment();
    }

    public final String toString() {
        return this.a.toString();
    }
}
