package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.music.R;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.Channel;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.a;

/* renamed from: ptw reason: default package */
public final class ptw implements OnCheckedChangeListener, pty {
    public static final Creator<ptw> CREATOR = new Creator<ptw>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ptw(parcel, 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ptw[i];
        }
    };
    public final String a;
    public final Channel b;
    public boolean c;

    /* renamed from: ptw$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[Channel.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp$Channel[] r0 = com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.Channel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp$Channel r1 = com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.Channel.PUSH     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp$Channel r1 = com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.Channel.EMAIL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ptw.AnonymousClass2.<clinit>():void");
        }
    }

    private ptw(Parcel parcel) {
        this.a = parcel.readString();
        this.b = Channel.valueOf(parcel.readString());
        this.c = juo.a(parcel);
    }

    /* synthetic */ ptw(Parcel parcel, byte b2) {
        this(parcel);
    }

    private ptw(String str, Channel channel, boolean z) {
        this.a = str;
        this.b = channel;
        this.c = z;
    }

    public static ptw a(String str, Channel channel, boolean z) {
        return new ptw(str, channel, z);
    }

    public final View a(Context context, a aVar, View view, ViewGroup viewGroup, int i) {
        String str;
        frx frx = (frx) fqv.b(view, frx.class);
        if (frx == null) {
            fqv.b();
            frx = fsk.c(context, viewGroup);
            frx.a(new SwitchCompat(context));
        }
        int i2 = AnonymousClass2.a[this.b.ordinal()];
        if (i2 == 1) {
            str = context.getString(R.string.notification_settings_channel_push);
        } else if (i2 == 2) {
            str = context.getString(R.string.notification_settings_channel_email);
        } else {
            StringBuilder sb = new StringBuilder("Unrecognized channel ");
            sb.append(this.b);
            throw new IllegalStateException(sb.toString());
        }
        frx.a(str);
        ((SwitchCompat) frx.a()).setOnCheckedChangeListener(null);
        ((SwitchCompat) frx.a()).setChecked(this.c);
        ((SwitchCompat) frx.a()).setOnCheckedChangeListener(this);
        frx.a().setTag(aVar);
        frx.getView().setTag(frx.a());
        return frx.getView();
    }

    public final int az_() {
        return 2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.c = z;
        ((a) compoundButton.getTag()).a(this.a, this.b, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        juo.a(parcel, this.c);
    }
}
