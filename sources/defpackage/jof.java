package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.music.R;

/* renamed from: jof reason: default package */
public final class jof {
    private final Context a;
    private fsp b;

    /* renamed from: jof$a */
    public interface a {
        void a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, DialogInterface dialogInterface) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, DialogInterface dialogInterface, int i) {
    }

    public jof(Context context) {
        this.a = context;
    }

    public final void a(a aVar) {
        Context context = this.a;
        fsr b2 = fsy.a(context, context.getString(R.string.settings_sync_quality_dialog_resync_downloads_title), this.a.getString(R.string.settings_sync_quality_dialog_resync_downloads_text)).a(this.a.getString(R.string.two_button_dialog_button_resync_downloads), new $$Lambda$jof$6bCb10TYvt0xkG3Tu9ueYATrh8A(aVar)).b(this.a.getString(R.string.two_button_dialog_button_cancel), new $$Lambda$jof$ZjiLneRQ9QiF8ZhJgrjmw_3n3TM(aVar));
        b2.e = true;
        b2.f = new $$Lambda$jof$sByPx_c8x019S7ewfIg1aq0XZ9U(aVar);
        this.b = b2.a();
        this.b.a();
    }
}
