package com.spotify.music.artist.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Releases implements Parcelable, JacksonModel {
    public static final Creator<Releases> CREATOR = new Creator<Releases>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Releases[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Releases(parcel);
        }
    };
    public final ReleasesWithTotalCount albums;
    public final ReleasesWithTotalCount appearsOn;
    public final ReleasesWithTotalCount compilations;
    public final ReleasesWithTotalCount singles;

    /* renamed from: com.spotify.music.artist.model.Releases$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[ReleaseType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.spotify.music.artist.model.ReleaseType[] r0 = com.spotify.music.artist.model.ReleaseType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.artist.model.ReleaseType r1 = com.spotify.music.artist.model.ReleaseType.ALBUMS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.artist.model.ReleaseType r1 = com.spotify.music.artist.model.ReleaseType.SINGLES     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.artist.model.ReleaseType r1 = com.spotify.music.artist.model.ReleaseType.APPEARS_ON     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.artist.model.ReleaseType r1 = com.spotify.music.artist.model.ReleaseType.APPEARS_ON_NEW     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.music.artist.model.ReleaseType r1 = com.spotify.music.artist.model.ReleaseType.COMPILATIONS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.artist.model.Releases.AnonymousClass2.<clinit>():void");
        }
    }

    public int describeContents() {
        return 0;
    }

    @JsonCreator
    public Releases(@JsonProperty("albums") ReleasesWithTotalCount releasesWithTotalCount, @JsonProperty("singles") ReleasesWithTotalCount releasesWithTotalCount2, @JsonProperty("appears_on") ReleasesWithTotalCount releasesWithTotalCount3, @JsonProperty("compilations") ReleasesWithTotalCount releasesWithTotalCount4) {
        ReleasesWithTotalCount releasesWithTotalCount5 = new ReleasesWithTotalCount(Collections.emptyList(), 0);
        this.albums = (ReleasesWithTotalCount) jtc.a(releasesWithTotalCount, releasesWithTotalCount5);
        this.singles = (ReleasesWithTotalCount) jtc.a(releasesWithTotalCount2, releasesWithTotalCount5);
        this.appearsOn = (ReleasesWithTotalCount) jtc.a(releasesWithTotalCount3, releasesWithTotalCount5);
        this.compilations = (ReleasesWithTotalCount) jtc.a(releasesWithTotalCount4, releasesWithTotalCount5);
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.albums.writeToParcel(parcel, 0);
        this.singles.writeToParcel(parcel, 0);
        this.appearsOn.writeToParcel(parcel, 0);
        this.compilations.writeToParcel(parcel, 0);
    }

    private Releases(Parcel parcel) {
        this.albums = (ReleasesWithTotalCount) ReleasesWithTotalCount.CREATOR.createFromParcel(parcel);
        this.singles = (ReleasesWithTotalCount) ReleasesWithTotalCount.CREATOR.createFromParcel(parcel);
        this.appearsOn = (ReleasesWithTotalCount) ReleasesWithTotalCount.CREATOR.createFromParcel(parcel);
        this.compilations = (ReleasesWithTotalCount) ReleasesWithTotalCount.CREATOR.createFromParcel(parcel);
    }

    public boolean hasReleasesOfType(ReleaseType releaseType) {
        return !getReleasesWithTotalCount(releaseType).releases.isEmpty();
    }

    public ReleasesWithTotalCount getReleasesWithTotalCount(ReleaseType releaseType) {
        int i = AnonymousClass2.a[releaseType.ordinal()];
        if (i == 1) {
            return this.albums;
        }
        if (i == 2) {
            return this.singles;
        }
        if (i == 3 || i == 4) {
            return this.appearsOn;
        }
        if (i == 5) {
            return this.compilations;
        }
        StringBuilder sb = new StringBuilder("Unknown release type: ");
        sb.append(releaseType);
        throw new IllegalArgumentException(sb.toString());
    }
}
