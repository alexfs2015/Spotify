package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.lyrics.model.LyricsLineData;
import com.spotify.music.lyrics.model.Word;
import com.spotify.music.lyrics.views.LyricsAppearance;
import java.util.List;

/* renamed from: svq reason: default package */
public final class svq extends jof<LyricsLineData> {
    private int b = -1;
    private int c = -16777216;
    private final LyricsAppearance d;

    public svq(Activity activity, List<LyricsLineData> list, LyricsAppearance lyricsAppearance) {
        super(activity, list);
        this.d = lyricsAppearance;
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

    public final View a(ViewGroup viewGroup) {
        return new svt(viewGroup.getContext(), this.b, this.c, this.d);
    }

    public final void a(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final void a(View view, int i) {
        ((svt) view).a.setText(((Word) ((LyricsLineData) getItem(i)).words().get(0)).getString());
    }

    public final int b(int i, int i2) {
        return (i < 0 ? ((LyricsLineData) getItem(0)).requireTime() : ((LyricsLineData) getItem(i)).requireTime()) - i2;
    }

    public final boolean isEnabled(int i) {
        return false;
    }
}
