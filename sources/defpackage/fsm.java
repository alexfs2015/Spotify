package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.android.glue.components.trackcloud.TrackCloudTextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.Iterator;
import java.util.List;

/* renamed from: fsm reason: default package */
final class fsm implements fsl {
    private final TrackCloudTextView a;
    private final TextView b;
    private final ViewGroup c;
    private final fsk d = new fsk();

    public fsm(Context context, ViewGroup viewGroup) {
        this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.solar_track_cloud, viewGroup, false);
        this.b = (TextView) this.c.findViewById(R.id.title);
        this.a = (TrackCloudTextView) this.c.findViewById(R.id.track_cloud);
        uui.b(this.c).a(this.b, this.a).a();
    }

    public final void a(fsj fsj) {
        Iterator it;
        int i;
        fsj fsj2 = fsj;
        fsk fsk = this.d;
        TrackCloudTextView trackCloudTextView = this.a;
        fsk.a.clear();
        fsk.a.clearSpans();
        fsk.e = fsj2.g;
        fsk.f = fsj2.b;
        fsk.g = fsj2.c;
        fsk.c.clear();
        Context context = trackCloudTextView.getContext();
        List subList = fsj2.d.subList(0, Math.min(fsj2.h, fsj2.d.size()));
        int c2 = fr.c(context, R.color.gray_70);
        int c3 = fr.c(context, R.color.white);
        int c4 = fr.c(context, R.color.gray_25);
        for (Iterator it2 = subList.iterator(); it2.hasNext(); it2 = it) {
            a aVar = (a) it2.next();
            int i2 = aVar.d ? c2 : c4;
            int i3 = aVar.d ? c3 : c4;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (fsj2.e) {
                StringBuilder sb = new StringBuilder();
                sb.append(aVar.b);
                sb.append(' ');
                SpannableString spannableString = new SpannableString(sb.toString());
                it = it2;
                spannableString.setSpan(new ForegroundColorSpan(i3), 0, spannableString.length(), 33);
                spannableStringBuilder.append(spannableString);
            } else {
                it = it2;
            }
            String str = (!fsj2.f || !aVar.c) ? "" : "  ";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(aVar.a);
            SpannableString spannableString2 = new SpannableString(sb2.toString());
            if (!fsj2.f || !aVar.c) {
                i = 0;
            } else {
                int textSize = (int) trackCloudTextView.getTextSize();
                SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.HEART_ACTIVE, (float) textSize);
                spotifyIconDrawable.a(i2);
                i = 0;
                spotifyIconDrawable.setBounds(0, 0, textSize, textSize);
                spannableString2.setSpan(new ImageSpan(spotifyIconDrawable, 1), 0, 1, 18);
            }
            spannableString2.setSpan(new ForegroundColorSpan(i2), i, spannableString2.length(), 33);
            spannableStringBuilder.append(spannableString2);
            fsk.c.add(spannableStringBuilder);
        }
        fsk.a(trackCloudTextView, fsk.c.size());
        for (int i4 = 0; i4 < fsk.c.size(); i4++) {
            if (fsj2.g || i4 > 0) {
                fsk.a.append((CharSequence) fsk.d.get(i4));
            }
            fsk.a.append((CharSequence) fsk.c.get(i4));
        }
        TrackCloudTextView trackCloudTextView2 = this.a;
        fsk fsk2 = this.d;
        trackCloudTextView2.a = fsk2;
        trackCloudTextView2.setMaxLines(trackCloudTextView2.a.g);
        trackCloudTextView2.setText(fsk2.a);
        this.b.setText(fsj2.a);
        this.b.setVisibility(TextUtils.isEmpty(fsj2.a) ^ true ? 0 : 8);
    }

    public final View getView() {
        return this.c;
    }
}
