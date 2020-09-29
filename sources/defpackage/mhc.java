package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import java.util.Collections;
import java.util.List;

/* renamed from: mhc reason: default package */
public final class mhc implements Parcelable {
    public static final Creator<mhc> CREATOR = new Creator<mhc>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mhc[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mhc(parcel);
        }
    };
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final List<a> e;
    private final String f;

    /* renamed from: mhc$a */
    public static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }
        };
        public final String a;
        public final CharSequence b;

        public final int describeContents() {
            return 0;
        }

        public a(String str, CharSequence charSequence) {
            this.a = str;
            this.b = charSequence;
        }

        protected a(Parcel parcel) {
            this.a = parcel.readString();
            this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, i);
        }
    }

    public final int describeContents() {
        return 0;
    }

    protected mhc(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.f = parcel.readString();
        this.e = parcel.createTypedArrayList(a.CREATOR);
    }

    public static mhc a() {
        return new mhc();
    }

    public mhc(int i, String str, String str2, String str3, String str4, List<a> list) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = str4;
        this.e = list;
    }

    private mhc() {
        this.a = 0;
        String str = "";
        this.b = str;
        this.c = str;
        this.d = null;
        this.f = null;
        this.e = Collections.emptyList();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.f);
        parcel.writeTypedList(this.e);
    }

    public final SpotifyIconV2 b() {
        int i = this.a;
        if (i == 0) {
            return SpotifyIconV2.DEVICE_COMPUTER;
        }
        if (i == 1) {
            return SpotifyIconV2.DEVICE_TV;
        }
        if (i == 3) {
            return SpotifyIconV2.GAMES_CONSOLE;
        }
        if (i == 4) {
            return SpotifyIconV2.CHROMECAST_DISCONNECTED;
        }
        if (i == 5) {
            return SpotifyIconV2.BLUETOOTH;
        }
        if (i != 6) {
            return SpotifyIconV2.DEVICE_SPEAKER;
        }
        return SpotifyIconV2.FOLLOW;
    }
}
