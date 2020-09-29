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

/* renamed from: rfu reason: default package */
public class rfu implements fqy {
    public a a;
    private final Context b;
    private final ViewGroup c;

    /* renamed from: rfu$a */
    public interface a {
        void onChipClicked(rfs rfs);
    }

    private rfu(ViewGroup viewGroup) {
        this.b = viewGroup.getContext();
        this.c = (ViewGroup) LayoutInflater.from(this.b).inflate(R.layout.your_library_music_row_chip_cloud, viewGroup, false);
        fqz.a(this);
    }

    public static rfu a(ViewGroup viewGroup) {
        return new rfu(viewGroup);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rfs rfs, View view) {
        this.a.onChipClicked(rfs);
    }

    public final void a(List<rfs> list) {
        this.c.removeAllViews();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.b, SpotifyIconV2.X, (float) vfj.b(12.0f, this.b.getResources()));
        spotifyIconDrawable.a(fr.b(this.b, (int) R.color.gray_70));
        for (rfs rfs : list) {
            Button button = (Button) LayoutInflater.from(this.b).inflate(R.layout.your_library_music_chip_button, this.c, false);
            button.setText(rfs.b());
            button.setCompoundDrawablesWithIntrinsicBounds(null, null, spotifyIconDrawable, null);
            button.setOnClickListener(new $$Lambda$rfu$ieNte3pdmTvacK7mhH0V5JgQBI(this, rfs));
            this.c.addView(button);
        }
    }

    public View getView() {
        return this.c;
    }
}
