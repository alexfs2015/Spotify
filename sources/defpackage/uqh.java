package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.music.R;

/* renamed from: uqh reason: default package */
public final class uqh {
    private final Context a;

    /* renamed from: uqh$a */
    public interface a {
        void onCancel();
    }

    /* renamed from: uqh$b */
    public interface b {
        void onConfirm();
    }

    public uqh(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(DialogInterface dialogInterface, int i) {
    }

    public final void a() {
        Context context = this.a;
        fts.a(context, context.getString(R.string.social_listening_scan_code_failed)).a(this.a.getString(R.string.social_listening_scan_code_failed_ok_button), $$Lambda$uqh$fY3RFtFLyiti96mk4evcXnDnJc.INSTANCE).a().a();
    }

    public final void a(b bVar, a aVar) {
        Context context = this.a;
        fts.a(context, context.getString(R.string.social_listening_end_session_confirmation_dialog_title), this.a.getString(R.string.social_listening_end_session_confirmation_dialog_subtitle)).a(this.a.getString(R.string.social_listening_end_session_confirmation_dialog_confirm_button), new $$Lambda$uqh$5esKSMFWHk1wBwteRKGBFDovg(bVar)).b(this.a.getString(17039360), new $$Lambda$uqh$6ySTc92oXSbtxQcqX36is6Fx78(aVar)).a().a();
    }
}
