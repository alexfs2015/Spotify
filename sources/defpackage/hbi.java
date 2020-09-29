package defpackage;

import android.content.Context;
import com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity;

/* renamed from: hbi reason: default package */
public final class hbi implements nrl {
    private final Context a;

    public hbi(Context context) {
        this.a = (Context) fay.a(context);
    }

    public final void a(fpt fpt) {
        Context context = this.a;
        context.startActivity(LocalFilesImportActivity.a(context, fpt));
    }
}
