package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: rix reason: default package */
public final class rix extends fxb {
    private final TextView a = ((TextView) fbp.a(getView().findViewById(R.id.title)));

    public rix(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.music_pages_drilldown_header, viewGroup, false));
    }

    public final void a(String str) {
        this.a.setText(str);
    }
}
