package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Creator<PlaybackStateCompat> CREATOR = new Creator<PlaybackStateCompat>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }
    };
    public final int a;
    final long b;
    final long c;
    final float d;
    public final long e;
    final int f;
    final CharSequence g;
    final long h;
    List<CustomAction> i;
    final long j;
    final Bundle k;
    PlaybackState l;

    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new Creator<CustomAction>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new CustomAction[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }
        };
        final String a;
        final CharSequence b;
        final int c;
        final Bundle d;
        android.media.session.PlaybackState.CustomAction e;

        public static final class a {
            public final String a;
            public final CharSequence b;
            public final int c;

            public a(String str, CharSequence charSequence, int i) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                } else if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                } else if (i != 0) {
                    this.a = str;
                    this.b = charSequence;
                    this.c = i;
                } else {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
            }
        }

        public final int describeContents() {
            return 0;
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.a = str;
            this.b = charSequence;
            this.c = i;
            this.d = bundle;
        }

        CustomAction(Parcel parcel) {
            this.a = parcel.readString();
            this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.c = parcel.readInt();
            this.d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, i);
            parcel.writeInt(this.c);
            parcel.writeBundle(this.d);
        }

        public static CustomAction a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            android.media.session.PlaybackState.CustomAction customAction = (android.media.session.PlaybackState.CustomAction) obj;
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
            customAction2.e = customAction;
            return customAction2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Action:mName='");
            sb.append(this.b);
            sb.append(", mIcon=");
            sb.append(this.c);
            sb.append(", mExtras=");
            sb.append(this.d);
            return sb.toString();
        }
    }

    public static final class a {
        public final List<CustomAction> a = new ArrayList();
        public long b;
        public long c = -1;
        public Bundle d;
        private int e;
        private long f;
        private long g;
        private float h;
        private int i;
        private CharSequence j;
        private long k;

        public a() {
        }

        public a(PlaybackStateCompat playbackStateCompat) {
            this.e = playbackStateCompat.a;
            this.f = playbackStateCompat.b;
            this.h = playbackStateCompat.d;
            this.k = playbackStateCompat.h;
            this.g = playbackStateCompat.c;
            this.b = playbackStateCompat.e;
            this.i = playbackStateCompat.f;
            this.j = playbackStateCompat.g;
            if (playbackStateCompat.i != null) {
                this.a.addAll(playbackStateCompat.i);
            }
            this.c = playbackStateCompat.j;
            this.d = playbackStateCompat.k;
        }

        public final a a(int i2, long j2, float f2) {
            return a(i2, j2, f2, SystemClock.elapsedRealtime());
        }

        public final a a(int i2, long j2, float f2, long j3) {
            this.e = i2;
            this.f = j2;
            this.k = j3;
            this.h = f2;
            return this;
        }

        public final a a(int i2, CharSequence charSequence) {
            this.i = i2;
            this.j = charSequence;
            return this;
        }

        public final PlaybackStateCompat a() {
            PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(this.e, this.f, this.g, this.h, this.b, this.i, this.j, this.k, this.a, this.c, this.d);
            return playbackStateCompat;
        }
    }

    public final int describeContents() {
        return 0;
    }

    PlaybackStateCompat(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.a = i2;
        this.b = j2;
        this.c = j3;
        this.d = f2;
        this.e = j4;
        this.f = i3;
        this.g = charSequence;
        this.h = j5;
        this.i = new ArrayList(list);
        this.j = j6;
        this.k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.d = parcel.readFloat();
        this.h = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", buffered position=");
        sb.append(this.c);
        sb.append(", speed=");
        sb.append(this.d);
        sb.append(", updated=");
        sb.append(this.h);
        sb.append(", actions=");
        sb.append(this.e);
        sb.append(", error code=");
        sb.append(this.f);
        sb.append(", error message=");
        sb.append(this.g);
        sb.append(", custom actions=");
        sb.append(this.i);
        sb.append(", active item id=");
        sb.append(this.j);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.h);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.g, parcel, i2);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f);
    }

    public static PlaybackStateCompat a(Object obj) {
        List list;
        Bundle bundle = null;
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<Object> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList = new ArrayList(customActions.size());
            for (Object a2 : customActions) {
                arrayList.add(CustomAction.a(a2));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (VERSION.SDK_INT >= 22) {
            bundle = playbackState.getExtras();
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), list, playbackState.getActiveQueueItemId(), bundle);
        playbackStateCompat.l = playbackState;
        return playbackStateCompat;
    }
}
