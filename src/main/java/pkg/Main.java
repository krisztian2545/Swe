package pkg;

import org.tinylog.Logger;

public class Main {

    public static void main(String[] args) {
        Logger.error("thy error");
        Logger.warn("thy warn");
        Logger.info("thy info mes.");
        Logger.debug("thy debug mes.");
        Logger.trace("thy trace mes.");

        Logger.info("Thy name is {}", System.getProperty("user.name")); // ez gyorsabb mint a pluszos megoldas mert nincs annyi string peldanyositas
        Logger.error(new RuntimeException("Oops"), "Something is really wrong");

    }

}
