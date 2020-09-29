package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.music.R;

/* renamed from: ueg reason: default package */
public final class ueg implements fqy {
    public final Button a;

    private ueg(Context context) {
        this.a = (Button) LayoutInflater.from(context).inflate(R.layout.podcast_topic_chip, null);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.rightMargin = vfj.b(8.0f, context.getResources());
        layoutParams.topMargin = vfj.b(8.0f, context.getResources());
        layoutParams.bottomMargin = vfj.b(8.0f, context.getResources());
        this.a.setLayoutParams(layoutParams);
    }

    public static ueg a(Context context) {
        return new ueg(context);
    }

    public final void a(ueh ueh, String str) {
        this.a.setOnClickListener(new $$Lambda$ueg$a_znEVlpThEC9qz837vPjq1Lra8(ueh, str));
    }

    public final View getView() {
        return this.a;
    }
}
