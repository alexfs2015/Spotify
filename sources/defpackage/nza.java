package defpackage;

import android.content.res.Resources;

/* renamed from: nza reason: default package */
public abstract class nza {
    /* access modifiers changed from: private */
    public static /* synthetic */ String a(String str, Resources resources) {
        return str;
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

    /* access modifiers changed from: 0000 */
    public abstract kko<Resources, String> b();

    /* access modifiers changed from: 0000 */
    public abstract kko<Resources, String> c();

    public final String a(Resources resources) {
        return (String) b().apply(resources);
    }

    public final String b(Resources resources) {
        return (String) c().apply(resources);
    }

    public static nza a(String str, String str2, String str3) {
        return new nys(str, new $$Lambda$nza$Ay8u8kmwXFPx1AkVNFDCWn5PpBk(str2), new $$Lambda$nza$vbGz6dbB8fi_gGN9jHTtaqEle0(str3));
    }

    public static nza a(String str, int i) {
        return new nys(str, new $$Lambda$nza$SwUspK1VxfHnzHmuFFCsT2QWog(i), $$Lambda$nza$u8jE1QQiyO3eAXDKw_vvhN1n1H0.INSTANCE);
    }

    public static nza a(String str, int i, int i2) {
        return new nys(str, new $$Lambda$nza$d4VAx47ryvAskb92_wcEtRbmETo(i), new $$Lambda$nza$il3cgBQWs_ZtQKPSat6pHf0kx0I(i2));
    }
}
