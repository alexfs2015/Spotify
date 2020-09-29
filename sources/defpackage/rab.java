package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: rab reason: default package */
public final class rab extends fwh {
    private final TextView a = ((TextView) fay.a(getView().findViewById(R.id.title)));

    public rab(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.music_pages_drilldown_header, viewGroup, false));
    }

    public final void a(String str) {
        this.a.setText(str);
    }
}
