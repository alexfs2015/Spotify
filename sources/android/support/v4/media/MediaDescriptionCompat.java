package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new Creator<MediaDescriptionCompat>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            if (VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }
    };
    final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final Bitmap d;
    public final Uri e;
    private final CharSequence f;
    private final Bundle g;
    private final Uri h;
    private MediaDescription i;

    public static final class a {
        public String a;
        public CharSequence b;
        public CharSequence c;
        CharSequence d;
        Bitmap e;
        public Uri f;
        public Bundle g;
        Uri h;

        public final MediaDescriptionCompat a() {
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            return mediaDescriptionCompat;
        }
    }

    public final int describeContents() {
        return 0;
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.f = charSequence3;
        this.d = bitmap;
        this.e = uri;
        this.g = bundle;
        this.h = uri2;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.d = (Bitmap) parcel.readParcelable(classLoader);
        this.e = (Uri) parcel.readParcelable(classLoader);
        this.g = parcel.readBundle(classLoader);
        this.h = (Uri) parcel.readParcelable(classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, i2);
            TextUtils.writeToParcel(this.c, parcel, i2);
            TextUtils.writeToParcel(this.f, parcel, i2);
            parcel.writeParcelable(this.d, i2);
            parcel.writeParcelable(this.e, i2);
            parcel.writeBundle(this.g);
            parcel.writeParcelable(this.h, i2);
            return;
        }
        ((MediaDescription) a()).writeToParcel(parcel, i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        String str = ", ";
        sb.append(str);
        sb.append(this.c);
        sb.append(str);
        sb.append(this.f);
        return sb.toString();
    }

    public final Object a() {
        if (this.i != null || VERSION.SDK_INT < 21) {
            return this.i;
        }
        Builder builder = new Builder();
        builder.setMediaId(this.a);
        builder.setTitle(this.b);
        builder.setSubtitle(this.c);
        builder.setDescription(this.f);
        builder.setIconBitmap(this.d);
        builder.setIconUri(this.e);
        Bundle bundle = this.g;
        if (VERSION.SDK_INT < 23 && this.h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.h);
        }
        builder.setExtras(bundle);
        if (VERSION.SDK_INT >= 23) {
            builder.setMediaUri(this.h);
        }
        this.i = builder.build();
        return this.i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0079
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0079
            android.support.v4.media.MediaDescriptionCompat$a r1 = new android.support.v4.media.MediaDescriptionCompat$a
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = r8.getMediaId()
            r1.a = r2
            java.lang.CharSequence r2 = r8.getTitle()
            r1.b = r2
            java.lang.CharSequence r2 = r8.getSubtitle()
            r1.c = r2
            java.lang.CharSequence r2 = r8.getDescription()
            r1.d = r2
            android.graphics.Bitmap r2 = r8.getIconBitmap()
            r1.e = r2
            android.net.Uri r2 = r8.getIconUri()
            r1.f = r2
            android.os.Bundle r2 = r8.getExtras()
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0046
            android.support.v4.media.session.MediaSessionCompat.b(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x0047
        L_0x0046:
            r4 = r0
        L_0x0047:
            if (r4 == 0) goto L_0x005f
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x0059
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x0059
            goto L_0x0060
        L_0x0059:
            r2.remove(r3)
            r2.remove(r5)
        L_0x005f:
            r0 = r2
        L_0x0060:
            r1.g = r0
            if (r4 == 0) goto L_0x0067
            r1.h = r4
            goto L_0x0073
        L_0x0067:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x0073
            android.net.Uri r0 = r8.getMediaUri()
            r1.h = r0
        L_0x0073:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.i = r8
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }
}
