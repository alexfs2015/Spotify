package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Concert implements Parcelable, JacksonModel {
    public static final Concert EMPTY = create(null, null, null, null, null, null, false, null, null);
    private String mListingTitle;

    static final class a extends upv<Artist> {
        protected a() {
            super(Concert.getArtistCreator());
        }
    }

    static final class b extends upv<ConcertPartner> {
        protected b() {
            super(Concert.getConcertPartnerCreator());
        }
    }

    static final class c extends upv<ConcertTicketing> {
        protected c() {
            super(Concert.getConcertTicketingCreator());
        }
    }

    @JsonProperty("artists")
    public abstract List<Artist> getArtists();

    @JsonProperty("date")
    public abstract String getDateString();

    @JsonProperty("id")
    public abstract String getId();

    @JsonProperty("location")
    public abstract String getLocation();

    @JsonProperty("partnerConcerts")
    public abstract List<ConcertPartner> getPartnerConcerts();

    @JsonProperty("ticketing")
    public abstract List<ConcertTicketing> getTicketing();

    @JsonProperty("title")
    public abstract String getTitle();

    @JsonProperty("venue")
    public abstract String getVenue();

    @JsonProperty("festival")
    public abstract boolean isFestival();

    @JsonCreator
    public static Concert create(@JsonProperty("id") String str, @JsonProperty("date") String str2, @JsonProperty("title") String str3, @JsonProperty("location") String str4, @JsonProperty("venue") String str5, @JsonProperty("artists") List<Artist> list, @JsonProperty("festival") boolean z, @JsonProperty("partnerConcerts") List<ConcertPartner> list2, @JsonProperty("ticketing") List<ConcertTicketing> list3) {
        AutoValue_Concert autoValue_Concert = new AutoValue_Concert(str, str2, str3, str4, str5, list == null ? new ArrayList<>() : list, z, list2, list3);
        return autoValue_Concert;
    }

    @JsonIgnore
    public List<Artist> getArtistsWithAffinity() {
        return Lists.a(fcl.b(getArtists(), new faz<Artist>() {
            public final /* synthetic */ boolean apply(Object obj) {
                Artist artist = (Artist) obj;
                return artist != null && artist.hasAffinity();
            }
        }));
    }

    @JsonIgnore
    public List<Artist> getArtistsWithOutAffinity() {
        return Lists.a(fcl.b(getArtists(), new faz<Artist>() {
            public final /* synthetic */ boolean apply(Object obj) {
                Artist artist = (Artist) obj;
                return artist != null && !artist.hasAffinity();
            }
        }));
    }

    /* access modifiers changed from: 0000 */
    @JsonIgnore
    public String createListingTitle() {
        ArrayList arrayList = new ArrayList(Lists.a(getArtists(), new Function<Artist, String>() {
            public final /* synthetic */ Object apply(Object obj) {
                Artist artist = (Artist) obj;
                String str = "";
                return (artist != null && !fax.a(artist.getName())) ? artist.getName() : str;
            }
        }));
        arrayList.removeAll(Arrays.asList(new String[]{"", null}));
        String join = TextUtils.join(", ", arrayList);
        if (fax.a(join) || isFestival()) {
            return getTitle();
        }
        return join;
    }

    public String getListingTitle() {
        if (this.mListingTitle == null) {
            this.mListingTitle = createListingTitle();
        }
        return this.mListingTitle;
    }

    @JsonIgnore
    public String getArtistName() {
        String str = "";
        for (Artist name : getArtists()) {
            str = name.getName();
            if (!fax.a(str)) {
                break;
            }
        }
        return str;
    }

    @JsonIgnore
    public String getImageUri() {
        String str = null;
        for (Artist imageUri : getArtists()) {
            str = imageUri.getImageUri();
            if (!fax.a(str)) {
                break;
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    public static Creator<? extends Artist> getArtistCreator() {
        return AutoValue_Artist.CREATOR;
    }

    /* access modifiers changed from: private */
    public static Creator<? extends ConcertPartner> getConcertPartnerCreator() {
        return AutoValue_ConcertPartner.CREATOR;
    }

    /* access modifiers changed from: private */
    public static Creator<? extends ConcertTicketing> getConcertTicketingCreator() {
        return AutoValue_ConcertTicketing.CREATOR;
    }
}
