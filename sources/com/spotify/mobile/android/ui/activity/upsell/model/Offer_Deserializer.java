package com.spotify.mobile.android.ui.activity.upsell.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public final class Offer_Deserializer extends StdDeserializer<Offer> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.mobile.android.ui.activity.upsell.model.Offer_Deserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[JsonToken.values().length];

        static {
            try {
                a[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public final boolean isCachable() {
        return true;
    }

    Offer_Deserializer() {
        super(Offer.class);
    }

    private static int a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    private Period c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        String str2 = null;
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                int hashCode = currentName.hashCode();
                if (hashCode != -1992012396) {
                    if (hashCode != -758757370) {
                        if (hashCode == 140662533 && currentName.equals("duration_type")) {
                            c = 2;
                        }
                    } else if (currentName.equals("formatted_price")) {
                        c = 0;
                    }
                } else if (currentName.equals("duration")) {
                    c = 1;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    str = d(jsonParser, deserializationContext);
                } else if (c == 1) {
                    jsonParser.nextValue();
                    i = a(jsonParser, deserializationContext);
                } else if (c != 2) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    str2 = d(jsonParser, deserializationContext);
                }
            }
        }
        return Period.create(str, i, str2);
    }

    private String d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Offer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            Period period = null;
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return null;
            }
            Period period2 = null;
            String str = null;
            boolean z = false;
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                    String currentName = jsonParser.getCurrentName();
                    char c = 65535;
                    switch (currentName.hashCode()) {
                        case -44113227:
                            if (currentName.equals("ad_targeting_key")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 125597633:
                            if (currentName.equals("is_trial")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 361988451:
                            if (currentName.equals("recurring_period")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1495410460:
                            if (currentName.equals("initial_period")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        jsonParser.nextValue();
                        z = ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
                    } else if (c == 1) {
                        jsonParser.nextValue();
                        period = c(jsonParser, deserializationContext);
                    } else if (c == 2) {
                        jsonParser.nextValue();
                        period2 = c(jsonParser, deserializationContext);
                    } else if (c != 3) {
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                    } else {
                        jsonParser.nextValue();
                        str = d(jsonParser, deserializationContext);
                    }
                }
            }
            return Offer.create(z, period, period2, str);
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }
}
