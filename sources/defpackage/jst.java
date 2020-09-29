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

/* renamed from: jst reason: default package */
public final class jst {
    private static final UriMatcher d = jud.a();
    private static final Pattern e = Pattern.compile("user:([^:]+)");
    private static final Map<String, jst> f = gbo.a();
    public final Uri a;
    public final LinkType b;
    public final String c;
    private final String g;

    public static jst a(String str) {
        jst jst = (jst) f.get(str);
        if (jst != null) {
            return jst;
        }
        jst jst2 = new jst(str);
        f.put(str, jst2);
        return jst2;
    }

    public static jst b(String str) {
        StringBuilder sb = new StringBuilder("spotify:user:");
        sb.append(Uri.encode(str));
        return a(sb.toString());
    }

    public static jst c(String str) {
        fay.a(((String) fay.a(str)).length() == 22);
        StringBuilder sb = new StringBuilder("spotify:track:");
        sb.append(str);
        return a(sb.toString());
    }

    public static jst d(String str) {
        fay.a(((String) fay.a(str)).length() == 22);
        StringBuilder sb = new StringBuilder("spotify:artist:");
        sb.append(str);
        return a(sb.toString());
    }

    public static jst e(String str) {
        fay.a(((String) fay.a(str)).length() == 22);
        StringBuilder sb = new StringBuilder("spotify:album:");
        sb.append(str);
        return a(sb.toString());
    }

    public static jst a(String str, String str2) {
        boolean z = true;
        fay.a(((String) fay.a(str)).length() == 22);
        if (((String) fay.a(str2)).length() != 22) {
            z = false;
        }
        fay.a(z);
        StringBuilder sb = new StringBuilder("spotify:album:");
        sb.append(str);
        sb.append(":play:");
        sb.append(str2);
        return a(sb.toString());
    }

    public static jst f(String str) {
        StringBuilder sb = new StringBuilder("spotify:playlist:");
        sb.append(str);
        return a(sb.toString());
    }

    public static jst g(String str) {
        StringBuilder sb = new StringBuilder("spotify:user:");
        sb.append(Uri.encode(str));
        sb.append(':');
        sb.append("collection");
        return a(sb.toString());
    }

    public static boolean h(String str) {
        return a(str).b != LinkType.DUMMY;
    }

    public static boolean a(String str, LinkType linkType) {
        return a(str).b == linkType;
    }

    public static boolean a(String str, LinkType... linkTypeArr) {
        jst a2 = a(str);
        for (LinkType linkType : linkTypeArr) {
            if (a2.b == linkType) {
                return true;
            }
        }
        return false;
    }

    private jst(String str) {
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
        String replaceAll = juc.d.matcher(str.substring(str8.length())).replaceAll("/");
        this.a = (Uri) jtc.a(Uri.parse(replaceAll), Uri.EMPTY);
        String str9 = juc.e.split(replaceAll, 0)[0];
        int match = d.match((Uri) jtc.a(Uri.parse(str9), Uri.EMPTY));
        if (match == -1 || !a(str9, match)) {
            this.b = LinkType.DUMMY;
        } else {
            this.b = LinkType.a(match);
        }
    }

    public final int a() {
        return this.a.getPathSegments().size();
    }

    public final String a(int i) {
        if (d.match(this.a) == -1 || i < 0 || i >= this.a.getPathSegments().size()) {
            return null;
        }
        return gbm.b(this.a.getEncodedPath().split("/")[i], far.c);
    }

    public final String b() {
        return this.a.getLastPathSegment();
    }

    public final String a(int i, String str) {
        if (d.match(this.a) == -1 || i < 0 || i >= this.a.getPathSegments().size()) {
            return null;
        }
        String[] split = this.a.getEncodedPath().split("/");
        String[] strArr = (String[]) Arrays.copyOfRange(split, i, split.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = gbm.b(strArr[i2], far.c);
        }
        return TextUtils.join(str, strArr);
    }

    public final String c() {
        Matcher matcher = e.matcher(h());
        if (matcher.find()) {
            return Uri.decode(matcher.group(1));
        }
        return null;
    }

    public final boolean d() {
        return !fax.a(this.a.getQueryParameter("context"));
    }

