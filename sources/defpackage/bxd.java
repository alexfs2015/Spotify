package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: bxd reason: default package */
public final class bxd {
    private final Resources a;
    private final String b = this.a.getResourcePackageName(R.string.common_google_play_services_unknown_issue);

    public bxd(Context context) {
        bwx.a(context);
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
