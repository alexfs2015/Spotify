package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.spotify.music.R;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$jae$tl6y5nvhORxIiL_aGDvPDEob6ro reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jae$tl6y5nvhORxIiL_aGDvPDEob6ro implements Action {
    private final /* synthetic */ Activity f$0;
    private final /* synthetic */ izq f$1;
    private final /* synthetic */ ClipboardManager f$2;

    public /* synthetic */ $$Lambda$jae$tl6y5nvhORxIiL_aGDvPDEob6ro(Activity activity, izq izq, ClipboardManager clipboardManager) {
        this.f$0 = activity;
        this.f$1 = izq;
        this.f$2 = clipboardManager;
    }

    public final void run() {
        this.f$2.setPrimaryClip(ClipData.newPlainText(this.f$0.getString(R.string.share_contextmenu_copy_link_label), this.f$1.c));
    }
}
