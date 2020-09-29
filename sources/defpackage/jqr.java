package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.music.R;

/* renamed from: jqr reason: default package */
public final class jqr {
    private final Context a;
    private ftj b;

    /* renamed from: jqr$a */
    public interface a {
        void a();
    }

    public jqr(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, DialogInterface dialogInterface) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, DialogInterface dialogInterface, int i) {
    }

    public final void a(a aVar) {
        Context context = this.a;
        ftl b2 = fts.a(context, context.getString(R.string.settings_sync_quality_dialog_resync_downloads_title), this.a.getString(R.string.settings_sync_quality_dialog_resync_downloads_text)).a(this.a.getString(R.string.two_button_dialog_button_resync_downloads), new $$Lambda$jqr$nQ66UR53MAqYa1kNNslLwABiDf4(aVar)).b(this.a.getString(R.string.two_button_dialog_button_cancel), new $$Lambda$jqr$oFuWZOpICRxoJsiNYJAyUGRg8d4(aVar));
        b2.e = true;
        b2.f = new $$Lambda$jqr$QY3pIVLxoUWAiuV_oVCp3bp1co(aVar);
        this.b = b2.a();
        this.b.a();
    }
}
