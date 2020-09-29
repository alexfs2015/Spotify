package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: -$$Lambda$qtq$5q3vG4XuaBBXKMciQXGQOr4KJzU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qtq$5q3vG4XuaBBXKMciQXGQOr4KJzU implements fqe {
    private final /* synthetic */ ViewGroup f$0;

    public /* synthetic */ $$Lambda$qtq$5q3vG4XuaBBXKMciQXGQOr4KJzU(ViewGroup viewGroup) {
        this.f$0 = viewGroup;
    }

    public final View getView() {
        return LayoutInflater.from(this.f$0.getContext()).inflate(R.layout.your_library_music_loading_indicator_row, this.f$0, false);
    }
}
