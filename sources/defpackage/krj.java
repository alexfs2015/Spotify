package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: krj reason: default package */
public final class krj {
    final List<vom> a = Collections.emptyList();
    private final String b;

    /* renamed from: krj$a */
    public final class a {
        final List<vom> a;

        /* synthetic */ a(krj krj, byte b2) {
            this();
        }

        private a() {
            List<vom> list = krj.this.a;
            defpackage.vom.a a2 = vom.a();
            a2.a = "dismiss_dialog_button";
            this.a = krj.a(list, a2.a());
        }
    }

    /* renamed from: krj$b */
    public final class b {
        final List<vom> a;

        /* synthetic */ b(krj krj, byte b2) {
            this();
        }

        private b() {
            List<vom> list = krj.this.a;
            defpackage.vom.a a2 = vom.a();
            a2.a = "go_to_settings_button";
            this.a = krj.a(list, a2.a());
        }
    }

    public krj(String str) {
        this.b = str;
    }

    /* access modifiers changed from: 0000 */
    public defpackage.voo.a a() {
        defpackage.voo.a a2 = voo.a();
        a2.a = "background-restrictions-checker-dialog";
        a2.b = "0288167de312af28e3497991f3d122feed62e758";
        a2.c = "bc4528075e94b663e92966edf45134a288aa98e9";
        a2.g = "music";
        a2.d = this.b;
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public defpackage.von.a b() {
        defpackage.von.a a2 = von.a();
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

    static /* synthetic */ List a(List list, Object obj) {
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }
}
