package defpackage;

import android.os.Parcelable;
import android.widget.TextView;

/* renamed from: ulz reason: default package */
public abstract class ulz implements Parcelable {
    public static ulz a(int i) {
        return new ulp(i);
    }

    public static ulz a(CharSequence charSequence) {
        return new uln(charSequence);
    }

    public abstract void a(TextView textView);
}
