package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: bxu reason: default package */
public final class bxu {
    private final Resources a;
    private final String b = this.a.getResourcePackageName(R.string.common_google_play_services_unknown_issue);

    public bxu(Context context) {
        bxo.a(context);
        this.a = context.getResources();
    }

    public final String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
