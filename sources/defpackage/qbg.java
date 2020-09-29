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
/* renamed from: qbg reason: default package */
public class qbg implements Parcelable {
    public static final Creator<qbg> CREATOR = new Creator<qbg>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new qbg(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new qbg[i];
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

    /* renamed from: qbg$a */
    public static class a implements Callable<qbg[]> {
        private final float a;
        private final ObjectMapper b;
        private final String c;

        public a(float f, ObjectMapper objectMapper, String str) {
            this.a = f;
            this.b = objectMapper;
            this.c = str;
        }

        /* renamed from: a */
        public final qbg[] call() {
            try {
                qbg[] qbgArr = (qbg[]) this.b.readValue(this.c, qbg[].class);
                for (qbg a2 : qbgArr) {
                    qbg.a(a2, this.a);
                }
                return qbgArr;
            } catch (IOException | RuntimeException e) {
                throw new AssertionError(e);
            }
        }
    }

    @JsonCreator
    public qbg(@JsonProperty("mXPos") float f, @JsonProperty("mYPos") float f2, @JsonProperty("mHeight") float f3, @JsonProperty("mWidth") float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public qbg(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
    }

    static /* synthetic */ void a(qbg qbg, float f) {
        qbg.a = (float) ((int) (qbg.a * f));
        qbg.b = (float) ((int) (qbg.b * f));
        qbg.c = (float) ((int) (qbg.c * f));
        qbg.d = (float) ((int) (qbg.d * f));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
    }
}
