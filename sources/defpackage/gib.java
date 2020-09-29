package defpackage;

import com.google.common.base.Optional;

/* renamed from: gib reason: default package */
public final class gib implements wly {
    private final wlc<String> a;
    private final wlc<String> b;
    private final wlc<String> c;
    private final wlc<String> d;

    /* access modifiers changed from: private */
    public static /* synthetic */ String a() {
        return "Android";
    }

    public gib(wlc<String> wlc, wlc<String> wlc2, wlc<Optional<String>> wlc3, wlc<Optional<String>> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = new $$Lambda$gib$qHLiUCkwmQz_2JN_WIcO1pnGUfs(wlc3);
        this.d = new $$Lambda$gib$OAr4KlTsgs0vH8VlCiNL_z50DEk(wlc4);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(wlc wlc) {
        return (String) ((Optional) wlc.get()).d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(wlc wlc) {
        return (String) ((Optional) wlc.get()).d();
    }

    public final wmf a(a aVar) {
        a a2 = aVar.a().a();
        a(aVar, a2, "Accept-Language", this.b);
        a(aVar, a2, "User-Agent", this.a);
        a(aVar, a2, "Spotify-App-Version", this.c);
        a(aVar, a2, "X-Client-Id", this.d);
        a(aVar, a2, "App-Platform", $$Lambda$gib$BW0UJ1UWX8OY1wKjV4d9I8HkXZA.INSTANCE);
        return aVar.a(a2.a());
    }

    private static void a(a aVar, a aVar2, String str, wlc<String> wlc) {
        if (aVar.a().a(str) == null) {
            String str2 = (String) wlc.get();
            if (str2 != null) {
                aVar2.b(str, str2);
            }
        }
    }
}
