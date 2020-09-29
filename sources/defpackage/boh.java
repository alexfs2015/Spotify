package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.spotify.music.R;
import java.util.List;

/* renamed from: boh reason: default package */
public final class boh extends bxf {
    public static final Creator<boh> CREATOR = new bop();
    private static final ehw e = new ehw("CastMediaOptions", 0);
    public final String a;
    public final String b;
    public final bon c;
    public final boolean d;
    private final bpc f;

    /* renamed from: boh$a */
    public static final class a {
        public String a = MediaIntentReceiver.class.getName();
        public bon b;

        public a() {
            defpackage.bon.a aVar = new defpackage.bon.a();
            List<String> list = aVar.a;
            int[] iArr = aVar.b;
            long j = aVar.p;
            int i = aVar.c;
            int i2 = aVar.d;
            int i3 = aVar.e;
            int i4 = aVar.f;
            int i5 = aVar.g;
            int i6 = aVar.h;
            int i7 = aVar.i;
            int i8 = aVar.j;
            bon bon = r2;
            int i9 = aVar.k;
            int i10 = aVar.l;
            int i11 = aVar.m;
            int i12 = aVar.n;
            int i13 = aVar.o;
            bon bon2 = bon;
            bon bon3 = new bon(list, iArr, j, null, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, R.dimen.cast_notification_image_size, R.string.cast_casting_to_device, R.string.cast_stop_live_stream, R.string.cast_pause, R.string.cast_play, R.string.cast_skip_next, R.string.cast_skip_prev, R.string.cast_forward, R.string.cast_forward_10, R.string.cast_forward_30, R.string.cast_rewind, R.string.cast_rewind_10, R.string.cast_rewind_30, R.string.cast_disconnect, null);
            this.b = bon2;
        }
    }

    public boh(String str, String str2, IBinder iBinder, bon bon, boolean z) {
        bpc bpc;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            bpc = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof bpc) {
                bpc = (bpc) queryLocalInterface;
            } else {
                bpc = new bpe(iBinder);
            }
        }
        this.f = bpc;
        this.c = bon;
        this.d = z;
    }

    public final boj a() {
        bpc bpc = this.f;
        if (bpc != null) {
            try {
                return (boj) cas.a(bpc.b());
            } catch (RemoteException e2) {
                e.a(e2, "Unable to call %s on %s.", "getWrappedClientObject", bpc.class.getSimpleName());
            }
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.a(parcel, 3, this.b, false);
        bpc bpc = this.f;
        bxg.a(parcel, 4, bpc == null ? null : bpc.asBinder(), false);
        bxg.a(parcel, 5, (Parcelable) this.c, i, false);
        bxg.a(parcel, 6, this.d);
        bxg.b(parcel, a2);
    }
}
