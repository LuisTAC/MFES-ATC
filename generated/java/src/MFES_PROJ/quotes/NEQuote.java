package MFES_PROJ.quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class NEQuote {
    private static int hc = 0;
    private static NEQuote instance = null;

    public NEQuote() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static NEQuote getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new NEQuote();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof NEQuote;
    }

    public String toString() {
        return "<NE>";
    }
}
