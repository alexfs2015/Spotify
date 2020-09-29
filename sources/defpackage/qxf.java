package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.List;

/* renamed from: qxf reason: default package */
public class qxf implements fqe {
    public a a;
    private final Context b;
    private final ViewGroup c;

    /* renamed from: qxf$a */
    public interface a {
        void onChipClicked(qxd qxd);
    }

    public static qxf a(ViewGroup viewGroup) {
        return new qxf(viewGroup);
    }

    public View getView() {
        return this.c;
    }

    private qxf(ViewGroup viewGroup) {
        this.b = viewGroup.getContext();
        this.c = (ViewGroup) LayoutInflater.from(this.b).inflate(R.layout.your_library_music_row_chip_cloud, viewGroup, false);
        fqf.a(this);
    }

    public final void a(List<qxd> list) {
        this.c.removeAllViews();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.b, SpotifyIconV2.X, (float) uts.b(12.0f, this.b.getResources()));
        spotifyIconDrawable.a(fr.b(this.b, (int) R.color.gray_70));
        for (qxd qxd : list) {
            Button button = (Button) LayoutInflater.from(this.b).inflate(R.layout.your_library_music_chip_button, this.c, false);
            button.setText(qxd.b());
            button.setCompoundDrawablesWithIntrinsicBounds(null, null, spotifyIconDrawable, null);
            button.setOnClickListener(new $$Lambda$qxf$V3_GCBg7ae2Jx7CTuTdwT2XgcuQ(this, qxd));
            this.c.addView(button);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(qxd qxd, View view) {
        this.a.onChipClicked(qxd);
    }
}
