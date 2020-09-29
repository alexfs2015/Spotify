package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: tty reason: default package */
public final class tty implements tuh {
    private View a;

    public final View a(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.default_placeholder, viewGroup, false);
    }

    public final void a() {
        this.a = null;
    }

    public final void a(View view) {
        this.a = view.findViewById(R.id.progress);
    }

    public final void a(boolean z) {
        View view = this.a;
        if (view != null) {
            view.setVisibility(z ? 0 : 4);
        }
    }
}
