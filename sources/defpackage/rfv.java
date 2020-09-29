package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import com.spotify.music.R;

/* renamed from: rfv reason: default package */
public final class rfv {
    private final Context a;
    private final hbj b;
    private final rfk c;

    public rfv(Context context, hbj hbj, rfk rfk) {
        this.a = context;
        this.b = hbj;
        this.c = rfk;
    }

    public final void a(String str) {
        $$Lambda$rfv$dmpG08uTLPij8kqUTP67zmiPodM r0 = new $$Lambda$rfv$dmpG08uTLPij8kqUTP67zmiPodM(this, str);
        new a(this.a, 2132017711).a(LayoutInflater.from(this.a).inflate(R.layout.free_tier_precuration_alert_dialog, null)).a(R.string.free_tier_precuration_education_dialog_positive_button_text, r0).b(R.string.free_tier_precuration_education_dialog_negative_button_text, new $$Lambda$rfv$ZGpQ5sIotEkCs_cfwDscq_46Wc(this, str)).a().show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, DialogInterface dialogInterface, int i) {
        this.c.a("lets-go", null, str, str, -1, "pre-curation-dialog");
        this.b.d(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, DialogInterface dialogInterface, int i) {
        this.c.a("not-now", null, str, str, -1, "pre-curation-dialog");
    }
}
