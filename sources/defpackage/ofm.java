package defpackage;

import android.content.res.Resources;

/* renamed from: ofm reason: default package */
public abstract class ofm {
    /* access modifiers changed from: private */
    public static /* synthetic */ String a(String str, Resources resources) {
        return str;
    }

    public static ofm a(String str, int i) {
        return new ofe(str, new $$Lambda$ofm$bbO3dRmmRRkxNXi6pSsktjxIv0I(i), $$Lambda$ofm$7cluUDJiwlyCNtntMacAGBJvir8.INSTANCE);
    }

    public static ofm a(String str, int i, int i2) {
        return new ofe(str, new $$Lambda$ofm$UOq8naaq6reOOnBNKnNGRZY6A0(i), new $$Lambda$ofm$89qaqnEAuzAJellN5Jw_1du4pk(i2));
    }

    public static ofm a(String str, String str2, String str3) {
        return new ofe(str, new $$Lambda$ofm$dTdm61N7PwsFrbE98YE3yj2vx08(str2), new $$Lambda$ofm$JeblrdfBRWkrjsbxtQZedLKJSIE(str3));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(String str, Resources resources) {
        return str;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String c(Resources resources) {
        return "";
    }

    public abstract String a();

    public final String a(Resources resources) {
        return (String) b().apply(resources);
    }

    public final String b(Resources resources) {
        return (String) c().apply(resources);
    }

    /* access modifiers changed from: 0000 */
    public abstract knx<Resources, String> b();

    /* access modifiers changed from: 0000 */
    public abstract knx<Resources, String> c();
}
