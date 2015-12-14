package MFES_PROJ.quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class SWQuote {
    private static int hc = 0;
    private static SWQuote instance = null;

    public SWQuote() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static SWQuote getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new SWQuote();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof SWQuote;
    }

    public String toString() {
        return "<SW>";
    }
}
