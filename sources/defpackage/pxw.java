package defpackage;

import io.reactivex.Single;

/* renamed from: pxw reason: default package */
public interface pxw {

    /* renamed from: pxw$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static String a(boolean z) {
            return z ? "quicksilverdev" : "quicksilver";
        }
    }

    @xhn(a = "{base}/{version}/{format}")
    Single<xgo<xam>> a(@xhq(a = "X-Spotify-Quicksilver-Uri") String str, @xia(a = "base") String str2, @xia(a = "version") String str3, @xia(a = "format") String str4, @xib(a = "locale") String str5, @xib(a = "trig_type") String str6, @xib(a = "purchase_allowed") boolean z, @xib(a = "trigger") String... strArr);
}
