package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bpe reason: default package */
public final class bpe extends bxw {
    public static final Creator<bpe> CREATOR = new bqe();
    /* access modifiers changed from: private */
    public static final List<String> F = Arrays.asList(new String[]{"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"});
    /* access modifiers changed from: private */
    public static final int[] G = {0, 1};
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final bpu E;
    private final int[] H;
    public final List<String> a;
    public final long b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* renamed from: bpe$a */
    public static final class a {
        List<String> a = bpe.F;
        int[] b = bpe.G;
        int c = R.drawable.cast_ic_notification_small_icon;
        int d = R.drawable.cast_ic_notification_stop_live_stream;
        int e = R.drawable.cast_ic_notification_pause;
        int f = R.drawable.cast_ic_notification_play;
        int g = R.drawable.cast_ic_notification_skip_next;
        int h = R.drawable.cast_ic_notification_skip_prev;
        int i = R.drawable.cast_ic_notification_forward;
        int j = R.drawable.cast_ic_notification_forward10;
        int k = R.drawable.cast_ic_notification_forward30;
        int l = R.drawable.cast_ic_notification_rewind;
        int m = R.drawable.cast_ic_notification_rewind10;
        int n = R.drawable.cast_ic_notification_rewind30;
        int o = R.drawable.cast_ic_notification_disconnect;
        long p = 10000;
    }

    public bpe(List<String> list, int[] iArr, long j2, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, IBinder iBinder) {
        int[] iArr2 = iArr;
        IBinder iBinder2 = iBinder;
        bpu bpu = null;
        if (list != null) {
            this.a = new ArrayList(list);
        } else {
            this.a = null;
        }
        if (iArr2 != null) {
            this.H = Arrays.copyOf(iArr, iArr2.length);
        } else {
            this.H = null;
        }
        this.b = j2;
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
        this.l = i10;
        this.m = i11;
        this.n = i12;
        this.o = i13;
        this.p = i14;
        this.q = i15;
        this.r = i16;
        this.s = i17;
        this.t = i18;
        this.u = i19;
        this.v = i20;
        this.w = i21;
        this.x = i22;
        this.y = i23;
        this.z = i24;
        this.A = i25;
        this.B = i26;
        this.C = i27;
        this.D = i28;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            bpu = queryLocalInterface instanceof bpu ? (bpu) queryLocalInterface : new bpw(iBinder2);
        }
        this.E = bpu;
    }

    public final int[] a() {
        int[] iArr = this.H;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        int[] a3 = a();
        if (a3 != null) {
            int a4 = bxx.a(parcel, 3);
            parcel.writeIntArray(a3);
            bxx.b(parcel, a4);
        }
        bxx.a(parcel, 4, this.b);
        bxx.a(parcel, 5, this.c, false);
        bxx.b(parcel, 6, this.d);
        bxx.b(parcel, 7, this.e);
        bxx.b(parcel, 8, this.f);
        bxx.b(parcel, 9, this.g);
        bxx.b(parcel, 10, this.h);
        bxx.b(parcel, 11, this.i);
        bxx.b(parcel, 12, this.j);
        bxx.b(parcel, 13, this.k);
        bxx.b(parcel, 14, this.l);
        bxx.b(parcel, 15, this.m);
        bxx.b(parcel, 16, this.n);
        bxx.b(parcel, 17, this.o);
        bxx.b(parcel, 18, this.p);
        bxx.b(parcel, 19, this.q);
        bxx.b(parcel, 20, this.r);
        bxx.b(parcel, 21, this.s);
        bxx.b(parcel, 22, this.t);
        bxx.b(parcel, 23, this.u);
        bxx.b(parcel, 24, this.v);
        bxx.b(parcel, 25, this.w);
        bxx.b(parcel, 26, this.x);
        bxx.b(parcel, 27, this.y);
        bxx.b(parcel, 28, this.z);
        bxx.b(parcel, 29, this.A);
        bxx.b(parcel, 30, this.B);
        bxx.b(parcel, 31, this.C);
        bxx.b(parcel, 32, this.D);
        bpu bpu = this.E;
        bxx.a(parcel, 33, bpu == null ? null : bpu.asBinder(), false);
        bxx.b(parcel, a2);
    }
}
