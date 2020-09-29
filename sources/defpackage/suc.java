package defpackage;

import android.os.Bundle;
import android.view.Display;
import com.spotify.music.lyrics.model.TrackLyrics;

/* renamed from: suc reason: default package */
public interface suc {

    /* renamed from: suc$a */
    public interface a {
        void onFocusChange(boolean z);
    }

    /* renamed from: suc$b */
    public interface b {
        void onFullscreenClicked();
    }

    Bundle a(Display display);

    void a();

    void a(int i, int i2);

    void a(long j);

    void a(TrackLyrics trackLyrics);

    void a(sle sle);

    void a(slf slf);

    void a(a aVar);

    void a(b bVar);

    void b();

    void setBackgroundColor(int i);
}
