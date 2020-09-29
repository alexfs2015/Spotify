package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.shortcut.ShortcutInstallerService;
import java.util.List;

/* renamed from: rfn reason: default package */
public final class rfn {
    final rfp a;
    private final uhs b;
    private final fyz c;
    private final txm d;
    private final Context e;
    private final sih f;

    public rfn(sih sih, Context context, txm txm, fyz fyz, rfp rfp, uhs uhs) {
        this.f = sih;
        this.e = context;
        this.d = txm;
        this.c = (fyz) fay.a(fyz);
        this.a = (rfp) fay.a(rfp);
        this.b = uhs;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, boolean z) {
        this.a.a(str, !z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        this.a.a(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.d.a(this.e, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, String str4) {
        this.a.a(str, str2, str3, str4);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3) {
        ShortcutInstallerService.a(this.e, str, str2, str3, this.f);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        this.a.a(str, (List<String>) Lists.a((E[]) new String[]{str2}));
    }

    public final void a(final String str, fyt fyt, rfo rfo, rfs rfs) {
        String str2;
        String str3 = rfo.f;
        if (str3 != null) {
            str2 = str3;
        } else {
            str2 = rfs.b().name();
        }
        String str4 = rfo.g;
        String str5 = str4 != null ? str4 : str;
        String str6 = (String) jtc.a(rfo.d, rfs.a());
        String str7 = "";
        String str8 = (String) jtc.a(rfo.e, str7);
        final String str9 = (String) jtc.a(rfo.h, str7);
        fyt.a(uhs.a(str2, str5, true), rfs.b(), false, true);
        fyt.b(str6);
        fyt.c(str8);
        boolean z = rfo.a;
        $$Lambda$rfn$XSyonRuqJLtmcyDgb47el3_SahA r5 = new $$Lambda$rfn$XSyonRuqJLtmcyDgb47el3_SahA(this, str, z);
        if (rfs.j()) {
            this.c.c(fyt, z, r5);
            this.c.d(fyt, z, r5);
        } else {
            this.c.a(fyt, z, (fyq) r5);
            this.c.b(fyt, z, r5);
        }
        if (rfs.d()) {
            final boolean z2 = rfo.b;
            this.c.a(fyt, z2, rfs.h(), (fyq) new fyq() {
                public final void onClick() {
                    rfn.this.a.b(str, !z2);
                }
            });
        }
        if (rfs.e()) {
            this.c.b(fyt, new fyq() {
                public final void onClick() {
                    rfn.this.a.b(str9);
                }
            });
        }
        if (rfs.i()) {
            this.c.a(fyt, str, (fyq) new $$Lambda$rfn$xlqWbBd8UYpAksTWussUpLIUs0(this, str));
        }
        if (rfs.f()) {
            this.c.c(fyt, new fyq() {
                public final void onClick() {
                    rfn.this.a.c(str);
                }
            });
        }
        if (rfs.k()) {
            final boolean z3 = rfo.c;
            this.c.e(fyt, z3, new fyq() {
                public final void onClick() {
                    rfn.this.a.a(!z3);
                }
            });
        }
        if (rfs.g()) {
            this.c.d(fyt, new $$Lambda$rfn$kqALVDrAPYlMMC7Y3VYn1O9NlqE(this, str));
        }
        fyz fyz = this.c;
        $$Lambda$rfn$1e66Jxg11S9ax4x4qWGdo5zbuNo r2 = new $$Lambda$rfn$1e66Jxg11S9ax4x4qWGdo5zbuNo(this, str5, str2, str6, str8);
        fyz.a(fyt, r2);
        if (rfs.m()) {
            this.c.e(fyt, new $$Lambda$rfn$p1AqSWPw1dyhvKAFNuOyEPcMhSo(this, str, str6, str2));
        }
        if (rfs.l() && !TextUtils.isEmpty(str3)) {
            this.c.f(fyt, new $$Lambda$rfn$m3hxMu82POU1XO9WcJ401nvkRaw(this, str, str3));
        }
    }
}
