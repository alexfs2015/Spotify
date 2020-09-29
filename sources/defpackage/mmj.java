package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: mmj reason: default package */
public final class mmj implements mmi {
    public final void a(String str, int i, String str2, mmm mmm) {
        if (str.equalsIgnoreCase("tag_device_fragment")) {
            if (i == 2) {
                mmm.a(1.0f);
            } else {
                mmm.a(0.0f);
            }
            mmm.b();
            mmm.a(SpotifyIconV2.X);
        } else if (str.equalsIgnoreCase("tag_education_steps_fragment")) {
            mmm.a();
            mmm.a(1.0f);
            mmm.a(SpotifyIconV2.ARROW_LEFT);
        } else if (str.equalsIgnoreCase("tag_participant_list_fragment")) {
            mmm.a();
            mmm.a(1.0f);
            mmm.a(SpotifyIconV2.ARROW_LEFT);
        }
        mmm.a(str2);
    }

    public final void a(mmm mmm, String str) {
        mmm.a((int) R.color.bg_picker);
        mmm.c();
        mmm.a(0.0f);
        mmm.a(str);
    }
}
