package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.spotify.music.R;
import com.spotify.paste.widgets.internal.PasteFrameLayout;

/* renamed from: gab reason: default package */
public final class gab {
    public static View a(Context context, ViewGroup viewGroup, int i) {
        PasteFrameLayout pasteFrameLayout = new PasteFrameLayout(context);
        fqw.a(pasteFrameLayout);
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        inflate.setDuplicateParentStateEnabled(true);
        inflate.setId(R.id.row_view);
        LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams != null) {
            pasteFrameLayout.setLayoutParams(layoutParams);
            inflate.setLayoutParams(new FrameLayout.LayoutParams(layoutParams));
        }
        pasteFrameLayout.addView(inflate);
        return pasteFrameLayout;
    }
}
