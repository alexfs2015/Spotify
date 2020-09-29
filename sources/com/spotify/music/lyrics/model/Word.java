package com.spotify.music.lyrics.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Word implements Parcelable, JacksonModel {
    public static final Creator<Word> CREATOR = new Creator<Word>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Word[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Word(parcel);
        }
    };
    private final String mString;

    public int describeContents() {
        return 0;
    }

    @JsonCreator
    public Word(@JsonProperty("string") String str) {
        this.mString = (String) fay.a(str);
    }

    public Word(Parcel parcel) {
        this.mString = (String) fay.a(parcel.readString());
    }

    public String getString() {
        return this.mString;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mString);
    }
}
