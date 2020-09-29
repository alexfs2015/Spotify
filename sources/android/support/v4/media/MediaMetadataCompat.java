package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

public final class MediaMetadataCompat implements Parcelable {
    public static final Creator<MediaMetadataCompat> CREATOR = new Creator<MediaMetadataCompat>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    };
    static final dp<String, Integer> a;
    private static final String[] d;
    private static final String[] e;
    private static final String[] f;
    public final Bundle b;
    public MediaMetadata c;
    private MediaDescriptionCompat g;

    public static final class a {
        private final Bundle a;

        public a() {
            this.a = new Bundle();
        }

        public a(MediaMetadataCompat mediaMetadataCompat) {
            this.a = new Bundle(mediaMetadataCompat.b);
            MediaSessionCompat.b(this.a);
        }

        public a(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.a.keySet()) {
                Object obj = this.a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        float f = (float) i;
                        float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
                        a(str, Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true));
                    }
                }
            }
        }

        public final a a(String str, long j) {
            if (!MediaMetadataCompat.a.containsKey(str) || ((Integer) MediaMetadataCompat.a.get(str)).intValue() == 0) {
                this.a.putLong(str, j);
                return this;
            }
            StringBuilder sb = new StringBuilder("The ");
            sb.append(str);
            sb.append(" key cannot be used to put a long");
            throw new IllegalArgumentException(sb.toString());
        }

        public final a a(String str, Bitmap bitmap) {
            if (!MediaMetadataCompat.a.containsKey(str) || ((Integer) MediaMetadataCompat.a.get(str)).intValue() == 2) {
                this.a.putParcelable(str, bitmap);
                return this;
            }
            StringBuilder sb = new StringBuilder("The ");
            sb.append(str);
            sb.append(" key cannot be used to put a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }

        public final a a(String str, String str2) {
            if (!MediaMetadataCompat.a.containsKey(str) || ((Integer) MediaMetadataCompat.a.get(str)).intValue() == 1) {
                this.a.putCharSequence(str, str2);
                return this;
            }
            StringBuilder sb = new StringBuilder("The ");
            sb.append(str);
            sb.append(" key cannot be used to put a String");
            throw new IllegalArgumentException(sb.toString());
        }

        public final MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.a);
        }
    }

    static {
        dp<String, Integer> dpVar = new dp<>();
        a = dpVar;
        Integer valueOf = Integer.valueOf(1);
        String str = "android.media.metadata.TITLE";
        dpVar.put(str, valueOf);
        String str2 = "android.media.metadata.ARTIST";
        a.put(str2, valueOf);
        dp<String, Integer> dpVar2 = a;
        Integer valueOf2 = Integer.valueOf(0);
        dpVar2.put("android.media.metadata.DURATION", valueOf2);
        String str3 = "android.media.metadata.ALBUM";
        a.put(str3, valueOf);
        String str4 = "android.media.metadata.AUTHOR";
        a.put(str4, valueOf);
        String str5 = "android.media.metadata.WRITER";
        a.put(str5, valueOf);
        String str6 = "android.media.metadata.COMPOSER";
        a.put(str6, valueOf);
        a.put("android.media.metadata.COMPILATION", valueOf);
        a.put("android.media.metadata.DATE", valueOf);
        a.put("android.media.metadata.YEAR", valueOf2);
        a.put("android.media.metadata.GENRE", valueOf);
        a.put("android.media.metadata.TRACK_NUMBER", valueOf2);
        a.put("android.media.metadata.NUM_TRACKS", valueOf2);
        a.put("android.media.metadata.DISC_NUMBER", valueOf2);
        String str7 = "android.media.metadata.ALBUM_ARTIST";
        a.put(str7, valueOf);
        dp<String, Integer> dpVar3 = a;
        Integer valueOf3 = Integer.valueOf(2);
        String str8 = "android.media.metadata.ART";
        dpVar3.put(str8, valueOf3);
        String str9 = "android.media.metadata.ART_URI";
        a.put(str9, valueOf);
        String str10 = "android.media.metadata.ALBUM_ART";
        a.put(str10, valueOf3);
        String str11 = "android.media.metadata.ALBUM_ART_URI";
        a.put(str11, valueOf);
        dp<String, Integer> dpVar4 = a;
        String str12 = str11;
        Integer valueOf4 = Integer.valueOf(3);
        dpVar4.put("android.media.metadata.USER_RATING", valueOf4);
        a.put("android.media.metadata.RATING", valueOf4);
        a.put("android.media.metadata.DISPLAY_TITLE", valueOf);
        a.put("android.media.metadata.DISPLAY_SUBTITLE", valueOf);
        a.put("android.media.metadata.DISPLAY_DESCRIPTION", valueOf);
        a.put("android.media.metadata.DISPLAY_ICON", valueOf3);
        a.put("android.media.metadata.DISPLAY_ICON_URI", valueOf);
        a.put("android.media.metadata.MEDIA_ID", valueOf);
        a.put("android.media.metadata.BT_FOLDER_TYPE", valueOf2);
        a.put("android.media.metadata.MEDIA_URI", valueOf);
        a.put("android.media.metadata.ADVERTISEMENT", valueOf2);
        a.put("android.media.metadata.DOWNLOAD_STATUS", valueOf2);
        d = new String[]{str, str2, str3, str7, str5, str4, str6};
        e = new String[]{"android.media.metadata.DISPLAY_ICON", str8, str10};
        f = new String[]{"android.media.metadata.DISPLAY_ICON_URI", str9, str12};
    }

    MediaMetadataCompat(Bundle bundle) {
        this.b = new Bundle(bundle);
        MediaSessionCompat.b(this.b);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat a(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.c = mediaMetadata;
        return mediaMetadataCompat;
    }

    private CharSequence c(String str) {
        return this.b.getCharSequence(str);
    }

    private Bitmap d(String str) {
        try {
            return (Bitmap) this.b.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final MediaDescriptionCompat a() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.g;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String a2 = a("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence c2 = c("android.media.metadata.DISPLAY_TITLE");
        if (!TextUtils.isEmpty(c2)) {
            charSequenceArr[0] = c2;
            charSequenceArr[1] = c("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = c("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            int i = 0;
            int i2 = 0;
            while (i < 3 && i2 < 7) {
                int i3 = i2 + 1;
                CharSequence c3 = c(d[i2]);
                if (!TextUtils.isEmpty(c3)) {
                    int i4 = i + 1;
                    charSequenceArr[i] = c3;
                    i = i4;
                }
                i2 = i3;
            }
        }
        int i5 = 0;
        while (true) {
            uri = null;
            if (i5 >= 3) {
                bitmap = null;
                break;
            }
            bitmap = d(e[i5]);
            if (bitmap != null) {
                break;
            }
            i5++;
        }
        int i6 = 0;
        while (true) {
            if (i6 >= 3) {
                uri2 = null;
                break;
            }
            String a3 = a(f[i6]);
            if (!TextUtils.isEmpty(a3)) {
                uri2 = Uri.parse(a3);
                break;
            }
            i6++;
        }
        String a4 = a("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty(a4)) {
            uri = Uri.parse(a4);
        }
        android.support.v4.media.MediaDescriptionCompat.a aVar = new android.support.v4.media.MediaDescriptionCompat.a();
        aVar.a = a2;
        aVar.b = charSequenceArr[0];
        aVar.c = charSequenceArr[1];
        aVar.d = charSequenceArr[2];
        aVar.e = bitmap;
        aVar.f = uri2;
        aVar.h = uri;
        Bundle bundle = new Bundle();
        String str = "android.media.metadata.BT_FOLDER_TYPE";
        if (this.b.containsKey(str)) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", b(str));
        }
        String str2 = "android.media.metadata.DOWNLOAD_STATUS";
        if (this.b.containsKey(str2)) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", b(str2));
        }
        if (!bundle.isEmpty()) {
            aVar.g = bundle;
        }
        this.g = aVar.a();
        return this.g;
    }

    public final String a(String str) {
        CharSequence charSequence = this.b.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final long b(String str) {
        return this.b.getLong(str, 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }
}
