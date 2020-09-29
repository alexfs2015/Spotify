package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.spotify.music.R;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$jcq$6Q4Bigtahl9KOt6PW1E7by4mUCI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jcq$6Q4Bigtahl9KOt6PW1E7by4mUCI implements Action {
    private final /* synthetic */ Activity f$0;
    private final /* synthetic */ jcc f$1;
    private final /* synthetic */ ClipboardManager f$2;

    public /* synthetic */ $$Lambda$jcq$6Q4Bigtahl9KOt6PW1E7by4mUCI(Activity activity, jcc jcc, ClipboardManager clipboardManager) {
        this.f$0 = activity;
        this.f$1 = jcc;
        this.f$2 = clipboardManager;
    }

    public final void run() {
        this.f$2.setPrimaryClip(ClipData.newPlainText(this.f$0.getString(R.string.share_contextmenu_copy_link_label), this.f$1.c()));
    }
}
