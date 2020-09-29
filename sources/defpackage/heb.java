package defpackage;

import android.content.Context;
import com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity;

/* renamed from: heb reason: default package */
public final class heb implements nxo {
    private final Context a;

    public heb(Context context) {
        this.a = (Context) fbp.a(context);
    }

    public final void a(fqn fqn) {
        Context context = this.a;
        context.startActivity(LocalFilesImportActivity.a(context, fqn));
    }
}
