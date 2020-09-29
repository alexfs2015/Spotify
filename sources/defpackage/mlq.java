package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import java.util.Collections;
import java.util.List;

/* renamed from: mlq reason: default package */
public final class mlq implements Parcelable {
    public static final Creator<mlq> CREATOR = new Creator<mlq>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mlq(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mlq[i];
        }
    };
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final List<a> e;
    private final String f;

    /* renamed from: mlq$a */
    public static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        public final String a;
        public final CharSequence b;

        protected a(Parcel parcel) {
            this.a = parcel.readString();
            this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public a(String str, CharSequence charSequence) {
            this.a = str;
            this.b = charSequence;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, i);
        }
    }

    private mlq() {
        this.a = 0;
        String str = "";
        this.b = str;
        this.c = str;
        this.d = null;
        this.f = null;
        this.e = Collections.emptyList();
    }

    public mlq(int i, String str, String str2, String str3, String str4, List<a> list) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = str4;
        this.e = list;
    }

    protected mlq(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.f = parcel.readString();
        this.e = parcel.createTypedArrayList(a.CREATOR);
    }

    public static mlq a() {
        return new mlq();
    }

    public final SpotifyIconV2 b() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? SpotifyIconV2.DEVICE_SPEAKER : SpotifyIconV2.FOLLOW : SpotifyIconV2.BLUETOOTH : SpotifyIconV2.CHROMECAST_DISCONNECTED : SpotifyIconV2.GAMES_CONSOLE : SpotifyIconV2.DEVICE_TV : SpotifyIconV2.DEVICE_COMPUTER;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.f);
        parcel.writeTypedList(this.e);
    }
}
