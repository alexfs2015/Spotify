package defpackage;

import io.reactivex.Single;

/* renamed from: pqb reason: default package */
public interface pqb {

    /* renamed from: pqb$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static String a(boolean z) {
            return z ? "quicksilverdev" : "quicksilver";
        }
    }

    @wti(a = "{base}/v2/preview")
    Single<wsj<wmg>> a(@wtl(a = "X-Spotify-Quicksilver-Uri") String str, @wtv(a = "base") String str2, @wtw(a = "device_id") String str3, @wtw(a = "locale") String str4, @wtw(a = "trig_type") String str5, @wtw(a = "trigger") String str6, @wtw(a = "creative_id") String str7);
}
