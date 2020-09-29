package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: kus reason: default package */
public final class kus {
    final List<wbu> a = Collections.emptyList();
    private final String b;

    /* renamed from: kus$a */
    public final class a {
        final List<wbu> a;

        private a() {
            List<wbu> list = kus.this.a;
            defpackage.wbu.a a2 = wbu.a();
            a2.a = "dismiss_dialog_button";
            this.a = kus.a(list, a2.a());
        }

        /* synthetic */ a(kus kus, byte b2) {
            this();
        }
    }

    /* renamed from: kus$b */
    public final class b {
        final List<wbu> a;

        private b() {
            List<wbu> list = kus.this.a;
            defpackage.wbu.a a2 = wbu.a();
            a2.a = "go_to_settings_button";
            this.a = kus.a(list, a2.a());
        }

        /* synthetic */ b(kus kus, byte b2) {
            this();
        }
    }

    public kus(String str) {
        this.b = str;
    }

    static /* synthetic */ List a(List list, Object obj) {
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: 0000 */
    public defpackage.wbw.a a() {
        defpackage.wbw.a a2 = wbw.a();
        a2.a = "background-restrictions-checker-dialog";
        a2.b = "0288167de312af28e3497991f3d122feed62e758";
        a2.c = "bc4528075e94b663e92966edf45134a288aa98e9";
        a2.g = "music";
        a2.d = this.b;
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public defpackage.wbv.a b() {
        defpackage.wbv.a a2 = wbv.a();
        a2.a = "background-restrictions-checker-dialog";
        a2.b = "0288167de312af28e3497991f3d122feed62e758";
        a2.c = "bc4528075e94b663e92966edf45134a288aa98e9";
        a2.e = "music";
        a2.d = this.b;
        return a2;
    }

    public final b c() {
        return new b(this, 0);
    }

    public final a d() {
        return new a(this, 0);
    }
}
