package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextPaint;
import android.text.style.URLSpan;

/* renamed from: joe reason: default package */
public final class joe extends URLSpan {
    public static final Creator<joe> CREATOR = new Creator<joe>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new joe(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new joe[i];
        }
    };

    public joe(Parcel parcel) {
        super(parcel);
    }

    public joe(String str) {
        super(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joe)) {
            return false;
        }
        return ((joe) obj).getURL().equals(getURL());
    }

    public final int hashCode() {
        return getURL().hashCode();
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
