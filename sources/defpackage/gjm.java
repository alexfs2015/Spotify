package defpackage;

import com.google.common.base.Optional;

/* renamed from: gjm reason: default package */
public final class gjm implements xae {
    private final wzi<String> a;
    private final wzi<String> b;
    private final wzi<String> c;
    private final wzi<String> d;

    public gjm(wzi<String> wzi, wzi<String> wzi2, wzi<Optional<String>> wzi3, wzi<Optional<String>> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = new $$Lambda$gjm$FjOhU8rAELGjFoNxnSaGgNTdYw(wzi3);
        this.d = new $$Lambda$gjm$lmnmejejMsqu5CCYmEpJ_hFdBjI(wzi4);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a() {
        return "Android";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(wzi wzi) {
        return (String) ((Optional) wzi.get()).d();
    }

    private static void a(a aVar, a aVar2, String str, wzi<String> wzi) {
        if (aVar.a().a(str) == null) {
            String str2 = (String) wzi.get();
            if (str2 != null) {
                aVar2.b(str, str2);
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(wzi wzi) {
        return (String) ((Optional) wzi.get()).d();
    }

    public final xal a(a aVar) {
        a a2 = aVar.a().a();
        a(aVar, a2, "Accept-Language", this.b);
        a(aVar, a2, "User-Agent", this.a);
        a(aVar, a2, "Spotify-App-Version", this.c);
        a(aVar, a2, "X-Client-Id", this.d);
        a(aVar, a2, "App-Platform", $$Lambda$gjm$W07R7pIjh8cWFGOSIVZURj9eKiI.INSTANCE);
        return aVar.a(a2.a());
    }
}
