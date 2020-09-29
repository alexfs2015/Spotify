package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.spotify.music.R;

/* renamed from: gpe reason: default package */
public final class gpe {
    static Intent a() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.APP_EMAIL");
        return intent;
    }

    public static Intent a(Context context) {
        try {
            return Intent.createChooser(a(), context.getString(R.string.magiclink_request_sent_choose_email));
        } catch (ActivityNotFoundException unused) {
            return null;
        }
    }
}
