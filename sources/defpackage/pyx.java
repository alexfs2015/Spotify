package defpackage;

import io.reactivex.Single;

/* renamed from: pyx reason: default package */
public interface pyx {

    /* renamed from: pyx$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static String a(boolean z) {
            return z ? "quicksilverdev" : "quicksilver";
        }
    }

    @xhn(a = "{base}/v2/preview")
    Single<xgo<xam>> a(@xhq(a = "X-Spotify-Quicksilver-Uri") String str, @xia(a = "base") String str2, @xib(a = "device_id") String str3, @xib(a = "locale") String str4, @xib(a = "trig_type") String str5, @xib(a = "trigger") String str6, @xib(a = "creative_id") String str7);
}
