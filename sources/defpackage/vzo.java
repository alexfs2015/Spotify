package defpackage;

import android.os.Parcelable;

/* renamed from: vzo reason: default package */
public abstract class vzo implements Parcelable {
    public static final vzo d = new a().a(false).a((vzp) new defpackage.vzp.a()).b(false).a();

    /* renamed from: vzo$a */
    public interface a {
        a a(vzp vzp);

        a a(boolean z);

        vzo a();

        a b(boolean z);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(defpackage.vzp.a aVar) {
        return "";
    }

    public final vzo a(vzp vzp) {
        return d().a(vzp).a();
    }

    public final vzo a(boolean z) {
        return d().a(z).a();
    }

    public abstract vzp a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract a d();

    public final String f() {
        return (String) a().a((gee<defpackage.vzp.a, R_>) $$Lambda$vzo$TDCoHlBccs0hwso1cf_csF4OD74.INSTANCE, (gee<b, R_>) $$Lambda$D3U2gPNGg1p00Tu1d4bNJZCWubk.INSTANCE);
    }
}
