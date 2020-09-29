package defpackage;

import android.os.Bundle;

/* renamed from: gox reason: default package */
public final class gox {
    public final Bundle a;

    public gox(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.a = bundle;
    }

    public gox() {
        this.a = new Bundle();
    }

    public final gox a(String str) {
        String str2 = "android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT";
        if (str == null) {
            this.a.remove(str2);
        } else {
            this.a.putString(str2, str);
        }
        return this;
    }

    public final gox a(Boolean bool) {
        this.a.putLong("android.media.IS_EXPLICIT", bool.booleanValue() ? 1 : 0);
        return this;
    }

    public final gox a(int i) {
        this.a.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", i);
        return this;
    }

    public final gox b(int i) {
        this.a.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", i);
        return this;
    }
}
