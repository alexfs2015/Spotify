package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import com.spotify.music.R;

/* renamed from: rgu reason: default package */
public final class rgu {
    public final LinearLayout a;

    public rgu(Context context) {
        this.a = new LinearLayout(context);
        this.a.setOrientation(1);
        this.a.setId(R.id.music_pages_filtered_empty_container);
        fvk a2 = fvm.a(context, this.a);
        a2.b((int) R.string.your_library_music_pages_filtered_empty_subtitle);
        a2.a((int) R.string.your_library_music_pages_filtered_empty_title);
        a2.getView().setBackgroundColor(0);
        this.a.addView(a2.getView());
        this.a.setVisibility(8);
    }
}
