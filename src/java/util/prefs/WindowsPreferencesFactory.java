package java.util.prefs;

/**
 * Implementation of  <tt>PreferencesFactory</tt> to return
 * WindowsPreferences objects.
 *
 * @author  Konstantin Kladko
 * @see Preferences
 * @see WindowsPreferences
 * @since 1.4
 */
class WindowsPreferencesFactory implements PreferencesFactory  {

    /**
     * Returns WindowsPreferences.userRoot
     */
    public Preferences userRoot() {
        return WindowsPreferences.userRoot;
    }

    /**
     * Returns WindowsPreferences.systemRoot
     */
    public Preferences systemRoot() {
        return WindowsPreferences.systemRoot;
    }
}
