package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: mhv reason: default package */
public final class mhv implements mhu {
    public final void a(mhy mhy, String str) {
        mhy.a((int) R.color.bg_picker);
        mhy.c();
        mhy.a(0.0f);
        mhy.a(str);
    }

    public final void a(String str, int i, String str2, mhy mhy) {
        if (str.equalsIgnoreCase("tag_device_fragment")) {
            if (i == 2) {
                mhy.a(1.0f);
            } else {
                mhy.a(0.0f);
            }
            mhy.b();
            mhy.a(SpotifyIconV2.X);
        } else if (str.equalsIgnoreCase("tag_education_steps_fragment")) {
            mhy.a();
            mhy.a(1.0f);
            mhy.a(SpotifyIconV2.ARROW_LEFT);
        } else if (str.equalsIgnoreCase("tag_participant_list_fragment")) {
            mhy.a();
            mhy.a(1.0f);
            mhy.a(SpotifyIconV2.ARROW_LEFT);
        }
        mhy.a(str2);
    }
}
