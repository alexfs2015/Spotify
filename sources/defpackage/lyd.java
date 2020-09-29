package defpackage;

/* renamed from: lyd reason: default package */
final class lyd {
    final String a;
    final String b;
    final boolean c;
    final boolean d;
    final String e;
    final String f;
    final String g;

    /* renamed from: lyd$a */
    static class a {
        final String a;
        final String b;
        final String c;
        final boolean d;
        final boolean e;
        final boolean f;
        final boolean g;
        String h;
        int i;

        a(fpt fpt, String str, jrp jrp, String str2, boolean z, boolean z2) {
            this.a = str;
            this.b = jrp.e().getID();
            this.c = str2;
            this.d = iqh.a(fpt);
            this.e = iqh.c(fpt);
            this.f = z;
            this.g = z2;
        }
    }

    /* synthetic */ lyd(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, byte b2) {
        this(str, str2, z, z2, str3, str4, str5);
    }

    private lyd(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowseRequest{mPage='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", mTimezone='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", mIsPodcastsEnabled=");
        sb.append(this.c);
        sb.append(", mIsVideosEnabled=");
        sb.append(this.d);
        sb.append(", mLocale='");
        sb.append(this.e);
        sb.append('\'');
        sb.append(", mSignal='");
        sb.append(this.f);
        sb.append('\'');
        sb.append(", mOffset='");
        sb.append(this.g);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
