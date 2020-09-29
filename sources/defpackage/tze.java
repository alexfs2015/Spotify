package defpackage;

import android.os.Parcelable;
import android.widget.TextView;

/* renamed from: tze reason: default package */
public abstract class tze implements Parcelable {
    public abstract void a(TextView textView);

    public static tze a(CharSequence charSequence) {
        return new tys(charSequence);
    }

    public static tze a(int i) {
        return new tyu(i);
    }
}
