package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Constructor;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;

public class DateDeserializers {
    private static final HashSet<String> _classNames = new HashSet<>();

    @JacksonStdImpl
    public static class CalendarDeserializer extends DateBasedDeserializer<Calendar> {
        protected final Constructor<Calendar> _defaultCtor;

        public /* bridge */ /* synthetic */ JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            return super.createContextual(deserializationContext, beanProperty);
        }

        public CalendarDeserializer() {
            super(Calendar.class);
            this._defaultCtor = null;
        }

        public CalendarDeserializer(Class<? extends Calendar> cls) {
            super(cls);
            this._defaultCtor = ClassUtil.findConstructor(cls, false);
        }

        public CalendarDeserializer(CalendarDeserializer calendarDeserializer, DateFormat dateFormat, String str) {
            super(calendarDeserializer, dateFormat, str);
            this._defaultCtor = calendarDeserializer._defaultCtor;
        }

        /* access modifiers changed from: protected */
        public CalendarDeserializer withDateFormat(DateFormat dateFormat, String str) {
            return new CalendarDeserializer(this, dateFormat, str);
        }

        public Calendar deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Date _parseDate = _parseDate(jsonParser, deserializationContext);
            if (_parseDate == null) {
                return null;
            }
            Constructor<Calendar> constructor = this._defaultCtor;
            if (constructor == null) {
                return deserializationContext.constructCalendar(_parseDate);
            }
            try {
                Calendar calendar = (Calendar) constructor.newInstance(new Object[0]);
                calendar.setTimeInMillis(_parseDate.getTime());
                TimeZone timeZone = deserializationContext.getTimeZone();
                if (timeZone != null) {
                    calendar.setTimeZone(timeZone);
                }
                return calendar;
            } catch (Exception e) {
                return (Calendar) deserializationContext.handleInstantiationProblem(handledType(), _parseDate, e);
            }
        }
    }

    public static abstract class DateBasedDeserializer<T> extends StdScalarDeserializer<T> implements ContextualDeserializer {
        protected final DateFormat _customFormat;
        protected final String _formatString;

        /* access modifiers changed from: protected */
        public abstract DateBasedDeserializer<T> withDateFormat(DateFormat dateFormat, String str);

        protected DateBasedDeserializer(Class<?> cls) {
            super(cls);
            this._customFormat = null;
            this._formatString = null;
        }

        protected DateBasedDeserializer(DateBasedDeserializer<T> dateBasedDeserializer, DateFormat dateFormat, String str) {
            super(dateBasedDeserializer._valueClass);
            this._customFormat = dateFormat;
            this._formatString = str;
        }

        /* JADX WARNING: type inference failed for: r6v3, types: [java.text.DateFormat] */
        /* JADX WARNING: type inference failed for: r6v6, types: [java.text.DateFormat] */
        /* JADX WARNING: type inference failed for: r0v5 */
        /* JADX WARNING: type inference failed for: r6v8, types: [com.fasterxml.jackson.databind.util.StdDateFormat] */
        /* JADX WARNING: type inference failed for: r6v9, types: [java.text.DateFormat] */
        /* JADX WARNING: type inference failed for: r6v12, types: [java.text.DateFormat] */
        /* JADX WARNING: type inference failed for: r6v14, types: [com.fasterxml.jackson.databind.util.StdDateFormat] */
        /* JADX WARNING: type inference failed for: r6v15, types: [com.fasterxml.jackson.databind.util.StdDateFormat] */
        /* JADX WARNING: type inference failed for: r6v20 */
        /* JADX WARNING: type inference failed for: r6v21 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v12, types: [java.text.DateFormat]
          assigns: [java.text.DateFormat, com.fasterxml.jackson.databind.util.StdDateFormat]
          uses: [java.text.DateFormat, com.fasterxml.jackson.databind.util.StdDateFormat]
          mth insns count: 71
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 5 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.fasterxml.jackson.databind.JsonDeserializer<?> createContextual(com.fasterxml.jackson.databind.DeserializationContext r6, com.fasterxml.jackson.databind.BeanProperty r7) {
            /*
                r5 = this;
                java.lang.Class r0 = r5.handledType()
                com.fasterxml.jackson.annotation.JsonFormat$Value r7 = r5.findFormatOverrides(r6, r7, r0)
                if (r7 == 0) goto L_0x00d1
                java.util.TimeZone r0 = r7.getTimeZone()
                java.lang.Boolean r1 = r7.getLenient()
                boolean r2 = r7.hasPattern()
                if (r2 == 0) goto L_0x0047
                java.lang.String r2 = r7.getPattern()
                boolean r3 = r7.hasLocale()
                if (r3 == 0) goto L_0x0027
                java.util.Locale r7 = r7.getLocale()
                goto L_0x002b
            L_0x0027:
                java.util.Locale r7 = r6.getLocale()
            L_0x002b:
                java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
                r3.<init>(r2, r7)
                if (r0 != 0) goto L_0x0036
                java.util.TimeZone r0 = r6.getTimeZone()
            L_0x0036:
                r3.setTimeZone(r0)
                if (r1 == 0) goto L_0x0042
                boolean r6 = r1.booleanValue()
                r3.setLenient(r6)
            L_0x0042:
                com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer r6 = r5.withDateFormat(r3, r2)
                return r6
            L_0x0047:
                if (r0 == 0) goto L_0x0092
                com.fasterxml.jackson.databind.DeserializationConfig r2 = r6.getConfig()
                java.text.DateFormat r2 = r2.getDateFormat()
                java.lang.Class r3 = r2.getClass()
                java.lang.Class<com.fasterxml.jackson.databind.util.StdDateFormat> r4 = com.fasterxml.jackson.databind.util.StdDateFormat.class
                if (r3 != r4) goto L_0x0079
                boolean r3 = r7.hasLocale()
                if (r3 == 0) goto L_0x0064
                java.util.Locale r6 = r7.getLocale()
                goto L_0x0068
            L_0x0064:
                java.util.Locale r6 = r6.getLocale()
            L_0x0068:
                com.fasterxml.jackson.databind.util.StdDateFormat r2 = (com.fasterxml.jackson.databind.util.StdDateFormat) r2
                com.fasterxml.jackson.databind.util.StdDateFormat r7 = r2.withTimeZone(r0)
                com.fasterxml.jackson.databind.util.StdDateFormat r6 = r7.withLocale(r6)
                if (r1 == 0) goto L_0x008b
                com.fasterxml.jackson.databind.util.StdDateFormat r6 = r6.withLenient(r1)
                goto L_0x008b
            L_0x0079:
                java.lang.Object r6 = r2.clone()
                java.text.DateFormat r6 = (java.text.DateFormat) r6
                r6.setTimeZone(r0)
                if (r1 == 0) goto L_0x008b
                boolean r7 = r1.booleanValue()
                r6.setLenient(r7)
            L_0x008b:
                java.lang.String r7 = r5._formatString
                com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer r6 = r5.withDateFormat(r6, r7)
                return r6
            L_0x0092:
                if (r1 == 0) goto L_0x00d1
                com.fasterxml.jackson.databind.DeserializationConfig r6 = r6.getConfig()
                java.text.DateFormat r6 = r6.getDateFormat()
                java.lang.String r7 = r5._formatString
                java.lang.Class r0 = r6.getClass()
                java.lang.Class<com.fasterxml.jackson.databind.util.StdDateFormat> r2 = com.fasterxml.jackson.databind.util.StdDateFormat.class
                if (r0 != r2) goto L_0x00b1
                com.fasterxml.jackson.databind.util.StdDateFormat r6 = (com.fasterxml.jackson.databind.util.StdDateFormat) r6
                com.fasterxml.jackson.databind.util.StdDateFormat r6 = r6.withLenient(r1)
                java.lang.String r7 = r6.toPattern()
                goto L_0x00c8
            L_0x00b1:
                java.lang.Object r6 = r6.clone()
                java.text.DateFormat r6 = (java.text.DateFormat) r6
                boolean r0 = r1.booleanValue()
                r6.setLenient(r0)
                boolean r0 = r6 instanceof java.text.SimpleDateFormat
                if (r0 == 0) goto L_0x00c8
                r0 = r6
                java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0
                r0.toPattern()
            L_0x00c8:
                if (r7 != 0) goto L_0x00cc
                java.lang.String r7 = "[unknown]"
            L_0x00cc:
                com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer r6 = r5.withDateFormat(r6, r7)
                return r6
            L_0x00d1:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer.createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonDeserializer");
        }

        /* access modifiers changed from: protected */
        public Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Date parse;
            if (this._customFormat == null || !jsonParser.hasToken(JsonToken.VALUE_STRING)) {
                return super._parseDate(jsonParser, deserializationContext);
            }
            String trim = jsonParser.getText().trim();
            if (trim.length() == 0) {
                return (Date) getEmptyValue(deserializationContext);
            }
            synchronized (this._customFormat) {
                try {
                    parse = this._customFormat.parse(trim);
                } catch (ParseException unused) {
                    return (Date) deserializationContext.handleWeirdStringValue(handledType(), trim, "expected format \"%s\"", this._formatString);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return parse;
        }
    }

    @JacksonStdImpl
    public static class DateDeserializer extends DateBasedDeserializer<Date> {
        public static final DateDeserializer instance = new DateDeserializer();

        public /* bridge */ /* synthetic */ JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            return super.createContextual(deserializationContext, beanProperty);
        }

        public DateDeserializer() {
            super(Date.class);
        }

        public DateDeserializer(DateDeserializer dateDeserializer, DateFormat dateFormat, String str) {
            super(dateDeserializer, dateFormat, str);
        }

        /* access modifiers changed from: protected */
        public DateDeserializer withDateFormat(DateFormat dateFormat, String str) {
            return new DateDeserializer(this, dateFormat, str);
        }

        public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return _parseDate(jsonParser, deserializationContext);
        }
    }

    public static class SqlDateDeserializer extends DateBasedDeserializer<java.sql.Date> {
        public /* bridge */ /* synthetic */ JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            return super.createContextual(deserializationContext, beanProperty);
        }

        public SqlDateDeserializer() {
            super(java.sql.Date.class);
        }

        public SqlDateDeserializer(SqlDateDeserializer sqlDateDeserializer, DateFormat dateFormat, String str) {
            super(sqlDateDeserializer, dateFormat, str);
        }

        /* access modifiers changed from: protected */
        public SqlDateDeserializer withDateFormat(DateFormat dateFormat, String str) {
            return new SqlDateDeserializer(this, dateFormat, str);
        }

        public java.sql.Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Date _parseDate = _parseDate(jsonParser, deserializationContext);
            if (_parseDate == null) {
                return null;
            }
            return new java.sql.Date(_parseDate.getTime());
        }
    }

    public static class TimestampDeserializer extends DateBasedDeserializer<Timestamp> {
        public /* bridge */ /* synthetic */ JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            return super.createContextual(deserializationContext, beanProperty);
        }

        public TimestampDeserializer() {
            super(Timestamp.class);
        }

        public TimestampDeserializer(TimestampDeserializer timestampDeserializer, DateFormat dateFormat, String str) {
            super(timestampDeserializer, dateFormat, str);
        }

        /* access modifiers changed from: protected */
        public TimestampDeserializer withDateFormat(DateFormat dateFormat, String str) {
            return new TimestampDeserializer(this, dateFormat, str);
        }

        public Timestamp deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Date _parseDate = _parseDate(jsonParser, deserializationContext);
            if (_parseDate == null) {
                return null;
            }
            return new Timestamp(_parseDate.getTime());
        }
    }

    static {
        Class[] clsArr = {Calendar.class, GregorianCalendar.class, java.sql.Date.class, Date.class, Timestamp.class};
        for (int i = 0; i < 5; i++) {
            _classNames.add(clsArr[i].getName());
        }
    }

    public static JsonDeserializer<?> find(Class<?> cls, String str) {
        if (_classNames.contains(str)) {
            if (cls == Calendar.class) {
                return new CalendarDeserializer();
            }
            if (cls == Date.class) {
                return DateDeserializer.instance;
            }
            if (cls == java.sql.Date.class) {
                return new SqlDateDeserializer();
            }
            if (cls == Timestamp.class) {
                return new TimestampDeserializer();
            }
            if (cls == GregorianCalendar.class) {
                return new CalendarDeserializer(GregorianCalendar.class);
            }
        }
        return null;
    }
}
