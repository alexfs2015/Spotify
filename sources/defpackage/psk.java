package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.concurrent.Callable;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: psk reason: default package */
public class psk implements Parcelable {
    public static final Creator<psk> CREATOR = new Creator<psk>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new psk[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new psk(parcel);
        }
    };
    @JsonProperty("mXPos")
    public float a;
    @JsonProperty("mYPos")
    public float b;
    @JsonProperty("mHeight")
    public float c;
    @JsonProperty("mWidth")
    public float d;

    /* renamed from: psk$a */
    public static class a implements Callable<psk[]> {
        private final float a;
        private final ObjectMapper b;
        private final String c;

        public a(float f, ObjectMapper objectMapper, String str) {
            this.a = f;
            this.b = objectMapper;
            this.c = str;
        }

        /* renamed from: a */
        public final psk[] call() {
            try {
                psk[] pskArr = (psk[]) this.b.readValue(this.c, psk[].class);
                for (psk a2 : pskArr) {
                    psk.a(a2, this.a);
                }
                return pskArr;
            } catch (IOException | RuntimeException e) {
                throw new AssertionError(e);
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    @JsonCreator
    public psk(@JsonProperty("mXPos") float f, @JsonProperty("mYPos") float f2, @JsonProperty("mHeight") float f3, @JsonProperty("mWidth") float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
    }

    public psk(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
    }

    static /* synthetic */ void a(psk psk, float f) {
        psk.a = (float) ((int) (psk.a * f));
        psk.b = (float) ((int) (psk.b * f));
        psk.c = (float) ((int) (psk.c * f));
        psk.d = (float) ((int) (psk.d * f));
    }
}
