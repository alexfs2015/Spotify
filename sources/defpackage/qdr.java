package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.Arrays;

/* renamed from: qdr reason: default package */
public final class qdr extends ArrayAdapter<String> {
    public qdr(Context context, String[] strArr) {
        super(context, 17367043, Arrays.asList(strArr));
        setDropDownViewResource(17367049);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getView(i, view, viewGroup);
        textView.setTypeface(utw.c(viewGroup.getContext(), R.attr.glueFontRegular));
        return textView;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getDropDownView(i, view, viewGroup);
        textView.setTypeface(utw.c(viewGroup.getContext(), R.attr.glueFontRegular));
        return textView;
    }
}
