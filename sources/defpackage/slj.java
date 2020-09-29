package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.lyrics.model.LyricsLineData;
import com.spotify.music.lyrics.model.Word;
import com.spotify.music.lyrics.views.LyricsAppearance;
import java.util.List;

/* renamed from: slj reason: default package */
public final class slj extends jlt<LyricsLineData> {
    private int b = -1;
    private int c = -16777216;
    private final LyricsAppearance d;

    public final boolean isEnabled(int i) {
        return false;
    }

    public slj(Activity activity, List<LyricsLineData> list, LyricsAppearance lyricsAppearance) {
        super(activity, list);
        this.d = lyricsAppearance;
    }

    public final void a(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final View a(ViewGroup viewGroup) {
        return new slm(viewGroup.getContext(), this.b, this.c, this.d);
    }

    public final void a(View view, int i) {
        ((slm) view).a.setText(((Word) ((LyricsLineData) getItem(i)).words().get(0)).getString());
    }

    public final int a(int i) {
        List list = this.a;
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            if (i < ((LyricsLineData) list.get(0)).requireTime()) {
                return -1;
            }
            while (i2 < size) {
                int i3 = (i2 + size) / 2;
                int i4 = i3 + 1;
                if (Math.abs(((LyricsLineData) list.get(i4)).requireTime() - i) <= Math.abs(((LyricsLineData) list.get(i3)).requireTime() - i)) {
                    i2 = i4;
                } else {
                    size = i3;
                }
            }
            return size;
        }
        throw new IllegalArgumentException("The list cannot be empty");
    }

    public final int b(int i, int i2) {
        int requireTime;
        if (i < 0) {
            requireTime = ((LyricsLineData) getItem(0)).requireTime();
        } else {
            requireTime = ((LyricsLineData) getItem(i)).requireTime();
        }
        return requireTime - i2;
    }
}
