package android.support.v4.media;

import android.media.Rating;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new Creator<RatingCompat>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RatingCompat[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }
    };
    public final int a;
    public final float b;
    private Object c;

    RatingCompat(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        if (f < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        sb.append(str);
        return sb.toString();
    }

    public final int describeContents() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }

    public final boolean a() {
        return this.b >= 0.0f;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat;
        float f;
        RatingCompat ratingCompat2 = null;
        if (obj != null && VERSION.SDK_INT >= 19) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat2 = new RatingCompat(ratingStyle, -1.0f);
                        break;
                }
            } else {
                float f2 = 1.0f;
                String str = "Rating";
                switch (ratingStyle) {
                    case 1:
                        if (!rating.hasHeart()) {
                            f2 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(1, f2);
                        break;
                    case 2:
                        if (!rating.isThumbUp()) {
                            f2 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(2, f2);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float starRating = rating.getStarRating();
                        if (ratingStyle == 3) {
                            f = 3.0f;
                        } else if (ratingStyle == 4) {
                            f = 4.0f;
                        } else if (ratingStyle != 5) {
                            StringBuilder sb = new StringBuilder("Invalid rating style (");
                            sb.append(ratingStyle);
                            sb.append(") for a star rating");
                            Log.e(str, sb.toString());
                            break;
                        } else {
                            f = 5.0f;
                        }
                        if (starRating >= 0.0f && starRating <= f) {
                            ratingCompat2 = new RatingCompat(ratingStyle, starRating);
                            break;
                        } else {
                            Log.e(str, "Trying to set out of range star-based rating");
                            break;
                        }
                        break;
                    case 6:
                        float percentRating = rating.getPercentRating();
                        if (percentRating >= 0.0f && percentRating <= 100.0f) {
                            ratingCompat2 = new RatingCompat(6, percentRating);
                            break;
                        } else {
                            Log.e(str, "Invalid percentage-based rating value");
                            break;
                        }
                        break;
                    default:
                        return null;
                }
                ratingCompat2 = ratingCompat;
            }
            ratingCompat2.c = obj;
        }
        return ratingCompat2;
    }
}