    public final jst e() {
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
        String replaceAll = juc.g.matcher(queryParameter).replaceAll(":");
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

    public final String i() {
        if (Uri.EMPTY.equals(this.a)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("spotify://");
        sb.append(this.a.getEncodedPath());
        return sb.toString();
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
            if (!TextUtils.isEmpty(b2)) {
                return b2;
            }
            return b(3);
        } else if (i != 16) {
            switch (i) {
                case 27:
                    String b3 = b(5, 6);
                    if (!TextUtils.isEmpty(b3)) {
                        return b3;
                    }
                    return b(5);
                case 28:
                    String b4 = b(3, 4);
                    if (!TextUtils.isEmpty(b4)) {
                        return b4;
                    }
                    return b(3);
                case 29:
                    return c(5);
                case 30:
                    return b(9);
                default:
                    return null;
            }
        } else {
            String b5 = b(3, 4);
            if (!TextUtils.isEmpty(b5)) {
                return b5;
            }
            return b(3);
        }
    }

    public final String p() {
        int i = AnonymousClass1.a[this.b.ordinal()];
        String str = "play";
        if (i == 1) {
            return b(2, str);
        }
        if (i == 4) {
            return b(2, str);
        }
        if (i == 11) {
            return b(2, str);
        }
        if (i == 13) {
            return b(2, str);
        }
        if (i == 6) {
            return b(4, str);
        }
        if (i != 7) {
            return h();
        }
        return b(2, str);
    }

    public final String i(String str) {
        int i = AnonymousClass1.a[this.b.ordinal()];
        if (i != 1 && i != 4 && i != 6 && i != 7) {
            return h();
        }
        StringBuilder sb = new StringBuilder(q());
        sb.append(':');
        sb.append("play:");
        sb.append(str.replace("spotify:", ""));
        return sb.toString();
    }

    public final String q() {
        int i = AnonymousClass1.a[this.b.ordinal()];
        switch (i) {
            case 14:
                return a(2, 2);
            case 15:
                String a2 = a(3, 2, 4);
                if (!TextUtils.isEmpty(a2)) {
                    return a2;
                }
                return a(2, 3);
            case 16:
                String a3 = a(3, 2, 4);
                if (!TextUtils.isEmpty(a3)) {
                    return a3;
                }
                return a(2, 3);
            default:
                switch (i) {
                    case 27:
                        String a4 = a(5, 4, 6);
                        if (!TextUtils.isEmpty(a4)) {
                            return a4;
                        }
                        return a(4, 5);
                    case 28:
                        String a5 = a(3, 2, 4);
                        if (!TextUtils.isEmpty(a5)) {
                            return a5;
                        }
                        return a(2, 3);
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

    private String a(int i, int i2, int i3) {
        String a2 = a(i);
        if (TextUtils.isEmpty(a2) || (!a2.equals("episode") && !a2.equals(TrackData.TYPE_TRACK))) {
            return null;
        }
        return a(i2, i3);
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

    private String b(int i) {
        String a2 = a(i);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("spotify:track:");
        sb.append(Uri.encode(a2));
        return sb.toString();
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

    public final String s() {
        if (Uri.EMPTY.equals(this.a)) {
            return null;
        }
        return this.a.getFragment();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.g});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jst)) {
            return false;
        }
        jst jst = (jst) obj;
        return faw.a(this.a, jst.a) && faw.a(this.g, jst.g);
    }

    public final String toString() {
        return this.a.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x014a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r10, int r11) {
        /*
            r9 = this;
            java.util.regex.Pattern r0 = defpackage.juc.f
            r1 = 0
            java.lang.String[] r10 = r0.split(r10, r1)
            r10 = r10[r1]
            java.lang.String r0 = "/"
            java.lang.String[] r10 = r10.split(r0)
            com.spotify.mobile.android.util.LinkType r11 = com.spotify.mobile.android.util.LinkType.a(r11)
            juc r11 = defpackage.jud.a(r11)
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
            jqw r6 = defpackage.jqw.c(r6)
            r2.c(r6)
            goto L_0x0109
        L_0x005d:
            char r7 = r6.charAt(r1)
            r8 = 123(0x7b, float:1.72E-43)
            if (r7 != r8) goto L_0x0074
            java.lang.String r7 = "as Base62}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x0074
            jqv r6 = defpackage.jqv.a
            r2.c(r6)
            goto L_0x0109
        L_0x0074:
            char r7 = r6.charAt(r1)
            if (r7 != r8) goto L_0x0089
            java.lang.String r7 = "as Hex64}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x0089
            jqy r6 = defpackage.jqy.a
            r2.c(r6)
            goto L_0x0109
        L_0x0089:
            char r7 = r6.charAt(r1)
            if (r7 != r8) goto L_0x009e
            java.lang.String r7 = "as text}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x009e
            jra r6 = defpackage.jra.a
            r2.c(r6)
            goto L_0x0109
        L_0x009e:
            char r7 = r6.charAt(r1)
            if (r7 != r8) goto L_0x00b2
            java.lang.String r7 = "as Username}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x00b2
            jrd r6 = defpackage.jrd.a
            r2.c(r6)
            goto L_0x0109
        L_0x00b2:
            char r7 = r6.charAt(r1)
            if (r7 != r8) goto L_0x00c6
            java.lang.String r7 = "as GidID}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x00c6
            jqx r6 = defpackage.jqx.a
            r2.c(r6)
            goto L_0x0109
        L_0x00c6:
            char r7 = r6.charAt(r1)
            if (r7 != r8) goto L_0x00da
            java.lang.String r7 = "as Query}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x00da
            jqz r6 = defpackage.jqz.a
            r2.c(r6)
            goto L_0x0109
        L_0x00da:
            char r7 = r6.charAt(r1)
            if (r7 != r8) goto L_0x00ee
            java.lang.String r7 = "as URL}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x00ee
            jrc r6 = defpackage.jrc.a
            r2.c(r6)
            goto L_0x0109
        L_0x00ee:
            char r7 = r6.charAt(r1)
            if (r7 != r8) goto L_0x0102
            java.lang.String r7 = "}"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x0102
            jrb r6 = defpackage.jrb.b
            r2.c(r6)
            goto L_0x0109
        L_0x0102:
            jqw r6 = defpackage.jqw.c(r6)
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
            jrb r3 = (defpackage.jrb) r3
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
            jrb r3 = (defpackage.jrb) r3
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jst.a(java.lang.String, int):boolean");
    }
}
