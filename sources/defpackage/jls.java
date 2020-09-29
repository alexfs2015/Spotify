package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextPaint;
import android.text.style.URLSpan;

/* renamed from: jls reason: default package */
public final class jls extends URLSpan {
    public static final Creator<jls> CREATOR = new Creator<jls>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new jls[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new jls(parcel);
        }
    };

    public jls(Parcel parcel) {
        super(parcel);
    }

    public jls(String str) {
        super(str);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jls)) {
            return false;
        }
        return ((jls) obj).getURL().equals(getURL());
    }

    public final int hashCode() {
        return getURL().hashCode();
    }
}
