package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.music.R;

/* renamed from: udm reason: default package */
public final class udm {
    private final Context a;

    /* renamed from: udm$a */
    public interface a {
        void onCancel();
    }

    /* renamed from: udm$b */
    public interface b {
        void onConfirm();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(DialogInterface dialogInterface, int i) {
    }

    public udm(Context context) {
        this.a = context;
    }

    public final void a(b bVar, a aVar) {
        Context context = this.a;
        fsy.a(context, context.getString(R.string.social_listening_end_session_confirmation_dialog_title), this.a.getString(R.string.social_listening_end_session_confirmation_dialog_subtitle)).a(this.a.getString(R.string.social_listening_end_session_confirmation_dialog_confirm_button), new $$Lambda$udm$pihEx5gPUWOC4zIPQ97Rbp2PXVY(bVar)).b(this.a.getString(17039360), new $$Lambda$udm$qJ3Kr0LDjH7aorXAjjc2fFHVsk(aVar)).a().a();
    }

    public final void a() {
        Context context = this.a;
        fsy.a(context, context.getString(R.string.social_listening_scan_code_failed)).a(this.a.getString(R.string.social_listening_scan_code_failed_ok_button), $$Lambda$udm$e8LWk9mSCbXvMol8s7KqlqTt0EE.INSTANCE).a().a();
    }
}
