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

    static final class a extends vba<ConcertResult> {
        protected a() {
            super(EventResult.getConcertResultCreator());
        }
    }

    @JsonCreator
    public static EventResult create(@JsonProperty("concerts") List<ConcertResult> list, @JsonProperty("artists") List<String> list2, @JsonProperty("source") String str, @JsonProperty("openingDate") String str2, @JsonProperty("closingDate") String str3, @JsonProperty("venue") String str4, @JsonProperty("location") String str5) {
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        List<String> list3 = list2;
        AutoValue_EventResult autoValue_EventResult = r0;
        String str6 = str;
        String str7 = str3;
        String str8 = str4;
        String str9 = str5;
        AutoValue_EventResult autoValue_EventResult2 = new AutoValue_EventResult(gcn.a(list), list2, str, str2, str3, str4, str5);
        return autoValue_EventResult2;
    }

    @JsonIgnore
    static SourceType createSourceFromString(String str) {
        SourceType[] sourceTypeArr;
        SourceType sourceType = SourceType.ALL;
        if (fbo.a(str)) {
            return sourceType;
        }
        boolean z = true;
        for (SourceType sourceType2 : SourceType.d) {
            if (fbn.a(sourceType2.mSourceName, str)) {
                return sourceType2;
            }
        }
        return sourceType;
    }

    /* access modifiers changed from: private */
    public static Creator<? extends ConcertResult> getConcertResultCreator() {
        return AutoValue_ConcertResult.CREATOR;
    }

    static String getFormattedDateRange(Context context, String str, String str2, jtz jtz) {
        if (!(str == null || str2 == null)) {
            try {
                return DateUtils.formatDateRange(context, iso8601toCalendar(str, jtz).getTimeInMillis(), iso8601toCalendar(str2, jtz).getTimeInMillis(), 65536);
            } catch (ParseException unused) {
                Object[] objArr = {str, str2};
                String str3 = "egsPndtd stirege a  %d:ta%apih ws tifc t eaninEmsonsxrnto  are";
                Logger.e("Parse Exception in formatting date range with dates: %s and %s", objArr);
            }
        }
        return null;
    }

    private static Calendar iso8601toCalendar(String str, jtz jtz) {
        String str2 = "Z";
        String str3 = "00+m:0";
        Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault()).parse(str.replace("Z", "+00:00"));
        Calendar f = jtz.f();
        f.setTime(parse);
        return f;
    }

    @JsonProperty("artists")
    public abstract List<String> getArtists();

    @JsonProperty("closingDate")
    public abstract String getClosingDate();

    @JsonProperty("concerts")
    public abstract List<ConcertResult> getConcertResults();

    @JsonProperty("location")
    public abstract String getLocation();

    public String getMetadata(Context context, jtz jtz) {
        String str;
        StringBuilder sb = new StringBuilder(getFormattedDateRange(context, getOpeningDate(), getClosingDate(), jtz));
        String venue = getVenue();
        if (MULTIPLE_LOCATIONS.equals(getVenue())) {
            str = context.getString(R.string.events_hub_multiple_venues);
        } else {
            StringBuilder sb2 = new StringBuilder(venue);
            String str2 = ", ";
            sb2.append(", ");
            sb2.append(getLocation());
            str = sb2.toString();
        }
        if (!fbo.a(str)) {
            if (sb.length() > 0) {
                String str3 = "2 u/o2 2";
                sb.append(" • ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    @JsonProperty("openingDate")
    public abstract String getOpeningDate();

    @JsonIgnore
    public ConcertResult getPosterConcertResult() {
        return (ConcertResult) getConcertResults().get(0);
    }

    @JsonProperty("source")
    public abstract String getSource();

    @JsonIgnore
    public SourceType getSourceType() {
        return getSource() != null ? createSourceFromString(getSource()) : getConcertResults().size() > 0 ? ((ConcertResult) getConcertResults().get(0)).getSourceType() : SourceType.ALL;
    }

    @JsonProperty("venue")
    public abstract String getVenue();

    @JsonIgnore
    public boolean isSingleConcert() {
        return getConcertResults().size() == 1;
    }
}
