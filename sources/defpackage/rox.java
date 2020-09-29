package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import com.spotify.music.R;

/* renamed from: rox reason: default package */
public final class rox {
    private final Context a;
    private final hec b;
    private final rom c;

    public rox(Context context, hec hec, rom rom) {
        this.a = context;
        this.b = hec;
        this.c = rom;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, DialogInterface dialogInterface, int i) {
        this.c.a("not-now", null, str, str, -1, "pre-curation-dialog");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, DialogInterface dialogInterface, int i) {
        this.c.a("lets-go", null, str, str, -1, "pre-curation-dialog");
        this.b.d(str);
    }

    public final void a(String str) {
        $$Lambda$rox$bDu9vnM7XSmRPIYLgMEjYixur4 r0 = new $$Lambda$rox$bDu9vnM7XSmRPIYLgMEjYixur4(this, str);
        new a(this.a, 2132017714).a(LayoutInflater.from(this.a).inflate(R.layout.free_tier_precuration_alert_dialog, null)).a(R.string.free_tier_precuration_education_dialog_positive_button_text, r0).b(R.string.free_tier_precuration_education_dialog_negative_button_text, new $$Lambda$rox$hBU2bL7LgaBQ57JOCeF8qX8bY0I(this, str)).a().show();
    }
}
