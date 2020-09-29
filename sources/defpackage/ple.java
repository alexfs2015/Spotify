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

/* renamed from: ple reason: default package */
public final class ple implements OnCheckedChangeListener, plg {
    public static final Creator<ple> CREATOR = new Creator<ple>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ple[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ple(parcel, 0);
        }
    };
    public final String a;
    public final Channel b;
    public boolean c;

    /* renamed from: ple$2 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ple.AnonymousClass2.<clinit>():void");
        }
    }

    public final int aB_() {
        return 2;
    }

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ ple(Parcel parcel, byte b2) {
        this(parcel);
    }

    public static ple a(String str, Channel channel, boolean z) {
        return new ple(str, channel, z);
    }

    private ple(String str, Channel channel, boolean z) {
        this.a = str;
        this.b = channel;
        this.c = z;
    }

    private ple(Parcel parcel) {
        this.a = parcel.readString();
        this.b = Channel.valueOf(parcel.readString());
        this.c = jse.a(parcel);
    }

    public final View a(Context context, a aVar, View view, ViewGroup viewGroup, int i) {
        String str;
        frd frd = (frd) fqb.b(view, frd.class);
        if (frd == null) {
            fqb.b();
            frd = frq.c(context, viewGroup);
            frd.a(new SwitchCompat(context));
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
        frd.a(str);
        ((SwitchCompat) frd.a()).setOnCheckedChangeListener(null);
        ((SwitchCompat) frd.a()).setChecked(this.c);
        ((SwitchCompat) frd.a()).setOnCheckedChangeListener(this);
        frd.a().setTag(aVar);
        frd.getView().setTag(frd.a());
        return frd.getView();
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.c = z;
        ((a) compoundButton.getTag()).a(this.a, this.b, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        jse.a(parcel, this.c);
    }
}
