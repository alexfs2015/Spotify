package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.music.R;

/* renamed from: tsd reason: default package */
public final class tsd implements fqe {
    public final Button a;

    public static tsd a(Context context) {
        return new tsd(context);
    }

    public final View getView() {
        return this.a;
    }

    private tsd(Context context) {
        this.a = (Button) LayoutInflater.from(context).inflate(R.layout.podcast_topic_chip, null);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.rightMargin = uts.b(8.0f, context.getResources());
        layoutParams.topMargin = uts.b(8.0f, context.getResources());
        layoutParams.bottomMargin = uts.b(8.0f, context.getResources());
        this.a.setLayoutParams(layoutParams);
    }

    public final void a(tse tse, String str) {
        this.a.setOnClickListener(new $$Lambda$tsd$TPXVsikrYfP5uInjJzOaa0dKELI(tse, str));
    }
}
