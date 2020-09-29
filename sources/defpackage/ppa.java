package defpackage;

import io.reactivex.Single;

/* renamed from: ppa reason: default package */
public interface ppa {

    /* renamed from: ppa$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static String a(boolean z) {
            return z ? "quicksilverdev" : "quicksilver";
        }
    }

    @wti(a = "{base}/{version}/{format}")
    Single<wsj<wmg>> a(@wtl(a = "X-Spotify-Quicksilver-Uri") String str, @wtv(a = "base") String str2, @wtv(a = "version") String str3, @wtv(a = "format") String str4, @wtw(a = "locale") String str5, @wtw(a = "trig_type") String str6, @wtw(a = "purchase_allowed") boolean z, @wtw(a = "trigger") String... strArr);
}
