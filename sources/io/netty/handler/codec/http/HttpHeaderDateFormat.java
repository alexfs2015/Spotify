package io.netty.handler.codec.http;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class HttpHeaderDateFormat extends SimpleDateFormat {
    private static final wwg<HttpHeaderDateFormat> a = new wwg<HttpHeaderDateFormat>() {
        public final /* synthetic */ Object a() {
            return new HttpHeaderDateFormat(0);
        }
    };
    private static final long serialVersionUID = -925286159755905325L;
    private final SimpleDateFormat format1;
    private final SimpleDateFormat format2;

    static final class HttpHeaderDateFormatObsolete1 extends SimpleDateFormat {
        private static final long serialVersionUID = -3178072504225114298L;

        HttpHeaderDateFormatObsolete1() {
            super("E, dd-MMM-yy HH:mm:ss z", Locale.ENGLISH);
            setTimeZone(TimeZone.getTimeZone("GMT"));
        }
    }

    static final class HttpHeaderDateFormatObsolete2 extends SimpleDateFormat {
        private static final long serialVersionUID = 3010674519968303714L;

        HttpHeaderDateFormatObsolete2() {
            super("E MMM d HH:mm:ss yyyy", Locale.ENGLISH);
            setTimeZone(TimeZone.getTimeZone("GMT"));
        }
    }

    private HttpHeaderDateFormat() {
        super("E, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH);
        this.format1 = new HttpHeaderDateFormatObsolete1();
        this.format2 = new HttpHeaderDateFormatObsolete2();
        setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    /* synthetic */ HttpHeaderDateFormat(byte b) {
        this();
    }

    public static HttpHeaderDateFormat a() {
        return (HttpHeaderDateFormat) a.a(wxi.b());
    }

    public final Date parse(String str, ParsePosition parsePosition) {
        Date parse = super.parse(str, parsePosition);
        if (parse == null) {
            parse = this.format1.parse(str, parsePosition);
        }
        return parse == null ? this.format2.parse(str, parsePosition) : parse;
    }
}
