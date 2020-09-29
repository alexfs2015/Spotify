package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: ukn reason: default package */
public final class ukn implements ukm {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.podcast_tag));

    public ukn(ViewGroup viewGroup) {
        this.a = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.podcast_tag_view, viewGroup, false);
    }

    public final void a(String str) {
        this.b.setText(str);
    }

    public final View getView() {
        return this.a;
    }
}
