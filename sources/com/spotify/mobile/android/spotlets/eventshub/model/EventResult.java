package com.spotify.mobile.android.spotlets.eventshub.model;

import android.content.Context;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.format.DateUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class EventResult implements Parcelable, JacksonModel {
    public static final EventResult EMPTY = create(null, null, null, null, null, null, null);
    private static final String MULTIPLE_LOCATIONS = "Multiple locations";

    static final class a extends upv<ConcertResult> {
        protected a() {
            super(EventResult.getConcertResultCreator());
        }
    }

    @JsonProperty("artists")
    public abstract List<String> getArtists();

    @JsonProperty("closingDate")
    public abstract String getClosingDate();

    @JsonProperty("concerts")
    public abstract List<ConcertResult> getConcertResults();

    @JsonProperty("location")
    public abstract String getLocation();

    @JsonProperty("openingDate")
    public abstract String getOpeningDate();

    @JsonProperty("source")
    public abstract String getSource();

    @JsonProperty("venue")
    public abstract String getVenue();

    @JsonCreator
    public static EventResult create(@JsonProperty("concerts") List<ConcertResult> list, @JsonProperty("artists") List<String> list2, @JsonProperty("source") String str, @JsonProperty("openingDate") String str2, @JsonProperty("closingDate") String str3, @JsonProperty("venue") String str4, @JsonProperty("location") String str5) {
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        AutoValue_EventResult autoValue_EventResult = new AutoValue_EventResult(gbp.a(list), list2, str, str2, str3, str4, str5);
        return autoValue_EventResult;
    }

    @JsonIgnore
    public boolean isSingleConcert() {
        return getConcertResults().size() == 1;
    }

    @JsonIgnore
    public ConcertResult getPosterConcertResult() {
        return (ConcertResult) getConcertResults().get(0);
    }

    public String getMetadata(Context context, jrp jrp) {
        String str;
        StringBuilder sb = new StringBuilder(getFormattedDateRange(context, getOpeningDate(), getClosingDate(), jrp));
        String venue = getVenue();
        if (MULTIPLE_LOCATIONS.equals(getVenue())) {
            str = context.getString(R.string.events_hub_multiple_venues);
        } else {
            StringBuilder sb2 = new StringBuilder(venue);
            sb2.append(", ");
            sb2.append(getLocation());
            str = sb2.toString();
        }
        if (!fax.a(str)) {
            if (sb.length() > 0) {
                sb.append(" • ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    static String getFormattedDateRange(Context context, String str, String str2, jrp jrp) {
        if (!(str == null || str2 == null)) {
            try {
                return DateUtils.formatDateRange(context, iso8601toCalendar(str, jrp).getTimeInMillis(), iso8601toCalendar(str2, jrp).getTimeInMillis(), 65536);
            } catch (ParseException unused) {
                Logger.e("Parse Exception in formatting date range with dates: %s and %s", str, str2);
            }
        }
        return null;
    }

    private static Calendar iso8601toCalendar(String str, jrp jrp) {
        Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault()).parse(str.replace("Z", "+00:00"));
        Calendar f = jrp.f();
        f.setTime(parse);
        return f;
    }

    @JsonIgnore
    public SourceType getSourceType() {
        if (getSource() != null) {
            return createSourceFromString(getSource());
        }
        if (getConcertResults().size() > 0) {
            return ((ConcertResult) getConcertResults().get(0)).getSourceType();
        }
        return SourceType.ALL;
    }

    @JsonIgnore
    static SourceType createSourceFromString(String str) {
        SourceType[] sourceTypeArr;
        SourceType sourceType = SourceType.ALL;
        if (fax.a(str)) {
            return sourceType;
        }
        for (SourceType sourceType2 : SourceType.d) {
            if (faw.a(sourceType2.mSourceName, str)) {
                return sourceType2;
            }
        }
        return sourceType;
    }

    /* access modifiers changed from: private */
    public static Creator<? extends ConcertResult> getConcertResultCreator() {
        return AutoValue_ConcertResult.CREATOR;
    }
}
