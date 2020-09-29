package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.spotify.music.freetiercommon.uicomponents.Rows.c;

/* renamed from: tpb reason: default package */
public final class tpb implements tlg {
    private final Typeface a;

    public tpb(Context context) {
        this.a = utw.a(context, 2132017666);
    }

    public final View a(Context context, ViewGroup viewGroup) {
        c b = Rows.b(context, viewGroup, 64, 8);
        b.b().setTypeface(this.a);
        return b.getView();
    }
}
