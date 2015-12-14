package MFES_PROJ.quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class NWQuote {
    private static int hc = 0;
    private static NWQuote instance = null;

    public NWQuote() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static NWQuote getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new NWQuote();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof NWQuote;
    }

    public String toString() {
        return "<NW>";
    }
}
