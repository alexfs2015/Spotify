package defpackage;

import android.os.Bundle;

/* renamed from: gqn reason: default package */
public final class gqn {
    public final Bundle a;

    public gqn() {
        this.a = new Bundle();
    }

    public gqn(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.a = bundle;
    }

    public final gqn a(int i) {
        this.a.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", i);
        return this;
    }

    public final gqn a(Boolean bool) {
        this.a.putLong("android.media.IS_EXPLICIT", bool.booleanValue() ? 1 : 0);
        return this;
    }

    public final gqn a(String str) {
        String str2 = "android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT";
        if (str == null) {
            this.a.remove(str2);
        } else {
            this.a.putString(str2, str);
        }
        return this;
    }

    public final gqn b(int i) {
        this.a.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", i);
        return this;
    }
}
